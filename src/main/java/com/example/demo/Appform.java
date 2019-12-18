package com.example.demo;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

public class Appform {

    @NotNull(groups = {ZestValidationGroup.class, CFValidationGroup.class})
    private String partnerName;

    @NotNull(groups = ZestValidationGroup.class)
    @Null(groups = CFValidationGroup.class)
    private String userId;

    @Pattern(groups = ZestValidationGroup.class, regexp = "1|2")
    @Pattern(groups = CFValidationGroup.class , regexp = "M|F")
    @NotNull
    private String gender;

    @NotNull
    private String col;

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
