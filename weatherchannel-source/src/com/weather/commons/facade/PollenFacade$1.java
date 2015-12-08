// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import java.util.Comparator;

// Referenced classes of package com.weather.commons.facade:
//            PollenFacade, PollenData

class this._cls0
    implements Comparator
{

    final PollenFacade this$0;

    public int compare(PollenData pollendata, PollenData pollendata1)
    {
        byte byte0 = 0;
        int i;
        int j;
        if (pollendata.getPollenDay().getPollenIndexCode() == null)
        {
            i = 0;
        } else
        {
            i = pollendata.getPollenDay().getPollenIndexCode().intValue();
        }
        if (pollendata1.getPollenDay().getPollenIndexCode() == null)
        {
            j = 0;
        } else
        {
            j = pollendata1.getPollenDay().getPollenIndexCode().intValue();
        }
        if (i > j)
        {
            byte0 = -1;
        } else
        if (i >= j)
        {
            return 1;
        }
        return byte0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((PollenData)obj, (PollenData)obj1);
    }

    oc.PollenDay()
    {
        this$0 = PollenFacade.this;
        super();
    }
}
