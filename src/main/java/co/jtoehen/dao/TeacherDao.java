package co.jtoehen.dao;

import co.jtoehen.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeacherDao {

    public List<Teacher> getResults()
    {
        List<Teacher> teachers = new ArrayList<>();

        // retrieve data from database table.

        return teachers;
    }
}
