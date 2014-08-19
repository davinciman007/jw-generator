<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign classNameLowerCase = className?lower_case>
package ${basepackage}.dao;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ${basepackage}.core.dao.IGenericDAO;
import ${basepackage}.entity.${className};

/**
 * description ${classNameLowerCase} EJB DAO
 * ${.now}
 * @author ${author}
 */
@SuppressWarnings("unchecked")
@Stateless(name = "${classNameLowerCase}DAO")
@Local(IGenericDAO.class)

public class ${className}DAO extends  GenericDAOImpl<${className}, Integer> {
	@PersistenceContext(unitName = "${dbName}_master")
	private EntityManager m_em;

	@PersistenceContext(unitName = "${dbName}_slaves")
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