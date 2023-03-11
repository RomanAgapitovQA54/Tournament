package Tournament;

class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name) {
        super("Player " + name + " not registered");
    }
}
