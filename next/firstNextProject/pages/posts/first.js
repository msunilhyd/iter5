import Link from 'next/link'
import Head from 'next/head'

export default function FirstPost() {
  return (
    <>
    <Head>
      <title>My First Post</title>
    </Head>
      <h1>My First Post</h1>
      <h2>
        <Link href="/">
          Home
        </Link>
      </h2>
      <br/>
      <img src="/logo.jpg" alt="TutorialsPoint Logo" />
    </>
  )
}

