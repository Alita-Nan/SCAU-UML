package view;

import domain.ATM;
import experiment.ClassUtil;
import experiment.Factory;
import experiment.InjectWorker;

import java.util.List;

/**
 * 程序启动类
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		List<Class> total = ClassUtil.getClassesByMultiPackage("domain", "remote", "physical");
		// Create all strawberries!
		Factory factory = new Factory(total);
		InjectWorker injectWorker = new InjectWorker(factory);
		// Dependency injection.
		injectWorker.inject(total);
		// Get ATM from factory.
		AtmFrame frame = new AtmFrame((ATM)factory.get("ATM"));
		//仅供测试查看登录面板GUI效果
		//frame.refreshDisplayPanel(frame.getLoginPanel());

		//仅供测试查看取款面板GUI效果
		//frame.refreshDisplayPanel(frame.getWithdrawlPanel());

		//仅供测试查看打印凭证面板GUI效果
		//frame.refreshDisplayPanel(frame.getPrintPanel());

		//仅供测试交易服务菜面板GUI效果
		//frame.refreshDisplayPanel(frame.getServicePanel());
	}
}
