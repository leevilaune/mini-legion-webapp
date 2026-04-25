import { useEffect, useState } from "react"
import type { RuneModel, CreateRuneRequest } from "../types/rune"

type State = {
  data: RuneModel[]
  loading: boolean
  error: string | null
}

const API_URL = "http://localhost:8080/runes"

export function useRunes() {
  const [state, setState] = useState<State>({
    data: [],
    loading: true,
    error: null,
  })

  // 🔹 GET all runes
  const fetchRunes = async () => {
    try {
      setState(prev => ({ ...prev, loading: true, error: null }))

      const res = await fetch(API_URL)

      if (!res.ok) {
        throw new Error(`Failed to fetch: ${res.status}`)
      }

      const data: RuneModel[] = await res.json()

      setState({
        data,
        loading: false,
        error: null,
      })
    } catch (err: any) {
      setState({
        data: [],
        loading: false,
        error: err.message,
      })
    }
  }

  // 🔹 POST new rune
  const createRune = async (rune: CreateRuneRequest) => {
    try {
      const res = await fetch(API_URL, {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(rune),
      })

      if (!res.ok) {
        throw new Error(`Failed to create rune: ${res.status}`)
      }

      // refresh list after creation
      await fetchRunes()
    } catch (err: any) {
      setState(prev => ({
        ...prev,
        error: err.message,
      }))
    }
  }

  useEffect(() => {
    fetchRunes()
  }, [])

  return {
    ...state,
    fetchRunes,
    createRune,
  }
}