package com.websystique.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.websystique.springmvc.model.Car;
import com.websystique.springmvc.model.CarList;

@Controller

public class ThucHanh1 {
	/*pathvariable
	 * http://localhost:8080/Spring4MVCHelloWorldNoXMLDemo/pathvariable/blackdog/dennhucho*/
	@RequestMapping(value="pathvariable/{name}/{password}")
	@ResponseBody
	public String xuatTT(@PathVariable("name") String name,@PathVariable("password") String pass) {
		return "pet 1 ten: "+name+" mat ma: "+pass;
	}
	
	
	@RequestMapping(value="requestparam")
	@ResponseBody
	public String tong(@RequestParam("a") int a,@RequestParam("b") int b) {
		int c=a+b;
		return "Ket qua:"+c;
	}
	
	@RequestMapping(value="car")
	@ResponseBody
	public Car cars() {
		Car car1=new Car();
		car1.setBrand("BMW");
		car1.setDate("10-29-2018");
		car1.setName("320i");
		car1.setWeight(2.0);
		return car1;
	}
	
	@RequestMapping(value="listcar")
	@ResponseBody
	public ArrayList<Car> listcar() {
		ArrayList<Car> list=new ArrayList<Car>();
		Car car1=new Car();
		car1.setBrand("BMW");
		car1.setDate("10-29-2018");
		car1.setName("320i");
		car1.setWeight(2.0);
		list.add(car1);
		
		Car car2=new Car();
		car2.setBrand("WQG");
		car2.setDate("10-29-2018");
		car2.setName("320i");
		car2.setWeight(2.0);
		list.add(car2);
		
		Car car3=new Car();
		car3.setBrand("BBB");
		car3.setDate("10-29-2018");
		car3.setName("320i");
		car3.setWeight(2.0);
		list.add(car3);
		
		Car car4=new Car();
		car4.setBrand("AAA");
		car4.setDate("10-29-2018");
		car4.setName("320i");
		car4.setWeight(2.0);
		list.add(car4);
		return list;
		
		
	}
	
	@RequestMapping(value="carweight",method=RequestMethod.POST)
	@ResponseBody
	public Car timCarNang(@RequestBody CarList cl) {
		Car maxWeight=cl.getListXe().get(0);
		for(Car car:cl.getListXe())
			if(car.getWeight()>maxWeight.getWeight())
				maxWeight=car;
		return maxWeight;
	}
}
