# Set seed for reproducibility
set.seed(110)

# Create example data
data <- matrix(rnorm(100, 0, 5), nrow = 10, ncol = 10)

# Column names
colnames(data) <- paste0("col", 1:10)
rownames(data) <- paste0("row", 1:10)

# Draw a heatmap
heatmap(data)	