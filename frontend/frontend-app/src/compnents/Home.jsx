import React from 'react';
import './Home.css';

const HomePage = () => {
  return (
    <div className="homepage">
      <header>
        <h1>EatHealthy</h1>
       
      </header>
      <main>
        <section className="hero">
          <h2>Your Journey to a Healthier Lifestyle Starts Here</h2>
          <p>Discover delicious and nutritious recipes, helpful tips, and expert advice to help you eat healthy and feel great.</p>
          
        </section>
        <section className="features">
          <div>
            <img src="meal.jpg" alt="Meal Planning" />
            <h3>Meal Planning</h3>
            <p>Plan your meals in advance and stay on track with your healthy eating goals.</p>
          </div>
          <div>
            <img src="tips.jpg" alt="Nutrition Tips" />
            <h3>Nutrition Tips</h3>
            <p>Learn about the importance of balanced nutrition and get useful tips for a healthier lifestyle.</p>
          </div>
          <div>
            <img src="recipe.jpg" alt="Recipe Library" />
            <h3>Recipe Library</h3>
            <p>Explore our extensive collection of tasty and nutritious recipes for every meal.</p>
          </div>
        </section>
      </main>
      <footer>
        <p>&copy; 2023 EatHealthy. All rights reserved.</p>
      </footer>
    </div>
  );
};

export default HomePage;
