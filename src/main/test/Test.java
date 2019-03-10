import com.ssh.test.bean.ItripHotelEntity;
import com.ssh.test.dao.ItripHotelDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {


    @org.junit.Test
    public void testList() {
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItripHotelDao itripHotelDao = (ItripHotelDao) resource.getBean("itripHotelDao");

//          List<ItripHotelEntity> list =itripHotelDao.getItripHotelList();
        List<ItripHotelEntity> list = itripHotelDao.findByName("北京首都大酒店");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getId());
        }

    }
}
