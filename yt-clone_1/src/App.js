import React from 'react'
import Header from './components/header/Header'
import Sidebar from './components/sidebar/Sidebar'
import HomeScreen from './screens/homeScreen/HomeScreen'

import { Container } from 'react-bootstrap'

const App = () => {
  return (
    <>
      <Header />
      <div className="app_container">
        <Sidebar />
        <Container fluid className="app__main">
          <HomeScreen />
        </Container>
      </div>    
    </>
  )
}

export default App  