package com.phil;
public class Car {
    private String mMake;
    private String mModel;

    public Car(String mMake, String mModel) {
        this.mMake = mMake;
        this.mModel = mModel;
    }

    public String getmMake() {
        return mMake;
    }

    public void setmMake(String mMake) {
        this.mMake = mMake;
    }

    public String getmModel() {
        return mModel;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mMake='" + mMake + '\'' +
                ", mModel='" + mModel + '\'' +
                '}';
    }
}
