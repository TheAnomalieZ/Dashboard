package com.taz.TAZ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import java.security.Principal;

/**
 * Created by K.Kokulan on 11/8/2016.
 */

@Controller
public class GraphPageController {

    @RequestMapping(value = "/graph")
    public String index() {
        return "TAZ/graph_page";
    }
}
