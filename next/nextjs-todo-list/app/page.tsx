import { prisma } from "@/db"
import Link from "next/link"

import { TodoItem } from "../components/TodoItem"

function getTodos() {
  return prisma.todo.findMany()
}

export default async function Home() {

  const todos = await getTodos()

  return <>
    <ul className="pl-4">
      {todos.map(todo => (
        <TodoItem key={todo.id} {...todo} />
      ))}
    </ul>
  </>
}