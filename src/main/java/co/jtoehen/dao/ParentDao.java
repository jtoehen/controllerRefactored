package co.jtoehen.dao;

import co.jtoehen.model.Parent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParentDao {

    public List<Parent> getResults()
    {
        List<Parent> parents = new ArrayList<>();

        // retrieve data from database table.

        return parents;
    }
}
