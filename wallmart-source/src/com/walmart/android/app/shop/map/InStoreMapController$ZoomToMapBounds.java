// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.graphics.Matrix;
import android.graphics.RectF;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapController, AisleMapTransform, InStoreMapView

private static class <init>
    implements <init>
{

    private final float SCALE;
    private final AisleMapTransform mAisleMapTransform;

    public void executeZoom(InStoreMapView instoremapview)
    {
        if (mAisleMapTransform.hasMapBounds())
        {
            RectF rectf = mAisleMapTransform.getMapBounds();
            Matrix matrix = new Matrix();
            matrix.setScale(1.5F, 1.5F, rectf.centerX(), rectf.centerY());
            matrix.mapRect(rectf);
            instoremapview.scrollToRect(rectf, true);
        }
    }

    private (AisleMapTransform aislemaptransform)
    {
        SCALE = 1.5F;
        mAisleMapTransform = aislemaptransform;
    }

    mAisleMapTransform(AisleMapTransform aislemaptransform, mAisleMapTransform maislemaptransform)
    {
        this(aislemaptransform);
    }
}
