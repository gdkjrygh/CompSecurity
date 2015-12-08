// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gtp.a.a.b.c;
import com.gtp.a.a.c.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ab
{

    public static int a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        int i = (new ExifInterface(s)).getAttributeInt("Orientation", 1);
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 3: // '\003'
            return 180;

        case 6: // '\006'
            return 90;

        case 8: // '\b'
            return 270;
        }
        s;
        if (com.gtp.a.a.b.c.a())
        {
            s.printStackTrace();
            return 0;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static android.graphics.Bitmap.CompressFormat a(File file)
    {
        Object obj;
label0:
        {
            android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.PNG;
            obj = compressformat;
            if (file == null)
            {
                break label0;
            }
            obj = compressformat;
            if (!file.exists())
            {
                break label0;
            }
            obj = file.getAbsolutePath();
            file = new android.graphics.BitmapFactory.Options();
            file.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(((String) (obj)), file);
            if (!"image/jpeg".equalsIgnoreCase(((android.graphics.BitmapFactory.Options) (file)).outMimeType))
            {
                obj = compressformat;
                if (!"image/bmp".equalsIgnoreCase(((android.graphics.BitmapFactory.Options) (file)).outMimeType))
                {
                    break label0;
                }
            }
            obj = android.graphics.Bitmap.CompressFormat.JPEG;
        }
        return ((android.graphics.Bitmap.CompressFormat) (obj));
    }

    public static Bitmap a(int i, int j, File file)
    {
        return a(i, j, file, ((android.graphics.Bitmap.Config) (null)));
    }

    public static Bitmap a(int i, int j, File file, android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap = null;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        float f1 = options.outHeight;
        float f2 = options.outWidth;
        options.inSampleSize = (int)(Math.max(f1 / (float)j, f2 / (float)i) + 0.5F);
        options.inJustDecodeBounds = false;
        if (config != null)
        {
            options.inPreferredConfig = config;
        }
        try
        {
            config = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            if (com.gtp.a.a.b.c.a())
            {
                config.printStackTrace();
            }
            i = 1;
            config = bitmap;
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L2:
        if (config != null || i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        options.inSampleSize = options.inSampleSize + 1;
        bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        config = bitmap;
        i = 0;
        continue; /* Loop/switch isn't completed */
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        if (com.gtp.a.a.b.c.a())
        {
            outofmemoryerror.printStackTrace();
        }
        i = 1;
        if (true) goto _L2; else goto _L1
_L1:
        return config;
    }

    public static Bitmap a(Bitmap bitmap)
    {
        int ai[];
        int k;
        int l;
        k = bitmap.getWidth();
        l = bitmap.getHeight();
        ai = new int[k * l];
        bitmap.getPixels(ai, 0, k, 0, 0, k, l);
        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < k; j++)
            {
                int i1 = ai[k * i + j];
                double d = (0xff0000 & i1) >> 16;
                int j1 = (int)((double)((0xff00 & i1) >> 8) * 0.58999999999999997D + d * 0.29999999999999999D + (double)(i1 & 0xff) * 0.11D);
                ai[k * i + j] = i1 & 0xff000000 | j1 << 16 | j1 << 8 | j1;
            }

        }

        Bitmap bitmap1 = Bitmap.createBitmap(k, l, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap = bitmap1;
        bitmap.setPixels(ai, 0, k, 0, 0, k, l);
        Bitmap bitmap2 = bitmap;
_L2:
        return bitmap2;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
_L3:
        bitmap2 = bitmap;
        if (!com.gtp.a.a.b.c.a()) goto _L2; else goto _L1
_L1:
        outofmemoryerror.printStackTrace();
        return bitmap;
        outofmemoryerror;
          goto _L3
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        if (i != 0 && bitmap != null) goto _L2; else goto _L1
_L1:
        return bitmap;
_L2:
        Object obj;
        obj = new Matrix();
        ((Matrix) (obj)).setRotate(i, bitmap.getWidth(), bitmap.getHeight());
        obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
        if (bitmap != obj)
        {
            return ((Bitmap) (obj));
        }
        continue; /* Loop/switch isn't completed */
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        if (com.gtp.a.a.b.c.a())
        {
            outofmemoryerror.printStackTrace();
            return bitmap;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static Bitmap a(Bitmap bitmap, int i, int j)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        return bitmap;
_L2:
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        float f1 = ((float)i * 1.0F) / (float)k;
        float f2 = ((float)j * 1.0F) / (float)l;
        Object obj = new Matrix();
        ((Matrix) (obj)).postScale(f1, f2);
        try
        {
            obj = Bitmap.createBitmap(bitmap, 0, 0, k, l, ((Matrix) (obj)), true);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            Object obj1 = null;
            obj = obj1;
            if (com.gtp.a.a.b.c.a())
            {
                outofmemoryerror.printStackTrace();
                obj = obj1;
            }
        }
        if (obj != null)
        {
            return ((Bitmap) (obj));
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static Bitmap a(String s, int i, int j)
    {
        Object obj = null;
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        android.graphics.Bitmap.Config config = obj;
        if (com.gtp.a.a.c.a.a() != 1)
        {
            config = obj;
            if (a(new File(s)) != android.graphics.Bitmap.CompressFormat.PNG)
            {
                config = android.graphics.Bitmap.Config.RGB_565;
            }
        }
        return a(s, i, j, config);
    }

    public static Bitmap a(String s, int i, int j, android.graphics.Bitmap.Config config)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        config = null;
_L4:
        return config;
_L2:
        int k = Math.max(i, j);
        j = Math.min(i, j);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        int i1 = Math.max(options.outHeight, options.outWidth);
        int l = Math.min(options.outHeight, options.outWidth);
        for (i = 1; i1 / i > k || l / i > j; i *= 2) { }
        if (i1 > k || l > j)
        {
            int j1 = (int)Math.pow(2D, i / 2);
            i1 /= j1;
            l /= j1;
            float f1 = Math.min(((float)k * 1.0F) / (float)i1, ((float)j * 1.0F) / (float)l);
            options.inScaled = true;
            options.inDensity = 160;
            options.inTargetDensity = (int)(f1 * (float)options.inDensity);
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        Object obj = null;
        if (config != null)
        {
            options.inPreferredConfig = config;
        }
        try
        {
            s = BitmapFactory.decodeFile(s, options);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            s = obj;
            if (com.gtp.a.a.b.c.a())
            {
                config.printStackTrace();
                s = obj;
            }
        }
        config = s;
        if (s != null)
        {
            com.gtp.a.a.b.c.a("LJL", (new StringBuilder()).append("loadSuitableSizeBitmap[ decodeFile.getConfig(): ").append(s.getConfig()).append(", options.inPreferredConfig: ").append(options.inPreferredConfig).append(" ]").toString());
            return s;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static File a(long l)
    {
        File file = new File(com.gtp.a.a.c.c.a(), (new StringBuilder()).append("sharephoto").append(File.separator).append(l).toString());
        if (!file.exists())
        {
            file.mkdirs();
        }
        return file;
    }

    public static File a(Context context)
    {
        context = new File(com.gtp.a.a.c.c.a(), "sharephoto");
        if (!context.exists())
        {
            context.mkdir();
        }
        return new File(context, "take_photo_temporary.jpg");
    }

    public static void a(boolean flag)
    {
        GoWidgetApplication.c(GoWidgetApplication.b()).a().edit().putBoolean("first_open_install_weather", flag).commit();
    }

    public static boolean a()
    {
        f f1 = f.a(GoWidgetApplication.b());
        return !f1.f() && !f1.g() && !w.p(GoWidgetApplication.b()) && !f1.a();
    }

    public static boolean a(Bitmap bitmap, File file, android.graphics.Bitmap.CompressFormat compressformat, int i)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag = false;
        flag1 = flag;
        if (file == null) goto _L2; else goto _L1
_L1:
        if (bitmap != null) goto _L4; else goto _L3
_L3:
        flag1 = flag;
_L2:
        return flag1;
_L4:
        Object obj;
        File file1 = file.getParentFile();
        if (!file1.exists())
        {
            file1.mkdirs();
        }
        obj = null;
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(file));
        file = bufferedoutputstream;
        flag1 = bitmap.compress(compressformat, i, bufferedoutputstream);
        flag = flag1;
        flag1 = flag;
        if (bufferedoutputstream == null) goto _L2; else goto _L5
_L5:
        try
        {
            bufferedoutputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            if (com.gtp.a.a.b.c.a())
            {
                bitmap.printStackTrace();
            }
        }
        bufferedoutputstream.close();
        return flag;
        bitmap;
        flag1 = flag;
        if (!com.gtp.a.a.b.c.a()) goto _L2; else goto _L6
_L6:
        bitmap.printStackTrace();
        return flag;
        compressformat;
        bitmap = null;
_L11:
        file = bitmap;
        if (!com.gtp.a.a.b.c.a())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        file = bitmap;
        compressformat.printStackTrace();
        flag1 = flag;
        if (bitmap == null) goto _L2; else goto _L7
_L7:
        try
        {
            bitmap.flush();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            if (com.gtp.a.a.b.c.a())
            {
                file.printStackTrace();
            }
        }
        bitmap.close();
        return false;
        bitmap;
        flag1 = flag;
        if (!com.gtp.a.a.b.c.a()) goto _L2; else goto _L8
_L8:
        flag = flag2;
          goto _L6
        bitmap;
        file = obj;
_L10:
        if (file != null)
        {
            try
            {
                file.flush();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.CompressFormat compressformat)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    compressformat.printStackTrace();
                }
            }
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file.printStackTrace();
                }
            }
        }
        throw bitmap;
        bitmap;
        if (true) goto _L10; else goto _L9
_L9:
        compressformat;
        bitmap = bufferedoutputstream;
          goto _L11
    }

    public static boolean b()
    {
        return GoWidgetApplication.c(GoWidgetApplication.b()).a().getBoolean("key_is_new_user", true) && c();
    }

    public static boolean b(String s)
    {
        return com.go.weatherex.e.a.a().d(s);
    }

    public static boolean c()
    {
        return GoWidgetApplication.c(GoWidgetApplication.b()).a().getBoolean("first_open_install_weather", true);
    }
}
