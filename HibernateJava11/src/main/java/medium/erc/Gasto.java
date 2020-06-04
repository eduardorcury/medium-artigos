package medium.erc;

import javax.persistence.*;

@Entity
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double quantia;

    @ManyToOne
    private Categoria categoria;

    public Gasto() { }

    public Gasto(Integer id, Double quantia, Categoria categoria) {
        this.id = id;
        this.quantia = quantia;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
