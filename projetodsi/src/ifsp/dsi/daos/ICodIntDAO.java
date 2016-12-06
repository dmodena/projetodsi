/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.daos;

import java.sql.SQLException;

/**
 *
 * @author Doug Modena
 * @param <T> Tipo da Classe
 */
public interface ICodIntDAO<T> {
    T buscarPorId(int id) throws SQLException;
}
