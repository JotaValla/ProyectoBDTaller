package ConexionBD;

import Clases.Cliente;
import Clases.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class metodoSQL {

    public void mostrarClientes(JTable paramTablaClientes) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");

        paramTablaClientes.setModel(modelo);
        sql = "select cedula_cliente,nombre_cliente, apellido_cliente, direccion_cliente from Cliente_Guayaquil";
        String[] datos = new String[5];
        Statement st;

        try {
            st = objetoConexion.establecerConexionG().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            paramTablaClientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public void mostrarVehiculos(JTable paramTabVehiculo) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Matricula");
        modelo.addColumn("Fecha");
        modelo.addColumn("Modelo");

        paramTabVehiculo.setModel(modelo);
        sql = "select matricula, fecha_compra, modelo from Vehiculo_Guayaquil";
        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.establecerConexionG().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getDate(2).toString();
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            paramTabVehiculo.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public void mostrarEmpleados(JTable paramTabEmp) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de contrato");
        modelo.addColumn("Salario");
        modelo.addColumn("Dirección");

        paramTabEmp.setModel(modelo);
        sql = "select cedula_emp, nom_empleado, fecha_contrato, salario, dir_empleado from Empleado_Guayaquil;";
        String[] datos = new String[8];
        Statement st;

        try {
            st = objetoConexion.establecerConexionG().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getDate(3).toString();
                datos[3] = rs.getBigDecimal(4).toPlainString();
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            paramTabEmp.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public void mostrarTelefonoEmp(JTable paramTelfEmp) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Número");
        modelo.addColumn("Cédula");

        paramTelfEmp.setModel(modelo);
        sql = "select id_telefono, num_telefono, cedula_empleado from Telefono_Guayaquil";
        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.establecerConexionG().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            paramTelfEmp.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
            System.out.println(e);
        }
    }

    public void mostrarReparaciones(JTable paramTabRepa) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("ID");
        modelo.addColumn("Tipo");
        modelo.addColumn("Observaciones");
        modelo.addColumn("Precio");
        modelo.addColumn("Matrícula");

        paramTabRepa.setModel(modelo);
        sql = "select id_reparacion, tipo_reparacion, observaciones, precio_reparacion, matricula from Reparacion_Guayaquil;";
        String[] datos = new String[7];
        Statement st;

        try {
            st = objetoConexion.establecerConexionG().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getBigDecimal(4).toPlainString();
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            paramTabRepa.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public void mostrarPieza(JTable paramTabPieza) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Descripción");
        modelo.addColumn("ID reparación");

        paramTabPieza.setModel(modelo);
        sql = "select id_pieza, nom_pieza, id_reparacion from Pieza_Guayaquil;";
        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.establecerConexionG().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = String.valueOf(rs.getInt(3));
                modelo.addRow(datos);
            }
            paramTabPieza.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
            System.out.println(e);
        }
    }

    public void mostrarRegistro(JTable paramTabPieza) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Cédula");
        modelo.addColumn("Matrícula");

        paramTabPieza.setModel(modelo);
        sql = "select cedula_cliente, matricula from Registro_Guayaquil;";
        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.establecerConexionG().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo.addRow(datos);
            }
            paramTabPieza.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
            System.out.println(e);
        }
    }

    public void registrarCliente(Cliente cliente) {
        CConexion objetoConexion = new CConexion();

        // La consulta SQL para insertar un nuevo cliente
        String sql = "INSERT INTO Cliente_Guayaquil (cedula_cliente, nombre_cliente, apellido_cliente, direccion_cliente, id_taller) VALUES (?, ?, ?, ?, ?)";

        try {
            CallableStatement cs = objetoConexion.establecerConexionG().prepareCall(sql);
            // Establecer los valores de cada parámetro basado en las propiedades del objeto cliente
            cs.setString(1, cliente.getCedula());
            cs.setString(2, cliente.getNombre());
            cs.setString(3, cliente.getApellido());
            cs.setString(4, cliente.getDireccion());
            cs.setInt(5, 2); // Asumiendo que el id_taller siempre será 2 para Cliente_Guayaquil
            // Ejecutar la consulta
            cs.execute();
            JOptionPane.showMessageDialog(null, "Cliente registrado con éxito, ahora registra su vehiculo.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente: " + e.getMessage());
        }
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        CConexion objetoConexion = new CConexion();

        // La consulta SQL para insertar un nuevo cliente
        String sql = "Insert into Vehiculo_Guayaquil(matricula, fecha_compra, modelo, id_taller) VALUES (?, ?, ?, ?)";

        try {
            CallableStatement cs = objetoConexion.establecerConexionG().prepareCall(sql);
            // Establecer los valores de cada parámetro basado en las propiedades del objeto cliente
            cs.setString(1, vehiculo.getMatricula());

            // Convertir java.util.Date a java.sql.Date
            java.sql.Date fechaCompraSql = new java.sql.Date(vehiculo.getFechaCompra().getTime());

            cs.setDate(2, fechaCompraSql);
            cs.setString(3, vehiculo.getModelo());
            cs.setInt(4, 2); // Asumiendo que el id_taller siempre será 2 para Cliente_Guayaquil
            // Ejecutar la consulta
            cs.execute();
            JOptionPane.showMessageDialog(null, "Vehiculo registrado con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente: " + e.getMessage());
        }
    }

    public Cliente setearDatosCliente(String cedula) {
        CConexion objetoConexion = new CConexion();
        Cliente cliente = new Cliente();

        String sqlCliente = "SELECT * FROM Cliente_Guayaquil WHERE cedula_cliente = ?";

        try {
            PreparedStatement psCliente = objetoConexion.establecerConexionG().prepareStatement(sqlCliente);
            psCliente.setString(1, cedula);
            ResultSet rsCliente = psCliente.executeQuery();
            cliente.setCedula(cedula);
            if (rsCliente.next()) {
                // Llena los datos del cliente con los valores obtenidos de la consulta principal
                cliente.setNombre(rsCliente.getString("nombre_cliente"));
                cliente.setApellido(rsCliente.getString("apellido_cliente"));
                cliente.setDireccion(rsCliente.getString("direccion_cliente"));
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente");
        }

        return cliente;
    }

    public Vehiculo setearDatosVehiculo(String matricula) {
        CConexion objetoConexion = new CConexion();
        Vehiculo vehi = new Vehiculo();

        String sqlCliente = "SELECT * FROM Vehiculo_Guayaquil WHERE matricula = ?";

        try {
            PreparedStatement psCliente = objetoConexion.establecerConexionG().prepareStatement(sqlCliente);
            psCliente.setString(1, matricula);
            ResultSet rsCliente = psCliente.executeQuery();
            if (rsCliente.next()) {
                // Llena los datos del vehiculo con los valores obtenidos de la consulta principal
                vehi.setModelo(rsCliente.getString("modelo"));
                vehi.setFechaCompra(rsCliente.getDate("fecha_compra"));
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente");
        }

        return vehi;
    }

    public void registrarEnRegistro(String cedulaCliente, String matriculaVehiculo) {
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Registro_Guayaquil (cedula_cliente, matricula) VALUES (?, ?)";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, cedulaCliente);
            ps.setString(2, matriculaVehiculo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente y Vehículo registrados correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar en Registro_Guayaquil: " + e.getMessage());
        }
    }

}
