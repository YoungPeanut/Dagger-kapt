package io.github.youngpeanut.dagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: DaggerPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)

        DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        presenter.showSuccessTips()

    }
}
