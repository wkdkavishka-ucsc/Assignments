object book_1 {

    def main (args:Array[String]){
        println("convert fahrenheit to celsiuc\nnumber of books")
        val num_in = scala.io.StdIn.readInt()
        println("price of a book")
        val price_in = scala.io.StdIn.readFloat()
        //calculate
        var price:Float = 0;
        price = ( num_in*price_in/100*60 ) +
                ( 
                    if( num_in > 50 ){
                        (num_in*3).toFloat + ( (num_in - 50)*0.75 ).toFloat
                    } else {
                        (num_in*3).toFloat
                    }
                );
        println( "wholeshale price is --> " + price );
    }

}