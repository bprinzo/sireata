package br.edu.utfpr.dv.sireata.factory;

public interface IDaoFactory {
  public int save(Object obj) throws Exception;

  public boolean remove(int id) throws Exception;

  public boolean update(Object obj) throws Exception;

  public Object getById(int id) throws Exception;

  public Object listByAta(int idAta) throws Exception;

  public IDaoFactory getDao(DAO anexo);
}
