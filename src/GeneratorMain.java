import java.io.IOException;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * description
 * 2014-8-18
 * @author jwjw233233@163.com
 */

/**
 * @author Administrator
 *
 */
public class GeneratorMain {

	/**
	 * description
	 * 2014-8-18
	 * @author jwjw233233@163.com
	 */
	public static void main(String[] args) {
		GeneratorFacade g = new GeneratorFacade();
		try {
			g.deleteOutRootDir();
			//g.generateByTable("message", "template");
			g.generateByAllTable("template");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
