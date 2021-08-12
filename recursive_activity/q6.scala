import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.Array._
import util.control.Breaks._
import scala.collection.mutable._

object q6{
    def feb(num:Int = 10, num1:Int = 0, num2:Int = 1): Unit = {// febonachi ( print )
        var sum = num1+num2; // 
        if(num > sum) {// sum is less than the number
            print(s" -> $sum");
            feb(num,num2,(num1+num2));
        }
        else if(num==(num1+num2)){// number is the sum
            print(f" -> $num");  return;
        }
        else {// sum is beyond 
            return;
        }
    }

    def main(args:Array[String]): Unit = {// main
        while(true){// infinite loop
            print("number -> ");
            var number = readInt();
            print(" 0 ");
            feb(number);
            print("\n");
        }
    }
}
