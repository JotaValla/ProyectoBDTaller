package ConexionBD;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Pieza;
import Clases.Reparacion;
import Clases.Vehiculo;
import java.math.BigDecimal;
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
        sql = "select cedula_cliente,nombre_cliente, apellido_cliente, direccion_cliente from Vista_Cliente_Guayaquil";
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

    public void mostrarClientesPorNroCedula(JTable paramTablaClientes, String ceduCliente) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dirección");

        paramTablaClientes.setModel(modelo);

        // Modificar la consulta SQL para buscar por id_cliente
        sql = "select cedula_cliente,nombre_cliente, apellido_cliente, direccion_cliente from Vista_Cliente_Guayaquil WHERE cedula_cliente = ?";

        String[] datos = new String[4];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, ceduCliente);
            ResultSet rs = ps.executeQuery();

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

    public void mostrarClientesPorNroCedula1(JTable paramTablaClientes, String ceduCliente) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dirección");

        paramTablaClientes.setModel(modelo);

        // Modificar la consulta SQL para buscar por cedula_cliente en Vista_Datos_Clientes
        sql = "SELECT cedula_cliente, nombre_cliente, apellido_cliente, direccion_cliente FROM [26.237.113.83].TALLERG8_V2_QUITO.dbo.Vista_Datos_Clientes WHERE cedula_cliente = ?";

        String[] datos = new String[4];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, ceduCliente);
            ResultSet rs = ps.executeQuery();

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
        sql = "select matricula, fecha_compra, modelo from Vista_Vehiculo_Guayaquil";
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

    public void mostrarVehiculoPorMatricula(JTable paramTablaClientes, String matricula) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Matrícula");
        modelo.addColumn("Fecha");
        modelo.addColumn("Modelo");

        paramTablaClientes.setModel(modelo);

        // Modificar la consulta SQL para buscar por id_cliente
        sql = "select matricula , fecha_compra, modelo from Vista_Vehiculo_Guayaquil WHERE matricula = ?";

        String[] datos = new String[4];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, matricula);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getDate(2).toString();
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            paramTablaClientes.setModel(modelo);
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
        sql = "select cedula_emp, nom_empleado, fecha_contrato, salario, dir_empleado from Vista_Empleado_Guayaquil;";
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

    public void mostrarEmpleadoPorNroCedula(JTable parmTabEmp, String ceduEmp) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de contrato");
        modelo.addColumn("Salario");
        modelo.addColumn("Dirección");

        parmTabEmp.setModel(modelo);

        // Modificar la consulta SQL para buscar por id_cliente
        sql = "select cedula_emp, nom_empleado, fecha_contrato, salario, dir_empleado from Vista_Empleado_Guayaquil WHERE cedula_emp = ?";

        String[] datos = new String[5];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, ceduEmp);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getDate(3).toString();
                datos[3] = rs.getBigDecimal(4).toPlainString();
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            parmTabEmp.setModel(modelo);
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
        sql = "select id_telefono, num_telefono, cedula_empleado from Vista_Telefono_Guayaquil";
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
        sql = "select id_reparacion, tipo_reparacion, observaciones, precio_reparacion, matricula from Vista_Reparacion_Guayaquil;";
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

    public void mostrarReparacionesPorId(JTable paramTabRepa, int idReparacion) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("ID");
        modelo.addColumn("Tipo");
        modelo.addColumn("Observaciones");
        modelo.addColumn("Precio");
        modelo.addColumn("Matrícula");

        paramTabRepa.setModel(modelo);

        // Modificamos la consulta para buscar por un ID de reparación específico
        sql = "SELECT id_reparacion, tipo_reparacion, observaciones, precio_reparacion, matricula FROM Vista_Reparacion_Guayaquil WHERE id_reparacion = ?;";

        String[] datos = new String[5]; // Ajustamos el tamaño del array de datos según las columnas que usamos
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, idReparacion); // Establecemos el ID de reparación como el primer parámetro de la consulta
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt("id_reparacion"));
                datos[1] = rs.getString("tipo_reparacion");
                datos[2] = rs.getString("observaciones");
                datos[3] = rs.getBigDecimal("precio_reparacion").toPlainString();
                datos[4] = rs.getString("matricula");
                modelo.addRow(datos);
            }
            paramTabRepa.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
            e.printStackTrace(); // Esto ayudará a identificar el error más específicamente
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
        sql = "select id_pieza, nom_pieza, id_reparacion from Vista_Pieza_Guayaquil;";
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

    public void mostrarPiezaPorId(JTable paramTabPieza, int idReparacion) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id");
        modelo.addColumn("Descripción");
        modelo.addColumn("ID reparación");

        paramTabPieza.setModel(modelo);
        String sql = "select id_pieza, nom_pieza, id_reparacion from Vista_Pieza_Guayaquil where id_reparacion = ?;";
        String[] datos = new String[3]; // Ajusta el tamaño del arreglo a los datos que realmente usas

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, idReparacion);
            ResultSet rs = ps.executeQuery(); // Corregido

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
        sql = "select cedula_cliente, matricula from Vista_Registro_Guayaquil;";
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
        String sql = "INSERT INTO Vista_Cliente_Guayaquil (cedula_cliente, nombre_cliente, apellido_cliente, direccion_cliente, id_taller) VALUES (?, ?, ?, ?, ?)";

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

    public void registrarCliente1(Cliente cliente) {
        CConexion objetoConexion = new CConexion();

        // La consulta SQL para verificar si el cliente ya existe en Vista_Datos_Clientes
        String sqlVerificarCliente = "SELECT COUNT(*) FROM [26.237.113.83].TALLERG8_V2_QUITO.dbo.Vista_Datos_Clientes WHERE cedula_cliente = ?";

        // La consulta SQL para insertar un nuevo cliente
        String sqlInsertarCliente = "INSERT INTO Vista_Cliente_Guayaquil (cedula_cliente, nombre_cliente, apellido_cliente, direccion_cliente, id_taller) VALUES (?, ?, ?, ?, ?)";

        try {
            // Verificar si el cliente ya existe en Vista_Datos_Clientes
            CallableStatement csVerificar = objetoConexion.establecerConexionG().prepareCall(sqlVerificarCliente);
            csVerificar.setString(1, cliente.getCedula());

            ResultSet rs = csVerificar.executeQuery();
            rs.next();
            int count = rs.getInt(1);

            if (count > 0) {
                // El cliente ya existe, mostrar advertencia
                JOptionPane.showMessageDialog(null, "Este cliente ya está registrado.");
            } else {
                // El cliente no existe, proceder con la inserción
                CallableStatement csInsertar = objetoConexion.establecerConexionG().prepareCall(sqlInsertarCliente);
                csInsertar.setString(1, cliente.getCedula());
                csInsertar.setString(2, cliente.getNombre());
                csInsertar.setString(3, cliente.getApellido());
                csInsertar.setString(4, cliente.getDireccion());
                csInsertar.setInt(5, 2); // Asumiendo que el id_taller siempre será 2 para Cliente_Guayaquil
                csInsertar.execute();
                JOptionPane.showMessageDialog(null, "Cliente registrado con éxito, ahora registra su vehículo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente: " + e.getMessage());
        }
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        CConexion objetoConexion = new CConexion();

        // La consulta SQL para insertar un nuevo cliente
        String sql = "Insert into Vista_Vehiculo_Guayaquil(matricula, fecha_compra, modelo, id_taller) VALUES (?, ?, ?, ?)";

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

    public void registrarEmpleado(Empleado empleado) {
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Vista_Empleado_Guayaquil (cedula_emp, nom_empleado, fecha_contrato, salario, dir_empleado, id_taller) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, empleado.getCedula());
            ps.setString(2, empleado.getNombre());
            ps.setDate(3, new java.sql.Date(empleado.getFechaContrato().getTime()));
            ps.setBigDecimal(4, BigDecimal.valueOf(empleado.getSalario()));
            ps.setString(5, empleado.getDireccion());
            ps.setInt(6, 2);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado registrado con éxito, ingrese su número de teléfono.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el empleado: " + e.getMessage());
        }
    }

    public void registrarEnRegistro(String cedulaCliente, String matriculaVehiculo) {
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Vista_Registro_Guayaquil (cedula_cliente, matricula) VALUES (?, ?)";

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

    public void agregarTelefonoEmpleado(String numTelefono, String cedulaEmpleado) {
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Vista_Telefono_Guayaquil (id_telefono, num_telefono, cedula_empleado) VALUES (?, ?, ?)";

        try {
            // Generar un ID único para id_telefono
            long timePart = System.currentTimeMillis();
            int randomPart = (int) (Math.random() * 100);
            int idTelefono = (int) ((timePart + randomPart) % Integer.MAX_VALUE);

            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, idTelefono);
            ps.setString(2, numTelefono);
            ps.setString(3, cedulaEmpleado);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Teléfono agregado con éxito al empleado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar teléfono al empleado: " + e.getMessage());
        }
    }

    public void agregarReparacion(Reparacion reparacion) {
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Vista_Reparacion_Guayaquil (id_reparacion, tipo_reparacion, observaciones, precio_reparacion, matricula, id_taller) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, reparacion.getIdReparacion());
            ps.setString(2, reparacion.getTipoReparacion());
            ps.setString(3, reparacion.getObservaciones());
            ps.setBigDecimal(4, reparacion.getPrecioReparacion());
            ps.setString(5, reparacion.getMatricula());
            ps.setInt(6, 2);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reparación agregada con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar reparación: " + e.getMessage());
        }
    }

    public int generarIdReparacion() {
        long timePart = System.currentTimeMillis();
        int randomPart = (int) (Math.random() * 100);
        return (int) ((timePart + randomPart) % Integer.MAX_VALUE);
    }

    public void agregarPieza(Pieza pieza) {
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Vista_Pieza_Guayaquil (id_pieza, nom_pieza, id_reparacion) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, pieza.getID());
            ps.setString(2, pieza.getNombrePieza());
            ps.setInt(3, pieza.getIdReparacion());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pieza agregada con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar pieza: " + e.getMessage());
        }
    }

    private int generarIdUnico() {
        long timePart = System.currentTimeMillis();
        int randomPart = (int) (Math.random() * 100);
        return (int) ((timePart + randomPart) % Integer.MAX_VALUE);
    }

    public Cliente setearDatosCliente(String cedula) {
        CConexion objetoConexion = new CConexion();
        Cliente cliente = new Cliente();

        String sqlCliente = "SELECT * FROM Vista_Cliente_Guayaquil WHERE cedula_cliente = ?";

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

        String sqlCliente = "SELECT * FROM Vista_Vehiculo_Guayaquil WHERE matricula = ?";

        try {
            PreparedStatement psCliente = objetoConexion.establecerConexionG().prepareStatement(sqlCliente);
            psCliente.setString(1, matricula);
            ResultSet rsCliente = psCliente.executeQuery();
            vehi.setMatricula(matricula);
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

    public Empleado obtenerEmpleadoPorCedula(String cedulaEmp) {
        CConexion objetoConexion = new CConexion();
        String sql = "SELECT * FROM Vista_Empleado_Guayaquil WHERE cedula_emp = ?";
        Empleado empleado = null;

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, cedulaEmp);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleado = new Empleado(
                        rs.getString("cedula_emp"),
                        rs.getString("nom_empleado"),
                        rs.getString("dir_empleado"),
                        rs.getBigDecimal("salario").doubleValue(),
                        rs.getDate("fecha_contrato")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el empleado: " + e.getMessage());
        }
        return empleado;
    }

    public Reparacion obtenerReparacionPorId(int idReparacion) {
        CConexion objetoConexion = new CConexion();
        String sql = "SELECT * FROM Vista_Reparacion_Guayaquil WHERE id_reparacion = ?";
        Reparacion reparacion = null;

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, idReparacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reparacion = new Reparacion();
                reparacion.setIdReparacion(rs.getInt("id_reparacion"));
                reparacion.setTipoReparacion(rs.getString("tipo_reparacion"));
                reparacion.setObservaciones(rs.getString("observaciones"));
                reparacion.setPrecioReparacion(rs.getBigDecimal("precio_reparacion"));
                reparacion.setMatricula(rs.getString("matricula"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la reparación: " + e.getMessage());
        }
        return reparacion;
    }

    public void mostrarTelefonosEmpleado(JTable paramTablaTelefonos, String cedulaEmpleado) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Número");
        modelo.addColumn("Cédula");

        paramTablaTelefonos.setModel(modelo);
        sql = "select id_telefono, num_telefono, cedula_empleado from Vista_Telefono_Guayaquil WHERE cedula_empleado = ?";
        String[] datos = new String[3]; // Ajustado a la cantidad de columnas que realmente usas
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, cedulaEmpleado);
            ResultSet rs = ps.executeQuery(); // Corregido

            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            paramTablaTelefonos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
            System.out.println(e);
        }
    }

    public void actualizarDireccionCliente(String cedulaCliente, String nuevaDir) {
        CConexion objetoConexion = new CConexion();

        // La consulta SQL para actualizar la dirección de un cliente existente
        String sql = "UPDATE Vista_Cliente_Guayaquil SET direccion_cliente = ? WHERE cedula_cliente = ?";

        try {
            CallableStatement cs = objetoConexion.establecerConexionG().prepareCall(sql);
            // Establecer el valor del parámetro para la dirección y la cédula del cliente
            cs.setString(1, nuevaDir); // Nueva dirección
            cs.setString(2, cedulaCliente); // Cédula para identificar al cliente

            // Ejecutar la consulta de actualización
            int affectedRows = cs.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Dirección del cliente actualizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente con la cédula proporcionada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la dirección del cliente: " + e.getMessage());
        }
    }

    public void actualizarDireccionEmpleado(String cedulaEmp, String nuevaDireccion) {
        CConexion objetoConexion = new CConexion();
        String sql = "UPDATE Vista_Empleado_Guayaquil SET dir_empleado = ? WHERE cedula_emp = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, nuevaDireccion);
            ps.setString(2, cedulaEmp);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Dirección del empleado actualizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el empleado con la cédula proporcionada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la dirección del empleado: " + e.getMessage());
        }
    }

    public void actualizarObservacionesReparacion(int idReparacion, String nuevasObservaciones) {
        CConexion objetoConexion = new CConexion();
        String sql = "UPDATE Vista_Reparacion_Guayaquil SET observaciones = ? WHERE id_reparacion = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, nuevasObservaciones);
            ps.setInt(2, idReparacion);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Observaciones de la reparación actualizadas con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la reparación especificada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar las observaciones de la reparación: " + e.getMessage());
        }
    }

    public void actualizarNomPieza(int idPieza, String nuevoNomPieza) {
        CConexion objetoConexion = new CConexion();
        String sql = "UPDATE Vista_Pieza_Guayaquil SET nom_pieza = ? WHERE id_pieza = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, nuevoNomPieza);
            ps.setInt(2, idPieza);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Nombre de la pieza actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la pieza especificada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el nombre de la pieza: " + e.getMessage());
        }
    }

    public void eliminarCliente(String cedulaCliente) {
        CConexion objetoConexion = new CConexion();

        // La consulta SQL para eliminar un cliente específico por su cédula
        String sql = "DELETE FROM Vista_Cliente_Guayaquil WHERE cedula_cliente = ?";

        try {
            // Preparar la consulta SQL para ejecución
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);

            // Establecer los valores de los parámetros en la consulta preparada
            ps.setString(1, cedulaCliente);

            // Ejecutar la consulta de eliminación
            int affectedRows = ps.executeUpdate();

            // Verificar si se eliminó algún registro
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente con la cédula proporcionada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage());
        }
    }

    public void eliminarVehiculo(String matricula) {
        CConexion objetoConexion = new CConexion();

        // La consulta SQL para eliminar un cliente específico por su cédula
        String sql = "DELETE FROM Vista_Vehiculo_Guayaquil WHERE matricula = ?";

        try {
            // Preparar la consulta SQL para ejecución
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);

            // Establecer los valores de los parámetros en la consulta preparada
            ps.setString(1, matricula);

            // Ejecutar la consulta de eliminación
            int affectedRows = ps.executeUpdate();

            // Verificar si se eliminó algún registro
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Vehiculo eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente con la cédula proporcionada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage());
        }
    }

    public void eliminarEmpleado(String cedulaEmp) {
        CConexion objetoConexion = new CConexion();
        String sql = "DELETE FROM Vista_Empleado_Guayaquil WHERE cedula_emp = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setString(1, cedulaEmp);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Empleado eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el empleado con la cédula proporcionada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el empleado: " + e.getMessage());
        }
    }

    public void eliminarTelefonoEmpleado(int idTelefono, String numTelefono) {
        CConexion objetoConexion = new CConexion();
        String sql = "DELETE FROM Telefono_Guayaquil WHERE id_telefono = ? AND num_telefono = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, idTelefono);
            ps.setString(2, numTelefono);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Teléfono eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el teléfono especificado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el teléfono: " + e.getMessage());
        }
    }

    public void eliminarReparacion(int idReparacion) {
        CConexion objetoConexion = new CConexion();
        String sql = "DELETE FROM Vista_Reparacion_Guayaquil WHERE id_reparacion = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, idReparacion);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Reparación eliminada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la reparación especificada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la reparación: " + e.getMessage());
        }
    }

    public void eliminarPieza(int idPieza) {
        CConexion objetoConexion = new CConexion();
        String sql = "DELETE FROM Vista_Pieza_Guayaquil WHERE id_pieza = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexionG().prepareStatement(sql);
            ps.setInt(1, idPieza);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Pieza eliminada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la pieza especificada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la pieza: " + e.getMessage());
        }
    }

}
