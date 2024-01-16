package org.vlad.grin.sprbt;


import org.vlad.grin.sprbt.domain.ToDo;
import org.vlad.grin.sprbt.repository.ToDoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToDoSimpleMockBeanTests {

    @MockBean
    private ToDoRepository repository;

    @Test
    public void toDoTest() {
        given(this.repository.findById("my-id")).willReturn(new ToDo("Read a Book"));
        assertThat(this.repository.findById("my-id").getDescription()).isEqualTo("Read a Book");
    }
}
