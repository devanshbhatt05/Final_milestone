
import {  useState } from "react";
 
import axios from "axios";
import './Register.css';
 
function Register() {
  
    const [username, setUsername] = useState("");

    const [password, setPassword] = useState("");
    const [role, setRole] = useState("");
 
 
    async function save(event) {
        event.preventDefault();
        try {
          await axios.post("http://localhost:8080/users/registerUser", {
          username:username,
        
          password: password,
          role:role,
          });
          alert("username Registation Successfully");
 
        } catch (err) {
          alert(err);
        }
      }
  
    return (
    <div>
    <div class="container mt-4" >
    <div class="card">
            <h1> Registation</h1>
    
    <form>
        <div class="form-group">
          <label>username</label>
          <input type="text"  class="form-control" id="username" placeholder="Enter Name"
          
          value={username}
          onChange={(event) => {
            setUsername(event.target.value);
          }}
          />
 
        </div>
 
 
        <div class="form-group">
            <label>password</label>
            <input type="password"  class="form-control" id="password" placeholder="Enter password"
            
            value={password}
            onChange={(event) => {
              setPassword(event.target.value);
            }}
            
            />
            <label>Role</label>
             <input type="text"  class="form-control" id="role" placeholder="Enter Role"
            
            value={role}
            onChange={(event) => {
              setRole(event.target.value);
            }}
            
            />
          </div>
 
        <button type="submit" class="btn btn-primary mt-4" onClick={save} >Save</button>
      
      </form>
    </div>
    </div>
     </div>
    );
  }
  
  export default Register;