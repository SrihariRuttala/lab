num = as.integer(readline(prompt = "Enter a value"))
temp = num
sum = 0
while(temp>0)
{
  r = temp%%10
  sum = sum + (r^3)
  temp = floor(temp/10)
}
if(num==sum)
{
  print(paste(num," is armstrong number"))
}else{
  print(paste(num," is not armstrong number"))
}