package entities;

import javax.persistence.*;
import java.time.Period;

@Entity
@Table(name = "number")
public class Number {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "number")
    private Long id;

    @ManyToOne(targetEntity = Client.class)
    @JoinColumn(name = "id")
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "balance")
    private double balance;

    @Column(name = "max_credit")
    private double maxCredit;

    @Column(name = "payment_period")
    private Period duePeriod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(double maxCredit) {
        this.maxCredit = maxCredit;
    }

    public Period getDuePeriod() {
        return duePeriod;
    }

    public void setDuePeriod(Period duePeriod) {
        this.duePeriod = duePeriod;
    }
}
