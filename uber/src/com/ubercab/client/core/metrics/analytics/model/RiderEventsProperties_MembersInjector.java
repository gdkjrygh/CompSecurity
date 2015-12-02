// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.metrics.analytics.model;

import hkr;
import hsr;
import hzb;

// Referenced classes of package com.ubercab.client.core.metrics.analytics.model:
//            RiderEventsProperties

public final class RiderEventsProperties_MembersInjector
    implements hsr
{

    static final boolean $assertionsDisabled;
    private final hzb mDataProvider;

    public RiderEventsProperties_MembersInjector(hzb hzb1)
    {
        if (!$assertionsDisabled && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            mDataProvider = hzb1;
            return;
        }
    }

    public static hsr create(hzb hzb1)
    {
        return new RiderEventsProperties_MembersInjector(hzb1);
    }

    public final void injectMembers(RiderEventsProperties ridereventsproperties)
    {
        if (ridereventsproperties == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            ridereventsproperties.mDataProvider = (hkr)mDataProvider.a();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RiderEventsProperties)obj);
    }

    static 
    {
        boolean flag;
        if (!com/ubercab/client/core/metrics/analytics/model/RiderEventsProperties_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
