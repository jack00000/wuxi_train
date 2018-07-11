package org.whgc.iservce;

import org.whgc.model.LogStudent;
import org.whgc.model.User;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public interface IRegisterSerivceDao {

	void RegisterUser(User u ,LogStudent logstu);
}
