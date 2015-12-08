// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;

public class RatingImageGenerator
{

    private static RatingImageGenerator sInstance;
    private Bitmap mEmptyStar;
    private Bitmap mFilledStar;
    private SparseArray mRatingImageCache;

    private RatingImageGenerator(Context context, int i, int j)
    {
        mFilledStar = BitmapFactory.decodeResource(context.getResources(), i);
        mEmptyStar = BitmapFactory.decodeResource(context.getResources(), j);
        mRatingImageCache = new SparseArray(50);
    }

    public static Bitmap createCustomStarImage(Bitmap bitmap, Bitmap bitmap1, int i, float f)
    {
        return createStarImage(bitmap, bitmap1, i, f);
    }

    private static Bitmap createStarImage(Bitmap bitmap, Bitmap bitmap1, int i, float f)
    {
        int i1 = bitmap1.getWidth();
        int j1 = bitmap1.getHeight();
        Bitmap bitmap2 = Bitmap.createBitmap((i1 + 2) * i - 2, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        int l = 0;
        for (int j = 0; j < i; j++)
        {
            canvas.drawBitmap(bitmap1, l, 0.0F, null);
            l += i1 + 2;
        }

        l = (int)f;
        float f1 = l;
        int k1 = Math.round((float)i1 * (f - f1));
        int k = 0;
        for (i = 0; i < l; i++)
        {
            canvas.drawBitmap(bitmap, k, 0.0F, null);
            k += i1 + 2;
        }

        canvas.clipRect(new Rect(k, 0, k + k1, j1));
        canvas.drawBitmap(bitmap, k, 0.0F, null);
        return bitmap2;
    }

    public static RatingImageGenerator getInstance()
    {
        return sInstance;
    }

    public static void init(Context context, int i, int j)
    {
        sInstance = new RatingImageGenerator(context, i, j);
    }

    public Bitmap createStarImage(int i, float f)
    {
        int j = Math.round(4F * f);
        Bitmap bitmap = (Bitmap)mRatingImageCache.get(j);
        if (bitmap != null)
        {
            return bitmap;
        } else
        {
            Bitmap bitmap1 = createStarImage(mFilledStar, mEmptyStar, i, f);
            mRatingImageCache.put(j, bitmap1);
            return bitmap1;
        }
    }
}
