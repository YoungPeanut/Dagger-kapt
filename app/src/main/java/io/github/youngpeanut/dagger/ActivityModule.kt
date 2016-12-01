package io.github.youngpeanut.dagger

import dagger.Module
import dagger.Provides

/**
 * Created by chenshao on 16/12/1.
 */
@Module
class ActivityModule(private val activity: DaggerActivity) {

    @Provides
    fun provideActivity(): DaggerActivity = activity


}