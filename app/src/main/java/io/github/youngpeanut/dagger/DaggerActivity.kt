package io.github.youngpeanut.dagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

/**
 * 为什么会要用Dagger？
 *
 * DaggerActivity依赖presenter，当然可以直接new DaggerPresenter()得到，但是DaggerPresenter改变的时候，DaggerActivity也得修改。
 * Dagger利用依赖注入的方式解决这个问题。
 */
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
