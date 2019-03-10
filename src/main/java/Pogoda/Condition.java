package Pogoda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author nieckarz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condition {

    private String text;
    private String icon;
    private int code;
}
