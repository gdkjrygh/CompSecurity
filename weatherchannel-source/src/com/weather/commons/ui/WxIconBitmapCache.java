// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.LruCache;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.bitmaps.SvgUtils;

public final class WxIconBitmapCache
{

    private static final LruCache CACHE = new LruCache(25) {

        private static final String TAG = "WxIconBitmapCache.LruCache";

        protected Bitmap create(Integer integer)
        {
            Bitmap bitmap = SvgUtils.createBitmapFromSvgResourceId(AbstractTwcApplication.getRootContext().getResources(), integer.intValue());
            Log.d("WxIconBitmapCache.LruCache", (new StringBuilder()).append("cache.create: resource key=").append(integer).append(", bm=").append(bitmap).toString());
            return bitmap;
        }

        protected volatile Object create(Object obj)
        {
            return create((Integer)obj);
        }

        protected void entryRemoved(boolean flag, Integer integer, Bitmap bitmap, Bitmap bitmap1)
        {
            super.entryRemoved(flag, integer, bitmap, bitmap1);
            Log.d("WxIconBitmapCache.LruCache", (new StringBuilder()).append("cache: entryRemoved: key=").append(integer).toString());
        }

        protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            entryRemoved(flag, (Integer)obj, (Bitmap)obj1, (Bitmap)obj2);
        }

    };
    private static final int CACHE_SIZE_COUNT = 25;
    private static final String TAG = "WxIconBitmapCache";

    private WxIconBitmapCache()
    {
    }

    public static Bitmap getBitmap(int i)
    {
        return (Bitmap)CACHE.get(Integer.valueOf(i));
    }

}
