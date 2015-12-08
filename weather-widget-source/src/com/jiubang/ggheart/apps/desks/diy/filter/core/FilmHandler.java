// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.ref.SoftReference;

// Referenced classes of package com.jiubang.ggheart.apps.desks.diy.filter.core:
//            AbsFilterHandler, BitmapInfo, FilterParameter

public class FilmHandler extends AbsFilterHandler
{

    public static final String EXSIT_FILE_ARRAY[] = {
        "film_map.png", "film_vignette_map.png"
    };
    private SoftReference a;
    private SoftReference b;
    private Context c;

    public FilmHandler(Context context)
    {
        c = context;
        try
        {
            Bitmap bitmap = BitmapFactory.decodeStream(context.getAssets().open("film_map.png"));
            context = BitmapFactory.decodeStream(context.getAssets().open("film_vignette_map.png"));
            a = new SoftReference(new BitmapInfo(a(bitmap), bitmap.getWidth(), bitmap.getHeight()));
            b = new SoftReference(new BitmapInfo(a(context), context.getWidth(), context.getHeight()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    private BitmapInfo a()
    {
        Object obj;
        BitmapInfo bitmapinfo;
        if (b != null)
        {
            bitmapinfo = (BitmapInfo)b.get();
        } else
        {
            bitmapinfo = null;
        }
        obj = bitmapinfo;
        if (bitmapinfo == null)
        {
            obj = c;
            if (obj == null)
            {
                obj = null;
            } else
            {
                try
                {
                    obj = BitmapFactory.decodeStream(((Context) (obj)).getAssets().open("film_vignette_map.png"));
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                    return null;
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    outofmemoryerror.printStackTrace();
                    return null;
                }
                bitmapinfo = new BitmapInfo(a(((Bitmap) (obj))), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
                obj = bitmapinfo;
                if (bitmapinfo != null)
                {
                    b = new SoftReference(bitmapinfo);
                    return bitmapinfo;
                }
            }
        }
        return ((BitmapInfo) (obj));
    }

    private int[] a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            int ai[] = new int[bitmap.getWidth() * bitmap.getHeight()];
            bitmap.getPixels(ai, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            return ai;
        }
    }

    private BitmapInfo b()
    {
        Object obj;
        BitmapInfo bitmapinfo;
        if (a != null)
        {
            bitmapinfo = (BitmapInfo)a.get();
        } else
        {
            bitmapinfo = null;
        }
        obj = bitmapinfo;
        if (bitmapinfo == null)
        {
            obj = c;
            if (obj == null)
            {
                obj = null;
            } else
            {
                try
                {
                    obj = BitmapFactory.decodeStream(((Context) (obj)).getAssets().open("film_map.png"));
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                    return null;
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    outofmemoryerror.printStackTrace();
                    return null;
                }
                bitmapinfo = new BitmapInfo(a(((Bitmap) (obj))), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
                obj = bitmapinfo;
                if (bitmapinfo != null)
                {
                    a = new SoftReference(bitmapinfo);
                    return bitmapinfo;
                }
            }
        }
        return ((BitmapInfo) (obj));
    }

    public static boolean canHandle(int i)
    {
        return (getHadlerIds() & i) == i;
    }

    public static int getHadlerIds()
    {
        return 32768;
    }

    public native void doFilt(int ai[], int i, int j, int ai1[], int k, int l, int ai2[], 
            int i1, int j1, int ai3[]);

    public Bitmap handler(FilterParameter filterparameter)
    {
        Object obj;
        if (filterparameter.mSrcBitmap == null)
        {
            obj = null;
        } else
        {
            int i = filterparameter.mSrcBitmap.getWidth();
            int j = filterparameter.mSrcBitmap.getHeight();
            obj = new int[i * j];
            int ai[] = new int[i * j];
            filterparameter.mSrcBitmap.getPixels(((int []) (obj)), 0, i, 0, 0, i, j);
            BitmapInfo bitmapinfo = b();
            BitmapInfo bitmapinfo1 = a();
            if (bitmapinfo == null || bitmapinfo1 == null)
            {
                return filterparameter.mSrcBitmap;
            }
            doFilt(((int []) (obj)), i, j, bitmapinfo.mPixels, bitmapinfo.mWidth, bitmapinfo.mHeight, bitmapinfo1.mPixels, bitmapinfo1.mWidth, bitmapinfo1.mHeight, ai);
            Bitmap bitmap = a(ai, i, j);
            obj = bitmap;
            if (bitmap == null)
            {
                return filterparameter.mSrcBitmap;
            }
        }
        return ((Bitmap) (obj));
    }

}
