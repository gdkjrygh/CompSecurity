// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.graphics.Matrix;
import android.graphics.RectF;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AislePositions

class AisleMapTransform
{

    private AislePositions mAislePositions;
    private final Matrix mMatrix = new Matrix();
    private float mMaxX;
    private float mMaxY;
    private float mOriginX;
    private float mOriginY;

    AisleMapTransform()
    {
    }

    private void updateAisleToMap()
    {
        if (hasMapBounds() && mAislePositions != null)
        {
            float f = mOriginX;
            float f1 = mOriginY;
            float f2 = mMaxX;
            float f3 = mMaxY;
            mMatrix.setPolyToPoly(mAislePositions.getAisleSource(), 0, new float[] {
                f, f1, f2, f3
            }, 0, 2);
            return;
        } else
        {
            mMatrix.reset();
            return;
        }
    }

    public boolean aisleToMap(float af[], float af1[])
    {
        if (af1.length == 2 && af.length == 2)
        {
            mMatrix.mapPoints(af, af1);
            return true;
        } else
        {
            return false;
        }
    }

    public RectF getMapBounds()
    {
        return new RectF(Math.min(mOriginX, mMaxX), Math.min(mOriginY, mMaxY), Math.max(mOriginX, mMaxX), Math.max(mOriginY, mMaxY));
    }

    public boolean hasAisleToMap()
    {
        return !mMatrix.isIdentity();
    }

    public boolean hasMapBounds()
    {
        return (mOriginX != 0.0F || mMaxX != 0.0F) && mOriginX != mMaxX && (mOriginY != 0.0F || mMaxY != 0.0F) && mOriginY != mMaxY;
    }

    public void resetMapBounds()
    {
        mMaxY = 0.0F;
        mMaxX = 0.0F;
        mOriginY = 0.0F;
        mOriginX = 0.0F;
    }

    public void setAislePositions(AislePositions aislepositions)
    {
        mAislePositions = aislepositions;
        updateAisleToMap();
    }

    public void setMapSource(float f, float f1, float f2, float f3)
    {
        mOriginX = f;
        mOriginY = f1;
        mMaxX = f2;
        mMaxY = f3;
        updateAisleToMap();
    }
}
