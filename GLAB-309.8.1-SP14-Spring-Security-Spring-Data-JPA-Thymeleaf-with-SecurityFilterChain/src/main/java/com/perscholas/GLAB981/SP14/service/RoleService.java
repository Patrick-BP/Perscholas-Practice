package com.perscholas.GLAB981.SP14.service;

import com.perscholas.GLAB981.SP14.model.Role;

import java.util.List;

public interface RoleService {
    public void saveRole(Role role);
    public Role findRoleByRoleName(String name);
    public List<Role> getAllRoles();
    public List<Role> getRolesByUser(long id);
}



