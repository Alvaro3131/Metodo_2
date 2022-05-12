/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.tarea.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.tarea.dao.EscuelaDao;
import pe.edu.upeu.tarea.dao.FacultadDao;
import pe.edu.upeu.tarea.daoImpl.EscuelaDaoImpl;
import pe.edu.upeu.tarea.daoImpl.FacultadDaoImpl;
import pe.edu.upeu.tarea.model.Escuela;
import pe.edu.upeu.tarea.model.Facultad;

/**
 *
 * @author alvar
 */
@WebService(serviceName = "FacuWebService")
public class FacuWebService {
    FacultadDao facuDao=new FacultadDaoImpl();
    EscuelaDao escuDao=new EscuelaDaoImpl();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarfacultad")
    public int insertarfacultad(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return facuDao.create(new Facultad(0,nombre));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarfacultad")
    public int editarfacultad(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return facuDao.update(new Facultad(id,nombre));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarfacultad")
    public int eliminarfacultad(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
       return facuDao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readfacultad")
    public Facultad readfacultad(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return facuDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readallfacultad")
    public List<Facultad> readallfacultad() {
        //TODO write your implementation code here:
        return facuDao.readAll();
    }
    @WebMethod(operationName = "insertarescuela")
    public int insertarescuela(@WebParam(name = "nombre") String nombre,@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return escuDao.create(new Escuela(0,nombre,id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarescuela")
    public int editarescuela(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre,@WebParam(name = "idfacultad") int idfa ) {
        //TODO write your implementation code here:
        return escuDao.update(new Escuela(id,nombre,idfa));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarescuela")
    public int eliminarescuela(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
       return escuDao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readescuela")
    public Escuela readescuela(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return escuDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readallescuela")
    public List<Escuela> readallescuela() {
        //TODO write your implementation code here:
        return escuDao.readAll();
    }
    
}
