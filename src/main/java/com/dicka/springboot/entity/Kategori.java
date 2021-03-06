package com.dicka.springboot.entity;
// Generated Mar 31, 2017 6:54:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Kategori generated by hbm2java
 */
@Entity
@Table(name="kategori"
    ,catalog="db_hibernate"
)
public class Kategori  implements java.io.Serializable {


     private String idkategori;
     private String nama;
     private Set<Barang> barangs = new HashSet<Barang>(0);

    public Kategori() {
    }

	
    public Kategori(String idkategori, String nama) {
        this.idkategori = idkategori;
        this.nama = nama;
    }
    public Kategori(String idkategori, String nama, Set<Barang> barangs) {
       this.idkategori = idkategori;
       this.nama = nama;
       this.barangs = barangs;
    }
   
     @Id 

    
    @Column(name="idkategori", unique=true, nullable=false, length=12)
    public String getIdkategori() {
        return this.idkategori;
    }
    
    public void setIdkategori(String idkategori) {
        this.idkategori = idkategori;
    }

    
    @Column(name="nama", nullable=false, length=45)
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="kategori")
    public Set<Barang> getBarangs() {
        return this.barangs;
    }
    
    public void setBarangs(Set<Barang> barangs) {
        this.barangs = barangs;
    }




}


