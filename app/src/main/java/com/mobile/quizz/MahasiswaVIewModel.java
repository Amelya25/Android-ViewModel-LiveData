package com.mobile.quizz;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MahasiswaVIewModel extends ViewModel {
    private MutableLiveData<String> name;
    public MutableLiveData<String> getName() {
        if(name == null){
            name = new MutableLiveData<>();
        }
        return name;
    }
    private MutableLiveData<String> nim;
    public MutableLiveData<String> getNim() {
        if(nim == null){
            nim = new MutableLiveData<>();
        }
        return nim;
    }
    private MutableLiveData<String> jurusan;
    public MutableLiveData<String> getJurusan() {
        if(jurusan == null){
            jurusan = new MutableLiveData<>();
        }
        return jurusan;
    }
    private MutableLiveData<String> angkatan;
    public MutableLiveData<String> getAngkatan() {
        if(angkatan == null){
            angkatan = new MutableLiveData<>();
        }
        return angkatan;
    }
    public void setName(String name) {this.name.postValue(name); }
    public void setNim(String nim) {this.nim.postValue(nim); }
    public void setJurusan(String jurusan) {this.jurusan.postValue(jurusan); }
    public void setAngkatan(String angkatan) {this.angkatan.postValue(angkatan); }
}
