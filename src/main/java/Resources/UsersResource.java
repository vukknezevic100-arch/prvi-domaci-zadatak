package Resources;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import model.Users;
@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class UsersResource extends PanacheEntity {

    @Inject
    EntityManager em;


    @POST
    @Path("/addUser")
    public Users addUser(Users u) {
        u.persist();
        return(u);
    }


}
