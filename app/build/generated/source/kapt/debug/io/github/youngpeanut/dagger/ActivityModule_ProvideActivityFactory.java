// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package io.github.youngpeanut.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ActivityModule_ProvideActivityFactory implements Factory<DaggerActivity> {
  private final ActivityModule module;

  public ActivityModule_ProvideActivityFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DaggerActivity get() {
    return Preconditions.checkNotNull(
        module.provideActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DaggerActivity> create(ActivityModule module) {
    return new ActivityModule_ProvideActivityFactory(module);
  }
}
