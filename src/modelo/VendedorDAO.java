package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO {

    Conexion con = new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;

    public EntidadVendedor ValidarVendedor(String dni, String user) {
        EntidadVendedor ev = new EntidadVendedor();
        String sql = "select * from vendedor where Dni=? and User=?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setTel(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));
                ev.setTU(rs.getString(7));

            }
        } catch (Exception e) {

        }
        return ev;
    }

    public List listar() {

        List<EntidadVendedor> lista = new ArrayList<>();
        String sql = "select *from vendedor";

        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                EntidadVendedor EV = new EntidadVendedor();
                EV.setId(rs.getInt(1));
                EV.setDni(rs.getString(2));
                EV.setNom(rs.getString(3));
                EV.setTel(rs.getString(4));
                EV.setEstado(rs.getString(5));
                EV.setUser(rs.getString(6));
                EV.setTU(rs.getString(7));
                lista.add(EV);

            }
        } catch (Exception e) {

        }
        return lista;
    }

    public int add(Object[] o) {

        int r = 0;
        String sql = "insert into vendedor(Dni,Nombres,Telefono,Estado,User,TU)values(?,?,?,?,?,?)";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;

    }

    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update vendedor set Dni=?,Nombres=?,Telefono=?,Estado=?,User=?,TU=? where IdVendedor=?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);

            r = ps.executeUpdate();

        } catch (Exception e) {

        }
        return r;
    }

    public void eliminar(int id) {
        String sql = "delete from vendedor where IdVendedor=?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {

        }

    }
}
