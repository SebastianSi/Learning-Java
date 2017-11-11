package ro.sci.service;


import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchRequest;

public class CauciucService {
    private Cauciuc[] cauciuce;

    public CauciucService() {
        initMockCauciuce();
    }

    public Cauciuc findCauciucByType(String type) {
        for (Cauciuc cauciuc : cauciuce) {
            if (type.equals(cauciuc.type)) {
                return cauciuc;
            }
        }
    }

    public Cauciuc findCauciuc(SearchRequest searchRequest) {
        if (searchRequest.type) {
            return findCauciucByType(searchRequest.type);
        }
    }

    private void initMockCauciuce() {
        // declaring some test cauciuce so that we can search through them
        Cauciuc winterRubber = new Cauciuc(24, 9, "winter_rubber");

        Cauciuc summerRubber = new Cauciuc(23, 7, "summer_rubber");

        Cauciuc rainRubber = new Cauciuc(16, 7, "rain_rubber");

        cauciuce = new Cauciuc[]{winterRubber, summerRubber, rainRubber};
    }
}

