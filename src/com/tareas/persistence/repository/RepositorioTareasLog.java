package com.tareas.persistence.repository;

import com.tareas.negocio.model.Tarea;
import java.util.ArrayList;
import java.util.List;

public class RepositorioTareasLog implements RepositorioTareas {

    private final List<Tarea> tareas = new ArrayList<>();

    @Override
    public void guardar(Tarea tarea) {
        tareas.removeIf(t -> t.getId() == tarea.getId());
        tareas.add(tarea);

        System.out.println("Guardada: " + tarea.getTitulo());
    }

    @Override
    public Tarea buscarPorId(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                return tarea;
            }
        }

        return null;
    }

    @Override
    public List<Tarea> listarTodas() {
        return new ArrayList<>(tareas);
    }
}