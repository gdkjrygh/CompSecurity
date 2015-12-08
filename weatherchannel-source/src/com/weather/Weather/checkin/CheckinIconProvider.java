// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.ExecutionException;

public class CheckinIconProvider
{

    public static final CheckinIconProvider BUTTON_PROVIDER = new CheckinIconProvider(0x7f090008, 0x7f090008, 0x7f090008, 0x7f090008, 0x7f02001c);
    private static final int CACHE_SIZE_COUNT = 12;
    private static final Drawable EMPTY = new LayerDrawable(new Drawable[0]);
    public static final CheckinIconProvider PIN_PROVIDER = new CheckinIconProvider(0x7f09000a, 0x7f09000c, 0x7f09000b, 0x7f090009, 0x7f020085);
    private static final String TAG = "CheckinIconCache";
    private Drawable background;
    private final int backgroundId;
    private int bottomInsetId;
    private final Cache cache = CacheBuilder.newBuilder().maximumSize(12L).build();
    private int leftInsetId;
    private final Object lock = new Object();
    private int rightInsetId;
    private int topInsetId;

    public CheckinIconProvider(int i, int j, int k, int l, int i1)
    {
        leftInsetId = i;
        topInsetId = j;
        rightInsetId = k;
        bottomInsetId = l;
        backgroundId = i1;
    }

    private Drawable getBackground(Context context)
    {
        synchronized (lock)
        {
            if (background == null)
            {
                background = (Drawable)Preconditions.checkNotNull(context.getResources().getDrawable(backgroundId));
            }
            context = background;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private Drawable getLayeredDrawable(Context context, Drawable drawable, Bitmap bitmap)
    {
        context = context.getResources();
        drawable = new LayerDrawable(new Drawable[] {
            drawable, new BitmapDrawable(context, bitmap)
        });
        drawable.setLayerInset(1, context.getInteger(leftInsetId), context.getInteger(topInsetId), context.getInteger(rightInsetId), context.getInteger(bottomInsetId));
        return drawable;
    }

    public Drawable getDrawable(Context context, int i)
    {
        try
        {
            context = (Drawable)cache.get(Integer.valueOf(i), new _cls1(context, i));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("CheckinIconCache", context.getMessage(), context);
            return EMPTY;
        }
        return context;
    }




    /* member class not found */
    class _cls1 {}

}
