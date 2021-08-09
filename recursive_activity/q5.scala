import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.Array._
import util.control.Breaks._
import scala.collection.mutable._

object q5{
    def is_even(num:Int = 10): Boolean = {
        if( num%2 == 0 ){
            true;
        }
        else{
            false;
        }
    }

    def sum_even(num:Int = 10): Long = {
        if( num < 0 ){// negative
            println("negative number");
            return -1;
        }// non negative

        var sum: Long = 0;

        if ( num == 0 ){
            return sum;
        }
        if( is_even( num ) ){
            sum = sum_even(num-1) + num
            sum;
        }
        else{
            sum = sum_even( num-1 )
            sum;
        }
    }

    def main(args:Array[String]): Unit = {// main
        while(true){
            var user: Int = 0;
            print(f"number -> ");
            user = readInt()
            println( sum_even( user ) );
            print("\n");
        }
    }
}