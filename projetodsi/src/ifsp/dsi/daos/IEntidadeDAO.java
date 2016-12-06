/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.daos;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Doug Modena
 * @param <T> Tipo da Classe
 */
public interface IEntidadeDAO<T> {
    void salvar(T t) throws SQLException;
    List<T> listar() throws SQLException;
}
