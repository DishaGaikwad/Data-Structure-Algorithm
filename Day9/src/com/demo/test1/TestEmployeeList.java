package com.demo.test1;
import beans.Employee;
import com.demo.linkedlists.SinglyLinkedListEmployee;
public class TestEmployeeList {
	public static void main(String[] args) {
		SinglyLinkedListEmployee elist=new SinglyLinkedListEmployee();
		elist.addNode(new Employee(12,"Dikshita",999999));
		elist.addNode(new Employee(13,"Revti",88888));
		elist.addNode(new Employee(14,"Ashu",78787));
		elist.addNode(new Employee(15,"Sangeeta",87878));
		elist.addNode(new Employee(16,"Medha",56789));
		elist.displayData();
		System.out.println("..........................................");
		elist.deleteByValue(16);
		elist.deleteByValue(12);
		elist.deleteByValue(17);
		elist.modifysalById(15,8888);
		elist.displayData();
	}

}
