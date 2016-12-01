package io.github.youngpeanut.dagger

import dagger.Component

/**
 * Created by chenshao on 16/12/1.
 */
@Component(dependencies = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: DaggerActivity)
}