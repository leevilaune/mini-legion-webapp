import { RoleModel } from "./role"

export type RuneModel = {
  id: number
  name: string
  role: RoleModel
  commonEffect: string
  rareEffect: string
  epicEffect: string
  legendaryEffect: string
}

export type CreateRuneRequest = {
  name: string
  roleId: number
  commonEffect: string
  rareEffect: string
  epicEffect: string
  legendaryEffect: string
}