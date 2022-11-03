# Create the data for the chart
month <- c('jan','feb','mar','apr','may')
H <- c(7,12,28,3,41)

# Give the chart file a name
png(file="bargraph.png")
# Plot the bar chart 
barplot(H, names.arg=month, main="attendance graph", xlab="month", ylab="no.of days")

# Save the file
dev.off()


barplot(airquality$Ozone, main="ozone", xlab = "ozone levels", horiz = TRUE)