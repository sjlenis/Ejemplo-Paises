package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.dao.IPaisDao;
import co.edu.uceva.pais_service.model.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class PaisServiceImpl implements IPaisService{

    @Autowired
    IPaisDao paisDao;

    @Override
    public Pais save(Pais pais) {
        return null;
    }

    @Override
    public void delete(Pais pais) {

    }

    @Override
    public Pais update(Pais pais) {
        return null;
    }

    @Override
    public List<Pais> findAll() {

        return (List<Pais>) paisDao.findAll();
    }

    @Override
    public Pais findById(Long id) {
        return null;
    }
}
