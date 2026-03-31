package Atv2;

class Instagram extends RedeSocial{
    @Override
    public void postar(String mensagem){
        System.out.println("Postou foto no feed " + mensagem);
    }
}