package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/search")
    public String loadSearchPage() {
        return "searchpage";
    }

    @RequestMapping("/searchQuery")
    public RedirectView processSearchQuery(@RequestParam("searchQuery") String query) {
        String url = "https://google.com/search?q=" + query;
        RedirectView rv = new RedirectView();
        rv.setUrl(url);
        return rv;
    }

//    @RequestMapping("/searchQuery")
//    public String processSearchQuery(@RequestParam("searchQuery") String query) {
//        String url = "https://google.com/search?q=" + query;
//        // If you include the slash 'redirect:/url' then path would be an relative to current. localhost:3306/https:
//        return "redirect:" + url ;
//    }
}
