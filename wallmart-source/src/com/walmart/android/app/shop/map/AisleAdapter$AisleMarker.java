// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.graphics.Bitmap;
import com.arubanetworks.meridian.maps.Marker;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleAdapter, AisleSection

public static class setShowsCallout extends Marker
{

    private final AisleSection mAisleSection;
    private final Bitmap mBitmap;

    public AisleSection getAisleSection()
    {
        return mAisleSection;
    }

    public Bitmap getBitmap()
    {
        return mBitmap;
    }

    public String getCalloutText()
    {
        return null;
    }

    public (AisleSection aislesection, float f, float f1, Bitmap bitmap)
    {
        super(f, f1);
        mBitmap = bitmap;
        mAisleSection = aislesection;
        setShowsCallout(false);
    }
}
