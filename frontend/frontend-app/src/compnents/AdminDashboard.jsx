import React, { useState, useEffect } from 'react';
import axios from 'axios';

const  AdminDashboard = () => {
  const [notifications, setNotifications] = useState([]);

  useEffect(() => {
    fetchNotifications();
  }, []);

  const fetchNotifications = async () => {
    try {
      const response = await axios.get('http://localhost:8080/admins/notifications'); // Replace with your API endpoint for notifications
      setNotifications(response.data);
    } catch (error) {
      console.error('Error fetching notifications:', error);
    }
  };

  const handleApproval = async (menuId) => {
    try {
      // Approve the notification
      await axios.post(`http://localhost:8080/notifications/${menuId}/approve`); // Replace with your API endpoint for approving notifications

      // Fetch updated notifications
      fetchNotifications();
    } catch (error) {
      console.error('Error approving notification:', error);
    }
  };

  return (
    <div>
      <h2>Admin Approval</h2>
      {notifications.length === 0 ? (
        <p>No new notifications</p>
      ) : (
        <ul>
          {notifications.map(notification => (
            <li key={notification.id}>
              {notification.message}
              <br></br>
              <button onClick={() => handleApproval(notification.id)}>Approve</button>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default AdminDashboard;
