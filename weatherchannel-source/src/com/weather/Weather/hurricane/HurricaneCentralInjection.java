// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import com.google.common.base.Supplier;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.ModulesFactory;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.hurricane:
//            HurricaneCentralModulesFactory

public class HurricaneCentralInjection
{

    public HurricaneCentralInjection()
    {
    }

    public Supplier provideAdConfigSupplier()
    {
        return new _cls2();
    }

    public Supplier provideModulesConfigProvider()
    {
        return new _cls1();
    }

    public ModulesFactory provideModulesFactory()
    {
        return new HurricaneCentralModulesFactory();
    }

    public ObjectGraph provideObjectGraph()
    {
        return FlagshipApplication.getInstance().getBaseObjectGraph();
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
