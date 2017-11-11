package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.SearchRequest;
import ro.sci.domain.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        }else {
            System.out.println("mai incearca " + loginRequest.loginName);
        }


        CauciucController cauciucController = new CauciucController();

        ArrayList<SearchRequest> searchRequests = new ArrayList<SearchRequest>();
        searchRequests.add(new SearchRequest(54, 9, "summer_ruber"));
        searchRequests.add(new SearchRequest("winter_rubber"));
        searchRequests.add(new SearchRequest(15));
        searchRequests.add(new SearchRequest(54, 9);

        searchRequests.forEach((a)->cauciucController.findCauciuc(a));

    }
}
