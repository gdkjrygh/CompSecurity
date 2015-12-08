// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenController, InStoreMapView, AisleMapTransform, AisleSection

private static class mAisleMapTransform
    implements mAisleMapTransform
{

    private static final float SCALE = 0.5F;
    private final AisleMapTransform mAisleMapTransform;
    private final AisleSection mAisleSection;
    private final float mCoordinates[] = new float[2];
    private final boolean mScale;
    private final Rect mVisibleRect;

    public void executeZoom(InStoreMapView instoremapview)
    {
        Object obj = instoremapview.getTransform();
        if (obj != null && mAisleMapTransform.hasAisleToMap())
        {
            Matrix matrix = new Matrix();
            RectF rectf = new RectF();
            ((Matrix) (obj)).invert(matrix);
            obj = new RectF(0.0F, 0.0F, instoremapview.getWidth(), instoremapview.getHeight());
            float f = ((RectF) (obj)).left;
            float f2 = ((RectF) (obj)).top;
            float f4 = ((RectF) (obj)).right;
            float f6 = ((RectF) (obj)).top;
            float f8 = ((RectF) (obj)).left;
            float f10 = ((RectF) (obj)).bottom;
            float f12 = ((RectF) (obj)).right;
            float f14 = ((RectF) (obj)).bottom;
            float af1[] = new float[8];
            matrix.mapPoints(af1, new float[] {
                f, f2, f4, f6, f8, f10, f12, f14
            });
            rectf.set(0.0F, 0.0F, (float)Math.sqrt((af1[0] - af1[2]) * (af1[0] - af1[2]) + (af1[1] - af1[3]) * (af1[1] - af1[3])), (float)Math.sqrt((af1[0] - af1[4]) * (af1[0] - af1[4]) + (af1[1] - af1[5]) * (af1[1] - af1[5])));
            mAisleMapTransform.aisleToMap(mCoordinates, mAisleSection.getPosition());
            rectf.offsetTo(mCoordinates[0] - rectf.width() / 2.0F, mCoordinates[1] - rectf.height() / 2.0F);
            if (mVisibleRect != null)
            {
                float f1 = mVisibleRect.left;
                float f3 = mVisibleRect.top;
                float f5 = mVisibleRect.right;
                float f7 = mVisibleRect.top;
                float f9 = mVisibleRect.left;
                float f11 = mVisibleRect.bottom;
                float f13 = mVisibleRect.right;
                float f15 = mVisibleRect.bottom;
                float af[] = new float[8];
                matrix.mapPoints(af, new float[] {
                    f1, f3, f5, f7, f9, f11, f13, f15
                });
                RectF rectf2 = new RectF(Math.min(Math.min(af1[0], af1[2]), Math.min(af1[4], af1[6])), Math.min(Math.min(af1[1], af1[3]), Math.min(af1[5], af1[7])), Math.max(Math.max(af1[0], af1[2]), Math.max(af1[4], af1[6])), Math.max(Math.max(af1[1], af1[3]), Math.max(af1[5], af1[7])));
                RectF rectf1 = new RectF(Math.min(Math.min(af[0], af[2]), Math.min(af[4], af[6])), Math.min(Math.min(af[1], af[3]), Math.min(af[5], af[7])), Math.max(Math.max(af[0], af[2]), Math.max(af[4], af[6])), Math.max(Math.max(af[1], af[3]), Math.max(af[5], af[7])));
                f7 = rectf2.centerX() - rectf1.centerX();
                f5 = rectf2.centerY() - rectf1.centerY();
                f3 = f7;
                f1 = f5;
                if (mScale)
                {
                    f3 = f7 * 0.5F;
                    f1 = f5 * 0.5F;
                }
                rectf.offset(f3, f1);
            }
            if (mScale)
            {
                matrix.reset();
                matrix.setScale(0.5F, 0.5F, rectf.centerX(), rectf.centerY());
                matrix.mapRect(rectf);
            }
            instoremapview.scrollToRect(rectf, true);
        }
    }

    public (AisleMapTransform aislemaptransform, AisleSection aislesection, Rect rect, boolean flag)
    {
        mAisleSection = aislesection;
        mVisibleRect = rect;
        mScale = flag;
        mAisleMapTransform = aislemaptransform;
    }
}
