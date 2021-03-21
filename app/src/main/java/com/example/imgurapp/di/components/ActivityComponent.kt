package com.example.imgurapp.di.components

import com.example.imgurapp.HomeActivity
import com.example.imgurapp.di.scopes.ActivityScope
import dagger.Component

@ActivityScope
@Component
interface ActivityComponent {
    fun  inject(homeActivity: HomeActivity)
}