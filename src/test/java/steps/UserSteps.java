package steps;

import io.restassured.response.Response;
import model.User;
import request.Request;

public class UserSteps {

    public Response delete() {
        return Request.delete("api/users/2");
    }

    public User login(User user) {
        return Request.post("api/login", user).as(User.class);
    }

    public User register(User user) {
        return Request.post("api/register", user).as(User.class);
    }

    public User update(User user) {
        return Request.put("api/users/2", user).as(User.class);
    }

    public User create(User user) {
        return Request.post("api/users", user).as(User.class);
    }
}
