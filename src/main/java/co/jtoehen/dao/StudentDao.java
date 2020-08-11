package co.jtoehen.dao;

import co.jtoehen.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {

    public List<Student> getResults()
    {
        List<Student> students = new ArrayList<>();

        // retrieve data from database table.

        return students;
    }
}
