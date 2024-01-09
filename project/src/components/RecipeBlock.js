import React from 'react'
import { Link } from 'react-router-dom'

function RecipeBlock() {
    return (
        <div className="col-lg-3 col-md-6 col-sm-12 col-xs-12 mb-5">
        <div className="blog-box">
            <div className="post-media">
                <a href="#" title="">    
                    <span className="detail veg">Veg</span>
                    <img src="assets/upload/blog_square_10.jpg" alt="" className="img-fluid"/>
                    <div className="hovereffect"></div>
                </a>
            </div>

            <div className="blog-meta big-meta">
                <div className="rating">
                    <i className="fa fa-star"></i>
                    <i className="fa fa-star"></i>
                    <i className="fa fa-star"></i>
                    <i className="fa fa-star"></i>
                    <i className="fa fa-star"></i>
                </div>
                <h4><Link to="singlerecipe" title="">Eggplant meat broth</Link></h4>
                <p>Aenean interdum arcu blandit, vehicula magna non, placerat et pharetratortor.</p>
                <small><a href="#" title="">18 July, 2017</a></small>
                <small><a href="#" title="">by Matilda</a></small>
            </div>
        </div>
    </div>
    )
}

export default RecipeBlock
