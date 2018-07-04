class Test {
	var name = "this is in the Test Class"
	var a:Int = 5
	var b:Int = 5
	
	fun sum(a: Int, b: Int): Int {
		return a + b
	}
	fun sum():String {
		return "The sum of ${this.a} and ${this.b} is ${this.a + this.b}"
	}
	
}