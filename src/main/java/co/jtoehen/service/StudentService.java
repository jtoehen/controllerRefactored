package co.jtoehen.service;

import co.jtoehen.dao.StudentDao;
import co.jtoehen.model.PagingDto;
import co.jtoehen.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao dao;

    public StudentDao retrieveList(PagingDto<Student> pagingDto, boolean b) {

        return dao;
    }
}
