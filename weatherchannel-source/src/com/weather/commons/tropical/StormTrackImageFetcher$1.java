// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.android.gms.maps.model.LatLng;
import com.google.common.base.Function;

// Referenced classes of package com.weather.commons.tropical:
//            StormTrackImageFetcher

class this._cls0
    implements Function
{

    final StormTrackImageFetcher this$0;

    public LatLng apply(com.weather.util.geometry.LatLng latlng)
    {
        if (latlng == null)
        {
            return null;
        } else
        {
            return new LatLng(latlng.latitude, latlng.longitude);
        }
    }

    public volatile Object apply(Object obj)
    {
        return apply((com.weather.util.geometry.LatLng)obj);
    }

    ()
    {
        this$0 = StormTrackImageFetcher.this;
        super();
    }
}
