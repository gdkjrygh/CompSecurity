// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.gtp.a.a.c.c;
import com.gtp.go.weather.sharephoto.takephoto.ab;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            b, i, j, m

public class h
{

    public static final String a = (new StringBuilder()).append(com.gtp.a.a.c.c.a()).append("/download/photoes/").toString();

    public static Bitmap a(Context context, int k, int l, String s, String s1, String s2)
    {
        Object obj;
        Bitmap bitmap = a(context, s2);
        obj = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s = ab.a(s, k, l);
        obj = bitmap;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        context = a(context, s1);
        if (context != null)
        {
            context = a(((Bitmap) (s)), ((Bitmap) (context)));
        } else
        {
            context = s;
        }
        obj = context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = new FileOutputStream(s2);
        s = s1;
        context.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, s1);
        obj = context;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1.flush();
        s1.close();
        obj = context;
_L2:
        return ((Bitmap) (obj));
        s2;
        s1 = null;
_L5:
        s = s1;
        s2.printStackTrace();
        obj = context;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1.flush();
        s1.close();
        return context;
        s;
_L3:
        s.printStackTrace();
        return context;
        context;
        s = null;
_L4:
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw context;
        s;
          goto _L3
        s;
          goto _L3
        context;
          goto _L4
        s2;
          goto _L5
    }

    public static Bitmap a(Context context, j j1, String s)
    {
        j1 = a(j1, s);
        if (!TextUtils.isEmpty(j1))
        {
            return a(context, ((String) (j1)));
        } else
        {
            return null;
        }
    }

    public static Bitmap a(Context context, String s)
    {
        return a(context, s, ((b) (null)));
    }

    public static Bitmap a(Context context, String s, b b1)
    {
        b b2 = b1;
        if (b1 == null)
        {
            b2 = new b(context);
        }
        if (b2.d() != null)
        {
            return a(s, b2.d());
        } else
        {
            return ab.a(s, b2.b(), b2.c());
        }
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap1)
    {
        if (bitmap == null || bitmap1 == null) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        l = bitmap.getWidth();
        k = bitmap.getHeight();
        if (l <= 0 || k <= 0) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L7:
        Object obj;
        try
        {
            obj = Bitmap.createBitmap(l, k, android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (!flag)
            {
                flag = true;
                l /= 2;
                k /= 2;
            } else
            {
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            continue; /* Loop/switch isn't completed */
        }
_L5:
        if (obj != null)
        {
            Rect rect = a(((Bitmap) (obj)));
            Canvas canvas = new Canvas(((Bitmap) (obj)));
            canvas.drawBitmap(bitmap, a(bitmap), rect, null);
            canvas.drawBitmap(bitmap1, a(bitmap1), rect, null);
        }
        return ((Bitmap) (obj));
_L4:
        obj = null;
        if (true) goto _L5; else goto _L2
_L2:
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static Bitmap a(Drawable drawable)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (drawable == null) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        k = drawable.getIntrinsicWidth();
        l = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() == -1) goto _L4; else goto _L3
_L3:
        Object obj = android.graphics.Bitmap.Config.ARGB_8888;
_L5:
        obj = Bitmap.createBitmap(k, l, ((android.graphics.Bitmap.Config) (obj)));
_L6:
        obj1 = obj;
        if (obj != null)
        {
            obj1 = new Canvas(((Bitmap) (obj)));
            drawable.setBounds(0, 0, k, l);
            drawable.draw(((Canvas) (obj1)));
            obj1 = obj;
        }
_L2:
        return ((Bitmap) (obj1));
_L4:
        obj = android.graphics.Bitmap.Config.RGB_565;
          goto _L5
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        obj = obj2;
        if (com.gtp.a.a.b.c.a())
        {
            outofmemoryerror.printStackTrace();
            obj = obj2;
        }
          goto _L6
    }

    private static Bitmap a(String s, android.graphics.BitmapFactory.Options options)
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        flag = false;
_L8:
        if (!flag) goto _L2; else goto _L1
_L1:
        if (options != null) goto _L4; else goto _L3
_L3:
        Object obj = new android.graphics.BitmapFactory.Options();
        options = ((android.graphics.BitmapFactory.Options) (obj));
        obj.inSampleSize = 2;
_L5:
        options = ((android.graphics.BitmapFactory.Options) (obj));
        obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
_L7:
        return ((Bitmap) (obj));
_L4:
        options.inSampleSize = options.inSampleSize + 1;
_L2:
        obj = options;
          goto _L5
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
_L9:
        outofmemoryerror = obj1;
        if (flag) goto _L7; else goto _L6
_L6:
        flag = true;
          goto _L8
        outofmemoryerror;
          goto _L9
    }

    private static Rect a(Bitmap bitmap)
    {
        Rect rect = null;
        if (bitmap != null)
        {
            rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        return rect;
    }

    public static String a(long l)
    {
        return (new StringBuilder()).append(ab.a(l)).append("/").append("photo_thumbnail_temporary.png").toString();
    }

    public static String a(j j1)
    {
        Object obj = null;
        i.a[j1.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 56
    //                   2 62
    //                   3 68;
           goto _L1 _L2 _L3 _L4
_L1:
        j1 = obj;
_L6:
        return (new StringBuilder(a)).append(j1).toString();
_L2:
        j1 = "compose";
        continue; /* Loop/switch isn't completed */
_L3:
        j1 = "original";
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = "watermark";
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String a(j j1, String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            j1 = a(j1);
            s = a(s);
            return (new StringBuilder(j1)).append(File.separator).append(s).append(".png").toString();
        }
    }

    public static String a(String s)
    {
        return m.a(s);
    }

    public static void a(String s, String s1)
    {
        Object obj;
        Exception exception;
        obj = null;
        exception = null;
        s = new File(s);
        if (s.exists()) goto _L2; else goto _L1
_L1:
        File file;
        return;
_L2:
        if ((file = new File(s1)).exists()) goto _L1; else goto _L3
_L3:
        file.getParentFile().mkdirs();
        try
        {
            file.createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        s1 = new BufferedInputStream(new FileInputStream(s));
        s = new BufferedOutputStream(new FileOutputStream(file));
        for (obj = new byte[4096]; s1.read(((byte []) (obj))) > 0; s.write(((byte []) (obj)))) { }
          goto _L4
        obj;
_L9:
        if (com.gtp.a.a.b.c.a())
        {
            ((Exception) (obj)).printStackTrace();
        }
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
            }
        }
        if (s == null) goto _L1; else goto _L5
_L5:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (!com.gtp.a.a.b.c.a()) goto _L1; else goto _L6
_L6:
        s.printStackTrace();
        return;
_L4:
        s.flush();
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
            }
        }
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (!com.gtp.a.a.b.c.a()) goto _L1; else goto _L6
        s;
        s1 = null;
_L8:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
            }
        }
        if (obj != null)
        {
            try
            {
                ((BufferedOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
            }
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = s;
        s = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = s;
        s = exception;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        s = null;
        s1 = exception;
          goto _L9
        obj;
        s = null;
          goto _L9
    }

    public static String b(long l)
    {
        return (new StringBuilder()).append(ab.a(l)).append("/").append("publish_photo_original.jpg").toString();
    }

    public static boolean b(String s)
    {
        if (c(s))
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(s, options);
            int k = options.outWidth;
            int l = options.outHeight;
            if (k != -1 && l != -1)
            {
                return true;
            }
        }
        return false;
    }

    public static String c(long l)
    {
        return (new StringBuilder()).append(ab.a(l)).append("/").append("publish_photo_watermark.png").toString();
    }

    public static boolean c(String s)
    {
        return !TextUtils.isEmpty(s) && (new File(s)).exists();
    }

}
