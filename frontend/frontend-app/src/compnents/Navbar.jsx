import React from 'react'
import { Link } from 'react-router-dom'
const Navbar = () => {
  return (
    <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
      <Link class="nav-link" to="/home">Home </Link>
      </li>
      <li class="nav-item">
      <Link class="nav-link" to="/registration"> Register</Link>
      </li>
      <li class="nav-item">
      <Link class="nav-link" to="/login"> Login</Link>
      </li>
      {/* <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
      </li> */}
    </ul>
  </div>
</nav>
    </div>
  )
}
export default Navbar