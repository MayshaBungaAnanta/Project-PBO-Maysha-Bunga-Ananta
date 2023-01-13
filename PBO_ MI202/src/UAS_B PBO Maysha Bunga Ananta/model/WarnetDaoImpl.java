/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.model;

import UAS_B.model.WarnetDao;
import UAS_B.model.Pelanggan;
import UAS_B.model.Warnet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author satri
 */
public class WarnetDaoImpl implements WarnetDao {
    private List<Warnet> data = new ArrayList<>();

    public WarnetDaoImpl() {
    }
    

    @Override
    public void save(Warnet warnet) {
                data.add(warnet);

    }

    @Override
    public void update(int index, Warnet warnet) {
                data.set(index, warnet);

    }

    @Override
    public void delete(int index) {
         data.remove(index);
    }

    @Override
    public Warnet getWarnet(int index) {
        return data.get(index);

    }

    @Override
    public List<Warnet> getAllWarnet() {
        return data;

    }

   
}
