package com.callmejeevan.jeedagger

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("String2")
    fun provideTestString2(
        @ApplicationContext context: Context,
        @Named("String1") testString1 : String
    ) = "${context.getString(R.string.hilt_resource_name)} - $testString1"

}



// @InstallIn(SingletonComponent::class) - used for the whole application life cycle
// @InstallIn(ActivityComponent::class)  - used for activity scope.
// @InstallIn(FragmentComponent::class) - for fragment
// @InstallIn(ViewComponent::class) -