package CheckpointSpringBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class CheckpointModelEntity {
    @Id
    private Long id;
}
