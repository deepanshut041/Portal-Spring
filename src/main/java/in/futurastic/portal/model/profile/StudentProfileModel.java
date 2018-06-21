package in.futurastic.portal.model.profile;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class StudentProfileModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String bloodGroup;
    private String birthPlace;
    private String nationality;
    private String motherTongue;
    private String category;
    private String religion;
    private String city;
    private String email;
    private String gender;
    private String permAddress;
    private String tempAddress;
    private String fatherProfession;
    private String motherProfession;
    private String fatherOfficeAddress;
    private String motherOfficeAddress;
    private String perviousSchoolName;
    private String perviousSchoolAddress;
    private String perviousQualification;
    private long fatherPhoneNumber;
    private long motherPhoneNumber;
    private long aadharNumber;
    private long fatherAadharNumber;
    private long motherAadharNumber;
    private int pin;
    private Date dateOfBirth;

    public StudentProfileModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }

    public String getFatherProfession() {
        return fatherProfession;
    }

    public void setFatherProfession(String fatherProfession) {
        this.fatherProfession = fatherProfession;
    }

    public String getMotherProfession() {
        return motherProfession;
    }

    public void setMotherProfession(String motherProfession) {
        this.motherProfession = motherProfession;
    }

    public String getFatherOfficeAddress() {
        return fatherOfficeAddress;
    }

    public void setFatherOfficeAddress(String fatherOfficeAddress) {
        this.fatherOfficeAddress = fatherOfficeAddress;
    }

    public String getMotherOfficeAddress() {
        return motherOfficeAddress;
    }

    public void setMotherOfficeAddress(String motherOfficeAddress) {
        this.motherOfficeAddress = motherOfficeAddress;
    }

    public String getPerviousSchoolName() {
        return perviousSchoolName;
    }

    public void setPerviousSchoolName(String perviousSchoolName) {
        this.perviousSchoolName = perviousSchoolName;
    }

    public String getPerviousSchoolAddress() {
        return perviousSchoolAddress;
    }

    public void setPerviousSchoolAddress(String perviousSchoolAddress) {
        this.perviousSchoolAddress = perviousSchoolAddress;
    }

    public String getPerviousQualification() {
        return perviousQualification;
    }

    public void setPerviousQualification(String perviousQualification) {
        this.perviousQualification = perviousQualification;
    }

    public long getFatherPhoneNumber() {
        return fatherPhoneNumber;
    }

    public void setFatherPhoneNumber(long fatherPhoneNumber) {
        this.fatherPhoneNumber = fatherPhoneNumber;
    }

    public long getMotherPhoneNumber() {
        return motherPhoneNumber;
    }

    public void setMotherPhoneNumber(long motherPhoneNumber) {
        this.motherPhoneNumber = motherPhoneNumber;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public long getFatherAadharNumber() {
        return fatherAadharNumber;
    }

    public void setFatherAadharNumber(long fatherAadharNumber) {
        this.fatherAadharNumber = fatherAadharNumber;
    }

    public long getMotherAadharNumber() {
        return motherAadharNumber;
    }

    public void setMotherAadharNumber(long motherAadharNumber) {
        this.motherAadharNumber = motherAadharNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
