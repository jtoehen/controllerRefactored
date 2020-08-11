package co.jtoehen.controller;

import co.jtoehen.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractController {

    protected void populateResponse(List<Map<String, String>> ret, List<? extends Member> members)
    {
        String label = null;

        for (Member member : members) {
            Map<String, String> res = new HashMap<String, String>();
            if(member instanceof Parent)
                label = ((Parent)member).getEducationHistory();
            else if(member instanceof Teacher)
                label = ((Teacher)member).getExperience();
            else if(member instanceof Student)
                label = ((Student)member).getInterests();

            res.put("label", label);
            res.put("value", member.getId());
            ret.add(res);
        }
    }

    protected PagingDto configurePagingDto(PagingDto pagingDto, String term)
    {
        pagingDto.setResultsPerPage(null);
        pagingDto.setSearch(term);

        return pagingDto;
    }
}
