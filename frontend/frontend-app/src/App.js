import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import Navbar from "./compnents/Navbar";
import Register from "./compnents/Register";
import Login from "./compnents/Login";
import AdminDashboard from "./compnents/AdminDashboard";
import VendorDashboard from './compnents/VendorDashboard';
import UserDashboard from './compnents/UserDashboard';
import HomePage from './compnents/Home';


function App() {
  return (
    <>
        <Router>
    <div className="App">
    <Navbar/>
    <Routes>
    <Route  path="/home" element={<HomePage/>} />
          <Route  path="/registration" element={<Register/>} />
          <Route  path="/login" element={<Login/>} />
          <Route exact path="/AdminDashboard" element={<AdminDashboard/>}/> 
          <Route exact path="/VendorDashboard" element={<VendorDashboard/>}/> 
          <Route exact path="/UserDashboard" element={<UserDashboard/>}/> 
          
        </Routes>
    </div>
    </Router>
    </>
  );
}
export default App;