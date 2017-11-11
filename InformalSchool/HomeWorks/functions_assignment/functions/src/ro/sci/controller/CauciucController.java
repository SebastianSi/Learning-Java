package ro.sci.controller;

import ro.sci.domain.SearchRequest;
import ro.sci.domain.Cauciuc;
import ro.sci.service.CauciucService;


public class CauciucController {
    private CauciucService cauciucService = new CauciucService();

    public Cauciuc findCauciuc (SearchRequest searchRequest) {
        Cauciuc cauciuc = this.cauciucService.findCauciuc(searchRequest);
        return cauciuc;
    }

}
