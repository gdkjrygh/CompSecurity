// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

private static class <init>
{

    private Map mCache;
    private Map mCacheReverse;

    public Marker get(Object obj)
    {
        return (Marker)mCache.get(obj);
    }

    public Object get(Marker marker)
    {
        return mCacheReverse.get(marker);
    }

    public void put(Object obj, Marker marker)
    {
        mCache.put(obj, marker);
        mCacheReverse.put(marker, obj);
    }

    public void remove(Marker marker)
    {
        Object obj = mCacheReverse.get(marker);
        mCacheReverse.remove(marker);
        mCache.remove(obj);
    }

    private ()
    {
        mCache = new HashMap();
        mCacheReverse = new HashMap();
    }

    mCacheReverse(mCacheReverse mcachereverse)
    {
        this();
    }
}
