import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Purchases extends PanacheEntity {
    public int total_value;
}
