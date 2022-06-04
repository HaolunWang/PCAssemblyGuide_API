package com.ajmoreid.pcguideapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * if the class annotated with @Entity, class 'PcAssembly' should have [public, protected] no-arg constructor
 */
@Entity
public class PcAssembly {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String computerType;
    private final String cpuBrand;
    private final long cpuId;
    private final long gpuId;
    private final long ramId;

    public PcAssembly() {
        this.computerType = "";
        this.cpuBrand = "";
        this.cpuId = 0;
        this.gpuId = 0;
        this.ramId = 0;
    }

    public PcAssembly(String computerType, String cpuBrand, long cpuId, long gpuId, long ramId) {
        this.computerType = computerType;
        this.cpuBrand = cpuBrand;
        this.cpuId = cpuId;
        this.gpuId = gpuId;
        this.ramId = ramId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComputerType() {
        return computerType;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public long getCpuId() {
        return cpuId;
    }

    public long getGpuId() {
        return gpuId;
    }

    public long getRamId() {
        return ramId;
    }

    @Override
    public String toString() {
        return "PcAssemblies{" + "id=" + id + ", computerType=" + computerType + ", cpuBrand=" + cpuBrand + ", cpuId=" + cpuId + ", gpuId=" + gpuId + ", ramId=" + ramId + "}" ;
    }
}
