import React from 'react'
import RecipeBlock from './RecipeBlock'


function Home() {
    return (
        <>
        <section className="section lb text-muted">
            <div className="container">
                <div className="row grid-style">
                    
                <RecipeBlock/>
                <RecipeBlock/>
                <RecipeBlock/>
                <RecipeBlock/>
                <RecipeBlock/>
                <RecipeBlock/>
                <RecipeBlock/>
                <RecipeBlock/>
                </div>
                
                <hr className="invis"/>

                <div className="row">
                    <div className="col-md-12 text-center">
                        <nav aria-label="Page navigation">
                            <ul className="pagination justify-content-center">
                                <li className="page-item"><a className="page-link" href="#">1</a></li>
                                <li className="page-item"><a className="page-link" href="#">2</a></li>
                                <li className="page-item"><a className="page-link" href="#">3</a></li>
                                <li className="page-item">
                                    <a className="page-link" href="#">Next</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </section>
       

        
        
    </>

    )
}

export default Home
