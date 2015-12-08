// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.widget.Adapter;
import com.arubanetworks.meridian.maps.Marker;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapMarkerView, AisleSection

public static interface I
    extends Adapter
{

    public abstract Marker getMarker(int i);

    public abstract Marker getMarker(AisleSection aislesection);

    public abstract void registerDataSetObserver(I i);

    public abstract void unregisterDataSetObserver(I i);
}
