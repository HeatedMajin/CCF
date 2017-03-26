package b_queue;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();// 队伍长度
		int[] queue = new int[len];
		// 初始化队伍
		for (int i = 0; i < len; i++) {
			queue[i] = i + 1;
		}

		// 调整次数
		int times = scanner.nextInt();
		// 进行调整
		for (int i = 0; i < times; i++) {
			int start = scanner.nextInt();
			// 遍历数组找到调整的位置
			int x;// 记录此时开始移动的位置
			for (x = 0; x < len && queue[x] != start; x++);
			// 移动的距离
			int move = scanner.nextInt();
			int end = x + move;
			int temp = queue[x];
			// 向后移动 end>x
			if (move > 0) {
				for (int y = x; y < end; y++) {
					queue[y] = queue[y + 1];
				}
			} else {
				// 向前移动 end < start
				for (int y = x; y > end; y--) {
					queue[y] = queue[y - 1];
				}
			}
			queue[end] = temp;
		}

		// 输出结果
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i] + " ");
		}
	}
}
