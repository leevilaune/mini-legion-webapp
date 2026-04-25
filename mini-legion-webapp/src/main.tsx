import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.tsx'
import CreateRuneForm from './components/CreateRuneForm.tsx'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <CreateRuneForm />
  </StrictMode>,
)
