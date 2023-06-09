import Link from 'next/link'
import Head from 'next/head'

function HomePage() {
  return (
    <>
    <Head>
      <title>Welcome to Next.js!</title>
    </Head>
      <div>Welcome to Next.js!</div>
      <Link href="/posts/first">First Post</Link>
      <img src="/logo.jpg" alt="TutorialsPoint Logo" />
    </>
  )
}

export default HomePage