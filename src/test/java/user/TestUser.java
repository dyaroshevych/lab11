package user;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestUser {

    @Test
    public void testUser() {
        User user = User.builder()
                .name("Dima")
                .age(18)
                .height(177)
                .race("black")
                .occupation("Co-founder of InstaNet")
                .build();

        assertEquals("Dima", user.getName());
        assertEquals(18, user.getAge());
        assertEquals(177, user.getHeight());
        assertEquals("black", user.getRace());
        assertArrayEquals(new String[] {"Co-founder of InstaNet"}, user.getOccupations().toArray());
    }
}