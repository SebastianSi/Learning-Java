package ro.sci.domain;

import java.util.UUID;
/*
Please extend the class example attached to moodle as follows:
- add relevant fields to the Cauciuc (size, radius, type, ...)
- add a CauciucService class that will allow searching through a predefined array or cauciuce :D (similar to what is done in UserService)
- add a CauciucController class that will be able to handle a search by a SearchCauciucRequest, pretty much like LoginController is handling the LoginRequest
- add an example of search for cauciuce in the Main class - similar to what we did for user


Hints:
- please note the package organization
- be careful to imports
- be careful to statics (there should be none into this assignment except the Main.main() )
 */

public class Cauciuc {
    private float size;
    private float radius;
    private String type;
    private String uuid;

    public Cauciuc(float size, float radius, String type) {
        this.size = size;
        this.radius = radius;
        this.type = type;
        this.uuid = generateUuid();
    }

    private String generateUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    };
}
