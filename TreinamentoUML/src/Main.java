/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controller.PixController;
import interfaces.PixFrame;
import service.PixService;
import entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelly
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Taylor Swift", "tay@gmail.com");
        Cliente cliente2 = new Cliente("Kelly Kimura", "kelly@gmail.com");

        Conta contaTaylor = new Conta(cliente1, 20700);
        Conta contaKelly = new Conta(cliente2, 500);

        List<Conta> contas = new ArrayList<>();
        contas.add(contaTaylor);
        contas.add(contaKelly);

        PixService service = new PixService(contas);
        PixController controller = new PixController(service, contaTaylor); // João envia

        new PixFrame(controller);
    }
    
}
