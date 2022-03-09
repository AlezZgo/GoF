package TryCatchExp

class TryCatchTest {

    companion object{
        fun foo(): String{
            try{
                return "hi"
            }catch (_: Exception){
                return "bi"
            }finally {
                println("logi")
            }
        }
    }
}