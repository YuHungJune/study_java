public class Computer extends Calculator {
	
	@Override
	double circleArea(double param) {

		double area = Constants.PAI_2 * (param * param);
		return area;
	}

}
