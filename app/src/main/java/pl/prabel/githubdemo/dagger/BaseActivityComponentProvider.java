package pl.prabel.githubdemo.dagger;

import android.os.Bundle;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface BaseActivityComponentProvider {

    @Nonnull
    BaseActivityComponent createActivityComponent(@Nullable Bundle savedInstanceState, ApplicationComponent appComponent);

}
