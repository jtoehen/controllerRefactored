package co.jtoehen.service;

import co.jtoehen.dao.TeacherDao;
import co.jtoehen.model.PagingDto;
import co.jtoehen.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherDao dao;

    public TeacherDao retrieveList(PagingDto<Teacher> pagingDto, boolean b) {

        return dao;
    }
}
