// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.weather.commons.config.ConfigurationManagers;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.weather.commons.tropical:
//            StormDataFetcher

public final class  extends Binding
    implements Provider
{

    private Binding configurationManagers;

    public void attach(Linker linker)
    {
        configurationManagers = linker.requestBinding("com.weather.commons.config.ConfigurationManagers", com/weather/commons/tropical/StormDataFetcher, getClass().getClassLoader());
    }

    public StormDataFetcher get()
    {
        return new StormDataFetcher((ConfigurationManagers)configurationManagers.get());
    }

    public volatile Object get()
    {
        return get();
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(configurationManagers);
    }

    public ()
    {
        super("com.weather.commons.tropical.StormDataFetcher", "members/com.weather.commons.tropical.StormDataFetcher", true, com/weather/commons/tropical/StormDataFetcher);
    }
}
