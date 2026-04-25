import { useState } from "react"
import type { CreateRuneRequest } from "../types/rune.ts"
import { useRunes } from "../hooks/useRune.ts"

export default function CreateRuneForm() {
  const { createRune } = useRunes()

  const [form, setForm] = useState<CreateRuneRequest>({
    name: "",
    roleId: 0,
    commonEffect: "",
    rareEffect: "",
    epicEffect: "",
    legendaryEffect: "",
  })

  const handleChange = (
    e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>
  ) => {
    const { name, value } = e.target

    setForm(prev => ({
      ...prev,
      [name]: name === "roleId" ? Number(value) : value,
    }))
  }

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault()

    await createRune(form)

    // reset form after submit
    setForm({
      name: "",
      roleId: 0,
      commonEffect: "",
      rareEffect: "",
      epicEffect: "",
      legendaryEffect: "",
    })
  }

  return (
    <form onSubmit={handleSubmit} style={{ display: "grid", gap: 10 }}>
      <h2>Create Rune</h2>

      <input
        name="name"
        placeholder="Rune name"
        value={form.name}
        onChange={handleChange}
      />

      <input
        name="roleId"
        type="number"
        placeholder="Role ID"
        value={form.roleId}
        onChange={handleChange}
      />

      <textarea
        name="commonEffect"
        placeholder="Common effect"
        value={form.commonEffect}
        onChange={handleChange}
      />

      <textarea
        name="rareEffect"
        placeholder="Rare effect"
        value={form.rareEffect}
        onChange={handleChange}
      />

      <textarea
        name="epicEffect"
        placeholder="Epic effect"
        value={form.epicEffect}
        onChange={handleChange}
      />

      <textarea
        name="legendaryEffect"
        placeholder="Legendary effect"
        value={form.legendaryEffect}
        onChange={handleChange}
      />

      <button type="submit">Create Rune</button>
    </form>
  )
}