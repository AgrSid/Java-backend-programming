package Day8;


	import java.io.Serializable;

	@SuppressWarnings("serial")
	public class Account implements Serializable
	{
	  int acc_num;
	  String cus_name;
	  String address;
	  String cus_type;
	  double loan_amt;
	  double intrst_rt;
	  int term;
	  String loan_type;
	public Account(int acc_num, String cus_name, String address, String cus_type,int term, double loan_amt, double intrst_rt,
	  String loan_type)
	{
	 this.acc_num = acc_num;
	 this.cus_name = cus_name;
	 this.address = address;
	 this.cus_type = cus_type;
	 this.loan_amt = loan_amt;
	 this.intrst_rt = intrst_rt;
	 this.term=term;
	 this.loan_type = loan_type;
	}

	@Override
	public String toString() {
	 return "Account [acc_num=" + acc_num + ", cus_name=" + cus_name + ", address=" + address + ", cus_type=" + cus_type
	   + ", loan_amt=" + loan_amt + ", intrst_rt=" + intrst_rt + ", term=" + term + ", loan_type=" + loan_type
	   + "]";
	}



	  
	  
	}

