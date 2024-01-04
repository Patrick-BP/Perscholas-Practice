import React from 'react'
import { Link } from 'react-router-dom'

function Register() {
    return (
        <div className = "container">
        <div className="wrapper">
  <form  name="Login_Form" className="form-signin">       
    <h3 className="form-signin-heading">Please Sign Up</h3>
    <hr className="colorgraph"/><br/>
    
    <input type="text" className="form-control" name="name" placeholder="Full Name" required=""/>          
    <input type="text" className="form-control" name="email" placeholder="Email" required="" autoFocus="" />
    <input type="password" className="form-control" name="Password" placeholder="Password" required=""/>          
   
    <button className="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Register</button>   
    <p ><Link to="/">Login</Link></p>      
</form>     
</div>
</div>
    )
}

export default Register
