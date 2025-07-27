public enum Size {
    XXS {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS,
    S,
    M,
    L;

    public String getDescription() {
        return "Взрослый размер";
    }
}

