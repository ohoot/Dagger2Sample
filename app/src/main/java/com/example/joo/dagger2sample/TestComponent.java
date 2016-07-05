package com.example.joo.dagger2sample;

import dagger.Component;

/**
 * Created by Joo on 2016-07-05.
 */
@Component(modules = TestModule.class)
public interface TestComponent {
    void inject(MainActivity target);
}
