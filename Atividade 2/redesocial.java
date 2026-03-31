ackage Atv2;

class RedeSocial {
    protected int usuario;

    public void usuario(int usuario){
        this.usuario = usuario;
    }

    public void postar(String mensagem){
        System.out.println("Postou mensagem " + usuario);
    }
}