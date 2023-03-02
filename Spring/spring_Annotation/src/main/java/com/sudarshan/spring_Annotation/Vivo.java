package com.sudarshan.spring_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vivo {
	
	@Autowired
	@Qualifier("snapdragoan")

	mobileProcessor cpu;
	
	public mobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(mobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("octa core,4-64gb,12mp");
        cpu.process();

	}

}
