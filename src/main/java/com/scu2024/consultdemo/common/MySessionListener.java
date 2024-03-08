package com.scu2024.consultdemo.common;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.stereotype.Component;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-08 15:05
 **/
@Component
public class MySessionListener implements HttpSessionListener {
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		SessionContext.addSession(se.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		SessionContext.delSession(session);
	}
}
