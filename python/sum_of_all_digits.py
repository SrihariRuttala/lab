arr = [int(i) for i in input().split(" ")]
sum = 0

for i in arr:
	sum += i

print("Sum of all digits is : " + str(sum))