package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.RolesDao;
import io.khasang.qb.entity.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class RolesDaoImpl extends BaseDaoImpl<Role> implements RolesDao {

    @Override
    public Class<Role> getEntityName() {
        return Role.class;
    }

}
