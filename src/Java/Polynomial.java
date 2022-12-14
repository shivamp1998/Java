package Java;
public class Polynomial {

	public int poly[] = new int [200];
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
		 poly[degree] = coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0; i<this.poly.length; i++) {
            if(this.poly[i] != 0)
            System.out.print(poly[i] + "x" + i + " ");
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	/**
	 * @param p
	 * @return
	 */
	public Polynomial add(Polynomial p){
        Polynomial add = new Polynomial();
        for(int i=0; i<p.poly.length; i++) {
            add.poly[i] = this.poly[i] + p.poly[i];
        }
		System.out.println(add);
        return add;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        Polynomial sub = new Polynomial();
        for(int i=0; i<p.poly.length; i++) {
            sub.poly[i] = this.poly[i] - p.poly[i];
        }
        return sub;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int x[]=new int[200];
        for(int i=0;i<200;i++)
        {
            for(int j=0;j<200;j++)
            {
                    int deg=(i) + (j);
                if(deg<200)
                {
                    x[deg]+=this.poly[i]*p.poly[j];
                }
            }
        }
        for(int i=0;i<200;i++)
            this.poly[i]=x[i];
          return this;

	}

    // public static void main(String[] args) {
	// 	// TODO Auto-generated method stub
	// 	Scanner s = new Scanner(System.in);
	// 	int n = s.nextInt();
	// 	int degree1[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		degree1[i] = s.nextInt();
	// 	}
	// 	int coeff1[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		coeff1[i] = s.nextInt();
	// 	}
	// 	Polynomial first = new Polynomial();
	// 	for(int i = 0; i < n; i++){
	// 		first.setCoefficient(degree1[i],coeff1[i]);
	// 	}
	// 	n = s.nextInt();
	// 	int degree2[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		degree2[i] = s.nextInt();
	// 	}
	// 	 int coeff2[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		coeff2[i] = s.nextInt();
	// 	}
	// 	Polynomial second = new Polynomial();
	// 	for(int i = 0; i < n; i++){
	// 		second.setCoefficient(degree2[i],coeff2[i]);
	// 	}
	// 	int choice = s.nextInt();
	// 	Polynomial result;
	// 	switch(choice){
	// 	// Add
	// 	case 1: 
	// 		result = first.add(second);
	// 		result.print();
	// 		break;
	// 	// Subtract	
	// 	case 2 :
	// 		 result = first.subtract(second);
	// 		result.print();
	// 		break;
	// 	// Multiply
	// 	case 3 :
	// 		 result = first.multiply(second);
	// 		result.print();
	// 		break;
	// 	}

	// }

}