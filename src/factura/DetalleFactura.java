/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

/**
 *
 * @author Brian Cardenas
 */
public class DetalleFactura {
    
    private Factura factura;
    private Producto producto;
    private int cantidadProducto;
    private double precioDetalle;

    public DetalleFactura(Producto producto, int cantidadProducto) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.precioDetalle = agregarPrecioDetalle();
    }
    
    private double agregarPrecioDetalle(){
        return producto.getPrecioUnitario() * cantidadProducto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioDetalle() {
        return precioDetalle;
    }

    public void setPrecioDetalle(double precioDetalle) {
        this.precioDetalle = precioDetalle;
    }
    
    @Override
    public  String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(producto.getNombre());
        sb.append(" ").append(producto.getPrecioUnitario());
        sb.append(" ").append(cantidadProducto);
        sb.append(" ").append(precioDetalle);
        
        return sb.toString();
    }
    
    
    
    
    
    
}
