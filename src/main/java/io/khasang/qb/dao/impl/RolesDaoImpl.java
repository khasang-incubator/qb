package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.RolesDao;
import io.khasang.qb.entity.Roles;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class RolesDaoImpl extends BaseDaoImpl<Roles> implements RolesDao {

    @Override
    public Class<Roles> getEntityName() {
        return Roles.class;
    }

}
