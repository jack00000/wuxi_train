package org.whgc.idao;

import org.whgc.model.User;
import org.whgc.util.Session;

public interface IUserDao {
	Session addUser(User user);

}
