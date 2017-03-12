package com.mdekhtiarenko.persistence.interfaces;

import com.mdekhtiarenko.persistence.entity.Discipline;

/**
 * Created by mykola.dekhtiarenko on 11.03.17.
 */
public interface DisciplineDao {
    Discipline add(Discipline discipline);
    Discipline get(int id);
}
