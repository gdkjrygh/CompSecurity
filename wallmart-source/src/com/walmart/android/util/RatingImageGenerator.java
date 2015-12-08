// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.walmart.android.utils.ViewUtil;

public class RatingImageGenerator
{

    private static RatingImageGenerator mInstance;
    private Context mContext;
    private Bitmap mEmptyStar;
    private Bitmap mFilledStar;

    private RatingImageGenerator(Context context)
    {
        mContext = context;
        mFilledStar = BitmapFactory.decodeResource(context.getResources(), 0x7f020300);
        mEmptyStar = BitmapFactory.decodeResource(context.getResources(), 0x7f0202ff);
    }

    private Bitmap createStarImage(int i, float f, Bitmap bitmap, Bitmap bitmap1, int j)
    {
        int l = ViewUtil.dpToPixels(j, mContext);
        int i1 = bitmap1.getWidth();
        int j1 = bitmap1.getHeight();
        Bitmap bitmap2 = Bitmap.createBitmap((i1 + l) * i - l, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        int k = 0;
        for (j = 0; j < i; j++)
        {
            canvas.drawBitmap(bitmap1, k, 0.0F, null);
            k += i1 + l;
        }

        k = (int)f;
        float f1 = k;
        int k1 = Math.round((float)i1 * (f - f1));
        j = 0;
        for (i = 0; i < k; i++)
        {
            canvas.drawBitmap(bitmap, j, 0.0F, null);
            j += i1 + l;
        }

        canvas.clipRect(new Rect(j, 0, j + k1, j1));
        canvas.drawBitmap(bitmap, j, 0.0F, null);
        return bitmap2;
    }

    public static RatingImageGenerator getInstance(Context context)
    {
        if (mInstance == null)
        {
            mInstance = new RatingImageGenerator(context.getApplicationContext());
        }
        return mInstance;
    }

    public Bitmap createStarImage(int i, float f)
    {
        return createStarImage(i, f, mFilledStar, mEmptyStar, 3);
    }

    public Bitmap createStarImage(int i, float f, int j, int k)
    {
        return createStarImage(i, f, j, k, 3);
    }

    public Bitmap createStarImage(int i, float f, int j, int k, int l)
    {
        return createStarImage(i, f, BitmapFactory.decodeResource(mContext.getResources(), j), BitmapFactory.decodeResource(mContext.getResources(), k), l);
    }
}
