package in.futurastic.portal.model.fee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeeCategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String receiptNumberPrefix;
    private String description;

    public FeeCategoryModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiptNumberPrefix() {
        return receiptNumberPrefix;
    }

    public void setReceiptNumberPrefix(String receiptNumberPrefix) {
        this.receiptNumberPrefix = receiptNumberPrefix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
