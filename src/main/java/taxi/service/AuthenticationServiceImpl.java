package taxi.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        logger.info("Login method was called. Params: login = {}", login);
        Driver driver = driverService.findByLogin(login);
        if (driver != null && driver.getPassword().equals(password)) {
            logger.info("Login method was a success. Params: login = {}", login);
            return driver;
        }
        logger.error("User with username : login={} has incorrect username or password.", login);
        throw new AuthenticationException("Username or password was incorrect");
    }
}
