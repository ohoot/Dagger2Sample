package com.example.joo.dagger2sample;

import com.example.joo.dagger2sample.models.TestModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Joo on 2016-07-05.
 */
@Module
public class TestModule {
    @Provides
    TestModel providesTestModel(){
        return new TestModel();
    }
}
