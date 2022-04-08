package gft_start.aplication;

import gft_start.CPU;
import gft_start.DiscoRigido;
import gft_start.Hardware;
import gft_start.Memoria;

public class Aplication {

	public static void main(String[] args) {
		
		
		var h = new Hardware(1,"desktop",3000.00,"acer");
		
		 var m= new Memoria(8,1666,"ddr4");
		 h.InstalarMemoria(m);
	
		 var d = new DiscoRigido(1000,220000,"SSD");
		 h.InstalarDiscoRigido(d);
		 
		 var c = new CPU(3220,"intel i7");
		 h.InstalarCPU(c);
		 
		 h.getDetalhesHardware();
	}

}
