package poplaroot.communication.example.service.spring1.DualPlugExample.demonstration1.entty;

import io.protostuff.Tag;
import lombok.Data;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 12:48
 */
@Data
public class ConsumerResponseUniversalDTO<T> {

    @Tag(1)
    private T myRpcExtend;
}