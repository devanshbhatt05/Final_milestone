import React, { useState, useEffect } from 'react';

import axios from 'axios';
import './UserDashboard.css';

const UserDashboard = () => {
  const [menuData, setMenuData] = useState([]);

  useEffect(() => {
    fetchMenuData();
  }, []);

  const fetchMenuData = async () => {
    try {
      const response = await axios.get('http://localhost:8080/menus/getmenu');
      setMenuData(response.data);
    } catch (error) {
      console.error('Error occurred while fetching menu data:', error);
    }
  };

  return (
    <div className="dashboard">
      <h2 className="dashboard-heading">Menu Dashboard</h2>
      <div className="menu-list">
        {menuData.map((menu, index) => (
          <div className="menu-item" key={index}>
            <div className="menu-schedule">{menu.schedule}</div>
            <div className={`menu-category ${menu.category.toLowerCase()}`}>{menu.category}</div>
            <div className="menu-name">{menu.menu_name}</div>
            <div className="menu-price">${menu.price.toFixed(2)}</div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default UserDashboard;

