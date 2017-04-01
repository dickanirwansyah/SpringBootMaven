package com.dicka.springboot.entity;
// Generated Mar 31, 2017 6:54:57 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TransaksiDetil generated by hbm2java
 */
@Entity
@Table(name="transaksi_detil"
    ,catalog="db_hibernate"
)
public class TransaksiDetil  implements java.io.Serializable {


     private TransaksiDetilId id;
     private Barang barang;
     private Transaksi transaksi;
     private int jumlah;
     private BigDecimal harga;

    public TransaksiDetil() {
    }

    public TransaksiDetil(TransaksiDetilId id, Barang barang, Transaksi transaksi, int jumlah, BigDecimal harga) {
       this.id = id;
       this.barang = barang;
       this.transaksi = transaksi;
       this.jumlah = jumlah;
       this.harga = harga;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idtransaksi", column=@Column(name="idtransaksi", nullable=false) ), 
        @AttributeOverride(name="idbarang", column=@Column(name="idbarang", nullable=false, length=12) ) } )
    public TransaksiDetilId getId() {
        return this.id;
    }
    
    public void setId(TransaksiDetilId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idbarang", nullable=false, insertable=false, updatable=false)
    public Barang getBarang() {
        return this.barang;
    }
    
    public void setBarang(Barang barang) {
        this.barang = barang;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idtransaksi", nullable=false, insertable=false, updatable=false)
    public Transaksi getTransaksi() {
        return this.transaksi;
    }
    
    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    
    @Column(name="jumlah", nullable=false)
    public int getJumlah() {
        return this.jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    
    @Column(name="harga", nullable=false, precision=6, scale=3)
    public BigDecimal getHarga() {
        return this.harga;
    }
    
    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }




}


