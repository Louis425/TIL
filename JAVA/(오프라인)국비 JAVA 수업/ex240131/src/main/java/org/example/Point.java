package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

// clone 메서드를 정의 하려면
// cloneable 인터페이스를 상속받아야 한다.

@Data
@AllArgsConstructor
public class Point implements Cloneable{
    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
