class Cliente extends Persona {

    String id;

    public Cliente(String dni, String nombre, String id) {
        super(dni, nombre);
        this.id = id;
    }
    public String getId() {
        return id;
    }
}