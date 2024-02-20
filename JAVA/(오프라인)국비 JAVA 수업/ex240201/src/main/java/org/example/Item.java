package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item implements Comparable{
    private long item_id;
    private String reg_time;
    private String update_time;
    private String created_by;
    private String modified_by;
    private String item_detail;
    private String item_nm;
    private String item_sell_status;
    private int price;
    private int stock_number;

    @Override
    public int compareTo(Object o) {
        return ((Item)o).price - this.price;
    }
}
