package task;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Tool tool1 = new Tool("包丁", "調理", 2);
		Tool tool2 = new Tool("彫刻刀", "工作", 3);
		Tool tool3 = new Tool("竹刀", "剣道", 1);

		System.out.println(tool1.getName() + "：" + tool1.getPurpose() + "用 " + tool1.getQuantity() + "本");
		System.out.println(tool2.getName() + "：" + tool2.getPurpose() + "用 " + tool2.getQuantity() + "本");
		System.out.println(tool3.getName() + "：" + tool3.getPurpose() + "用 " + tool3.getQuantity() + "本");

		System.out.println("\n");

		tool3.setPurpose("護身");
		System.out.println(tool3.getName() + "：" + tool3.getPurpose() + "用 " + tool3.getQuantity() + "本");

		System.out.println("\n");

		Tool tool4 = new Tool("ほうき", "掃除", 200);
		Tool tool5 = new Tool("物干しざお", "洗濯", 200);
		Tool tool6 = new Tool("待ち針", "裁縫", 500);
		Tool tool7 = new Tool("洗濯ばさみ", "洗濯", 800);
		Tool tool8 = new Tool("ちりとり", "掃除", 200);

		List<Tool> toolList = new ArrayList<Tool>();

		toolList.add(tool4);
		toolList.add(tool5);
		toolList.add(tool6);
		toolList.add(tool7);
		toolList.add(tool8);

		for (Tool tool : toolList) {
			System.out.println("商品名：" + tool.getName());
			System.out.println("用途：" + tool.getPurpose());
			System.out.println("在庫数：" + tool.getQuantity() + "\n");

		}

		System.out.println("\n");

		Tool tool9 = new Tool("はさみ", "文具", 200);

		if (tool9.getPurpose().equals("園芸")) {
			System.out.println(tool9.getName() + "は、園芸コーナーにあります。");
		} else if (tool9.getPurpose().equals("裁縫")) {
			System.out.println(tool9.getName() + "は、裁縫コーナーにあります。");
		} else if (tool9.getPurpose().equals("工作")) {
			System.out.println(tool9.getName() + "は、工作コーナーにあります。");
		} else {
			System.out.println(tool9.getName() + "は取り扱ってません。");
		}

		System.out.println("\n");

		for (Tool tool : toolList) {
			if (tool.getQuantity() == 500) {
				System.out.println(tool.getName() + "は500個在庫があります。\n");
			} else if (tool.getQuantity() > 500) {
				System.out.println(tool.getName() + "は500個より多くの在庫があります。\n");
			} else if (tool.getQuantity() < 500) {
				System.out.println(tool.getName() + "は500個揃いません。\n");
			}
		}
	}

}
