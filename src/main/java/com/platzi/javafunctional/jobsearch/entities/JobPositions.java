package com.platzi.javafunctional.jobsearch.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class JobPositions {

    @SerializedName("PositionTitle")
    private String positionTitle;

    @SerializedName("PositionURI")
    private String positionURI;

    @SerializedName("ApplyURI")
    private String ApplyURI;

    @SerializedName("PositionLocationDisplay")
    private String positionLocationDisplay;

    @SerializedName("OrganizationName")
    private String organizationName;

    @SerializedName("QualificationSummary")
    private String qualificationSummary;

    @SerializedName("MajorDuties")
    private String majorDuties;

    @SerializedName("Requirements")
    private String requirements;

    @SerializedName("HowToApply")
    private String howToApply;

    @SerializedName("RequiredDocuments")
    private String requiredDocuments;
}
