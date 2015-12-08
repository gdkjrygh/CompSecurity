// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.graphics.RectF;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapSectionController, AisleMapTransform, AisleAdapter, AisleSection, 
//            InStoreMapView

private static class <init>
    implements <init>
{

    private final AisleMapTransform mAisleMapTransform;
    private final float mCoordinates[];
    private final AisleAdapter mStoreMapAdapter;

    public void executeZoom(InStoreMapView instoremapview)
    {
        if (mAisleMapTransform.hasMapBounds() && mAisleMapTransform.hasAisleToMap() && mStoreMapAdapter.getCount() > 0)
        {
            RectF rectf = mAisleMapTransform.getMapBounds();
            RectF rectf1 = new RectF(3.402823E+38F, 3.402823E+38F, 1.401298E-45F, 1.401298E-45F);
            for (int i = 0; i < mStoreMapAdapter.getCount(); i++)
            {
                mAisleMapTransform.aisleToMap(mCoordinates, ((AisleSection)mStoreMapAdapter.getItem(i)).getPosition());
                rectf1.left = Math.min(rectf1.left, mCoordinates[0]);
                rectf1.top = Math.min(rectf1.top, mCoordinates[1]);
                rectf1.right = Math.max(rectf1.right, mCoordinates[0]);
                rectf1.bottom = Math.max(rectf1.bottom, mCoordinates[1]);
            }

            rectf.offset(rectf1.centerX() - rectf.centerX(), rectf1.centerY() - rectf.centerY());
            instoremapview.scrollToRect(rectf, true);
        }
    }

    private (AisleMapTransform aislemaptransform, AisleAdapter aisleadapter)
    {
        mCoordinates = new float[2];
        mAisleMapTransform = aislemaptransform;
        mStoreMapAdapter = aisleadapter;
    }

    mStoreMapAdapter(AisleMapTransform aislemaptransform, AisleAdapter aisleadapter, mStoreMapAdapter mstoremapadapter)
    {
        this(aislemaptransform, aisleadapter);
    }
}
