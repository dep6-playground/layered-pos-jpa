package lk.ijse.dep.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDetailDTO implements Serializable {

    private String orderId;
    private String itemCode;
    private Integer qty;
    private BigDecimal unitPrice;

}
