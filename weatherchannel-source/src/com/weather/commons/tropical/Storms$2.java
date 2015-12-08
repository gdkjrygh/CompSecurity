// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Function;

// Referenced classes of package com.weather.commons.tropical:
//            Storms, StormData

class this._cls0
    implements Function
{

    final Storms this$0;

    public volatile Object apply(Object obj)
    {
        return apply((StormData)obj);
    }

    public String apply(StormData stormdata)
    {
        if (stormdata == null)
        {
            return null;
        } else
        {
            return stormdata.getStormId();
        }
    }

    ()
    {
        this$0 = Storms.this;
        super();
    }
}
