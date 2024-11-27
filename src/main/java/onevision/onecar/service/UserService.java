package onevision.onecar.service;
import onevision.onecar.dto.ApiResponse;
import onevision.onecar.dto.user.UserDto;





public interface UserService {


    ApiResponse signUp (UserDto.Create request);

    ApiResponse order (UserDto.Order request);


    ApiResponse checkStatus(Long request);

    ApiResponse invoise(Long orderId, Long userId);
}
