package cg.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;

    private String name;
    private int age;

    @ManyToMany
    @JoinTable(name = "bill_detail",joinColumns = @JoinColumn(name = "idCustomer"), inverseJoinColumns = @JoinColumn(name = "idBill"))
    private Set<Bill> billSet;

    public Customer() {
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
