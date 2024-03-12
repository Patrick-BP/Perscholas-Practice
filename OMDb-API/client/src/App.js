
import { useEffect, useState } from 'react';
 import './App.css';
import './index.css';
import axios from 'axios';

function App() {

const[titleInput, setTitleInput] = useState("");
const[yearInput, setYearInput] = useState("");
const[result, setResult] = useState([]);
const[title, setTitle] = useState("");
const[isLoading, setIsLoading] = useState(true);
const[movieDetails, setMovieDetails] = useState({Title:"", Poster:"",Year:"", Genre:"", Plot:"",Country:"",Actors:"",Runtime:"",Released:"", Rated:"", Language:"",Director:""});

const fetchData = async ()=>{
    const response = await axios.get(`http://localhost:8000/movie?title=${titleInput}&year=${yearInput}`);
    setResult(response.data)

}
const fetchMovieDetails = async ()=>{
  const response = await axios.get(`http://localhost:8000/moviedetails?title=${title}`);

  setMovieDetails(response.data)

}


const handleChanges = (e)=>{
  setTitleInput(e.target.value)
}
const handleYearChanges = (e)=>{
  setYearInput(e.target.value)
}

const handleShowDetails =(title)=>{
  setIsLoading(true)
  setTitle(title);
  setTimeout(()=>{
    setIsLoading(false);
    console.log("triggered");
  }, 3000);
}
useEffect(()=>{
fetchData();
},[titleInput, yearInput]);

useEffect(()=>{
  fetchMovieDetails()
  
  },[title]);
const saveToDb = ()=>{
  axios.post(`http://localhost:8000/movie/add`, movieDetails)
  
}
  return (
    <>

       
                    <div className="row">
                        <div className="col-md-10 offset-md-2">
                            <div className="pt-3 pb-4">
                                <div className="input-group gap-2">
                                    <input type="text" id="" name="" className="form-control w-75 " value={titleInput} onChange={(e)=>handleChanges(e)} placeholder ="Search a Title"/>
                                    <input type="text" id="" name="" className="form-control " value={yearInput} onChange={(e)=>handleYearChanges(e)} placeholder ="Year"/>

                                   
                                </div>  
                                
                            </div>
                        </div>
                    </div>
                    {/* <!-- end row --> */}

                    {result.length >0?<>
                    
                    <div className="mt-4 text-center m-5 text-light ">
                                    <h4>{result.length} Results For " {titleInput} "</h4>
                    </div>
                    
                    <div className="container-fluid gap-5 d-flex flex-wrap justify-content-around ">
                                  {result && result.map(movie => {

                                    return (
                                                                 
  
                                                  <div className="example-2 card  " key={movie.imdbID}>
                                                    <div className="wrapper" style={{ backgroundImage: `url(${movie.Poster})`,backgroundPosition: '20% 1%',backgroundSize: 'cover',backgroundRepeat: 'no-repeat'}}>
                                                      <div className="header">
                                                        <div className="date">
                                                          
                                                          <span className="year">{movie.Year}</span>
                                                        </div>
                                                      
                                                      </div>
                                                      <div className="data">
                                                        <div className="content">
                                                          <span className="author">{movie.Type}</span>
                                                          <h1 className="title"><a href="#">{movie.Title}</a></h1>
                                                          <a href="#" className="button" data-bs-toggle="modal" onClick={()=>handleShowDetails(movie.Title)} data-bs-target="#exampleModal">Read more</a>

                                                        </div>
                                                      </div>
                                                    </div>
                                                  </div>
                                                

                                    ) 
                                  })  }
                                    {/* <!-- Modal --> */}
                                    <div className="modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                                    <div className="modal-dialog">
                                                                      <div className="modal-content">
                                                                    {isLoading ===  true ? <div className='fs-2 text-center m-4'><svg xmlns="http://www.w3.org/2000/svg" width="3em" height="3em" viewBox="0 0 24 24"><rect width="10" height="10" x="1" y="1" fill="currentColor" rx="1"><animate id="svgSpinnersBlocksShuffle30" fill="freeze" attributeName="x" begin="0;svgSpinnersBlocksShuffle3b.end" dur="0.2s" values="1;13"/><animate id="svgSpinnersBlocksShuffle31" fill="freeze" attributeName="y" begin="svgSpinnersBlocksShuffle38.end" dur="0.2s" values="1;13"/><animate id="svgSpinnersBlocksShuffle32" fill="freeze" attributeName="x" begin="svgSpinnersBlocksShuffle39.end" dur="0.2s" values="13;1"/><animate id="svgSpinnersBlocksShuffle33" fill="freeze" attributeName="y" begin="svgSpinnersBlocksShuffle3a.end" dur="0.2s" values="13;1"/></rect><rect width="10" height="10" x="1" y="13" fill="currentColor" rx="1"><animate id="svgSpinnersBlocksShuffle34" fill="freeze" attributeName="y" begin="svgSpinnersBlocksShuffle30.end" dur="0.2s" values="13;1"/><animate id="svgSpinnersBlocksShuffle35" fill="freeze" attributeName="x" begin="svgSpinnersBlocksShuffle31.end" dur="0.2s" values="1;13"/><animate id="svgSpinnersBlocksShuffle36" fill="freeze" attributeName="y" begin="svgSpinnersBlocksShuffle32.end" dur="0.2s" values="1;13"/><animate id="svgSpinnersBlocksShuffle37" fill="freeze" attributeName="x" begin="svgSpinnersBlocksShuffle33.end" dur="0.2s" values="13;1"/></rect><rect width="10" height="10" x="13" y="13" fill="currentColor" rx="1"><animate id="svgSpinnersBlocksShuffle38" fill="freeze" attributeName="x" begin="svgSpinnersBlocksShuffle34.end" dur="0.2s" values="13;1"/><animate id="svgSpinnersBlocksShuffle39" fill="freeze" attributeName="y" begin="svgSpinnersBlocksShuffle35.end" dur="0.2s" values="13;1"/><animate id="svgSpinnersBlocksShuffle3a" fill="freeze" attributeName="x" begin="svgSpinnersBlocksShuffle36.end" dur="0.2s" values="1;13"/><animate id="svgSpinnersBlocksShuffle3b" fill="freeze" attributeName="y" begin="svgSpinnersBlocksShuffle37.end" dur="0.2s" values="1;13"/></rect></svg></div>
                                                                     :  <>
                                                                        <div className="modal-header">
                                                                          <h1 className="modal-title fs-5 text-primary fw-bold" id="exampleModalLabel" >{movieDetails.Title} ( {movieDetails.Year} )</h1>
                                                                          <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                                        </div>
                                                                        <div className="modal-body">
                                                                       <img src={movieDetails.Poster} />
                                                                       <div className='d-flex gap-2 justify-content-around mt-4 mb-3 fw-bold text-primary ' style={{fontSize:"12px"}}>
                                                                        <div><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" className="bi bi-star-fill" viewBox="0 0 16 16">
                                                                          <path d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z"/>
                                                                        </svg> {movieDetails.imdbRating}</div>
                                                                        <div>{movieDetails.Runtime}</div>
                                                                        <div>{movieDetails.Language}</div>
                                                                        <div>{movieDetails.Country}</div>
                                                                        <div></div>
                                                                       
                                                                       </div>

                                                                  
                                                                       <div>
                                                                        <p>{movieDetails.Plot}</p>
                                                                        <p><b>Genre:</b> {movieDetails.Genre}</p>
                                                                        <p><b>Director:</b> {movieDetails.Director}</p>
                                                                        <p><b>Cast:</b>  {movieDetails.Actors}</p>
                                                                        
                                                                       </div>
                                                                        </div>
                                                                        <div className="modal-footer">
                                                                          
                                                                          <button type="button" onClick={saveToDb} className="btn btn-primary">Add to favorite </button>
                                                                        </div>
                                                                     </>
                                                                      }


                                                                      </div>
                                                                    </div>
                                                                  </div>
                                    </div>
                                  
                                    <div className="clearfix"></div>
                            
                        
                        {/* <!-- end All results tab --> */}
                       
                   
                    
                    </> : <div className='text-center text-light'><h1>Search a Movie ....</h1></div>}


                
   </>
  );
}

export default App;
