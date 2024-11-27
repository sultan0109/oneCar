package onevision.onecar.service.serviseImpl;

import onevision.onecar.dto.ApiResponse;
import onevision.onecar.dto.user.UserDto;
import onevision.onecar.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public ApiResponse signUp(UserDto.Create request) {
        return null;
    }

    @Override
    public ApiResponse order(UserDto.Order request) {
        return null;
    }

    @Override
    public ApiResponse checkStatus(Long request) {
        return null;
    }

    @Override
    public ApiResponse invoise(Long orderId, Long userId) {
        return null;
    }
}
