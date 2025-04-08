package comlisanshuxue.lisan.dto;

//import io.swagger.models.auth.In;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class jihedto {
    private List<Integer> a = new ArrayList<>();  // 默认空列表
    private List<Integer> b = new ArrayList<>();
    private List<Integer> c = new ArrayList<>();
    private List<Integer> d = new ArrayList<>();
    public String shizi;

}
