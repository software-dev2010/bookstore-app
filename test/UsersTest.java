import com.bookstore.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsersTest {

    public static void main(String[] args) {
        Users user1 = new Users();
        user1.setEmail("you@codejava.net");
        user1.setFullName("George Bush");
        user1.setPassword("helloworld");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("books-store-app");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(user1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        System.out.println("A Users object was persisted");

    }
}
