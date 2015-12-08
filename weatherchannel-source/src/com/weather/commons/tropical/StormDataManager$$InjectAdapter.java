// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.weather.dal2.system.TwcBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.weather.commons.tropical:
//            StormDataManager, StormDataFetcher

public final class  extends Binding
    implements Provider
{

    private Binding bus;
    private Binding stormDataFetcher;

    public void attach(Linker linker)
    {
        stormDataFetcher = linker.requestBinding("com.weather.commons.tropical.StormDataFetcher", com/weather/commons/tropical/StormDataManager, getClass().getClassLoader());
        bus = linker.requestBinding("com.weather.dal2.system.TwcBus", com/weather/commons/tropical/StormDataManager, getClass().getClassLoader());
    }

    public StormDataManager get()
    {
        return new StormDataManager((StormDataFetcher)stormDataFetcher.get(), (TwcBus)bus.get());
    }

    public volatile Object get()
    {
        return get();
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(stormDataFetcher);
        set.add(bus);
    }

    public ()
    {
        super("com.weather.commons.tropical.StormDataManager", "members/com.weather.commons.tropical.StormDataManager", true, com/weather/commons/tropical/StormDataManager);
    }
}
