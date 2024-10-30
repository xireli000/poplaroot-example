package poplaroot.communication.example.service.spring1.DualPlugExample.demonstration1.entty;

import io.protostuff.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/9/11 21:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerUser {

    @Tag(1)
    private String name;

    @Tag(2)
    private Integer age;
}
