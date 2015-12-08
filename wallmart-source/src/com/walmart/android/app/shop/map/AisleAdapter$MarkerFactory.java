// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.LruCache;
import android.view.View;
import com.arubanetworks.meridian.maps.Marker;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleAdapter, AisleSection

private static class mContext
{

    private final LruCache mAisles = new LruCache(10);
    private final Context mContext;
    private int mPinResource;
    private float mSelectedAnchorY;

    public Marker create(AisleSection aislesection, float f, float f1)
    {
        return new nit>(aislesection, f, f1, BitmapFactory.decodeResource(mContext.getResources(), mPinResource));
    }

    public Marker create(AisleSection aislesection, float f, float f1, String s)
    {
        Object obj = (Bitmap)mAisles.get(s);
        if (obj == null || mSelectedAnchorY == 0.0F)
        {
            View view = ViewUtil.inflate(mContext, 0x7f04006b, null, false);
            ViewUtil.setText(0x7f100178, view, mContext.getString(0x7f090159, new Object[] {
                s
            }));
            if (view.getMeasuredHeight() <= 0 || view.getMeasuredWidth() <= 0)
            {
                view.measure(android.view.eSpec(0, 0), android.view.eSpec(0, 0));
            }
            s = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), android.graphics.c);
            obj = new Canvas(s);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.draw(((Canvas) (obj)));
            obj = s;
            if (mSelectedAnchorY == 0.0F)
            {
                float f2 = view.getHeight();
                mSelectedAnchorY = (float)ViewUtil.findViewById(view, 0x7f100179).getHeight() / 2.0F / f2;
                obj = s;
            }
        }
        aislesection = new nit>(aislesection, f, f1, ((Bitmap) (obj)));
        aislesection.tAnchor(0.5F, mSelectedAnchorY);
        return aislesection;
    }

    public void setPinResource(int i)
    {
        mPinResource = i;
    }

    public A(Context context)
    {
        mContext = context;
    }
}
