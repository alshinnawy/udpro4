package com.udacity.project4.authentication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

private val firebaseAuth = FirebaseAuth.getInstance()

class AuthenticationViewModel: ViewModel() {
    private val firebaseAuth = FirebaseAuth.getInstance()
    private var _active: MutableLiveData<Boolean> =
        MutableLiveData()
    val active: LiveData<Boolean>
        get() = _active
    init {
        _active.postValue(firebaseAuth.currentUser!=null)
    }
    fun activate(){
        _active.postValue(true)

    }
}