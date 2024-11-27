package onevision.onecar.dto.user;

import lombok.Data;

public class UserDto {


    @Data
    public static class Order {
        private Long userId;
        private Long carId;
    }



    @Data
    public static class Create {
        private String firstName;
        private String lastName;
        private String phone;
        // car
        private String brand;
        private String model;
        private String vin;
    }
}
