package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.data.Group;
import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Resource
    GroupService groupService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Group> group() {
        return groupService.group();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Group> getGroups() {
        return groupService.getGroups();
    }
}
