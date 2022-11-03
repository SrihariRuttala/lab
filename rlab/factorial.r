num = as.integer(readline(prompt="Enter a number : "))
factorial = 1
for(i in 1:num)
{
  factorial = factorial * i
}
print(paste("Factorial of ", num," is ",factorial))