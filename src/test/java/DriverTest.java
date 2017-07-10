import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.hibernate.HikariConfigurationUtil;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Date: 10.07.2017
 *
 * @author Roman Litvishko
 */
public class DriverTest {

    private HikariDataSource dataSource;

    @Test
    public void driverTest() throws Exception {

        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("config.properties");
        properties.load(inputStream);

        HikariConfig config = HikariConfigurationUtil.loadConfiguration(properties);
        dataSource = new HikariDataSource(config);
    }
}
