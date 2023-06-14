/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Asus
 */
public class Controlador {

    ArrayList<Reserva> reservas;

    public Controlador() {
        reservas = new ArrayList<>();
    }

    public boolean crearReserva(Reserva reserva) {

        int numero = generarCodigo();
        while (!verificarCodigoUnico(numero)) {
            numero = generarCodigo();
        }
        reserva.setCodigo(numero);
        reservas.add(reserva);
        return true;

    }

    public boolean cancelarReserva(int codigo) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getCodigo() == codigo) {
                reservas.get(i).setEstado(Reserva.CANCELADA);
                return true;
            }
        }
        return false;
    }

    public boolean modificarReserva(Reserva reserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getCodigo() == reserva.getCodigo()) {
                reservas.get(i).setMotivo(reserva.getMotivo());
                reservas.get(i).setTipoDecoracion(reserva.getTipoDecoracion());

                return true;
            }
        }
        return false;
    }

    public ArrayList<Reserva> buscarReservarXDocumento(int documento) {
           ArrayList<Reserva> lista = new ArrayList<>();
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i) != null && reservas.get(i).getNoDocumento() == documento) {

                lista.add(reservas.get(i));
            }
        }
       return lista;
    }
       public Reserva buscarReservarXCodigo(int codigo) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i) != null && reservas.get(i).getCodigo() == codigo) {
                return reservas.get(i);
            }
        }
        return null;
    }

    public ArrayList<Reserva> buscarReservarXFecha(Date fecha) {
        ArrayList<Reserva> lista = new ArrayList<>();

        String fechaAux = String.valueOf(fecha.getDate() + fecha.getMonth() + fecha.getYear());
        for (Reserva reserva : reservas) {
            String fechaDoc = String.valueOf(reserva.getFechaReserva().getDate() + reserva.getFechaReserva().getMonth() + reserva.getFechaReserva().getYear());
            if (fechaDoc.equals(fechaAux)) {
                lista.add(reserva);
            }

        }
        return lista;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public boolean verificarCodigoUnico(int codigo) {
        for (Reserva reserva : reservas) {
            if (reserva != null && reserva.getCodigo() == codigo) {
                return false;
            }
        }
        return true;
    }

    /**
     * Genera un codigo aleatorio para cada cita que se registre
     *
     * @return un codigo (numero aleatorio)
     */
    public int generarCodigo() {
        int min_valor = 0;
        int max_valor = 100000;
        ThreadLocalRandom tl = ThreadLocalRandom.current();
        int numero = tl.nextInt(min_valor, max_valor + 1);
        return numero;
    }

}
