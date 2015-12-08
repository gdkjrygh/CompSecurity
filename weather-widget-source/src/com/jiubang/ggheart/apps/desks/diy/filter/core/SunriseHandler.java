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

public class SunriseHandler extends AbsFilterHandler
{

    public static final String EXSIT_FILE_ARRAY[] = {
        "sunrise_metal.png", "sunrise_soft_light.png", "sunrise_curves.png", "sunrise_overlay_map_warm.png", "sunrise_color_shift.png"
    };
    private SoftReference a;
    private SoftReference b;
    private SoftReference c;
    private SoftReference d;
    private SoftReference e;
    private Context f;

    public SunriseHandler(Context context)
    {
        f = context;
        if (context == null)
        {
            return;
        }
        try
        {
            Bitmap bitmap = BitmapFactory.decodeStream(context.getAssets().open("sunrise_metal.png"));
            Bitmap bitmap1 = BitmapFactory.decodeStream(context.getAssets().open("sunrise_soft_light.png"));
            Bitmap bitmap2 = BitmapFactory.decodeStream(context.getAssets().open("sunrise_curves.png"));
            Bitmap bitmap3 = BitmapFactory.decodeStream(context.getAssets().open("sunrise_overlay_map_warm.png"));
            context = BitmapFactory.decodeStream(context.getAssets().open("sunrise_color_shift.png"));
            a = new SoftReference(new BitmapInfo(a(bitmap2), bitmap2.getWidth(), bitmap2.getHeight()));
            d = new SoftReference(new BitmapInfo(a(bitmap3), bitmap3.getWidth(), bitmap3.getHeight()));
            e = new SoftReference(new BitmapInfo(a(context), context.getWidth(), context.getHeight()));
            b = new SoftReference(new BitmapInfo(a(bitmap), bitmap.getWidth(), bitmap.getHeight()));
            c = new SoftReference(new BitmapInfo(a(bitmap1), bitmap1.getWidth(), bitmap1.getHeight()));
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
        return;
    }

    private BitmapInfo a()
    {
        Object obj;
label0:
        {
            BitmapInfo bitmapinfo = (BitmapInfo)b.get();
            obj = bitmapinfo;
            if (bitmapinfo == null)
            {
                obj = f;
                if (obj != null)
                {
                    break label0;
                }
                obj = null;
            }
            return ((BitmapInfo) (obj));
        }
        try
        {
            obj = BitmapFactory.decodeStream(((Context) (obj)).getAssets().open("sunrise_metal.png"));
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
        return new BitmapInfo(a(((Bitmap) (obj))), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
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
label0:
        {
            BitmapInfo bitmapinfo = (BitmapInfo)c.get();
            obj = bitmapinfo;
            if (bitmapinfo == null)
            {
                obj = f;
                if (obj != null)
                {
                    break label0;
                }
                obj = null;
            }
            return ((BitmapInfo) (obj));
        }
        try
        {
            obj = BitmapFactory.decodeStream(((Context) (obj)).getAssets().open("sunrise_soft_light.png"));
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
        return new BitmapInfo(a(((Bitmap) (obj))), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
    }

    private BitmapInfo c()
    {
        Object obj;
label0:
        {
            BitmapInfo bitmapinfo = (BitmapInfo)e.get();
            obj = bitmapinfo;
            if (bitmapinfo == null)
            {
                obj = f;
                if (obj != null)
                {
                    break label0;
                }
                obj = null;
            }
            return ((BitmapInfo) (obj));
        }
        try
        {
            obj = BitmapFactory.decodeStream(((Context) (obj)).getAssets().open("sunrise_color_shift.png"));
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
        return new BitmapInfo(a(((Bitmap) (obj))), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
    }

    public static boolean canHandle(int i)
    {
        return (getHadlerIds() & i) == i;
    }

    private BitmapInfo d()
    {
        Object obj;
label0:
        {
            BitmapInfo bitmapinfo = (BitmapInfo)d.get();
            obj = bitmapinfo;
            if (bitmapinfo == null)
            {
                obj = f;
                if (obj != null)
                {
                    break label0;
                }
                obj = null;
            }
            return ((BitmapInfo) (obj));
        }
        try
        {
            obj = BitmapFactory.decodeStream(((Context) (obj)).getAssets().open("sunrise_overlay_map_warm.png"));
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
        return new BitmapInfo(a(((Bitmap) (obj))), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
    }

    private BitmapInfo e()
    {
        Object obj;
label0:
        {
            BitmapInfo bitmapinfo = (BitmapInfo)a.get();
            obj = bitmapinfo;
            if (bitmapinfo == null)
            {
                obj = f;
                if (obj != null)
                {
                    break label0;
                }
                obj = null;
            }
            return ((BitmapInfo) (obj));
        }
        try
        {
            obj = BitmapFactory.decodeStream(((Context) (obj)).getAssets().open("sunrise_curves.png"));
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
        return new BitmapInfo(a(((Bitmap) (obj))), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
    }

    public static int getHadlerIds()
    {
        return 16384;
    }

    public native void doFilt(int ai[], int i, int j, int ai1[], int k, int l, int ai2[], 
            int i1, int j1, int ai3[], int k1, int l1, int ai4[], int i2, 
            int j2, int ai5[], int k2, int l2, int ai6[]);

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
            BitmapInfo bitmapinfo = a();
            BitmapInfo bitmapinfo1 = b();
            BitmapInfo bitmapinfo2 = e();
            BitmapInfo bitmapinfo3 = d();
            BitmapInfo bitmapinfo4 = c();
            if (bitmapinfo == null || bitmapinfo1 == null || bitmapinfo2 == null || bitmapinfo3 == null || bitmapinfo4 == null)
            {
                return filterparameter.mSrcBitmap;
            }
            doFilt(((int []) (obj)), i, j, bitmapinfo.mPixels, bitmapinfo.mWidth, bitmapinfo.mHeight, bitmapinfo1.mPixels, bitmapinfo1.mWidth, bitmapinfo1.mHeight, bitmapinfo2.mPixels, bitmapinfo2.mWidth, bitmapinfo2.mHeight, bitmapinfo3.mPixels, bitmapinfo3.mWidth, bitmapinfo3.mHeight, bitmapinfo4.mPixels, bitmapinfo4.mWidth, bitmapinfo4.mHeight, ai);
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
