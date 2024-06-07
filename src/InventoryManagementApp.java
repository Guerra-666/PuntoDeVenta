import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InventoryManagementApp {

    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Gestión de Inventario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Crear el panel con pestañas
        JTabbedPane tabbedPane = new JTabbedPane();

        // Crear los paneles para cada pestaña
        JPanel altaProductoPanel = new JPanel(new GridBagLayout());
        JPanel altaVentaPanel = new JPanel(new GridBagLayout());
        JPanel visualizarInventarioPanel = new JPanel(new GridBagLayout());
        JPanel agregarProductosNuevosPanel = new JPanel(new GridBagLayout());

        // Configurar el panel de Alta de Producto
        setupAltaProductoPanel(altaProductoPanel);

        // Configurar el panel de Alta de Venta
        setupAltaVentaPanel(altaVentaPanel);

        // Configurar el panel de Visualizar Inventario
        setupVisualizarInventarioPanel(visualizarInventarioPanel);

        // Configurar el panel de Agregar Productos Nuevos
        setupAgregarProductosNuevosPanel(agregarProductosNuevosPanel);

        // Agregar pestañas al panel de pestañas
        tabbedPane.addTab("Alta de Producto", altaProductoPanel);
        tabbedPane.addTab("Alta de Venta", altaVentaPanel);
        tabbedPane.addTab("Visualizar Inventario", visualizarInventarioPanel);
        tabbedPane.addTab("Agregar Productos Nuevos", agregarProductosNuevosPanel);

        // Agregar el panel de pestañas al marco
        frame.add(tabbedPane);

        // Hacer visible el marco
        frame.setVisible(true);
    }

    private static void setupAltaProductoPanel(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta y campo para Nombre del Producto
        JLabel nameLabel = new JLabel("Nombre del Producto:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameField, gbc);

        // Etiqueta y campo para Código de Barras
        JLabel barcodeLabel = new JLabel("Código de Barras:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(barcodeLabel, gbc);

        JTextField barcodeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(barcodeField, gbc);

        // Etiqueta y campo para Categoría
        JLabel categoryLabel = new JLabel("Categoría:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(categoryLabel, gbc);

        JTextField categoryField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(categoryField, gbc);

        // Etiqueta y campo para Precio
        JLabel priceLabel = new JLabel("Precio:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(priceLabel, gbc);

        JTextField priceField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(priceField, gbc);

        // Etiqueta y campo para Cantidad
        JLabel quantityLabel = new JLabel("Cantidad:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(quantityLabel, gbc);

        JTextField quantityField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(quantityField, gbc);

        // Botón para agregar producto
        JButton addButton = new JButton("Agregar Producto");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(addButton, gbc);
    }

    private static void setupAltaVentaPanel(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta y campo para Nombre del Producto
        JLabel productLabel = new JLabel("Nombre del Producto:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(productLabel, gbc);

        JTextField productField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(productField, gbc);

        // Etiqueta y campo para Código de Barras
        JLabel barcodeLabel = new JLabel("Código de Barras:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(barcodeLabel, gbc);

        JTextField barcodeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(barcodeField, gbc);

        // Etiqueta y campo para Cantidad Vendida
        JLabel quantityLabel = new JLabel("Cantidad Vendida:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(quantityLabel, gbc);

        JTextField quantityField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(quantityField, gbc);

        // Etiqueta y campo para Precio de Venta
        JLabel salePriceLabel = new JLabel("Precio de Venta:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(salePriceLabel, gbc);

        JTextField salePriceField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(salePriceField, gbc);

        // Etiqueta y campo para Fecha de Venta
        JLabel dateLabel = new JLabel("Fecha de Venta:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(dateLabel, gbc);

        JTextField dateField = new JTextField(20);
        dateField.setEditable(false); // No editable, será llenado por el botón
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(dateField, gbc);

        // Botón para registrar la venta
        JButton registerButton = new JButton("Registrar Venta");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(registerButton, gbc);

        // Añadir ActionListener al botón para capturar la fecha actual
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                dateField.setText(currentDate);
            }
        });
    }

    private static void setupVisualizarInventarioPanel(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta y campo para Código de Barras
        JLabel barcodeLabel = new JLabel("Código de Barras:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(barcodeLabel, gbc);

        JTextField barcodeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(barcodeField, gbc);

        // Etiqueta y campo para Cantidad en Inventario
        JLabel quantityLabel = new JLabel("Cantidad en Inventario:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(quantityLabel, gbc);

        JTextField quantityField = new JTextField(20);
        quantityField.setEditable(false); // No editable, solo muestra información
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(quantityField, gbc);

        // Botón para verificar cantidad
        JButton checkButton = new JButton("Verificar Cantidad");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(checkButton, gbc);

        // Botón para mostrar inventario total
        JButton showInventoryButton = new JButton("Mostrar Inventario Total");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(showInventoryButton, gbc);

        // Añadir ActionListener al botón para mostrar inventario total
        showInventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame inventoryFrame = new JFrame("Inventario Total");
                inventoryFrame.setSize(600, 400);

                JTextArea inventoryTextArea = new JTextArea();
                inventoryTextArea.setEditable(false);

                // Aquí deberías cargar la información del inventario real
                inventoryTextArea.setText("Aquí se mostrará el inventario total...");

                inventoryFrame.add(new JScrollPane(inventoryTextArea));
                inventoryFrame.setVisible(true);
            }
        });
    }

    private static void setupAgregarProductosNuevosPanel(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta y campo para Nombre del Producto
        JLabel nameLabel = new JLabel("Nombre del Producto:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameField, gbc);

        // Etiqueta y campo para Código de Barras
        JLabel barcodeLabel = new JLabel("Código de Barras:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(barcodeLabel, gbc);

        JTextField barcodeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(barcodeField, gbc);

        // Etiqueta y campo para Categoría
        JLabel categoryLabel = new JLabel("Categoría:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(categoryLabel, gbc);

        JTextField categoryField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(categoryField, gbc);

        // Etiqueta y campo para Precio
        JLabel priceLabel = new JLabel("Precio:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(priceLabel, gbc);

        JTextField priceField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(priceField, gbc);

        // Etiqueta y campo para Cantidad
        JLabel quantityLabel = new JLabel("Cantidad:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(quantityLabel, gbc);

        JTextField quantityField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(quantityField, gbc);

        // Botón para agregar producto
        JButton addButton = new JButton("Agregar Producto");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(addButton, gbc);
    }
}
