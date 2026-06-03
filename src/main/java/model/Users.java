import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Users extends PanacheEntity {
    @OneToMany
    public List<Purchases> Purchases;
}
