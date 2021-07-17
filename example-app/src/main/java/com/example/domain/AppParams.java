package com.example.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * A AppParams.
 */
@Entity
@Table(name = "app_params")
public class AppParams implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "app_type", nullable = false)
    private String appType;

    @NotNull
    @Column(name = "app_code", nullable = false)
    private String appCode;

    @Column(name = "app_name")
    private String appName;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppType() {
        return appType;
    }

    public AppParams appType(String appType) {
        this.appType = appType;
        return this;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppCode() {
        return appCode;
    }

    public AppParams appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppName() {
        return appName;
    }

    public AppParams appName(String appName) {
        this.appName = appName;
        return this;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppParams)) {
            return false;
        }
        return id != null && id.equals(((AppParams) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AppParams{" +
            "id=" + getId() +
            ", appType='" + getAppType() + "'" +
            ", appCode='" + getAppCode() + "'" +
            ", appName='" + getAppName() + "'" +
            "}";
    }
}
