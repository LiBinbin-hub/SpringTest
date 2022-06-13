import com.test.bean.MainConfiguration;
import com.test.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("项目正在启动");
        //使用AnnotationConfigApplicationContext来实现注解配置
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        TestService service = context.getBean(TestService.class);
        service.test();
    }
}

