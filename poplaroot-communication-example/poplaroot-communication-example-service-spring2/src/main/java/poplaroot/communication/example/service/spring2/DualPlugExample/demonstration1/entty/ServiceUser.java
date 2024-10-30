package poplaroot.communication.example.service.spring2.DualPlugExample.demonstration1.entty;

import io.protostuff.Tag;
import lombok.Data;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/9/11 21:32
 */
@Data
public class ServiceUser {

    @Tag(1)
    private String name;

    @Tag(2)
    private Integer age;
}
