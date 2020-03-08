package  com.example.demo.util;

import java.util.Calendar;

public class ProducerTask implements Runnable {
	private static Integer  num=1;

	private Cache cache;

	public ProducerTask(Cache cache) {
		this.cache = cache;
	}

	public void run() {
		while (true) {
			if (cache.size() == 0) {
				// 一次生产5个订单号 2019415001-2019415005
				for (int i = 1; i <= 5; i++) {
					Calendar c = Calendar.getInstance();
					String oid = new StringBuffer().append(c.get(Calendar.YEAR)).append((c.get(Calendar.MONTH )+1))
							.append(c.get(Calendar.DATE)).append("00").append(num++).toString();
					cache.save(oid);
					System.out.println("【生产者" + Thread.currentThread().getName() + "】生产了第" + i + "个订单号");
				}

			}
		}
	}

}
