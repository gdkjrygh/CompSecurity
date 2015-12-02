// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Debug;
import java.io.Closeable;

// Referenced classes of package com.whatsapp.util:
//            Log

public class cl
{

    private static Bitmap a;
    private static Bitmap b;
    private static Bitmap c;
    private static Bitmap d;
    private static Bitmap e;
    private static Bitmap f;
    private static Bitmap g;
    private static final String z[];

    public static int a(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT < 12)
        {
            return bitmap.getRowBytes() * bitmap.getHeight();
        } else
        {
            return bitmap.getByteCount();
        }
    }

    public static Bitmap a(Context context)
    {
        if (b == null)
        {
            b = BitmapFactory.decodeResource(context.getResources(), 0x7f0205a2);
        }
        return b;
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        Object obj = bitmap;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = new Matrix();
        ((Matrix) (obj)).setRotate(i, (float)bitmap.getWidth() / 2.0F, (float)bitmap.getHeight() / 2.0F);
        Bitmap bitmap1;
        try
        {
            bitmap1 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            Log.e((new StringBuilder()).append(z[1]).append(Debug.getNativeHeapAllocatedSize() / 1024L).append(z[0]).toString());
            return bitmap;
        }
        obj = bitmap;
        if (bitmap == bitmap1)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        bitmap.recycle();
        obj = bitmap1;
        return ((Bitmap) (obj));
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            Log.e(closeable.toString());
        }
    }

    public static Bitmap b(Context context)
    {
        if (c == null)
        {
            c = BitmapFactory.decodeResource(context.getResources(), 0x7f0205a1);
        }
        return c;
    }

    public static Bitmap c(Context context)
    {
        if (d == null)
        {
            d = BitmapFactory.decodeResource(context.getResources(), 0x7f0205a3);
        }
        return d;
    }

    public static Bitmap d(Context context)
    {
        if (g == null)
        {
            g = BitmapFactory.decodeResource(context.getResources(), 0x7f0205aa);
        }
        return g;
    }

    public static Bitmap e(Context context)
    {
        if (f == null)
        {
            f = BitmapFactory.decodeResource(context.getResources(), 0x7f0205a0);
        }
        return f;
    }

    public static Bitmap f(Context context)
    {
        if (e == null)
        {
            e = BitmapFactory.decodeResource(context.getResources(), 0x7f0205a4);
        }
        return e;
    }

    public static Bitmap g(Context context)
    {
        if (a != null)
        {
            return a;
        } else
        {
            context = context.getResources().getDrawable(0x7f02008a);
            a = Bitmap.createBitmap(context.getIntrinsicWidth(), context.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(a);
            context.setBounds(0, 0, context.getIntrinsicWidth(), context.getIntrinsicHeight());
            context.draw(canvas);
            return a;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ">R!";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "wT\0026WkM\n=\035qL\027|]x\024\0164_qK\032k";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                e = null;
                d = null;
                g = null;
                f = null;
                c = null;
                b = null;
                a = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 164
    //                   0 185
    //                   1 191
    //                   2 197
    //                   3 203;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_203;
_L3:
        byte byte0 = 50;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 30;
          goto _L9
_L5:
        byte0 = 57;
          goto _L9
_L6:
        byte0 = 99;
          goto _L9
        byte0 = 81;
          goto _L9
    }
}
