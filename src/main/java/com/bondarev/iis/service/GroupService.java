package com.bondarev.iis.service;

import com.bondarev.iis.model.Group;

import java.util.List;

public interface GroupService {

    public List<Group> getListGroup();

    public void addGroup(Group group);

    public void updateGroup(Group group);

    public Group getGroupById(int id);

    public void removeGroup(int id);

}
