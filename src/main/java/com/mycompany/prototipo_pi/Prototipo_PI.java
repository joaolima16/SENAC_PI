

package com.mycompany.prototipo_pi;

import DBConnection.ConnectionDB;
import java.sql.SQLException;

/**
 *
 * @author Grupo - Loja de calçados
 */
public class Prototipo_PI {

    public static void main(String[] args) throws SQLException {
        ConnectionDB connDb = new ConnectionDB();
        connDb.createTables();
    }
}
