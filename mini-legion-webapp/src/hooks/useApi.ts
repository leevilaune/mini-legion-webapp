import { useEffect, useState } from "react"

type UseApiState<T> = {
  data: T | null
  loading: boolean
  error: string | null
}

export function useApi<T>(url: string) {
  const [state, setState] = useState<UseApiState<T>>({
    data: null,
    loading: true,
    error: null,
  })

  useEffect(() => {
    const controller = new AbortController()

    async function fetchData() {
      try {
        setState({ data: null, loading: true, error: null })

        const res = await fetch(url, {
          signal: controller.signal,
        })

        if (!res.ok) {
          throw new Error(`HTTP error: ${res.status}`)
        }

        const json = (await res.json()) as T

        setState({
          data: json,
          loading: false,
          error: null,
        })
      } catch (err: any) {
        if (err.name === "AbortError") return

        setState({
          data: null,
          loading: false,
          error: err.message || "Something went wrong",
        })
      }
    }

    fetchData()

    return () => controller.abort()
  }, [url])

  return state
}