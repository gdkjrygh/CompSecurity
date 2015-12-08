// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.util.LruCache;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.RecyclingBitmapDrawable;

// Referenced classes of package com.walmartlabs.android.photo.util:
//            PhotoLogger

public class BitmapCache extends LruCache
{

    private static final String TAG = com/walmartlabs/android/photo/util/BitmapCache.getSimpleName();
    private static BitmapCache sInstance;

    private BitmapCache(int i)
    {
        super(i);
    }

    public static BitmapCache get()
    {
        com/walmartlabs/android/photo/util/BitmapCache;
        JVM INSTR monitorenter ;
        BitmapCache bitmapcache;
        if (sInstance == null)
        {
            int i = (int)(Runtime.getRuntime().maxMemory() / 1024L);
            int j = Math.min(i / 8, 16000);
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Max heap size - maxMemory(): ").append(i).toString());
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Current heap size - totalMemory(): ").append(Runtime.getRuntime().totalMemory() / 1024L).toString());
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Bitmap cache: ").append(j).toString());
            sInstance = new BitmapCache(j);
        }
        bitmapcache = sInstance;
        com/walmartlabs/android/photo/util/BitmapCache;
        JVM INSTR monitorexit ;
        return bitmapcache;
        Exception exception;
        exception;
        throw exception;
    }

    public static int getBitmapSize(BitmapDrawable bitmapdrawable)
    {
        if (bitmapdrawable != null)
        {
            bitmapdrawable = bitmapdrawable.getBitmap();
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                return bitmapdrawable.getAllocationByteCount();
            }
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return bitmapdrawable.getByteCount();
            } else
            {
                return bitmapdrawable.getRowBytes() * bitmapdrawable.getHeight();
            }
        } else
        {
            return 0;
        }
    }

    protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        entryRemoved(flag, (String)obj, (PhotoDrawable)obj1, (PhotoDrawable)obj2);
    }

    protected void entryRemoved(boolean flag, String s, PhotoDrawable photodrawable, PhotoDrawable photodrawable1)
    {
        if (com/walmartlabs/android/photo/view/RecyclingBitmapDrawable.isInstance(photodrawable))
        {
            ((RecyclingBitmapDrawable)photodrawable).setIsCached(false);
        }
    }

    public PhotoDrawable getBitmapDrawable(String s)
    {
        return (PhotoDrawable)get(s);
    }

    public PhotoDrawable putBitmap(String s, PhotoDrawable photodrawable)
    {
        if (com/walmartlabs/android/photo/view/RecyclingBitmapDrawable.isInstance(photodrawable))
        {
            ((RecyclingBitmapDrawable)photodrawable).setIsCached(true);
        }
        return (PhotoDrawable)super.put(s, photodrawable);
    }

    protected volatile int sizeOf(Object obj, Object obj1)
    {
        return sizeOf((String)obj, (PhotoDrawable)obj1);
    }

    protected int sizeOf(String s, PhotoDrawable photodrawable)
    {
        int j = getBitmapSize(photodrawable) / 1024;
        int i = j;
        if (j == 0)
        {
            i = 1;
        }
        return i;
    }

}
