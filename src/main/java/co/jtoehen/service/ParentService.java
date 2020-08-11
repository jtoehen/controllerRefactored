package co.jtoehen.service;

import co.jtoehen.dao.ParentDao;
import co.jtoehen.model.PagingDto;
import co.jtoehen.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService {

    @Autowired
    private ParentDao dao;

    public ParentDao retrieveList(PagingDto<Parent> pagingDto, boolean b) {

        return dao;
    }
}
