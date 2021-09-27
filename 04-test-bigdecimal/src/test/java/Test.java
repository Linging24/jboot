import com.jfinal.aop.Inject;
import com.linging.model.PayCoinConvertManage;
import com.linging.service.PayCoinConvertManageService;
import io.jboot.test.junit4.JbootRunner;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

/**
 * @Author linhuibin
 * @Date 2021/9/27 9:58
 */
@RunWith(JbootRunner.class)
public class Test {

    @Inject
    private PayCoinConvertManageService payCoinConvertManageService;

    @org.junit.Test
    public void test(){
        PayCoinConvertManage coinConvertManage = payCoinConvertManageService.findById("345602412341710848");
        System.out.println(coinConvertManage.getSellDayLimit().toString());


        BigDecimal num = new BigDecimal(0.03);
        System.out.println(num.toString());
    }

}
