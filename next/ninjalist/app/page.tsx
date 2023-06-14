import Navbar from '../src/comps/Navbar';
import Footer from '../src/comps/Footer';
import Link from 'next/link';

export default function Home() {
  return (
      <div>
        <Navbar />
        <p>Self interest alone moves men</p>
        <p>Pose as a friend. Work as a spy</p>
        <Link href="/ninjas">
          See Ninja Listing
        </Link>
        <Footer />
      </div>
  );
}
