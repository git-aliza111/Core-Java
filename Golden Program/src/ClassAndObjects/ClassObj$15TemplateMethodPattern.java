package classesAndObjects;

public class ClassObj$15TemplateMethodPattern {

	public static void main(String[] args) {
		GoldenTouch goldenTouch=new RahimGolden();
      goldenTouch.CalculateCommission();
      goldenTouch.StartProcess();
      goldenTouch.governstudentsforprogress();
	}

}

//All parent classes to be declared abstract

abstract class GoldenTouch{  //dominos is not a actual shop,its a concept created by Gora Firangiss.
	final private void fees() {
	System.out.println("affordable");	
	}
	final private void attendance() {
		System.out.println("90% attendance compulsory");
	}
	final private void coursecontent() {
		System.out.println("golden touch course content finalized");
	}
	final private void studyMaterial() {
		System.out.println("study material taken care...");
	}
	final private void project() {
		System.out.println("project work taken care...........");
	}
	final private void certification() {
		System.out.println("certification process is finalised");
	}
	final private void teachingMethodology() {
		System.out.println("teaching methodology is also finalized");
	}
	abstract public void CalculateCommission();
	abstract public void governstudentsforprogress();
	//Template Method...
	final public void StartProcess() {
		fees();
		attendance();
		coursecontent();
		studyMaterial();
		project();
		certification();
		teachingMethodology();
		
		
	}
}
class RahimGolden extends GoldenTouch{
@Override
	public void CalculateCommission() {
		System.out.println("rahim has his own way of calculating commision");
		
	}	
@Override
	public void governstudentsforprogress() {
		System.out.println("he periodically governs the student and ensure attendance");
		
	}
}