package io.github.youngpeanut.dagger

import android.widget.Toast
import javax.inject.Inject

/**
 * Created by chenshao on 16/12/1.
 */
class DaggerPresenter
@Inject
constructor(var activity: DaggerActivity) {

    fun getView(): DaggerActivity{
        return activity
    }

    fun showSuccessTips(){
        Toast.makeText(getView(),"success!!!",Toast.LENGTH_LONG).show()
    }



}