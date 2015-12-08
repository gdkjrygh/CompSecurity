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

// Referenced classes of package com.weather.commons.ui:
//            WxIconBitmapCache

static final class  extends LruCache
{

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

    (int i)
    {
        super(i);
    }
}
