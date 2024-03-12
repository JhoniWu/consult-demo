package com.scu2024.consultdemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-12 16:48
 **/
public class PCdemo {

	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(20);
		producer pro = new producer(q);
		consumer con = new consumer(q);
		Thread t = new Thread(() -> {
			try {
				pro.print();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				con.print();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});
		t.start();
		t2.start();
	}
}
class producer{
	BlockingQueue<Integer> q;
	producer(BlockingQueue q){
		this.q = q;
	}
	void print() throws InterruptedException {
		while (true){
			q.put(1);
			System.out.println("producer aa");
			Thread.sleep(1000);
		}
	}
}
class consumer{
	BlockingQueue<Integer> q;
	consumer(BlockingQueue q){
		this.q = q;
	}
	void print() throws InterruptedException {
		while (true){
			q.take();
			System.out.println("consumer bb");
			Thread.sleep(100);
		}
	}
}
