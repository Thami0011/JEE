package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    @Autowired
    private IDao dao; // Couplage faible.
    @Override
    public double calcul() {

        return dao.getData()*10;
    }

    /*
    Injecter dans la variable dao un objet d'une classe qui implemente l'interface IDao.
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
