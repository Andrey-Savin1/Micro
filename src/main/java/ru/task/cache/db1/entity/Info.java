package ru.task.cache.db1.entity;


import javax.persistence.*;

@Entity
@Table(name = "Info")
public class Info {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "val")
    private String value;

    @Column(name = "version")
    private Long version;

    public Info() {    }

    public Info(String value, Long version) {
        this.value = value;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", version=" + version +
                '}';
    }
}
