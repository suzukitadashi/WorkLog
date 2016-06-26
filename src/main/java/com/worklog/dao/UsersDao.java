package com.worklog.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.builder.SelectBuilder;
import org.springframework.transaction.annotation.Transactional;

import com.worklog.entity.Users;

@ConfigAutowireable
@Dao
public interface UsersDao {

	default Users findOne(String userId) {

		Config config = Config.get(this);
		SelectBuilder builder = SelectBuilder.newInstance(config);
		builder.sql("select * from USERS where user_id = ").param(String.class, userId);
		return builder.getEntitySingleResult(Users.class);

	}

	@Insert
	@Transactional
	int insert(Users user);

	@Update
	@Transactional
	int update(Users user);

	@Delete
	int delete(Users userId);
}
