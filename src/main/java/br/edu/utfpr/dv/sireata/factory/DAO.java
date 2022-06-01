package br.edu.utfpr.dv.sireata.factory;

import br.edu.utfpr.dv.sireata.dao.AnexoDAO;

public class DAO {
  public static IDaoFactory getInstance() {
    return (IDaoFactory) new AnexoDAO();
  }
}
