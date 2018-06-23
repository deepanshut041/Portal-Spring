package in.futurastic.portal.service.auth;

import in.futurastic.portal.model.auth.User;

public interface UserService {
    User saveUser(User user);
    User getSelf();
}
