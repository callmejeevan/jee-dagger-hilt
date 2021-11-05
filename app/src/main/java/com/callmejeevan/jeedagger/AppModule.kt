package com.callmejeevan.jeedagger

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a test string for the hilt example one."

}



// @InstallIn(SingletonComponent::class) - used for the whole application life cycle
// @InstallIn(ActivityComponent::class)  - used for activity scope.
// @InstallIn(FragmentComponent::class) - for fragment
// @InstallIn(ViewComponent::class) -