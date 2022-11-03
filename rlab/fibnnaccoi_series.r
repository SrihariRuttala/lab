num = as.integer(readline(prompt="Enter the value"))
cat(paste("0 1"))
first = 0
second = 1
for(i in 1:num)
{
  cat(paste(" ", (first+second)))
  temp = first
  first = second
  second = temp + second
}