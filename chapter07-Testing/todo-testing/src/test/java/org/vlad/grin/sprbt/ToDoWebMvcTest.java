package org.vlad.grin.sprbt;


import org.vlad.grin.sprbt.controller.ToDoController;
import org.vlad.grin.sprbt.domain.ToDo;
import org.vlad.grin.sprbt.repository.ToDoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ToDoController.class)
public class ToDoWebMvcTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ToDoRepository toDoRepository;

    @Test
    public void toDoControllerTest() throws Exception {
        given(this.toDoRepository.findById("my-id"))
                .willReturn(new ToDo("Do Homework", true));

        this.mvc.perform(get("/todo/my-id").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string("{\"id\":\"my-id\",\"description\":\"Do Homework\",\"completed\":true}"));
    }

}
