
import com.cherkasov.entity.Entity;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
public class SpringMain {
    public static void main(String[] args) throws SQLException {
        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring-app.xml")) {

            System.out.println("Bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));

            DataSource dataSource = appCtx.getBean(DataSource.class);

            System.out.println(dataSource.getConnection());

            Connection conn = dataSource.getConnection();

            Statement statement = conn.createStatement();

            String sql = "SELECT * FROM table_name";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Entity> list = new ArrayList<Entity>();
            while (resultSet.next()) {
                list.add(new Entity(resultSet.getInt("id"), resultSet.getString("name1"), resultSet.getString("name2")));
            }
            resultSet.close();

            System.out.println(list);

/*            AdminRestController adminUserController = appCtx.getBean(AdminRestController.class);
            adminUserController.create(UserTestData.USER);
            System.out.println();

            MealRestController mealController = appCtx.getBean(MealRestController.class);
            List<MealWithExceed> filteredMealsWithExceeded =
                    mealController.getBetween(
                            LocalDate.of(2015, Month.MAY, 30), LocalTime.of(7, 0),
                            LocalDate.of(2015, Month.MAY, 31), LocalTime.of(11, 0));
            filteredMealsWithExceeded.forEach(System.out::println);*/
        }
    }
}
