def curry[A,B,C] (f: (A, B) => C): A => (B => C) = {
	a => b:B => f(a,b)
}

//You have to take an argument of type `A` and return a function of type `B => C`. That function has to take an argument of type `B` and return a value of type `C`. Follow the types.

