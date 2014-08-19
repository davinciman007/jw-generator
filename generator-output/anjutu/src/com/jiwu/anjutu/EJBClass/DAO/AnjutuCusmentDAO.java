package com.jiwu.anjutu.dao;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.jiwu.anjutu.core.dao.IGenericDAO;
import com.jiwu.anjutu.entity.AnjutuCusment;

/**
 * description anjutucusment EJB DAO
 * 2014-8-19 10:18:17
 * @author jiwurapid
 */
@SuppressWarnings("unchecked")
@Stateless(name = "anjutucusmentDAO")
@Local(IGenericDAO.class)

public class AnjutuCusmentDAO extends  GenericDAOImpl<AnjutuCusment, Integer> {
	@PersistenceContext(unitName = "anjutu_flat_master")
	private EntityManager m_em;

	@PersistenceContext(unitName = "anjutu_flat_slaves")
	private EntityManager s_em;

	@Override
	protected EntityManager getMasterDBEntityManager() {
		return m_em;
	}

	@Override
	protected EntityManager getSlavesDBEntityManager() {
		return s_em;
	}
}