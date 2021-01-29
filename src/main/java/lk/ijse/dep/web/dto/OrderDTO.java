package lk.ijse.dep.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.json.bind.annotation.JsonbDateFormat;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO implements Serializable {

    private String orderId;
    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDate orderDate;
    private String customerId;
    private List<OrderDetailDTO> orderDetails = new ArrayList<>();


}
