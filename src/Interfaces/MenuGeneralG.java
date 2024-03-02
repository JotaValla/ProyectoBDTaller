package Interfaces;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Pieza;
import Clases.Reparacion;
import Clases.Vehiculo;
import ConexionBD.CConexionG;
import ConexionBD.CConexionPadre;
import ConexionBD.metodoSQL;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MenuGeneralG extends javax.swing.JFrame {

    Login login;
    metodoSQL metodos;
    Cliente cliAggSelect, clienteToVinc;
    Empleado empToVinc, empAggSelect;
    Vehiculo vehiAggSelect;
    String idTelfToDel;
    Reparacion repToVinc, repAggSelect;
    int idRepara, idPieza;
    int taller=2;
    CConexionPadre conexionG;
    String localizacionTaller = "Guayaquil";

    public MenuGeneralG() {
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("ADMINISTRACION TALLER DE GUAYAQUIL");
        conexionG = new CConexionG();
        clienteToVinc = new Cliente();
        metodos = new metodoSQL();
        metodos.mostrarClientes(jTCliBus, conexionG, localizacionTaller);
        metodos.mostrarVehiculos(jTVehiculoBus, conexionG, localizacionTaller);
        metodos.mostrarEmpleados(jTEmpVis, conexionG, localizacionTaller);
        metodos.mostrarTelefonoEmp(JTTelfEmpVis, conexionG, localizacionTaller);
        metodos.mostrarReparaciones(jTReparaVis, conexionG, localizacionTaller);
        metodos.mostrarPieza(jTPiezaVis, conexionG, localizacionTaller);
        metodos.mostrarClientes(jTCliElim, conexionG, localizacionTaller);
        metodos.mostrarVehiculos(jTVehiculoElim, conexionG, localizacionTaller);
        metodos.mostrarEmpleados(jTEmpVis1, conexionG, localizacionTaller);
        metodos.mostrarTelefonoEmp(JTTelfEmpVis1, conexionG, localizacionTaller);
        metodos.mostrarReparaciones(jTReparaAgg2, conexionG, localizacionTaller);
        metodos.mostrarPieza(JTTelfEmpAgg3, conexionG, localizacionTaller);
        //Se oculta para vincular despues si se desa
        btnRegisNuevoVehi.setVisible(false);
        btnAddNuewPieza.setVisible(false);

        //Para que no de errores
        jTCliAgg.setEnabled(false);
        jTTelfAdd.setEnabled(false);

        jTPClienteVehiculo.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // Reemplaza 'INDEX_DE_LA_PESTAÑA_DE_VISUALIZACION' con el índice de la pestaña donde se visualizan los clientes.
                if (jTPClienteVehiculo.getSelectedIndex() == 1) {
                    metodos.mostrarClientes(jTCliBus, conexionG, localizacionTaller);
                    metodos.mostrarVehiculos(jTVehiculoBus, conexionG, localizacionTaller);
                }
            }
        });

        jTPEmpleado.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // Reemplaza 'INDEX_DE_LA_PESTAÑA_DE_VISUALIZACION' con el índice de la pestaña donde se visualizan los clientes.
                if (jTPEmpleado.getSelectedIndex() == 1) {
                    metodos.mostrarEmpleados(jTEmpVis, conexionG, localizacionTaller);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTPClienteVehiculo = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPCliAggDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomClienteAgg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApelliCliAgg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADirCliAgg = new javax.swing.JTextArea();
        btnAggCliente = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtCeduCliAgg = new javax.swing.JTextField();
        btnCancelarCliAdd = new javax.swing.JButton();
        btnVincNuevoVehiculo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCliAgg = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumMatriculaAgg = new javax.swing.JTextField();
        txtModeloAgg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDCFechaCompraVehiAgg = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        btnAggVehiculo = new javax.swing.JButton();
        lblcliente = new javax.swing.JLabel();
        txtCeduVehiToAdd = new javax.swing.JTextField();
        btnRegisNuevoVehi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTTelfAdd = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTRegistroG = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTCliBus = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTVehiculoBus = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtFiltroCeduCli = new javax.swing.JTextField();
        btnBuscarCliEspc = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFiltNumMatricula = new javax.swing.JTextField();
        btnBuscarVehiculo = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCedulaClieBus = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTADirCliBus = new javax.swing.JTextArea();
        btnActualizarDatosCli = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNomCliBus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtApeCliBus = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtMatVehiBus = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtModelVehiBus = new javax.swing.JTextField();
        jDCFechaCompraBus = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        btnLimpDatos = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtFiltroNomCliDel = new javax.swing.JTextField();
        btnBuscarCliDel = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTCliElim = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtFiltNumMatriculaElim = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTVehiculoElim = new javax.swing.JTable();
        btnBuscarVehiculoDel = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtMatVehiElim = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnElimVehiculo = new javax.swing.JButton();
        txtModeloVehículoElim = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jDCFechaCompraDel = new com.toedter.calendar.JDateChooser();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtCedulaCliElim = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTaDirCliElim = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        txtNomCliElim = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtApeCliElim = new javax.swing.JTextField();
        btnEliminarCli = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTPEmpleado = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTEmpAgg = new javax.swing.JTable();
        jPDatosEmpAgg = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtNomEmpAgg = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtSalarioAgg = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtCeduEmpAgg = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jDCFechaContratoEmpAgg = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTADirEmpAgg = new javax.swing.JTextArea();
        btnAggEmp = new javax.swing.JButton();
        btnAddTelfEmp = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        JTTelfEmpAgg = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtNumTelfEmpAgg = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtIDEmpAggTelf = new javax.swing.JTextField();
        btnAggTelfEmp = new javax.swing.JButton();
        btnAddNuevoTelfEmp = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTEmpVis = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        JTTelfEmpVis = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtNomEmpBus = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtSalarioBus = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtCeduEmpBus = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jDCFechaContratoEmpBus = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTADirEmpBus = new javax.swing.JTextArea();
        btnBuscEmp = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        txtIDEmpBusc = new javax.swing.JTextField();
        btnActEmp = new javax.swing.JButton();
        btnLimpDatosEmp = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        txtNumTelfEmpAgg2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtIDEmpAggTelf1 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txtNomEmpAgg2 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtSalarioAgg2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtCeduEmpAgg2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jDCFechaContratoEmpAgg2 = new com.toedter.calendar.JDateChooser();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTADirEmpAgg2 = new javax.swing.JTextArea();
        btnElimEmp = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        txtIDEmpBusc1 = new javax.swing.JTextField();
        btnEliminarEmp = new javax.swing.JButton();
        btnLimpDatosEmp1 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTEmpVis1 = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txtNumTelfEmpAgg3 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtIDEmpAggTelf2 = new javax.swing.JTextField();
        btnElimTelfEmp = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        JTTelfEmpVis1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jPRepara = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txtTipoRepaAgg = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtPrecioRepaAgg = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTAObserReparaAgg = new javax.swing.JTextArea();
        btnAggRepara = new javax.swing.JButton();
        txtNumMatrReparaAgg = new javax.swing.JTextField();
        btnAddPiezaToExistRep = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        txtPiezaAgg = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtIDRePiezaAgg = new javax.swing.JTextField();
        btnAggPieza = new javax.swing.JButton();
        btnAddNuewPieza = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTReparaAgg = new javax.swing.JTable();
        jScrollPane26 = new javax.swing.JScrollPane();
        JTTelfEmpAgg1 = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        txtTipoRepaAgg1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtPrecioRepaAgg1 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTAObserReparaAgg1 = new javax.swing.JTextArea();
        btnAggRepara1 = new javax.swing.JButton();
        txtNumMatrReparaAgg1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtIDRepBus = new javax.swing.JTextField();
        btnBuscRep = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTReparaVis = new javax.swing.JTable();
        jPanel36 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        txtPiezaAgg1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtIDRePiezaAgg1 = new javax.swing.JTextField();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTPiezaVis = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        txtTipoRepaAgg2 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtPrecioRepaAgg2 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTAObserReparaAgg2 = new javax.swing.JTextArea();
        txtNumMatrReparaAgg2 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtIDRepBus1 = new javax.swing.JTextField();
        btnBuscDelRepara = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        txtPiezaAgg2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtIDRePiezaAgg2 = new javax.swing.JTextField();
        btnActPieza1 = new javax.swing.JButton();
        jScrollPane31 = new javax.swing.JScrollPane();
        JTTelfEmpAgg3 = new javax.swing.JTable();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTReparaAgg2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPCliAggDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel1.setText("Ingrese el nombre del cliente:");

        jLabel2.setText("Ingrese el apellido del cliente:");

        jLabel3.setText("Ingrese la direccion del cliente:");

        jTADirCliAgg.setColumns(20);
        jTADirCliAgg.setRows(5);
        jScrollPane1.setViewportView(jTADirCliAgg);

        btnAggCliente.setText("Agregar cliente");
        btnAggCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggClienteActionPerformed(evt);
            }
        });

        jLabel19.setText("Ingresa el número de cédula del cliente:");

        btnCancelarCliAdd.setText("Cancelar");
        btnCancelarCliAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCliAddActionPerformed(evt);
            }
        });

        btnVincNuevoVehiculo.setText("Vincular nuevo vehiculo");
        btnVincNuevoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincNuevoVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCliAggDatosLayout = new javax.swing.GroupLayout(jPCliAggDatos);
        jPCliAggDatos.setLayout(jPCliAggDatosLayout);
        jPCliAggDatosLayout.setHorizontalGroup(
            jPCliAggDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCliAggDatosLayout.createSequentialGroup()
                .addGroup(jPCliAggDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCeduCliAgg)
                    .addComponent(jScrollPane1)
                    .addComponent(txtApelliCliAgg)
                    .addComponent(txtNomClienteAgg)
                    .addGroup(jPCliAggDatosLayout.createSequentialGroup()
                        .addGroup(jPCliAggDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCliAggDatosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAggCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarCliAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPCliAggDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVincNuevoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCliAggDatosLayout.setVerticalGroup(
            jPCliAggDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCliAggDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCeduCliAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomClienteAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApelliCliAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCliAggDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarCliAdd)
                    .addComponent(btnAggCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVincNuevoVehiculo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTCliAgg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTCliAgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCliAggMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTCliAgg);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del vehiculo"));

        jLabel4.setText("Ingrese el numero de matricula:");

        txtModeloAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloAggActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese el modelo del vehiculo:");

        jLabel6.setText("Seleccione la fecha de compra:");

        btnAggVehiculo.setText("Registrar vehículo");
        btnAggVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggVehiculoActionPerformed(evt);
            }
        });

        lblcliente.setText("Cliente:");

        txtCeduVehiToAdd.setEditable(false);

        btnRegisNuevoVehi.setText("Registrar nuevo vehículo");
        btnRegisNuevoVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisNuevoVehiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCeduVehiToAdd)
                    .addComponent(txtModeloAgg)
                    .addComponent(jDCFechaCompraVehiAgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(txtNumMatriculaAgg))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAggVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(btnRegisNuevoVehi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCeduVehiToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumMatriculaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDCFechaCompraVehiAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModeloAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAggVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegisNuevoVehi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTTelfAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Fecha", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTTelfAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTelfAddMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTTelfAdd);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de registros del cliente con sus vehiculos"));

        jTRegistroG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cédula", "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTRegistroG);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPCliAggDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCliAggDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTPClienteVehiculo.addTab("Agregar", jPanel5);

        jTCliBus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTCliBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCliBusMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTCliBus);

        jTVehiculoBus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Fecha", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTVehiculoBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVehiculoBusMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTVehiculoBus);

        jLabel9.setText("Ingrese el número de cédula del cliente a buscar:");

        btnBuscarCliEspc.setText("Buscar cliente");
        btnBuscarCliEspc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliEspcActionPerformed(evt);
            }
        });

        jLabel10.setText("Ingresa el número de matricula del vehículo a buscar:");

        btnBuscarVehiculo.setText("Buscar vehículo");
        btnBuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel11.setText("Cedula:");

        txtCedulaClieBus.setEditable(false);

        jLabel12.setText("Direccion del cliente:");

        jTADirCliBus.setColumns(20);
        jTADirCliBus.setRows(5);
        jScrollPane7.setViewportView(jTADirCliBus);

        btnActualizarDatosCli.setText("Actualizar datos");
        btnActualizarDatosCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosCliActionPerformed(evt);
            }
        });

        jLabel13.setText("Nombres:");

        txtNomCliBus.setEditable(false);

        jLabel14.setText("Apellidos:");

        txtApeCliBus.setEditable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaClieBus, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtNomCliBus, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApeCliBus))
                    .addComponent(btnActualizarDatosCli, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCedulaClieBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtNomCliBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtApeCliBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarDatosCli))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del vehiculo"));

        jLabel15.setText("Matricula:");

        txtMatVehiBus.setEditable(false);

        jLabel16.setText("Modelo:");

        txtModelVehiBus.setEditable(false);

        jLabel28.setText("Fecha de compra: ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtModelVehiBus, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMatVehiBus, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCFechaCompraBus, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMatVehiBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jDCFechaCompraBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtModelVehiBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnLimpDatos.setText("Limpiar datos");
        btnLimpDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtFiltroCeduCli, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliEspc, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFiltNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarVehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiltroCeduCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliEspc))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnLimpDatos)))
                .addContainerGap())
        );

        jTPClienteVehiculo.addTab("Visualizar y Actualizar", jPanel6);

        jLabel17.setText("Ingrese el número de cédula del cliente a eliminar:");

        btnBuscarCliDel.setText("Buscar cliente");
        btnBuscarCliDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliDelActionPerformed(evt);
            }
        });

        jTCliElim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTCliElim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCliElimMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTCliElim);

        jLabel18.setText("Ingresa el número de matricula del vehículo a eliminar:");

        jTVehiculoElim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Fecha", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTVehiculoElim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVehiculoElimMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTVehiculoElim);

        btnBuscarVehiculoDel.setText("Buscar vehículo");
        btnBuscarVehiculoDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoDelActionPerformed(evt);
            }
        });

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del vehiculo"));

        jLabel25.setText("Vehículo seleccionado:");

        jLabel26.setText("Modelo del vehículo:");

        btnElimVehiculo.setText("Eliminar vehículo");
        btnElimVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimVehiculoActionPerformed(evt);
            }
        });

        jLabel27.setText("Fecha de compra: ");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatVehiElim)
                    .addComponent(txtModeloVehículoElim)
                    .addComponent(jDCFechaCompraDel, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnElimVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtMatVehiElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElimVehiculo))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtModeloVehículoElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jDCFechaCompraDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel20.setText("Cedula:");

        jLabel21.setText("Direccion del cliente:");

        jTaDirCliElim.setColumns(20);
        jTaDirCliElim.setRows(5);
        jScrollPane8.setViewportView(jTaDirCliElim);

        jLabel22.setText("Nombres:");

        jLabel72.setText("Apellidos:");

        btnEliminarCli.setText("Eliminar cliente");
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaCliElim, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtNomCliElim, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApeCliElim))
                    .addComponent(btnEliminarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCedulaCliElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtNomCliElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(txtApeCliElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCli))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtFiltroNomCliDel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliDel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtFiltNumMatriculaElim, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscarVehiculoDel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiltroNomCliDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiltNumMatriculaElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarVehiculoDel))))
                .addGap(38, 38, 38)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120))
        );

        jTPClienteVehiculo.addTab("Eliminar", jPanel13);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPClienteVehiculo)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPClienteVehiculo)
        );

        jTabbedPane1.addTab("Clientes y Vehículos", jPanel1);

        jTEmpAgg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Fecha de contrato", "Salario", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTEmpAgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpAggMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTEmpAgg);

        jPDatosEmpAgg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));

        jLabel29.setText("Ingrese los nombres y apellidos del empleado:");

        jLabel30.setText("Ingrese el salario del empleado:");

        jLabel31.setText("Ingrese el número de cédula del empleado:");

        jLabel32.setText("Seleccione la fecha de contrato:");

        jLabel33.setText("Ingrese la dirección de domicillio del empleado:");

        jTADirEmpAgg.setColumns(20);
        jTADirEmpAgg.setRows(5);
        jScrollPane15.setViewportView(jTADirEmpAgg);

        btnAggEmp.setText("Agregar empleado");
        btnAggEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggEmpActionPerformed(evt);
            }
        });

        btnAddTelfEmp.setText("Agregar nuevo teléfono");
        btnAddTelfEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTelfEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatosEmpAggLayout = new javax.swing.GroupLayout(jPDatosEmpAgg);
        jPDatosEmpAgg.setLayout(jPDatosEmpAggLayout);
        jPDatosEmpAggLayout.setHorizontalGroup(
            jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEmpAggLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEmpAggLayout.createSequentialGroup()
                        .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomEmpAgg)
                            .addComponent(txtCeduEmpAgg, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCFechaContratoEmpAgg, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtSalarioAgg)))
                    .addComponent(jScrollPane15))
                .addContainerGap())
            .addGroup(jPDatosEmpAggLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(btnAggEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddTelfEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDatosEmpAggLayout.setVerticalGroup(
            jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEmpAggLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtNomEmpAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtSalarioAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(txtCeduEmpAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32))
                    .addComponent(jDCFechaContratoEmpAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosEmpAggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAggEmp)
                    .addComponent(btnAddTelfEmp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTTelfEmpAgg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Número", "Cédula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane16.setViewportView(JTTelfEmpAgg);

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar telefono al empleado"));

        jLabel35.setText("Ingrese el número de teléfono del empleado:");

        jLabel36.setText("Cédula del empleado seleccionado:");

        txtIDEmpAggTelf.setEditable(false);

        btnAggTelfEmp.setText("Agregar teléfono al empleado");
        btnAggTelfEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggTelfEmpActionPerformed(evt);
            }
        });

        btnAddNuevoTelfEmp.setText("Agregar otro teléfono al empleado");
        btnAddNuevoTelfEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNuevoTelfEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDEmpAggTelf, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumTelfEmpAgg)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAggTelfEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(btnAddNuevoTelfEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel36)
                .addGap(10, 10, 10)
                .addComponent(txtIDEmpAggTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumTelfEmpAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAggTelfEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddNuevoTelfEmp)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPDatosEmpAgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addGap(31, 31, 31)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPDatosEmpAgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        jTPEmpleado.addTab("Agregar", jPanel18);

        jTEmpVis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Fecha de contrato", "Salario", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTEmpVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpVisMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(jTEmpVis);

        JTTelfEmpVis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Número", "Cédula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTTelfEmpVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTTelfEmpVisMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(JTTelfEmpVis);

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));

        jLabel34.setText("Nombres y apellidos:");

        txtNomEmpBus.setEditable(false);

        jLabel37.setText("Salario:");

        txtSalarioBus.setEditable(false);

        jLabel38.setText("Número de cédula:");

        txtCeduEmpBus.setEditable(false);

        jLabel39.setText("Fecha de contrato:");

        jLabel40.setText("Dirección de domicillio:");

        jTADirEmpBus.setColumns(20);
        jTADirEmpBus.setRows(5);
        jScrollPane19.setViewportView(jTADirEmpBus);

        btnBuscEmp.setText("Buscar empleado");
        btnBuscEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscEmpActionPerformed(evt);
            }
        });

        jLabel41.setText("Ingrese el número de cédula del empleado a buscar:");

        btnActEmp.setText("Actualizar datos del empleado");
        btnActEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActEmpActionPerformed(evt);
            }
        });

        btnLimpDatosEmp.setText("Limpiar datos");
        btnLimpDatosEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpDatosEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDEmpBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCFechaContratoEmpBus, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSalarioBus, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btnBuscEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomEmpBus)
                            .addComponent(txtCeduEmpBus)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpDatosEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtIDEmpBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtNomEmpBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txtSalarioBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(txtCeduEmpBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFechaContratoEmpBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActEmp)
                    .addComponent(btnLimpDatosEmp))
                .addGap(20, 20, 20))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar telefono al empleado"));

        jLabel42.setText("Número de telefono:");

        jLabel43.setText("Cédula del empleado seleccionado");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDEmpAggTelf1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumTelfEmpAgg2))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel43)
                .addGap(10, 10, 10)
                .addComponent(txtIDEmpAggTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addComponent(txtNumTelfEmpAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTPEmpleado.addTab("Visualizar y Actualizar", jPanel19);

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));

        jLabel44.setText("Nombres y apellidos:");

        jLabel45.setText("Salario:");

        jLabel46.setText("Número de cédula:");

        jLabel47.setText("Fecha de contrato:");

        jLabel48.setText("Dirección de domicillio:");

        jTADirEmpAgg2.setColumns(20);
        jTADirEmpAgg2.setRows(5);
        jScrollPane20.setViewportView(jTADirEmpAgg2);

        btnElimEmp.setText("Buscar empleado");
        btnElimEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpActionPerformed(evt);
            }
        });

        jLabel49.setText("Ingrese el número de cédula del empleado a eliminar:");

        btnEliminarEmp.setText("Eliminar empleado");
        btnEliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpActionPerformed(evt);
            }
        });

        btnLimpDatosEmp1.setText("Limpiar datos");
        btnLimpDatosEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpDatosEmp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomEmpAgg2)
                            .addComponent(txtCeduEmpAgg2)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCFechaContratoEmpAgg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSalarioAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDEmpBusc1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnElimEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addGap(54, 54, 54)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpDatosEmp1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtIDEmpBusc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElimEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtNomEmpAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtSalarioAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txtCeduEmpAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFechaContratoEmpAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarEmp)
                    .addComponent(btnLimpDatosEmp1))
                .addGap(19, 19, 19))
        );

        jTEmpVis1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cédula", "Fecha de contrato", "Salario", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTEmpVis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpVis1MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(jTEmpVis1);

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de contacto del empleado"));

        jLabel50.setText("Número de telefono:");

        jLabel51.setText("ID del empleado seleccionado:");

        btnElimTelfEmp.setText("Eliminar teléfono del empleado");
        btnElimTelfEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTelfEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDEmpAggTelf2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumTelfEmpAgg3)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnElimTelfEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel51)
                .addGap(10, 10, 10)
                .addComponent(txtIDEmpAggTelf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumTelfEmpAgg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnElimTelfEmp)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        JTTelfEmpVis1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Número", "ID empleado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTTelfEmpVis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTTelfEmpVis1MouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(JTTelfEmpVis1);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTPEmpleado.addTab("Eliminar", jPanel20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPEmpleado)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPEmpleado)
        );

        jTabbedPane1.addTab("Empleados", jPanel2);

        jPRepara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la reparacion"));

        jLabel52.setText("Ingrese el tipo de reparacion que se realizo:");

        jLabel53.setText("Ingrese el precio de la reparacion:");

        jLabel55.setText("Número de matrícula del vehículo:");

        jLabel56.setText("Observaciones de la reparación:");

        jTAObserReparaAgg.setColumns(20);
        jTAObserReparaAgg.setRows(5);
        jScrollPane24.setViewportView(jTAObserReparaAgg);

        btnAggRepara.setText("Agregar reparación");
        btnAggRepara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggReparaActionPerformed(evt);
            }
        });

        btnAddPiezaToExistRep.setText("Agregar nueva pieza a una reparacion");
        btnAddPiezaToExistRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPiezaToExistRepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPReparaLayout = new javax.swing.GroupLayout(jPRepara);
        jPRepara.setLayout(jPReparaLayout);
        jPReparaLayout.setHorizontalGroup(
            jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReparaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAggRepara, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPReparaLayout.createSequentialGroup()
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(txtTipoRepaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPReparaLayout.createSequentialGroup()
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane24))))
                .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPReparaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPReparaLayout.createSequentialGroup()
                                .addComponent(txtPrecioRepaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNumMatrReparaAgg)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPReparaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddPiezaToExistRep, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)))
                .addContainerGap())
        );
        jPReparaLayout.setVerticalGroup(
            jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReparaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtTipoRepaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(txtPrecioRepaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55)
                        .addComponent(txtNumMatrReparaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56))
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPReparaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAggRepara)
                    .addComponent(btnAddPiezaToExistRep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de las piezas"));

        jLabel57.setText("Ingrese la descripción de la pieza:");

        jLabel58.setText("ID de la reparación seleccionada:");

        btnAggPieza.setText("Agregar pieza a la reparación");
        btnAggPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggPiezaActionPerformed(evt);
            }
        });

        btnAddNuewPieza.setText("Agregar nueva pieza a la reparación");
        btnAddNuewPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNuewPiezaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDRePiezaAgg, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPiezaAgg)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAggPieza, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(btnAddNuewPieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel58)
                .addGap(10, 10, 10)
                .addComponent(txtIDRePiezaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPiezaAgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAggPieza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddNuewPieza)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTReparaAgg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Observaciones", "Precio", "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTReparaAgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReparaAggMouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(jTReparaAgg);

        JTTelfEmpAgg1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Descripción", "ID reparación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane26.setViewportView(JTTelfEmpAgg1);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPRepara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane25))
                .addGap(31, 31, 31)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPRepara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        jTabbedPane6.addTab("Agregar", jPanel29);

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la reparacion"));

        jLabel54.setText("Tipo de reparación que se realizó:");

        txtTipoRepaAgg1.setEditable(false);

        jLabel59.setText("Precio de la reparacion:");

        txtPrecioRepaAgg1.setEditable(false);

        jLabel60.setText("Número de matrícula del vehículo:");

        jLabel61.setText("Observaciones de la reparación:");

        jTAObserReparaAgg1.setColumns(20);
        jTAObserReparaAgg1.setRows(5);
        jScrollPane27.setViewportView(jTAObserReparaAgg1);

        btnAggRepara1.setText("Actualizar reparación");
        btnAggRepara1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggRepara1ActionPerformed(evt);
            }
        });

        txtNumMatrReparaAgg1.setEditable(false);

        jLabel64.setText("Ingrese el ID de la reparación que desea buscar:");

        btnBuscRep.setText("Buscar reparación");
        btnBuscRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscRepActionPerformed(evt);
            }
        });

        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAggRepara1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIDRepBus))
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(txtTipoRepaAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane27))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(btnBuscRep, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLimpiarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(txtPrecioRepaAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNumMatrReparaAgg1))))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(txtIDRepBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscRep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtTipoRepaAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(txtPrecioRepaAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(txtNumMatrReparaAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61))
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAggRepara1)
                    .addComponent(btnLimpiarDatos))
                .addContainerGap())
        );

        jTReparaVis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Observaciones", "Precio", "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTReparaVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReparaVisMouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(jTReparaVis);

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de las piezas"));

        jLabel62.setText("Descripción de la pieza:");

        jLabel63.setText("ID de la reparación seleccionada:");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDRePiezaAgg1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPiezaAgg1))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel63)
                .addGap(10, 10, 10)
                .addComponent(txtIDRePiezaAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPiezaAgg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPiezaVis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Descripción", "ID reparación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTPiezaVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPiezaVisMouseClicked(evt);
            }
        });
        jScrollPane29.setViewportView(jTPiezaVis);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jTabbedPane6.addTab("Visualizar y Actualizar", jPanel30);

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la reparacion"));

        jLabel65.setText("Tipo de reparación que se realizó:");

        jLabel66.setText("Precio de la reparacion:");

        jLabel67.setText("Número de matrícula del vehículo:");

        jLabel68.setText("Observaciones de la reparación:");

        jTAObserReparaAgg2.setColumns(20);
        jTAObserReparaAgg2.setRows(5);
        jScrollPane30.setViewportView(jTAObserReparaAgg2);

        jLabel69.setText("Ingrese el ID de la reparación que desea eliminar:");

        btnBuscDelRepara.setText("Buscar reparación");
        btnBuscDelRepara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscDelReparaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDRepBus1))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtTipoRepaAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(txtPrecioRepaAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNumMatrReparaAgg2)))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(btnBuscDelRepara, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtIDRepBus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscDelRepara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtTipoRepaAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(txtPrecioRepaAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel67)
                        .addComponent(txtNumMatrReparaAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68))
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de las piezas"));

        jLabel70.setText("Descripción de la pieza:");

        jLabel71.setText("ID de la reparación seleccionada:");

        btnActPieza1.setText("Eliminar pieza de la reparación");
        btnActPieza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActPieza1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDRePiezaAgg2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPiezaAgg2)))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnActPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel71)
                .addGap(10, 10, 10)
                .addComponent(txtIDRePiezaAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPiezaAgg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActPieza1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        JTTelfEmpAgg3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Descripción", "ID reparación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTTelfEmpAgg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTTelfEmpAgg3MouseClicked(evt);
            }
        });
        jScrollPane31.setViewportView(JTTelfEmpAgg3);

        jTReparaAgg2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Observaciones", "Precio", "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTReparaAgg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReparaAgg2MouseClicked(evt);
            }
        });
        jScrollPane32.setViewportView(jTReparaAgg2);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jTabbedPane6.addTab("Eliminar", jPanel31);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        jTabbedPane1.addTab("Reparaciones", jPanel4);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Regresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAggVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggVehiculoActionPerformed
        String modelo = txtModeloAgg.getText();
        String matricula = txtNumMatriculaAgg.getText();
        Date fechaCompra = jDCFechaCompraVehiAgg.getDate();
        Vehiculo vehiculo = new Vehiculo(matricula, modelo, fechaCompra);
        metodos.registrarVehiculo(vehiculo, conexionG, localizacionTaller, taller);
        metodos.mostrarVehiculos(jTTelfAdd, conexionG, localizacionTaller);
        metodos.registrarEnRegistro(clienteToVinc.getCedula(), matricula, conexionG, localizacionTaller);
        metodos.mostrarRegistro(jTRegistroG, conexionG, localizacionTaller);
        jTTelfAdd.setEnabled(true);
        limpiarDatosVehiAgg();
        jPCliAggDatos.setVisible(true);
    }//GEN-LAST:event_btnAggVehiculoActionPerformed

    private void txtModeloAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloAggActionPerformed
        int filaSeleccionada = jTCliAgg.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaCli = jTCliAgg.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            cliAggSelect = metodos.setearDatosCliente(cedulaCli, conexionG, localizacionTaller);
            txtCeduVehiToAdd.setText(cedulaCli);
        }
    }//GEN-LAST:event_txtModeloAggActionPerformed

    private void btnAggClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggClienteActionPerformed
        String cedula = txtCeduCliAgg.getText();
        String nombre = txtNomClienteAgg.getText();
        String apellido = txtApelliCliAgg.getText();
        String direccion = jTADirCliAgg.getText();
        Cliente cliente = new Cliente(cedula, nombre, apellido, direccion);
        metodos.registrarCliente(cliente, conexionG, localizacionTaller, taller);
        clienteToVinc = metodos.setearDatosCliente(cedula, conexionG, localizacionTaller);
        metodos.mostrarClientes(jTCliAgg, conexionG, localizacionTaller);
        jTCliAgg.setEnabled(true);
        txtCeduVehiToAdd.setText(cedula);
        limpiarDatosClienteAgg();
        jPCliAggDatos.setVisible(false);
    }//GEN-LAST:event_btnAggClienteActionPerformed

    private void jTCliAggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCliAggMouseClicked
        int filaSeleccionada = jTCliAgg.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaCli = jTCliAgg.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            cliAggSelect = metodos.setearDatosCliente(cedulaCli, conexionG, localizacionTaller);
            txtCeduVehiToAdd.setText(cedulaCli);
        }
    }//GEN-LAST:event_jTCliAggMouseClicked

    private void jTTelfAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTelfAddMouseClicked
        int filaSeleccionada = jTTelfAdd.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String matricula = jTTelfAdd.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            vehiAggSelect = metodos.setearDatosVehiculo(matricula, conexionG, localizacionTaller);
        }
    }//GEN-LAST:event_jTTelfAddMouseClicked

    private void btnCancelarCliAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCliAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCliAddActionPerformed

    private void btnVincNuevoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincNuevoVehiculoActionPerformed
        jPCliAggDatos.setVisible(false);
        btnAggVehiculo.setVisible(false);
        btnRegisNuevoVehi.setVisible(true);
        metodos.mostrarClientes(jTCliAgg, conexionG, localizacionTaller);
        metodos.mostrarRegistro(jTRegistroG, conexionG, localizacionTaller);
        jTCliAgg.setEnabled(true);
        btnAggVehiculo.setVisible(true);
    }//GEN-LAST:event_btnVincNuevoVehiculoActionPerformed

    private void btnRegisNuevoVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisNuevoVehiActionPerformed
        String modelo = txtModeloAgg.getText();
        String matricula = txtNumMatriculaAgg.getText();
        Date fechaCompra = jDCFechaCompraVehiAgg.getDate();
        Vehiculo vehiculo = new Vehiculo(matricula, modelo, fechaCompra);
        metodos.registrarVehiculo(vehiculo, conexionG, localizacionTaller, taller);
        metodos.mostrarVehiculos(jTTelfAdd, conexionG, localizacionTaller);
        metodos.registrarEnRegistro(cliAggSelect.getCedula(), matricula, conexionG, localizacionTaller);
        metodos.mostrarRegistro(jTRegistroG, conexionG, localizacionTaller);
        limpiarDatosVehiAgg();
        jPCliAggDatos.setVisible(true);
        btnRegisNuevoVehi.setVisible(false);
    }//GEN-LAST:event_btnRegisNuevoVehiActionPerformed

    private void btnBuscarCliEspcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliEspcActionPerformed
        metodos.mostrarClientesPorNroCedula(jTCliBus, txtFiltroCeduCli.getText(),conexionG, localizacionTaller);
    }//GEN-LAST:event_btnBuscarCliEspcActionPerformed

    private void jTCliBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCliBusMouseClicked
        int filaSeleccionada = jTCliBus.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaCli = jTCliBus.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            cliAggSelect = metodos.setearDatosCliente(cedulaCli, conexionG, localizacionTaller);
            txtCedulaClieBus.setText(cliAggSelect.getCedula());
            txtNomCliBus.setText(cliAggSelect.getNombre());
            txtApeCliBus.setText(cliAggSelect.getApellido());
            jTADirCliBus.setText(cliAggSelect.getDireccion());
        }
    }//GEN-LAST:event_jTCliBusMouseClicked

    private void btnBuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoActionPerformed
        metodos.mostrarVehiculoPorMatricula(jTVehiculoBus, txtFiltNumMatricula.getText(), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnBuscarVehiculoActionPerformed

    private void jTVehiculoBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVehiculoBusMouseClicked
        int filaSeleccionada = jTVehiculoBus.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String matricula = jTVehiculoBus.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            vehiAggSelect = metodos.setearDatosVehiculo(matricula, conexionG, localizacionTaller);
            txtMatVehiBus.setText(vehiAggSelect.getMatricula());
            jDCFechaCompraBus.setDate(vehiAggSelect.getFechaCompra());
            txtModelVehiBus.setText(vehiAggSelect.getModelo());
        }
    }//GEN-LAST:event_jTVehiculoBusMouseClicked

    private void btnLimpDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpDatosActionPerformed
        txtMatVehiBus.setText("");
        jDCFechaCompraBus.setDate(null);
        txtModelVehiBus.setText("");
        txtCedulaClieBus.setText("");
        txtNomCliBus.setText("");
        txtApeCliBus.setText("");
        jTADirCliBus.setText("");
        metodos.mostrarClientes(jTCliBus, conexionG, localizacionTaller);
        metodos.mostrarVehiculos(jTVehiculoBus, conexionG, localizacionTaller);
    }//GEN-LAST:event_btnLimpDatosActionPerformed

    private void btnBuscarCliDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliDelActionPerformed
        metodos.mostrarClientesPorNroCedula(jTCliElim, txtFiltroNomCliDel.getText(), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnBuscarCliDelActionPerformed

    private void jTCliElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCliElimMouseClicked
        int filaSeleccionada = jTCliElim.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaCli = jTCliElim.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            cliAggSelect = metodos.setearDatosCliente(cedulaCli, conexionG, localizacionTaller);
            txtCedulaCliElim.setText(cliAggSelect.getCedula());
            txtNomCliElim.setText(cliAggSelect.getNombre());
            txtApeCliElim.setText(cliAggSelect.getApellido());
            jTaDirCliElim.setText(cliAggSelect.getDireccion());
        }
    }//GEN-LAST:event_jTCliElimMouseClicked

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
        // Mostrar un cuadro de diálogo de confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar al cliente?\nTen en cuenta que eliminara sus registros de vehiculo tambien.", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        // Verificar si el usuario seleccionó "Sí" (YES_OPTION)
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Si el usuario confirma, proceder a eliminar el cliente
            metodos.eliminarCliente(cliAggSelect.getCedula(), conexionG, localizacionTaller);
            metodos.mostrarClientes(jTCliElim, conexionG, localizacionTaller);
            limpiarDatosClienteElim();
        } else {
            // Si el usuario no confirma, no hacer nada (o realizar alguna otra acción deseada)
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
        }
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnBuscarVehiculoDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoDelActionPerformed
        metodos.mostrarVehiculoPorMatricula(jTVehiculoBus, txtFiltNumMatriculaElim.getText(), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnBuscarVehiculoDelActionPerformed

    private void jTVehiculoElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVehiculoElimMouseClicked
        int filaSeleccionada = jTVehiculoElim.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String matricula = jTVehiculoElim.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            vehiAggSelect = metodos.setearDatosVehiculo(matricula, conexionG, localizacionTaller);
            txtMatVehiElim.setText(vehiAggSelect.getMatricula());
            jDCFechaCompraDel.setDate(vehiAggSelect.getFechaCompra());
            txtModeloVehículoElim.setText(vehiAggSelect.getModelo());
        }
    }//GEN-LAST:event_jTVehiculoElimMouseClicked

    private void btnElimVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimVehiculoActionPerformed
        // Mostrar un cuadro de diálogo de confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar al vehiculo?\nTen en cuenta que eliminara sus registros de reparacion tambien.", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        // Verificar si el usuario seleccionó "Sí" (YES_OPTION)
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Si el usuario confirma, proceder a eliminar el cliente
            metodos.eliminarVehiculo(vehiAggSelect.getMatricula(), conexionG, localizacionTaller);
            metodos.mostrarVehiculos(jTVehiculoElim, conexionG, localizacionTaller);
            limpiarDatosVehiElim();
        } else {
            // Si el usuario no confirma, no hacer nada (o realizar alguna otra acción deseada)
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
        }
    }//GEN-LAST:event_btnElimVehiculoActionPerformed

    private void btnActualizarDatosCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosCliActionPerformed
        metodos.actualizarDireccionCliente(cliAggSelect.getCedula(), jTADirCliBus.getText(), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnActualizarDatosCliActionPerformed

    private void btnAggEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggEmpActionPerformed
        String cedula = txtCeduEmpAgg.getText();
        String nombre = txtNomEmpAgg.getText();
        Double salario = Double.valueOf(txtSalarioAgg.getText());
        String direccion = jTADirEmpAgg.getText();
        Date fechaContrato = jDCFechaContratoEmpAgg.getDate();
        Empleado empleado = new Empleado(cedula, nombre, direccion, salario, fechaContrato);
        metodos.registrarEmpleado(empleado, conexionG, localizacionTaller, taller);
        empToVinc = metodos.obtenerEmpleadoPorCedula(cedula, conexionG, localizacionTaller);
        metodos.mostrarEmpleados(jTEmpAgg, conexionG, localizacionTaller);
        jTEmpAgg.setEnabled(true);
        txtIDEmpAggTelf.setText(cedula);
        limpiarDatosEmpAgg();
        jPDatosEmpAgg.setVisible(false);
        btnAggTelfEmp.setVisible(false);
    }//GEN-LAST:event_btnAggEmpActionPerformed

    private void btnAddTelfEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTelfEmpActionPerformed
        metodos.mostrarEmpleados(jTEmpAgg, conexionG, localizacionTaller);
        metodos.mostrarTelefonoEmp(JTTelfEmpAgg, conexionG, localizacionTaller);
        btnAggTelfEmp.setVisible(false);
        jPDatosEmpAgg.setVisible(false);

    }//GEN-LAST:event_btnAddTelfEmpActionPerformed

    private void btnAggTelfEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggTelfEmpActionPerformed
        metodos.agregarTelefonoEmpleado(txtNumTelfEmpAgg.getText(), empToVinc.getCedula(), conexionG, localizacionTaller);
        limpiarDatosTelfAdd();
        jPDatosEmpAgg.setVisible(true);
    }//GEN-LAST:event_btnAggTelfEmpActionPerformed

    private void jTEmpAggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpAggMouseClicked
        int filaSeleccionada = jTEmpAgg.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaEmp = jTEmpAgg.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            empAggSelect = metodos.obtenerEmpleadoPorCedula(cedulaEmp, conexionG, localizacionTaller);
            txtIDEmpAggTelf.setText(cedulaEmp);
        }
    }//GEN-LAST:event_jTEmpAggMouseClicked

    private void btnAddNuevoTelfEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNuevoTelfEmpActionPerformed
        metodos.agregarTelefonoEmpleado(txtNumTelfEmpAgg.getText(), empAggSelect.getCedula(), conexionG, localizacionTaller);
        limpiarDatosTelfAdd();
        jPDatosEmpAgg.setVisible(true);
        btnAggTelfEmp.setVisible(true);
        metodos.mostrarTelefonoEmp(JTTelfEmpAgg, conexionG, localizacionTaller);
    }//GEN-LAST:event_btnAddNuevoTelfEmpActionPerformed

    private void btnBuscEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscEmpActionPerformed
        metodos.mostrarEmpleadoPorNroCedula(jTEmpVis, txtIDEmpBusc.getText(), conexionG, localizacionTaller);
        metodos.mostrarTelefonosEmpleado(JTTelfEmpVis, txtIDEmpBusc.getText(), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnBuscEmpActionPerformed

    private void jTEmpVisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpVisMouseClicked
        int filaSeleccionada = jTEmpVis.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaEmp = jTEmpVis.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            empAggSelect = metodos.obtenerEmpleadoPorCedula(cedulaEmp, conexionG, localizacionTaller);
            txtIDEmpBusc.setText(cedulaEmp);
            txtNomEmpBus.setText(empAggSelect.getNombre());
            txtCeduEmpBus.setText(empAggSelect.getCedula());
            jTADirEmpBus.setText(empAggSelect.getDireccion());
            txtSalarioBus.setText(String.valueOf(empAggSelect.getSalario()));
            jDCFechaContratoEmpBus.setDate(empAggSelect.getFechaContrato());
        }
    }//GEN-LAST:event_jTEmpVisMouseClicked

    private void btnLimpDatosEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpDatosEmpActionPerformed
        txtIDEmpBusc.setText("");
        metodos.mostrarEmpleados(jTEmpVis, conexionG, localizacionTaller);
        metodos.mostrarTelefonoEmp(JTTelfEmpVis, conexionG, localizacionTaller);
        limpiarDatosEmpBus();
        txtIDEmpAggTelf1.setText("");
        txtNumTelfEmpAgg2.setText("");
    }//GEN-LAST:event_btnLimpDatosEmpActionPerformed

    private void btnActEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActEmpActionPerformed
        metodos.actualizarDireccionEmpleado(empAggSelect.getCedula(), jTADirEmpBus.getText(), conexionG, localizacionTaller);
        limpiarDatosEmpBus();
    }//GEN-LAST:event_btnActEmpActionPerformed

    private void JTTelfEmpVisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTelfEmpVisMouseClicked
        int filaSeleccionada = JTTelfEmpVis.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String numTelf = JTTelfEmpVis.getValueAt(filaSeleccionada, 1).toString();
            String numCedu = JTTelfEmpVis.getValueAt(filaSeleccionada, 2).toString();
            txtIDEmpAggTelf1.setText(numCedu);
            txtNumTelfEmpAgg2.setText(numTelf);
        }
    }//GEN-LAST:event_JTTelfEmpVisMouseClicked

    private void jTEmpVis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpVis1MouseClicked
        int filaSeleccionada = jTEmpVis1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaEmp = jTEmpVis1.getValueAt(filaSeleccionada, 0).toString();
            metodoSQL metodos = new metodoSQL();
            empAggSelect = metodos.obtenerEmpleadoPorCedula(cedulaEmp, conexionG, localizacionTaller);
            txtIDEmpBusc1.setText(cedulaEmp);
            txtNomEmpAgg2.setText(empAggSelect.getNombre());
            txtCeduEmpAgg2.setText(empAggSelect.getCedula());
            jTADirEmpAgg2.setText(empAggSelect.getDireccion());
            txtSalarioAgg2.setText(String.valueOf(empAggSelect.getSalario()));
            jDCFechaContratoEmpAgg2.setDate(empAggSelect.getFechaContrato());
            txtIDEmpAggTelf2.setText(cedulaEmp);
        }
    }//GEN-LAST:event_jTEmpVis1MouseClicked

    private void btnElimEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpActionPerformed
        metodos.mostrarEmpleadoPorNroCedula(jTEmpVis1, txtIDEmpBusc1.getText(), conexionG, localizacionTaller);
        txtIDEmpAggTelf2.setText(txtIDEmpBusc1.getText());
        metodos.mostrarTelefonosEmpleado(JTTelfEmpVis1, txtIDEmpBusc1.getText(), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnElimEmpActionPerformed

    private void btnEliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpActionPerformed
        // Mostrar un cuadro de diálogo de confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar al empleado?\nTen en cuenta que eliminara sus datos de telefono.", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        // Verificar si el usuario seleccionó "Sí" (YES_OPTION)
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Si el usuario confirma, proceder a eliminar el cliente
            metodos.eliminarEmpleado(empAggSelect.getCedula(), conexionG, localizacionTaller);
            metodos.mostrarEmpleados(jTEmpVis1, conexionG, localizacionTaller);
            limpiarDatosEmpElim();
        } else {
            // Si el usuario no confirma, no hacer nada (o realizar alguna otra acción deseada)
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
        }
    }//GEN-LAST:event_btnEliminarEmpActionPerformed

    private void JTTelfEmpVis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTelfEmpVis1MouseClicked
        int filaSeleccionada = JTTelfEmpVis1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String numTelf = JTTelfEmpVis1.getValueAt(filaSeleccionada, 1).toString();
            String numCedu = JTTelfEmpVis1.getValueAt(filaSeleccionada, 2).toString();
            idTelfToDel = JTTelfEmpVis1.getValueAt(filaSeleccionada, 0).toString();
            txtIDEmpAggTelf2.setText(numCedu);
            txtNumTelfEmpAgg3.setText(numTelf);
        }
    }//GEN-LAST:event_JTTelfEmpVis1MouseClicked

    private void btnElimTelfEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimTelfEmpActionPerformed
        // Mostrar un cuadro de diálogo de confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar al telefono del empleado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        // Verificar si el usuario seleccionó "Sí" (YES_OPTION)
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Si el usuario confirma, proceder a eliminar el cliente
            metodos.eliminarTelefonoEmpleado(Integer.valueOf(idTelfToDel), txtNumTelfEmpAgg3.getText(), conexionG, localizacionTaller);
            metodos.mostrarTelefonoEmp(JTTelfEmpVis1, conexionG, localizacionTaller);
            txtIDEmpAggTelf2.setText("");
            txtNumTelfEmpAgg3.setText("");
        } else {
            // Si el usuario no confirma, no hacer nada (o realizar alguna otra acción deseada)
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
        }
    }//GEN-LAST:event_btnElimTelfEmpActionPerformed

    private void btnLimpDatosEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpDatosEmp1ActionPerformed
        metodos.mostrarEmpleados(jTEmpVis1, conexionG, localizacionTaller);
        metodos.mostrarTelefonoEmp(JTTelfEmpVis1, conexionG, localizacionTaller);
        txtIDEmpAggTelf2.setText("");
        txtNumTelfEmpAgg3.setText("");
        limpiarDatosEmpElim();
    }//GEN-LAST:event_btnLimpDatosEmp1ActionPerformed

    private void btnAggReparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggReparaActionPerformed
        String tipoReparacion = txtTipoRepaAgg.getText();
        String observaciones = jTAObserReparaAgg.getText();
        String matricula = txtNumMatrReparaAgg.getText();
        int idReparacion = metodos.generarIdReparacion();
        BigDecimal precio = BigDecimal.valueOf(Double.parseDouble(txtPrecioRepaAgg.getText()));
        Reparacion reparacion = new Reparacion(idReparacion, tipoReparacion, observaciones, precio, matricula);
        metodos.agregarReparacion(reparacion, conexionG, localizacionTaller, taller);
        // Mostrar un cuadro de diálogo de confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Deseas agregar una pieza a la reparacion?", "Agregar pieza", JOptionPane.YES_NO_OPTION);

        // Verificar si el usuario seleccionó "Sí" (YES_OPTION)
        if (confirmacion == JOptionPane.YES_OPTION) {
            repToVinc = metodos.obtenerReparacionPorId(idReparacion, conexionG, localizacionTaller);
            metodos.mostrarReparaciones(jTReparaAgg, conexionG, localizacionTaller);
            jTReparaAgg.setEnabled(true);
            txtIDRePiezaAgg.setText(String.valueOf(idReparacion));
            limpiarDatosRepAgg();
            jPRepara.setVisible(false);
        } else {
            metodos.mostrarReparaciones(jTReparaAgg, conexionG, localizacionTaller);
            limpiarDatosRepAgg();
        }

    }//GEN-LAST:event_btnAggReparaActionPerformed

    private void jTReparaAggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReparaAggMouseClicked
        int filaSeleccionada = jTReparaAgg.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String idtoRepara = jTReparaAgg.getValueAt(filaSeleccionada, 0).toString();
            idRepara = Integer.parseInt(idtoRepara);
            metodoSQL metodos = new metodoSQL();
            repAggSelect = metodos.obtenerReparacionPorId(idRepara, conexionG, localizacionTaller);
            txtIDRePiezaAgg.setText(String.valueOf(repAggSelect.getIdReparacion()));
        }
    }//GEN-LAST:event_jTReparaAggMouseClicked

    private void btnAggPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggPiezaActionPerformed
        int idPieza = metodos.generarIdReparacion();
        String nomPieza = txtPiezaAgg.getText();
        int idReparacion = repToVinc.getIdReparacion();
        Pieza pieza = new Pieza(idPieza, idReparacion, nomPieza);
        metodos.agregarPieza(pieza, conexionG, localizacionTaller);
        metodos.mostrarPieza(JTTelfEmpAgg1, conexionG, localizacionTaller);
        txtIDRePiezaAgg.setText("");
        txtPiezaAgg.setText("");
        jPRepara.setVisible(true);
        limpiarDatosRepAgg();
    }//GEN-LAST:event_btnAggPiezaActionPerformed

    private void btnAddPiezaToExistRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPiezaToExistRepActionPerformed
        jPRepara.setVisible(false);
        btnAggPieza.setVisible(false);
        btnAddNuewPieza.setVisible(true);
        metodos.mostrarReparaciones(jTReparaAgg, conexionG, localizacionTaller);
    }//GEN-LAST:event_btnAddPiezaToExistRepActionPerformed

    private void btnAddNuewPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNuewPiezaActionPerformed
        int idPieza = metodos.generarIdReparacion();
        String nomPieza = txtPiezaAgg.getText();
        Pieza pieza = new Pieza(idPieza, idRepara, nomPieza);
        metodos.agregarPieza(pieza, conexionG, localizacionTaller);
        metodos.mostrarPieza(JTTelfEmpAgg1, conexionG, localizacionTaller);
        txtIDRePiezaAgg.setText("");
        txtPiezaAgg.setText("");
        jPRepara.setVisible(true);
        btnAggPieza.setVisible(true);
        btnAddNuewPieza.setVisible(false);
        limpiarDatosRepAgg();
    }//GEN-LAST:event_btnAddNuewPiezaActionPerformed

    private void jTReparaVisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReparaVisMouseClicked
        int filaSeleccionada = jTReparaVis.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String idtoRepara = jTReparaVis.getValueAt(filaSeleccionada, 0).toString();
            idRepara = Integer.parseInt(idtoRepara);
            metodoSQL metodos = new metodoSQL();
            repAggSelect = metodos.obtenerReparacionPorId(idRepara, conexionG, localizacionTaller);
            txtIDRePiezaAgg1.setText(String.valueOf(repAggSelect.getIdReparacion()));
            txtTipoRepaAgg1.setText(repAggSelect.getTipoReparacion());
            txtPrecioRepaAgg1.setText(repAggSelect.getPrecioReparacion().toString());
            jTAObserReparaAgg1.setText(repAggSelect.getObservaciones());
            txtNumMatrReparaAgg1.setText(repAggSelect.getMatricula());
            txtIDRepBus.setText(String.valueOf(idRepara));
        }
    }//GEN-LAST:event_jTReparaVisMouseClicked

    private void btnBuscRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscRepActionPerformed
        metodos.mostrarReparacionesPorId(jTReparaVis, Integer.parseInt(txtIDRepBus.getText()), conexionG, localizacionTaller);
        metodos.mostrarPiezaPorId(jTPiezaVis, Integer.parseInt(txtIDRepBus.getText()), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnBuscRepActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        metodos.mostrarReparaciones(jTReparaVis, conexionG, localizacionTaller);
        metodos.mostrarPieza(jTPiezaVis, conexionG, localizacionTaller);
        limpiarDatosRepBus();
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed

    private void jTPiezaVisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPiezaVisMouseClicked
        int filaSeleccionada = jTPiezaVis.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String descPieza = jTPiezaVis.getValueAt(filaSeleccionada, 1).toString();
            txtPiezaAgg1.setText(descPieza);
        }
    }//GEN-LAST:event_jTPiezaVisMouseClicked

    private void btnAggRepara1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggRepara1ActionPerformed
        metodos.actualizarObservacionesReparacion(Integer.parseInt(txtIDRepBus.getText()), jTAObserReparaAgg1.getText(), conexionG, localizacionTaller);
        metodos.mostrarReparaciones(jTReparaVis, conexionG, localizacionTaller);
        metodos.mostrarPieza(jTPiezaVis, conexionG, localizacionTaller);
        limpiarDatosRepBus();
    }//GEN-LAST:event_btnAggRepara1ActionPerformed

    private void jTReparaAgg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReparaAgg2MouseClicked
        int filaSeleccionada = jTReparaAgg2.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String idtoRepara = jTReparaAgg2.getValueAt(filaSeleccionada, 0).toString();
            idRepara = Integer.parseInt(idtoRepara);
            metodoSQL metodos = new metodoSQL();
            repAggSelect = metodos.obtenerReparacionPorId(idRepara, conexionG, localizacionTaller);
            txtIDRePiezaAgg2.setText(String.valueOf(repAggSelect.getIdReparacion()));
            txtTipoRepaAgg2.setText(repAggSelect.getTipoReparacion());
            txtPrecioRepaAgg2.setText(repAggSelect.getPrecioReparacion().toString());
            jTAObserReparaAgg2.setText(repAggSelect.getObservaciones());
            txtNumMatrReparaAgg2.setText(repAggSelect.getMatricula());
            txtIDRepBus1.setText(String.valueOf(idRepara));
        }
    }//GEN-LAST:event_jTReparaAgg2MouseClicked

    private void btnBuscDelReparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscDelReparaActionPerformed
        metodos.mostrarReparacionesPorId(jTReparaAgg2, Integer.parseInt(txtIDRepBus1.getText()), conexionG, localizacionTaller);
        metodos.mostrarPiezaPorId(JTTelfEmpAgg3, Integer.parseInt(txtIDRepBus1.getText()), conexionG, localizacionTaller);
    }//GEN-LAST:event_btnBuscDelReparaActionPerformed

    private void JTTelfEmpAgg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTelfEmpAgg3MouseClicked
        int filaSeleccionada = JTTelfEmpAgg3.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String descPieza = JTTelfEmpAgg3.getValueAt(filaSeleccionada, 1).toString();
            txtPiezaAgg2.setText(descPieza);
            idPieza = Integer.parseInt(JTTelfEmpAgg3.getValueAt(filaSeleccionada, 0).toString());
        }
    }//GEN-LAST:event_JTTelfEmpAgg3MouseClicked

    private void btnActPieza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActPieza1ActionPerformed
        // Mostrar un cuadro de diálogo de confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la pieza de la reparacion?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        // Verificar si el usuario seleccionó "Sí" (YES_OPTION)
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Si el usuario confirma, proceder a eliminar el cliente
            metodos.eliminarPieza(idPieza, conexionG, localizacionTaller);
            metodos.mostrarPieza(JTTelfEmpAgg3, conexionG, localizacionTaller);
        } else {
            // Si el usuario no confirma, no hacer nada (o realizar alguna otra acción deseada)
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
        }
    }//GEN-LAST:event_btnActPieza1ActionPerformed

    public void limpiarDatosClienteAgg() {
        txtCeduCliAgg.setText("");
        txtNomClienteAgg.setText("");
        txtApelliCliAgg.setText("");
        jTADirCliAgg.setText("");
    }

    public void limpiarDatosVehiAgg() {
        txtNumMatriculaAgg.setText("");
        jDCFechaCompraVehiAgg.setDate(null);
        txtModeloAgg.setText("");
        txtCeduVehiToAdd.setText("");
    }

    public void limpiarDatosClienteBus() {
        txtCedulaClieBus.setText("");
        txtNomCliBus.setText("");
        txtApeCliBus.setText("");
        jTADirCliBus.setText("");
    }

    public void limpiarDatosClienteElim() {
        txtCedulaCliElim.setText("");
        txtNomCliElim.setText("");
        txtApeCliElim.setText("");
        jTaDirCliElim.setText("");
        txtFiltroNomCliDel.setText("");
    }

    public void limpiarDatosVehiElim() {
        txtFiltNumMatriculaElim.setText("");
        txtMatVehiElim.setText("");
        jDCFechaCompraDel.setDate(null);
        txtModeloVehículoElim.setText("");
    }

    public void limpiarDatosEmpAgg() {
        txtCeduEmpAgg.setText("");
        txtNomEmpAgg.setText("");
        txtSalarioAgg.setText("");
        jTADirEmpAgg.setText("");
        jDCFechaContratoEmpAgg.setDate(null);
    }

    public void limpiarDatosTelfAdd() {
        txtIDEmpAggTelf.setText("");
        txtIDEmpAggTelf.setText("");
        txtNumTelfEmpAgg.setText("");
    }

    public void limpiarDatosEmpBus() {
        txtIDEmpBusc.setText("");
        txtNomEmpBus.setText("");
        txtCeduEmpBus.setText("");
        jTADirEmpBus.setText("");
        txtSalarioBus.setText("");
        jDCFechaContratoEmpBus.setDate(null);
    }

    public void limpiarDatosEmpElim() {
        txtIDEmpBusc1.setText("");
        txtNomEmpAgg2.setText("");
        txtCeduEmpAgg2.setText("");
        jTADirEmpAgg2.setText("");
        txtSalarioAgg2.setText("");
        jDCFechaContratoEmpAgg2.setDate(null);
    }

    public void limpiarDatosRepAgg() {
        txtTipoRepaAgg.setText("");
        jTAObserReparaAgg.setText("");
        txtNumMatrReparaAgg.setText("");
        txtPrecioRepaAgg.setText("");
        txtIDRePiezaAgg.setText("");
    }

    public void limpiarDatosRepBus() {
        txtIDRepBus.setText("");
        txtTipoRepaAgg1.setText("");
        txtPrecioRepaAgg1.setText("");
        txtNumMatrReparaAgg1.setText("");
        jTAObserReparaAgg1.setText("");
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGeneralG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneralG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneralG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneralG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneralG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTTelfEmpAgg;
    private javax.swing.JTable JTTelfEmpAgg1;
    private javax.swing.JTable JTTelfEmpAgg3;
    private javax.swing.JTable JTTelfEmpVis;
    private javax.swing.JTable JTTelfEmpVis1;
    private javax.swing.JButton btnActEmp;
    private javax.swing.JButton btnActPieza1;
    private javax.swing.JButton btnActualizarDatosCli;
    private javax.swing.JButton btnAddNuevoTelfEmp;
    private javax.swing.JButton btnAddNuewPieza;
    private javax.swing.JButton btnAddPiezaToExistRep;
    private javax.swing.JButton btnAddTelfEmp;
    private javax.swing.JButton btnAggCliente;
    private javax.swing.JButton btnAggEmp;
    private javax.swing.JButton btnAggPieza;
    private javax.swing.JButton btnAggRepara;
    private javax.swing.JButton btnAggRepara1;
    private javax.swing.JButton btnAggTelfEmp;
    private javax.swing.JButton btnAggVehiculo;
    private javax.swing.JButton btnBuscDelRepara;
    private javax.swing.JButton btnBuscEmp;
    private javax.swing.JButton btnBuscRep;
    private javax.swing.JButton btnBuscarCliDel;
    private javax.swing.JButton btnBuscarCliEspc;
    private javax.swing.JButton btnBuscarVehiculo;
    private javax.swing.JButton btnBuscarVehiculoDel;
    private javax.swing.JButton btnCancelarCliAdd;
    private javax.swing.JButton btnElimEmp;
    private javax.swing.JButton btnElimTelfEmp;
    private javax.swing.JButton btnElimVehiculo;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnEliminarEmp;
    private javax.swing.JButton btnLimpDatos;
    private javax.swing.JButton btnLimpDatosEmp;
    private javax.swing.JButton btnLimpDatosEmp1;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JButton btnRegisNuevoVehi;
    private javax.swing.JButton btnVincNuevoVehiculo;
    private com.toedter.calendar.JDateChooser jDCFechaCompraBus;
    private com.toedter.calendar.JDateChooser jDCFechaCompraDel;
    private com.toedter.calendar.JDateChooser jDCFechaCompraVehiAgg;
    private com.toedter.calendar.JDateChooser jDCFechaContratoEmpAgg;
    private com.toedter.calendar.JDateChooser jDCFechaContratoEmpAgg2;
    private com.toedter.calendar.JDateChooser jDCFechaContratoEmpBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPCliAggDatos;
    private javax.swing.JPanel jPDatosEmpAgg;
    private javax.swing.JPanel jPRepara;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTADirCliAgg;
    private javax.swing.JTextArea jTADirCliBus;
    private javax.swing.JTextArea jTADirEmpAgg;
    private javax.swing.JTextArea jTADirEmpAgg2;
    private javax.swing.JTextArea jTADirEmpBus;
    private javax.swing.JTextArea jTAObserReparaAgg;
    private javax.swing.JTextArea jTAObserReparaAgg1;
    private javax.swing.JTextArea jTAObserReparaAgg2;
    private javax.swing.JTable jTCliAgg;
    private javax.swing.JTable jTCliBus;
    private javax.swing.JTable jTCliElim;
    private javax.swing.JTable jTEmpAgg;
    private javax.swing.JTable jTEmpVis;
    private javax.swing.JTable jTEmpVis1;
    private javax.swing.JTabbedPane jTPClienteVehiculo;
    private javax.swing.JTabbedPane jTPEmpleado;
    private javax.swing.JTable jTPiezaVis;
    private javax.swing.JTable jTRegistroG;
    private javax.swing.JTable jTReparaAgg;
    private javax.swing.JTable jTReparaAgg2;
    private javax.swing.JTable jTReparaVis;
    private javax.swing.JTable jTTelfAdd;
    private javax.swing.JTable jTVehiculoBus;
    private javax.swing.JTable jTVehiculoElim;
    private javax.swing.JTextArea jTaDirCliElim;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JLabel lblcliente;
    private javax.swing.JTextField txtApeCliBus;
    private javax.swing.JTextField txtApeCliElim;
    private javax.swing.JTextField txtApelliCliAgg;
    private javax.swing.JTextField txtCeduCliAgg;
    private javax.swing.JTextField txtCeduEmpAgg;
    private javax.swing.JTextField txtCeduEmpAgg2;
    private javax.swing.JTextField txtCeduEmpBus;
    private javax.swing.JTextField txtCeduVehiToAdd;
    private javax.swing.JTextField txtCedulaCliElim;
    private javax.swing.JTextField txtCedulaClieBus;
    private javax.swing.JTextField txtFiltNumMatricula;
    private javax.swing.JTextField txtFiltNumMatriculaElim;
    private javax.swing.JTextField txtFiltroCeduCli;
    private javax.swing.JTextField txtFiltroNomCliDel;
    private javax.swing.JTextField txtIDEmpAggTelf;
    private javax.swing.JTextField txtIDEmpAggTelf1;
    private javax.swing.JTextField txtIDEmpAggTelf2;
    private javax.swing.JTextField txtIDEmpBusc;
    private javax.swing.JTextField txtIDEmpBusc1;
    private javax.swing.JTextField txtIDRePiezaAgg;
    private javax.swing.JTextField txtIDRePiezaAgg1;
    private javax.swing.JTextField txtIDRePiezaAgg2;
    private javax.swing.JTextField txtIDRepBus;
    private javax.swing.JTextField txtIDRepBus1;
    private javax.swing.JTextField txtMatVehiBus;
    private javax.swing.JTextField txtMatVehiElim;
    private javax.swing.JTextField txtModelVehiBus;
    private javax.swing.JTextField txtModeloAgg;
    private javax.swing.JTextField txtModeloVehículoElim;
    private javax.swing.JTextField txtNomCliBus;
    private javax.swing.JTextField txtNomCliElim;
    private javax.swing.JTextField txtNomClienteAgg;
    private javax.swing.JTextField txtNomEmpAgg;
    private javax.swing.JTextField txtNomEmpAgg2;
    private javax.swing.JTextField txtNomEmpBus;
    private javax.swing.JTextField txtNumMatrReparaAgg;
    private javax.swing.JTextField txtNumMatrReparaAgg1;
    private javax.swing.JTextField txtNumMatrReparaAgg2;
    private javax.swing.JTextField txtNumMatriculaAgg;
    private javax.swing.JTextField txtNumTelfEmpAgg;
    private javax.swing.JTextField txtNumTelfEmpAgg2;
    private javax.swing.JTextField txtNumTelfEmpAgg3;
    private javax.swing.JTextField txtPiezaAgg;
    private javax.swing.JTextField txtPiezaAgg1;
    private javax.swing.JTextField txtPiezaAgg2;
    private javax.swing.JTextField txtPrecioRepaAgg;
    private javax.swing.JTextField txtPrecioRepaAgg1;
    private javax.swing.JTextField txtPrecioRepaAgg2;
    private javax.swing.JTextField txtSalarioAgg;
    private javax.swing.JTextField txtSalarioAgg2;
    private javax.swing.JTextField txtSalarioBus;
    private javax.swing.JTextField txtTipoRepaAgg;
    private javax.swing.JTextField txtTipoRepaAgg1;
    private javax.swing.JTextField txtTipoRepaAgg2;
    // End of variables declaration//GEN-END:variables
}
