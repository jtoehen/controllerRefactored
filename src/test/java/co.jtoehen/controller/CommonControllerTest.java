package co.jtoehen.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:application.xml")
public class CommonControllerTest
{
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception
    {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    /**
     * Test basic search with successful response.
     * @throws Exception
     */
    @Test
    public void testSearchTeacher() throws Exception
    {
        mockMvc.perform(get("/common/searchTeacher?term=test")
                .contentType(contentType))
                .andExpect(status().isOk());
    }

    /**
     * Test basic search with failed response.
     * @throws Exception
     */
    @Test
    public void testSearchTeacherFailed() throws Exception
    {
        mockMvc.perform(get("/common/searchTeacher")
                .contentType(contentType))
                .andExpect(status().is4xxClientError());
    }
}