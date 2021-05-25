package fit;

import fit.async.Async;
import fit.basic.Collections;
import fit.basic.Controls;
import fit.basic.Types;
import fit.dynamics.Dynamics;
import fit.functions.Functions;
import fit.oo.Objects;
import fit.streams.Streams;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Java!");
        Types.variaveis();
        Controls.switchAndMore();
        Collections.listsAndMaps();
        Dynamics.tasteDynamics();
        Objects.playOO();
        Functions.playFunctional();
        Streams.playStreams();
        Async.playAsync();
    }
}
