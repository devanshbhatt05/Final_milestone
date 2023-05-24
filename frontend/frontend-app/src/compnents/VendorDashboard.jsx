import React, { useState } from 'react';
import './VendorDashboard.css';

// const AddMenu = () => {
//   const [schedule, setSchedule] = useState('');
//   const [category, setCategory] = useState('');
//   const [menuName, setMenuName] = useState('');
//   const [price, setPrice] = useState('');

//   const handleSubmit = (e) => {
//     e.preventDefault();

//     // Perform the necessary actions to submit the menu item data to the backend
//     // You can make an API call or perform any other required operations here
//     console.log('Menu item submitted:', { schedule, category, menuName, price });

//     // Reset the form fields after submission
//     setSchedule('');
//     setCategory('');
//     setMenuName('');
//     setPrice('');
//   };

//   return (
//     <div>
//       <h2>Add Menu Item</h2>
//       <form onSubmit={handleSubmit}>
//         <label>
//           Schedule:
//           <select value={schedule} onChange={(e) => setSchedule(e.target.value)}>
//             <option value="">Select Schedule</option>
//             <option value="breakfast">Breakfast</option>
//             <option value="lunch">Lunch</option>
//             <option value="dinner">Dinner</option>
//           </select>
//         </label>
//         <br />
//         <label>
//           Category:
//           <select value={category} onChange={(e) => setCategory(e.target.value)}>
//             <option value="">Select Category</option>
//             <option value="veg">Veg</option>
//             <option value="non-veg">Non-Veg</option>
//           </select>
//         </label>
//         <br />
//         <label>
//           Menu Name:
//           <input type="text" value={menuName} onChange={(e) => setMenuName(e.target.value)} />
//         </label>
//         <br />
//         <label>
//           Price:
//           <input type="number" value={price} onChange={(e) => setPrice(e.target.value)} />
//         </label>
//         <br />
//         <button type="submit">Add Menu Item</button>
//       </form>
//     </div>
//   );
// };

// export default AddMenu;

const VendorDashboard = () => {
    const [schedule, setSchedule] = useState('');
    const [category, setCategory] = useState('');
    const [menu_name, setMenuName] = useState('');
    const [price, setPrice] = useState('');
  
    const handleAddMenu = async (e) => {
      e.preventDefault();
  
      const menuData = {
        schedule: schedule,
        category: category,
        menu_name: menu_name,
        price: price
      };
  
      try {
        const response = await fetch('http://localhost:8080/vendors/menus', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(menuData)
        });
  
        if (response.ok) {
          // Menu item added successfully
          console.log('Menu item added');
          // Reset the form
          setSchedule('');
          setCategory('');
          setMenuName('');
          setPrice('');
        } else {
          // Error occurred while adding menu item
          console.error('Failed to add menu item');
        }
      } catch (error) {
        console.error('Error occurred during menu item addition:', error);
      }
    };
  
    return (
      <div className="bg">
      <div className="add-menu-container">

        <h2>Add Menu Item</h2>
        <form onSubmit={handleAddMenu}>
          <label>Schedule:</label>
          <select value={schedule} onChange={(e) => setSchedule(e.target.value)}>
            <option value="">Select Schedule</option>
            <option value="breakfast">Breakfast</option>
            <option value="lunch">Lunch</option>
            <option value="dinner">Dinner</option>
          </select>
  
          <label>Category:</label>
          <select value={category} onChange={(e) => setCategory(e.target.value)}>
            <option value="">Select Category</option>
            <option value="veg">Veg</option>
            <option value="non-veg">Non-Veg</option>
          </select>
  
          <label>Menu Name:</label>
          <input type="text" value={menu_name} onChange={(e) => setMenuName(e.target.value)} />
  
          <label>Price:</label>
          <input type="text" value={price} onChange={(e) => setPrice(e.target.value)} />
  
          <button type="submit">Add Menu</button>
        </form>
      </div>
      </div>
    );
  };
  
  export default VendorDashboard;