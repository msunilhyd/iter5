import Layout from '../comps/Layout';
import '../../app/globals.css';

function MyApp({ Component, pageProps }) {
  return (
    <Layout>
      <Component {...pageProps} />
    </Layout>
  ); 
}

export default MyApp;