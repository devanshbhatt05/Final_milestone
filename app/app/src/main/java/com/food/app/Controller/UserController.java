package com.food.app.Controller;

import com.food.app.Dao.*;
import com.food.app.Enties.*;
import com.food.app.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private ScheduleMealMultipleRepository scheduleMealMultipleRepository;

        private final VendorRepository vendorRepository;
        private final UserRepository userRepository;

        @Autowired
        private final ScheduleMealRepository scheduleMealRepository;
       // private final ScheduleMealMultipleRepository scheduleMealMultipleRepository;

  /*      private final OrderRepository orderRepository;

        private  RatingRepository ratingRepository;
*/
        public UserController(VendorRepository vendorRepository, UserRepository userRepository, ScheduleMealRepository scheduleMealRepository, ScheduleMealMultipleRepository scheduleMealMultipleRepository /*OrderRepository orderRepository, RatingRepository ratingRepository*/) {
            this.vendorRepository = vendorRepository;
            this.userRepository = userRepository;
            this.scheduleMealRepository = scheduleMealRepository;
            this.scheduleMealMultipleRepository = scheduleMealMultipleRepository;
           /* this.orderRepository = orderRepository;
            this.ratingRepository = ratingRepository;*/
        }


        @PostMapping("/{user_Id}/schedule-meal")
        public ResponseEntity<String> scheduleMeal(@PathVariable Long id, @RequestBody ScheduleMealRequest request) {
            Optional<User> optionalUser = userRepository.findById(id);
            Optional<Vendor> optionalVendor = vendorRepository.findById((Long) request.getVendorId());

            if (optionalUser.isPresent() && optionalVendor.isPresent()) {
                User user = optionalUser.get();
                Vendor vendor = optionalVendor.get();

                ScheduleMeal scheduleMeal = new ScheduleMeal();
                scheduleMeal.setScheduledTime(request.getScheduledTime());
                scheduleMeal.setUser(user);
                scheduleMeal.setVendor(vendor);

                scheduleMealRepository.save(scheduleMeal);

                return ResponseEntity.ok("Meal plan scheduled successfully");
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @PostMapping("/{user_Id}/schedule-meal-multiple")
        public ResponseEntity<String> scheduleMealMultiple(@PathVariable Long id,
                                                           @RequestBody ScheduleMealMultipleRequest request) {
            Optional<User> optionalUser = userRepository.findById(id);
            List<Vendor> vendors = vendorRepository.findAllById(request.getVendorIds());

            if (optionalUser.isPresent()) {
                User user = optionalUser.get();

                ScheduleMealMultiple scheduleMealMultiple = new ScheduleMealMultiple();
                scheduleMealMultiple.setScheduledTime(request.getScheduledTime());
                scheduleMealMultiple.setUser(user);
                scheduleMealMultiple.setVendors(vendors);

                scheduleMealMultipleRepository.save(scheduleMealMultiple);

                return ResponseEntity.ok("Meal plans scheduled with multiple vendors successfully");
            } else {
                return ResponseEntity.notFound().build();
            }
        }






    @PostMapping("/registerUser")
    public String saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


  /*  @GetMapping("/{userId}/orders")
    public List<Order> getUserOrders(@PathVariable Long user_id) {
        return orderRepository.findAllByUserId(user_id);
    }

    @GetMapping("/{userId}/ratings")
    public List<Rating> getUserRatings(@PathVariable Long user_id) {
        return ratingRepository.findAllByUserId(user_id);
    }
*/


}






