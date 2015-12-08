// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            FluFacade, PollenFacade

public class HealthFacadeBundle
{

    final FluFacade fluFacade;
    final PollenFacade pollenFacade;

    public HealthFacadeBundle(PollenFacade pollenfacade, FluFacade flufacade)
    {
        pollenFacade = pollenfacade;
        fluFacade = flufacade;
    }

    public FluFacade getFluFacade()
    {
        return fluFacade;
    }

    public PollenFacade getPollenFacade()
    {
        return pollenFacade;
    }
}
