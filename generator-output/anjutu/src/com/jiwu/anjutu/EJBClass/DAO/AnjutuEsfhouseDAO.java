package com.jiwu.anjutu.dao;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.jiwu.anjutu.core.dao.IGenericDAO;
import com.jiwu.anjutu.entity.AnjutuEsfhouse;

/**
 * description anjutuesfhouse EJB DAO
 * 2014-8-19 10:18:44
 * @author jiwurapid
 */
@SuppressWarnings("unchecked")
@Stateless(name = "anjutuesfhouseDAO")
@Local(IGenericDAO.class)

public class AnjutuEsfhouseDAO extends  GenericDAOImpl<AnjutuEsfhouse, Integer> {
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