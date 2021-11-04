class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = new TernaryIntPredicate() {
        @Override
        public boolean test(int a, int b, int c) {
            return a != b && b != c && c != a;
        }
    };

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int a, int b, int c);
    }
}