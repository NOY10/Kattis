package Kattis;
import java.util.*;

public class Other_Side {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] linearr = line.split(" ");

                //wolf sheep bs
                int wolf = Integer.parseInt(linearr[0]), sheep = Integer.parseInt(linearr[1]), cabbage = Integer.parseInt(linearr[2]), raft = Integer.parseInt(linearr[3]);
                boolean shit = false;
                if (raft == 0) {
                    shit = false;
                } else if (sheep < raft) {
                    shit = true;
                } else if (wolf <= raft && sheep <= raft && cabbage <= raft) {
                    shit = true;
                } else if (wolf + sheep < raft || wolf + cabbage < raft || cabbage + sheep < raft) {
                    shit = true;
                } else if (wolf + cabbage <= raft * 2 && sheep == raft) {
                    shit = true;
                } else if (wolf + sheep == raft) {
                    if (cabbage <= raft * 2) {
                        shit = true;
                    }
                } else if (wolf + cabbage == raft) {
                    if (sheep <= raft * 2) {
                        shit = true;
                    }
                } else if (cabbage + sheep == raft) {
                    if (wolf <= raft * 2) {
                        shit = true;
                    }
                } else if (sheep == 0) {
                    shit = true;
                } else if (wolf == 0) {
                    if (sheep == raft) {
                        if (cabbage <= raft * 2)
                            shit = true;
                    } else if (cabbage == raft) {
                        if (sheep <= raft * 2)
                            shit = true;
                    } else if (sheep < raft || cabbage < raft)
                        shit = true;
                } else if (cabbage == 0) {
                    if (sheep == raft) {
                        if (wolf <= raft * 2)
                            shit = true;
                    } else if (wolf == raft) {
                        if (sheep <= raft * 2)
                            shit = true;
                    } else if (wolf <= raft || sheep <= raft)
                        shit = true;
                } else shit = false;
                if (shit)
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
