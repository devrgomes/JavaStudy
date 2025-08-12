package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio02;

public class MainAnimal {

    public void MainAnimal() {

        //-----Cachorro-----//
        Cachorro c = new Cachorro();

        c.emitirSom();
        c.abanarRabo();

        //-----Gato-----//
        Gato g = new Gato();

        g.emitirSom();
        g.arranharMoveis();
    }
}