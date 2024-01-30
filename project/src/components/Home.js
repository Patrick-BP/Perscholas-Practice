import React, { useEffect, useState } from 'react'
import RecipeBlock from './RecipeBlock'
import { createServer } from 'miragejs';

let server = createServer();
server.get("/api/recipes", {
    recipes:[
        {
        id:1,
        title:"Birria Stew",
        description:"Birria is traditionally a spicy and super savory Mexican beef or goat stew that’s slow cooked until the meat is tender and fall-apart juicy and delicious. Someone had the amazing idea to stuff this meaty goodness into a taco shell, and then dip the whole thing into the stew and fry it up. These birria tacos blew up after that, and the rest is history.",
        image:"https://iamafoodblog.b-cdn.net/wp-content/uploads/2020/05/homemade-birria-tacos-recipe-3273w-2048x1366.webp",
        steps: {
            Soak_the_peppers: "Bring a pot of water to a boil and then take it off the heat, soak the dried peppers while you do the next steps.",
            Season_the_meat: "While you wait for the peppers to soak, cube up the roast and season the meat with salt and pepper",
            Make_the_marinade: " Throw together everything left except the cloves, bay leaves, and cinnamon into a blender. Remove the peppers from the now warm water and let them get cool enough to handle. Hold them by the tip over the sink and cut the tops off with scissors. The seeds will just fall right out. Then drop them into the blender too. Blend it all up into a smooth paste.",
            Marinate_the_beef_overnight: " Two hours is good enough too, but longer is always better when it comes to stews.",
            Make_the_stew: "Saute the onions. Onions are the base of all flavor, so make sure they are extra delicious – transparent and golden. Take your time. Then add the meats, cover with chicken stock, and add the last few spices. That’s all there is to it!",
        },
        category: "Dinner",
        ingredients:["1.5 lb beef shank","1 lb sirloin or other roast/steak"],
        components:{
            Marinade:["3 dried guajillo peppers see notes",
                "1 can chipotle peppers in adobo",
                "1/4 cup vinegar",
                "1/2 cup crushed tomatoes",
                "5 cloves garlic",
                "1 tsp dried oregano",
                "1/2 tsp smoked paprika",
                "1 tsp cumin"
            ],
            Stew:[
                "1 medium onion chopped",
                "1 cinnamon stick",
                "2 bay leaves",
                "6 whole cloves",
                "chicken stock to cover sodium free, about 1 quart",
            ],
            Tacos:[
                '4" corn or flour tortillas as needed, 12-16',
                "1 medium onion chopped, optional",
                "1 bunch cilantro chopped, optional",
                "1 cup mexican cheese blend grated, optional",
            ]
        },
        instructions:[
            "Bring a large pot of water to a boil and then remove from heat. Soak your dried guajillo peppers for 15 minutes. Meanwhile, cube your cab sirloin, then season both the steak and the shank with salt and pepper. Set aside.",
            "Add marinade ingredients to the blender. When the peppers are done soaking, hold them by the tip over the sink and use scissors to cut the stem off and allow the seeds to fall out, then add to blender. Blend the marinade into a smooth paste. Marinate the meats for a minimum of two hours or up to overnight.",
            "Set your Instant Pot on saute high or use a skillet over medium heat. Add 1-2 tbsp oil, then saute the onions until golden and translucent (6-8 minutes).",
            "Add the meats, marinade, bay leaves, cinnamon stick, and cloves to the pot. Cover with chicken broth, then set to high pressure for 45 minutes. If using a slow cooker or stovetop, set to low heat for 4-6 hours.",
            "When the instant pot is finished, allow a natural release, then remove the meat. Shred, set aside, and discard the bones.",
            "Warm up some tortillas, then dip the tortillas in the stew. Build your tacos, top with any optional toppings, then fry over medium heat on a nonstick skillet. Enjoy immediately, preferably with a margarita or cold Mexican beer.",
        ],
        nutritionFActs:{

        }
        },
        {
            id:1,
            title:"Birria Stew",
            description:"Birria is traditionally a spicy and super savory Mexican beef or goat stew that’s slow cooked until the meat is tender and fall-apart juicy and delicious. Someone had the amazing idea to stuff this meaty goodness into a taco shell, and then dip the whole thing into the stew and fry it up. These birria tacos blew up after that, and the rest is history.",
            image:"https://www.simplyrecipes.com/thmb/a2Cw3HAbCF0ni56Ug2olbw9C5rU=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/SimplyRecipes_JohnnyMarzettiCasserole_LEAD_15-05685a0a5f804b92afe545220761d5dd.jpg",
            steps: {
                Soak_the_peppers: "Bring a pot of water to a boil and then take it off the heat, soak the dried peppers while you do the next steps.",
                Season_the_meat: "While you wait for the peppers to soak, cube up the roast and season the meat with salt and pepper",
                Make_the_marinade: " Throw together everything left except the cloves, bay leaves, and cinnamon into a blender. Remove the peppers from the now warm water and let them get cool enough to handle. Hold them by the tip over the sink and cut the tops off with scissors. The seeds will just fall right out. Then drop them into the blender too. Blend it all up into a smooth paste.",
                Marinate_the_beef_overnight: " Two hours is good enough too, but longer is always better when it comes to stews.",
                Make_the_stew: "Saute the onions. Onions are the base of all flavor, so make sure they are extra delicious – transparent and golden. Take your time. Then add the meats, cover with chicken stock, and add the last few spices. That’s all there is to it!",
            },
            category: "Dinner",
            ingredients:["1.5 lb beef shank","1 lb sirloin or other roast/steak"],
            components:{
                Marinade:["3 dried guajillo peppers see notes",
                    "1 can chipotle peppers in adobo",
                    "1/4 cup vinegar",
                    "1/2 cup crushed tomatoes",
                    "5 cloves garlic",
                    "1 tsp dried oregano",
                    "1/2 tsp smoked paprika",
                    "1 tsp cumin"
                ],
                Stew:[
                    "1 medium onion chopped",
                    "1 cinnamon stick",
                    "2 bay leaves",
                    "6 whole cloves",
                    "chicken stock to cover sodium free, about 1 quart",
                ],
                Tacos:[
                    '4" corn or flour tortillas as needed, 12-16',
                    "1 medium onion chopped, optional",
                    "1 bunch cilantro chopped, optional",
                    "1 cup mexican cheese blend grated, optional",
                ]
            },
            instructions:[
                "Bring a large pot of water to a boil and then remove from heat. Soak your dried guajillo peppers for 15 minutes. Meanwhile, cube your cab sirloin, then season both the steak and the shank with salt and pepper. Set aside.",
                "Add marinade ingredients to the blender. When the peppers are done soaking, hold them by the tip over the sink and use scissors to cut the stem off and allow the seeds to fall out, then add to blender. Blend the marinade into a smooth paste. Marinate the meats for a minimum of two hours or up to overnight.",
                "Set your Instant Pot on saute high or use a skillet over medium heat. Add 1-2 tbsp oil, then saute the onions until golden and translucent (6-8 minutes).",
                "Add the meats, marinade, bay leaves, cinnamon stick, and cloves to the pot. Cover with chicken broth, then set to high pressure for 45 minutes. If using a slow cooker or stovetop, set to low heat for 4-6 hours.",
                "When the instant pot is finished, allow a natural release, then remove the meat. Shred, set aside, and discard the bones.",
                "Warm up some tortillas, then dip the tortillas in the stew. Build your tacos, top with any optional toppings, then fry over medium heat on a nonstick skillet. Enjoy immediately, preferably with a margarita or cold Mexican beer.",
            ],
            nutritionFActs:{
    
            }
            }
]
})

function Home() {
    let [recipes, setRecipes] = useState([]);

    const fetchRecipes = ()=>{
        fetch("/api/recipes")
        .then(res => res.json())
        .then(data=>{
            
            setRecipes(data.recipes)
        })
    }
    useEffect(()=>{
fetchRecipes();
    },[])
    return (
        <>
        <section className="section lb text-muted">
            <div className="container">
                <div className="row grid-style">
                  {recipes && recipes.map(recipe =>{
                    return  <RecipeBlock key={recipe.id} data={recipe}/>
                  })}  
               
                
                </div>
                
                <hr className="invis"/>

                <div className="row">
                    <div className="col-md-12 text-center">
                        <nav aria-label="Page navigation">
                            <ul className="pagination justify-content-center">
                            
                                <li className="page-item">
                                    <a className="page-link" href="#">Load More</a>
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
