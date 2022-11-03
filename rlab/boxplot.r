data("airquality")
boxplot(airquality$Wind, main="average wind", xlab="miles perhour", ylab="wind", col="orange", border = "brown", horizontal = TRUE, notch = TRUE)