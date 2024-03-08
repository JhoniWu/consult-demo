package com.scu2024.consultdemo.common;

import jakarta.servlet.http.HttpSession;
import org.yaml.snakeyaml.error.MarkedYAMLException;

import javax.swing.plaf.synth.SynthColorChooserUI;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-08 15:02
 **/
public class SessionContext {
	public static HashMap mymap = new HashMap();
	public static synchronized void addSession(HttpSession session){
		if(session!=null){
			mymap.put(session.getId(), session);
		}
	}

	public static synchronized void delSession(HttpSession session){
		if(session!=null){
			mymap.remove(session);
		}
	}

	public static synchronized HttpSession getSession(String sessionId){
		if(sessionId==null){
			return null;
		}
		return  (HttpSession) mymap.get(sessionId);
	}
}
