long result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8)
.map(n -> n / 2)
.distinct()
.count();