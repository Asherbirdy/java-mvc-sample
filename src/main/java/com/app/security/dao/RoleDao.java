package com.app.security.dao;

import com.app.security.model.Role;

public interface RoleDao {

    Role getRoleByName(String roleName);
}
