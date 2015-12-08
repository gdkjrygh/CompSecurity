// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.android.gms.maps.model.LatLng;
import com.google.common.base.Function;

// Referenced classes of package com.weather.commons.tropical:
//            StormTrackImageFetcher, StormPosition

class this._cls0
    implements Function
{

    final StormTrackImageFetcher this$0;

    public LatLng apply(StormPosition stormposition)
    {
        if (stormposition == null)
        {
            return null;
        } else
        {
            return new LatLng(stormposition.getLatLng().latitude, stormposition.getLatLng().longitude);
        }
    }

    public volatile Object apply(Object obj)
    {
        return apply((StormPosition)obj);
    }

    ()
    {
        this$0 = StormTrackImageFetcher.this;
        super();
    }
}
