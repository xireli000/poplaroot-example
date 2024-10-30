package poplaroot.communication.example.service2.DualPlugExample.demonstration3.demo.entty;

import io.protostuff.Tag;
import lombok.Data;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 12:48
 */
@Data
public class ServiceResponseDTO {
    @Tag(1)
    private ServiceRpcExtend consumerRpcExtend;
}
