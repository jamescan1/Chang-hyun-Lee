package mc.sn.review;
import java.util.Random;
import java.util.ArrayList;
public class LottoMachine {
	private ArrayList<LottoBall> list;
	
	public LottoMachine(ArrayList<LottoBall>list) {
		this.list =list;
	}
	
	public LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		int index = r.nextInt(45);
		ball = list.get(index);
		return ball;
	}

	public void startMachine(int num) {
		LottoBall ball = null;
		for (int i=0;i<6;i++) {
			ball= this.getBall();
			System.out.println(ball.getNumber()+"¹ø ´çÃ·");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
