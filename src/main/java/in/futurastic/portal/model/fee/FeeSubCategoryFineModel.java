package in.futurastic.portal.model.fee;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FeeSubCategoryFineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int fineAmount;
    private String feeType;
    private String fineIncrement;

    public FeeSubCategoryFineModel() {
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

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFineIncrement() {
        return fineIncrement;
    }

    public void setFineIncrement(String fineIncrement) {
        this.fineIncrement = fineIncrement;
    }
}
