package org.example.entity;



public class Student {
    private String txtId;
    private String txtName;
    private String txtAddress;

    public Student() {
    }

    public Student(String txtId, String txtName, String txtAddress) {
        this.txtId = txtId;
        this.txtName = txtName;
        this.txtAddress = txtAddress;
    }

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtAddress() {
        return txtAddress;
    }

    public void setTxtAddress(String txtAddress) {
        this.txtAddress = txtAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "txtId='" + txtId + '\'' +
                ", txtName='" + txtName + '\'' +
                ", txtAddress='" + txtAddress + '\'' +
                '}';
    }
}
