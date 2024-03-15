package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.Service.BookService;

@SpringBootApplication
public class SpringExcelDataBasesApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(SpringExcelDataBasesApplication.class, args);
		BookService bean = context.getBean(BookService.class);
		//bean.bookSave();
		bean.generatExcel();
	}

}
