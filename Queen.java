package queen;

import java.util.Scanner;

public class Queen {
	//优化		
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Queen qn = new Queen(n);
		qn.arrayOut(0);
		System.out.println(qn.arrayNum);
	}
	
	int n,arrayNum = 0;
	int[] x;
	
	public Queen(int n){
			this.n = n;
			this.arrayNum = 0;
			x = new int[n];			
	}

	
	public void arrayOut(int i){
		if(i == n){
			output();
			arrayNum ++;
			return;
		}
		for(int j = 0;j < n;j ++){
			x[i] = j;
			if(isRight(i)) arrayOut(i + 1);
			else x[i] = 0;
	}
	}
	
	public boolean isRight(int i){
		for(int j = 0;j < i;j ++){
			if(x[j] == x[i] || (Math.abs(x[j] - x[i]) == Math.abs(j - i))){
				return false;
			}
		}
		return true;
	}
	
	public void output(){
		for(int i = 0;i < n;i ++){
			System.out.print(x[i]);
		}
		System.out.println();
	}
}
