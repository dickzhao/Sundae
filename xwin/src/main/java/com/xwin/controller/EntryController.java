package com.xwin.controller;

import com.xwin.common.utils.ReturnResult;
import com.xwin.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/entry")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @RequestMapping(value = "/getHotEntry",method = RequestMethod.GET)
    public ReturnResult getHotNews(){
        entryService.getHotNews();
        return null;
    }
}
