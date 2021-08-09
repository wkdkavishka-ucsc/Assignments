import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.Array._
import util.control.Breaks._
import scala.collection.mutable._

object q3{
    def summation(num:Int = 10): Long = {
        var sum:Long = 0;
        if( num == 0 ){// reach end
            sum;
        }
        else{// going
            sum = summation( num-1 ) + num;
            return sum
        }
    }

    def main(args:Array[String]):Unit = {// main ------------------
        while(true){
            var user: Int = 0;
            print(f"number -> ");
            user = readInt()
            println( summation( user ) );
            print("\n");
        }
    }
}