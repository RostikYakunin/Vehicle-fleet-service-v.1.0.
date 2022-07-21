package courseworke3.repositories.implementation;


import courseworke3.models.Route;
import courseworke3.models.transports.Transport;
import courseworke3.repositories.repointerfaces.TransportRepo;

import java.util.ArrayList;
import java.util.List;

public class TransportRepoImpl implements TransportRepo {

    private final List<Transport> listOfTransports;

    public TransportRepoImpl () {
        this.listOfTransports = new ArrayList<>();
    }

    @Override
    public Transport add(Transport transport) {
        listOfTransports.add(transport);
        return transport;
    }

    @Override
    public void remove(Integer id) {
        List <Transport> temp = listOfTransports;
        temp.remove(findById(id));
    }

    @Override
    public Transport findById(Integer id) {
        return listOfTransports.get(id);
    }

    @Override
    public List<Transport> findAll() {
        return listOfTransports;
    }

}