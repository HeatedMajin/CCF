package b_queue;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();// ���鳤��
		int[] queue = new int[len];
		// ��ʼ������
		for (int i = 0; i < len; i++) {
			queue[i] = i + 1;
		}

		// ��������
		int times = scanner.nextInt();
		// ���е���
		for (int i = 0; i < times; i++) {
			int start = scanner.nextInt();
			// ���������ҵ�������λ��
			int x;// ��¼��ʱ��ʼ�ƶ���λ��
			for (x = 0; x < len && queue[x] != start; x++);
			// �ƶ��ľ���
			int move = scanner.nextInt();
			int end = x + move;
			int temp = queue[x];
			// ����ƶ� end>x
			if (move > 0) {
				for (int y = x; y < end; y++) {
					queue[y] = queue[y + 1];
				}
			} else {
				// ��ǰ�ƶ� end < start
				for (int y = x; y > end; y--) {
					queue[y] = queue[y - 1];
				}
			}
			queue[end] = temp;
		}

		// ������
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i] + " ");
		}
	}
}
