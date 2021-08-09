import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.Array._
import util.control.Breaks._
import scala.collection.mutable._

object test{
    

    def main(args:Array[String]):Unit = {
        while(true){
            var user: Int = 0; var sum: Long = 0;
            println(f"number -> ");
            user = readInt()
            for ( x <- 1 to user ){
                sum = sum + x;
            }
            println(sum)
            print("\n");
    }
    }
}