package co.jtoehen.controller;

import co.jtoehen.model.*;
import co.jtoehen.service.ParentService;
import co.jtoehen.service.StudentService;
import co.jtoehen.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CommonController extends AbstractController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private ParentService parentService;

    @RequestMapping(value = {"/common/searchTeacher"}, method = RequestMethod.GET)
    public @ResponseBody Object searchTeacher(@RequestParam(value = "term") String term) throws Exception {

        List<Map<String, String>> ret = new ArrayList<>();

        List<Teacher> members = teacherService.retrieveList(
                configurePagingDto(new PagingDto(), term),
                false).getResults();

        populateResponse(ret, members);

        return ret;
    }

    @RequestMapping(value = {"/common/searchStudent"}, method = RequestMethod.GET)
    public @ResponseBody Object searchStudent(@RequestParam(value = "term") String term) throws Exception {

        List<Map<String, String>> ret = new ArrayList<>();

        List<Student> members = studentService.retrieveList(
                configurePagingDto(new PagingDto(), term),
                false).getResults();

        populateResponse(ret, members);

        return ret;
    }

    @RequestMapping(value = {"/common/searchParent"}, method = RequestMethod.GET)
    public @ResponseBody Object searchParent(@RequestParam(value = "term") String term) throws Exception {

        List<Map<String, String>> ret = new ArrayList<>();

        List<Parent> members = parentService.retrieveList(
                configurePagingDto(new PagingDto(), term),
                false).getResults();

        populateResponse(ret, members);

        return ret;
    }

}
