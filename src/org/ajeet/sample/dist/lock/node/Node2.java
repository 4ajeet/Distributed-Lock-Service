package org.ajeet.sample.dist.lock.node;

import java.io.IOException;

import org.ajeet.sample.dist.lock.LockManager;

public class Node2 {
	
	public static void main(String[] args) throws IOException {
		LockManager manager = new LockManager("230.0.0.1", "Node2");
		manager.start();
	}


}
