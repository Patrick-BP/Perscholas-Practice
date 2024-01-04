import React from 'react'
import './Login.css'
import { Link } from 'react-router-dom'

function Login() {

  const onSubmit = (e)=>{
    e.preventDefault();
    console.log("loged in");
  }
    return (
        
         <div className = "container">
            <div className="wrapper">
      <form  name="Login_Form" className="form-signin" onSubmit={onSubmit}>       
        <h3 className="form-signin-heading">Welcome Back! Please Sign In</h3>
        <hr className="colorgraph"/><br/>
        
        <input type="text" className="form-control" name="Username" placeholder="Username" required="" autoFocus="" />
        <input type="password" className="form-control" name="Password" placeholder="Password" required=""/>          
       
        <button className="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  

        <p><Link to="/register">Create an Account</Link></p>      
    </form>     
  </div>
</div>
       
    )
}

export default Login
