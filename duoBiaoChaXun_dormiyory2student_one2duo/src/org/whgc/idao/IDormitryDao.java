package org.whgc.idao;

import org.whgc.model.Dormitory;

public interface IDormitryDao {
	void addDormitry(Dormitory dorm);
	 Dormitory getDormitryById(String dormid);

}
