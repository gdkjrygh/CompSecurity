// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.app.Activity;
import android.backport.util.Base64;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.media.FaceDetector;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.whatsapp.App;
import com.whatsapp.MediaData;
import com.whatsapp.MediaGallery;
import com.whatsapp.Voip;
import com.whatsapp.au2;
import com.whatsapp.dx;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.o4;
import com.whatsapp.protocol.c4;
import com.whatsapp.s0;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.whatsapp.util:
//            b7, Log, aj, q, 
//            be, bi, a8, cl

public class c1
{

    private static int a;
    private static File b;
    private static final DecimalFormat c;
    public static b7 d;
    private static String e;
    public static android.graphics.BitmapFactory.Options f;
    private static final String z[];

    public static float a(int i, int j, long l)
    {
        if (i == 0 || j == 0)
        {
            return 3F;
        } else
        {
            float f1 = (8000F * (float)(au2.q * 1024 * 1024)) / (float)(i * j * 3 + 0x17700);
            f1 = Math.max(0.0F, f1 - (float)l) / f1;
            return 3F + f1 * (6F * f1);
        }
    }

    public static int a(InputStream inputstream, OutputStream outputstream)
    {
        boolean flag = Log.f;
        byte abyte0[] = new byte[4096];
        int i = 0;
        int j;
        do
        {
            int k = inputstream.read(abyte0, 0, abyte0.length);
            j = i;
            if (k < 0)
            {
                break;
            }
            outputstream.write(abyte0, 0, k);
            j = i + k;
            i = j;
        } while (!flag);
        return j;
    }

    private static int a(String s, byte byte0, int i, boolean flag)
    {
        File file;
        int j;
        int k;
        int l;
        boolean flag1;
        boolean flag2;
        k = 0;
        flag1 = false;
        flag2 = Log.f;
        j = -1;
        file = s0.a(byte0, i, flag);
        l = j;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        File afile[];
        afile = file.listFiles();
        k = ((flag1) ? 1 : 0);
        l = j;
        if (afile == null) goto _L4; else goto _L3
_L3:
        int j1;
        s = (new StringBuilder()).append(a(byte0, i)).append("-").append(s).append(z[39]).toString();
        k = afile.length;
        j1 = afile.length;
        l = 0;
_L12:
        if (l >= j1) goto _L6; else goto _L5
_L5:
        String s1;
        s1 = afile[l].getName();
        String s2;
        int i1;
        try
        {
            if (!s1.startsWith(s))
            {
                break MISSING_BLOCK_LABEL_174;
            }
            i1 = s1.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i1 <= 19)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        s2 = s1.substring(15, 19);
        i1 = Integer.parseInt(s2);
        if (i1 > j)
        {
            j = i1;
        }
_L10:
        if (!flag2) goto _L7; else goto _L6
_L6:
        if (!flag2) goto _L9; else goto _L8
_L8:
        l = j;
_L4:
        NumberFormatException numberformatexception;
        try
        {
            Log.i((new StringBuilder()).append(z[36]).append(byte0).append(z[40]).append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
_L2:
        Log.i((new StringBuilder()).append(z[38]).append(byte0).append(z[35]).append(i).append(z[41]).append(l).append(z[37]).append(k).toString());
        return l;
        numberformatexception;
        Log.i((new StringBuilder()).append(z[34]).append(s1).toString());
          goto _L10
_L9:
        l = j;
          goto _L2
_L7:
        l++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static Bitmap a(Bitmap bitmap, int i, float f1)
    {
label0:
        {
            if (bitmap != null)
            {
                boolean flag;
                try
                {
                    flag = bitmap.isRecycled();
                }
                // Misplaced declaration of an exception variable
                catch (Bitmap bitmap)
                {
                    throw bitmap;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return null;
        }
        Rect rect;
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        RectF rectf;
label1:
        {
            bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            canvas = new Canvas(bitmap1);
            paint = new Paint();
            rectf = new RectF(0.0F, 0.0F, i, i);
            i = (bitmap.getWidth() - bitmap.getHeight()) / 2;
            if (i > 0)
            {
                rect = new Rect(i, 0, bitmap.getWidth() - i, bitmap.getHeight());
                if (!Log.f)
                {
                    break label1;
                }
            }
            rect = new Rect(0, -i, bitmap.getWidth(), i + bitmap.getHeight());
        }
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        canvas.drawRoundRect(rectf, f1, f1, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rectf, paint);
        return bitmap1;
    }

    public static Bitmap a(Uri uri, int i, int j)
    {
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        boolean flag = TextUtils.isEmpty(uri.toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        try
        {
            throw new FileNotFoundException((new StringBuilder()).append(z[149]).append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        uri;
        throw uri;
        Matrix matrix;
        android.graphics.BitmapFactory.Options options;
        Log.i((new StringBuilder()).append(z[146]).append(uri.toString()).toString());
        matrix = g(uri);
        options = a(uri, i);
        Bitmap bitmap = a(uri, i, j, options, matrix);
        uri = bitmap;
_L2:
        Log.i((new StringBuilder()).append(z[148]).append(uri.getWidth()).append(z[147]).append(uri.getHeight()).toString());
        return uri;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        options.inSampleSize = options.inSampleSize * 2;
        Log.i((new StringBuilder()).append(z[150]).append(options.inSampleSize).toString());
        uri = a(uri, i, j, options, matrix);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Bitmap a(Uri uri, int i, int j, android.graphics.BitmapFactory.Options options, Matrix matrix)
    {
        InputStream inputstream = f(uri);
        int k;
        try
        {
            options = BitmapFactory.decodeStream(inputstream, null, options);
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e(z[59]);
            inputstream.close();
            throw uri;
        }
        if (options == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        k = options.getWidth();
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        k = options.getHeight();
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        try
        {
            Log.i((new StringBuilder()).append(z[60]).append(uri).toString());
            throw new aj();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        uri;
        try
        {
            throw uri;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri) { }
        throw uri;
        uri = options;
        if (matrix != null)
        {
            Log.i(z[64]);
            float f1;
            Rect rect;
            Rect rect1;
            Paint paint;
            int l;
            try
            {
                uri = Bitmap.createBitmap(options, 0, 0, options.getWidth(), options.getHeight(), matrix, true);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                Log.e(z[65]);
                options.recycle();
                throw uri;
            }
            if (options != uri)
            {
                try
                {
                    options.recycle();
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw uri;
                }
            }
        }
        options = uri;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        l = uri.getWidth();
        if (l <= j)
        {
            try
            {
                l = uri.getHeight();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            options = uri;
            if (l <= j)
            {
                break MISSING_BLOCK_LABEL_412;
            }
        }
        Log.i((new StringBuilder()).append(z[62]).append(uri.getWidth()).append(z[61]).append(uri.getHeight()).toString());
        f1 = Math.max((float)uri.getWidth() / (float)i, (float)uri.getHeight() / (float)i);
        rect = new Rect(0, 0, (int)((float)uri.getWidth() / f1), (int)((float)uri.getHeight() / f1));
        rect.right = Math.max(rect.right, 1);
        rect.bottom = Math.max(rect.bottom, 1);
        rect1 = new Rect(0, 0, uri.getWidth(), uri.getHeight());
        matrix = uri.getConfig();
        try
        {
            i = rect.width();
            j = rect.height();
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.BitmapFactory.Options options)
        {
            try
            {
                throw options;
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.BitmapFactory.Options options)
            {
                Log.e(z[63]);
            }
            uri.recycle();
            throw options;
        }
        options = matrix;
        if (matrix != null)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        options = android.graphics.Bitmap.Config.ARGB_8888;
        options = Bitmap.createBitmap(i, j, options);
        matrix = new Canvas(options);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        matrix.drawBitmap(uri, rect1, rect, paint);
        uri.recycle();
        return options;
        uri;
        throw uri;
    }

    public static Bitmap a(Uri uri, File file)
    {
        Object obj;
        InputStream inputstream;
        Matrix matrix;
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        boolean flag1;
        boolean flag2;
        obj = null;
        inputstream = null;
        flag = true;
        flag2 = true;
        File file1 = file.getParentFile();
        if (file1 != null)
        {
            file1.mkdirs();
        }
        matrix = g(uri);
        options = a(uri, au2.d);
        flag1 = flag;
        if (matrix != null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        int i;
        int j;
        i = options.outWidth;
        j = au2.d;
        flag1 = flag;
        if (i > j)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        i = options.outHeight;
        j = au2.d;
        FileOutputStream fileoutputstream;
        flag1 = flag;
        if (i > j)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        long l;
        boolean flag3;
        try
        {
            flag3 = e(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        flag1 = flag;
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        Log.i((new StringBuilder()).append(z[7]).append(uri).append(" ").append(options.outWidth).append("x").append(options.outHeight).toString());
        fileoutputstream = new FileOutputStream(file);
        obj = inputstream;
        inputstream = f(uri);
        obj = inputstream;
        i = a(inputstream, ((OutputStream) (fileoutputstream)));
        flag = flag2;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        l = i;
        obj = inputstream;
        j = au2.f;
        if (l > (long)j * 1024L)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        obj = inputstream;
        Log.i((new StringBuilder()).append(z[6]).append(i).append(z[8]).append(au2.f).append(z[4]).append(flag).toString());
        if (inputstream != null)
        {
            inputstream.close();
        }
        flag1 = flag;
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            flag1 = flag;
        }
        break MISSING_BLOCK_LABEL_316;
        uri;
        try
        {
            throw uri;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri) { }
        throw uri;
        uri;
        obj = inputstream;
        try
        {
            throw uri;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            obj = inputstream;
        }
        finally
        {
            file = fileoutputstream;
        }
        throw uri;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        throw uri;
        if (flag1)
        {
            try
            {
                obj = a(uri, au2.d, au2.d, options, matrix);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                options.inSampleSize = options.inSampleSize * 2;
                Log.i((new StringBuilder()).append(z[5]).append(options.inSampleSize).toString());
                outofmemoryerror = a(uri, au2.d, au2.d, options, matrix);
            }
            file = new FileOutputStream(file);
            flag = ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, au2.n, file);
            file.close();
            ((Bitmap) (obj)).recycle();
            if (!flag)
            {
                try
                {
                    if (App.A() < (long)(au2.f * 1024))
                    {
                        throw new IOException(z[9]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw uri;
                }
                throw new IOException();
            }
        }
        return a(uri, 100, 100);
        uri;
        file = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static android.graphics.BitmapFactory.Options a(Uri uri, int i)
    {
        boolean flag;
        flag = Log.f;
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        boolean flag1 = TextUtils.isEmpty(uri.toString());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        try
        {
            throw new FileNotFoundException((new StringBuilder()).append(z[67]).append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        uri;
        throw uri;
        android.graphics.BitmapFactory.Options options;
        InputStream inputstream;
        inputstream = f(uri);
        if (inputstream == null)
        {
            try
            {
                Log.e(z[71]);
                throw new FileNotFoundException((new StringBuilder()).append(z[68]).append(uri).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        options = new android.graphics.BitmapFactory.Options();
        int j;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputstream, null, options);
        inputstream.close();
        if (options.outWidth <= 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        j = options.outHeight;
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        try
        {
            Log.i((new StringBuilder()).append(z[66]).append(uri).toString());
            throw new aj();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        uri;
        throw uri;
        options.inSampleSize = 1;
        int k = Math.max(options.outWidth, options.outHeight);
        do
        {
            if (k / 2 <= (i * 8) / 10)
            {
                break;
            }
            k /= 2;
            options.inSampleSize = options.inSampleSize * 2;
        } while (!flag);
        options.inDither = true;
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Log.i((new StringBuilder()).append(z[73]).append(options.outWidth).append(z[69]).append(options.outHeight).append(z[70]).append(options.inSampleSize).toString());
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 10)
            {
                options.inPreferQualityOverSpeed = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.w((new StringBuilder()).append(z[72]).append(android.os.Build.VERSION.SDK_INT).toString());
            return options;
        }
        return options;
    }

    public static Matrix a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 6: // '\006'
            Matrix matrix = new Matrix();
            matrix.setRotate(90F);
            return matrix;

        case 3: // '\003'
            Matrix matrix1 = new Matrix();
            matrix1.setRotate(180F);
            return matrix1;

        case 8: // '\b'
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(270F);
            return matrix2;

        case 2: // '\002'
            Matrix matrix3 = new Matrix();
            matrix3.setValues(new float[] {
                -1F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F
            });
            return matrix3;

        case 4: // '\004'
            Matrix matrix4 = new Matrix();
            matrix4.setValues(new float[] {
                1.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 1.0F
            });
            return matrix4;

        case 5: // '\005'
            Matrix matrix5 = new Matrix();
            matrix5.setValues(new float[] {
                0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
            });
            return matrix5;

        case 7: // '\007'
            Matrix matrix6 = new Matrix();
            matrix6.setValues(new float[] {
                0.0F, -1F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
            });
            return matrix6;
        }
    }

    public static File a(Context context, byte byte0, String s)
    {
        b = a(context, s, byte0, 0, false);
        context = context.getSharedPreferences(z[137], 0).edit();
        try
        {
            context.putString(z[138], b.getAbsolutePath());
            if (!context.commit())
            {
                Log.e(z[136]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        return b;
    }

    public static File a(Context context, File file, byte byte0, int i, boolean flag)
    {
        file = file.getAbsolutePath();
        int j = file.lastIndexOf(".");
        if (j >= 0)
        {
            try
            {
                file = file.substring(j);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        } else
        {
            file = "";
        }
        return a(context, ((String) (file)), byte0, i, flag);
    }

    public static File a(Context context, String s, byte byte0, int i, boolean flag)
    {
        boolean flag1 = Log.f;
        File file = null;
        int j = 0;
        do
        {
            if (j >= 100)
            {
                break;
            }
            File file1 = App.a((new StringBuilder()).append(a(context, byte0, i)).append(s).toString(), byte0, i, flag);
            boolean flag2;
            try
            {
                flag2 = file1.exists();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                try
                {
                    throw context;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
            }
            if (!flag2)
            {
                file = file1;
                if (!flag1)
                {
                    break;
                }
            }
            j++;
            file = file1;
            if (!flag1)
            {
                continue;
            }
            file = file1;
            break;
        } while (true);
        return file;
    }

    public static File a(Uri uri)
    {
        Object obj2;
        boolean flag;
        obj2 = null;
        flag = Log.f;
        if (uri.getScheme() == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = uri.getScheme().equals(z[22]);
        if (!flag1) goto _L3; else goto _L2
_L2:
        Object obj = new File(uri.getPath());
_L8:
        return ((File) (obj));
        uri;
        throw uri;
_L3:
        Cursor cursor;
        cursor = App.d.query(uri, new String[] {
            z[23]
        }, null, null, null);
        if (cursor == null)
        {
            try
            {
                throw new IOException(z[21]);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        int i = cursor.getColumnCount();
        if (i <= 0) goto _L5; else goto _L4
_L4:
        flag1 = cursor.moveToFirst();
        if (!flag1) goto _L5; else goto _L6
_L6:
        Object obj3 = cursor.getString(0);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        File file = new File(((String) (obj3)));
        Object obj1;
        obj1 = obj3;
        obj = file;
        try
        {
            if (!file.exists())
            {
                throw new FileNotFoundException(((String) (obj3)));
            }
            break MISSING_BLOCK_LABEL_197;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri) { }
        finally
        {
            cursor.close();
            throw uri;
        }
        throw uri;
        uri;
        throw uri;
        obj = null;
        obj1 = obj3;
_L13:
        cursor.close();
        if (obj1 != null) goto _L8; else goto _L7
_L7:
        obj1 = App.m(b(0));
        uri = App.d.openInputStream(uri);
        obj3 = new FileOutputStream(((File) (obj1)));
        obj = new byte[4096];
_L10:
        i = uri.read(((byte []) (obj)), 0, obj.length);
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((OutputStream) (obj3)).write(((byte []) (obj)), 0, i);
        if (!flag) goto _L10; else goto _L9
_L9:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        obj = obj1;
        if (obj3 == null) goto _L8; else goto _L11
_L11:
        try
        {
            uri.close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        return ((File) (obj1));
        uri;
        obj = null;
        obj1 = obj2;
_L12:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        throw uri;
        obj1;
        obj = uri;
        uri = ((Uri) (obj1));
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj1 = obj3;
        obj = uri;
        uri = exception;
        if (true) goto _L12; else goto _L5
_L5:
        obj1 = null;
        obj = null;
          goto _L13
    }

    private static String a(int i, int j)
    {
        switch (i)
        {
        default:
            return null;

        case 2: // '\002'
            if (j == 1)
            {
                String s;
                try
                {
                    s = z[18];
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw numberformatexception;
                }
                return s;
            } else
            {
                return z[15];
            }

        case 3: // '\003'
            return z[16];

        case 1: // '\001'
            return z[17];
        }
    }

    private static String a(Context context, int i, int j)
    {
        com/whatsapp/util/c1;
        JVM INSTR monitorenter ;
        String s;
        a(context);
        context = context.getSharedPreferences(z[58], 0).edit();
        s = q.a();
        if (!s.equals(e))
        {
            a = 0;
            e = s;
            context.putString(z[56], e);
        }
        s = (new StringBuilder()).append(a(i, j)).append("-").append(e).append(z[57]).append(c.format(a)).toString();
        a++;
        context.putInt(z[55], a);
        if (!context.commit())
        {
            Log.e(z[53]);
        }
        Log.i((new StringBuilder()).append(z[54]).append(s).toString());
        com/whatsapp/util/c1;
        JVM INSTR monitorexit ;
        return s;
        context;
        throw context;
        context;
        com/whatsapp/util/c1;
        JVM INSTR monitorexit ;
        throw context;
        context;
        throw context;
    }

    public static String a(File file)
    {
        Object obj;
        boolean flag;
        flag = Log.f;
        try
        {
            obj = MessageDigest.getInstance(z[32]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e((new StringBuilder()).append(z[30]).append(((NoSuchAlgorithmException) (obj)).toString()).toString());
            obj = null;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        try
        {
            Log.e(z[33]);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
_L6:
        return null;
_L2:
        byte abyte0[] = new byte[8192];
        FileInputStream fileinputstream = new FileInputStream(file);
_L4:
        file = fileinputstream;
        int i = fileinputstream.read(abyte0);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        file = fileinputstream;
        ((MessageDigest) (obj)).update(abyte0, 0, i);
        if (!flag) goto _L4; else goto _L3
_L3:
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Log.e((new StringBuilder()).append(z[29]).append(file.toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        return Base64.encodeToString(((MessageDigest) (obj)).digest(), 2);
        IOException ioexception;
        ioexception;
        obj = null;
_L9:
        file = ((File) (obj));
        Log.e((new StringBuilder()).append(z[27]).append(ioexception.toString()).toString());
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e((new StringBuilder()).append(z[28]).append(file.toString()).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        return null;
        Exception exception;
        exception;
        file = null;
_L8:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Log.e((new StringBuilder()).append(z[31]).append(file.toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        ioexception;
        exception = fileinputstream;
          goto _L9
    }

    public static void a()
    {
        try
        {
            Log.e((new StringBuilder()).append(z[93]).append(Debug.getNativeHeapAllocatedSize() / 1024L).append(z[94]).toString());
            if (MediaGallery.z != null)
            {
                MediaGallery.z.d();
                MediaGallery.z.finish();
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        App.Q.trimToSize(0);
    }

    public static void a(int i, Activity activity)
    {
        ArrayList arraylist;
        boolean flag;
        flag = Log.f;
        arraylist = new ArrayList();
        i;
        JVM INSTR lookupswitch 5: default 64
    //                   4: 224
    //                   5: 333
    //                   21: 110
    //                   22: 110
    //                   23: 184;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        Object obj = null;
_L6:
        obj = Intent.createChooser(((Intent) (obj)), null);
        Object obj1;
        Intent intent;
        Object obj2;
        ActivityInfo activityinfo;
        String s;
        Intent intent1;
        int j;
        boolean flag1;
        try
        {
            if (!arraylist.isEmpty())
            {
                ((Intent) (obj)).putExtra(z[116], (android.os.Parcelable[])arraylist.toArray(new Intent[0]));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        activity.startActivityForResult(((Intent) (obj)), i);
        return;
_L4:
        if (i == 22)
        {
            obj = new Intent(z[115], android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, activity, com/whatsapp/gallerypicker/GalleryPicker);
            ((Intent) (obj)).putExtra(z[114], 10);
        } else
        {
            obj = new Intent(z[105], android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        }
        ((Intent) (obj)).setType(z[121]);
          goto _L6
_L5:
        obj = (new Intent(z[101])).putExtra(z[122], Uri.fromFile(a(((Context) (activity)), (byte)1, z[112])));
          goto _L6
_L2:
        obj1 = new Intent(z[123]);
        j = android.os.Build.VERSION.SDK_INT;
        if (j == 18)
        {
            try
            {
                if (Build.MODEL.contains(z[125]))
                {
                    ((Intent) (obj1)).putExtra(z[124], Uri.fromFile(a(((Context) (activity)), (byte)3, z[117])));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        }
        obj = obj1;
        if (android.os.Build.VERSION.SDK_INT >= 9) goto _L6; else goto _L7
_L7:
        ((Intent) (obj1)).putExtra(z[103], (long)au2.q * 0x100000L);
        obj = obj1;
          goto _L6
        activity;
        throw activity;
        activity;
        throw activity;
_L3:
label0:
        {
            if (!Voip.h())
            {
                break label0;
            }
            obj = new Intent(z[110], android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        }
          goto _L6
        obj1 = new ArrayList();
        ((ArrayList) (obj1)).add((new Intent(z[102])).setType(z[111]).putExtra(z[100], (long)au2.q * 0x100000L));
        ((ArrayList) (obj1)).add(new Intent(z[104], android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI));
        obj = new HashSet();
        obj1 = ((ArrayList) (obj1)).iterator();
_L11:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        intent = (Intent)((Iterator) (obj1)).next();
        obj2 = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = ((List) (obj2)).iterator();
_L9:
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        activityinfo = ((ResolveInfo)((Iterator) (obj2)).next()).activityInfo;
        s = activityinfo.applicationInfo.packageName;
        try
        {
            Log.i((new StringBuilder()).append(z[119]).append(s).append(z[109]).append(activityinfo.name).toString());
            flag1 = s.contains(z[108]);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity) { }
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity) { }
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_638;
        }
        flag1 = s.contains(z[113]);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_638;
        }
        flag1 = s.contains(z[118]);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_638;
        }
        if (!s.contains(z[120]))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = ((HashSet) (obj)).contains(s);
        if (!flag1)
        {
            intent1 = (Intent)intent.clone();
            intent1.setClassName(s, activityinfo.name);
            intent1.setPackage(s);
            arraylist.add(intent1);
            ((HashSet) (obj)).add(s);
        }
        if (!flag) goto _L9; else goto _L8
_L8:
        if (!flag) goto _L11; else goto _L10
_L10:
        obj = (new Intent(z[106])).setType(z[107]);
          goto _L6
    }

    public static void a(Activity activity, String s)
    {
        Intent intent = new Intent(z[99], android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, activity, com/whatsapp/gallerypicker/GalleryPicker);
        intent.putExtra(z[96], 10);
        intent.putExtra(z[98], s);
        intent.setType(z[97]);
        activity.startActivityForResult(intent, 22);
    }

    public static void a(Context context)
    {
        com/whatsapp/util/c1;
        JVM INSTR monitorenter ;
        int i = a;
        if (i < 0) goto _L2; else goto _L1
_L1:
        com/whatsapp/util/c1;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
        context;
        com/whatsapp/util/c1;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        context = context.getSharedPreferences(z[50], 0);
        a = context.getInt(z[51], -1);
        e = context.getString(z[43], null);
        i = a;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (TextUtils.isEmpty(e))
        {
            break MISSING_BLOCK_LABEL_137;
        }
        Log.i((new StringBuilder()).append(z[48]).append(a).append(z[42]).append(e).toString());
          goto _L1
_L3:
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
          goto _L3
        long l;
        e = q.a();
        l = System.currentTimeMillis();
        a = -1;
        a = Math.max(a, a(e, (byte)2, 0, true));
        a = Math.max(a, a(e, (byte)2, 0, false));
        a = Math.max(a, a(e, (byte)2, 1, true));
        a = Math.max(a, a(e, (byte)2, 1, false));
        a = Math.max(a, a(e, (byte)3, 0, true));
        a = Math.max(a, a(e, (byte)3, 0, false));
        a = Math.max(a, a(e, (byte)1, 0, true));
        a = Math.max(a, a(e, (byte)1, 0, false));
        a++;
        context = context.edit();
        context.putInt(z[46], a);
        context.putString(z[52], e);
        if (!context.commit())
        {
            Log.e(z[47]);
        }
        Log.i((new StringBuilder()).append(z[44]).append(a).append(z[49]).append(e).append(z[45]).append(System.currentTimeMillis() - l).toString());
          goto _L1
        context;
        throw context;
    }

    public static void a(Context context, Uri uri)
    {
        context.sendBroadcast((new Intent(z[151])).setData(uri));
    }

    public static void a(Context context, c4 c4_1)
    {
        byte byte0 = c4_1.w;
        if (byte0 == 2)
        {
            try
            {
                if (c4_1.n == 1)
                {
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        break MISSING_BLOCK_LABEL_25;
        context;
        throw context;
        c4_1 = ((MediaData)c4_1.B).file;
        if (c4_1 != null)
        {
            try
            {
                if (c4_1.exists())
                {
                    a(context, Uri.fromFile(c4_1));
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        return;
    }

    public static void a(Context context, String s, Uri uri)
    {
        MediaData mediadata = new MediaData();
        byte abyte0[] = a(context, uri, mediadata);
        uri = uri.getQueryParameter(z[26]);
        Looper looper;
        Looper looper1;
        try
        {
            looper = Looper.myLooper();
            looper1 = context.getMainLooper();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (looper != looper1)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        App.a(s, abyte0, mediadata, (byte)1, 0, uri, null);
        if (!Log.f)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        (new Handler(context.getMainLooper())).post(new be(s, abyte0, mediadata, uri));
        return;
    }

    public static void a(Uri uri, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bytearrayoutputstream);
            bitmap = bytearrayoutputstream.toByteArray();
            d.put(uri, ByteBuffer.wrap(bitmap));
        }
    }

    public static void a(File file, File file1)
    {
        FileInputStream fileinputstream = new FileInputStream(file);
        file = file1.getParentFile();
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        file.mkdirs();
        a(((InputStream) (fileinputstream)), ((OutputStream) (new FileOutputStream(file1))));
        if (fileinputstream != null)
        {
            fileinputstream.close();
        }
        return;
        file;
        file1 = null;
_L2:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        throw file;
        file;
        file1 = fileinputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(String s, Uri uri)
    {
        Object obj;
        Object obj1;
        MediaData mediadata;
        obj = null;
        mediadata = new MediaData();
        obj1 = (ByteBuffer)d.get(uri.buildUpon().query(null).build());
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((ByteBuffer) (obj1)).array();
        obj = uri.getQueryParameter(z[139]);
        if (obj == null) goto _L4; else goto _L3
_L3:
        Object obj2 = new Matrix();
        ((Matrix) (obj2)).postRotate(Integer.parseInt(((String) (obj))));
        obj = BitmapFactory.decodeByteArray(((byte []) (obj1)), 0, obj1.length);
        obj2 = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), ((Matrix) (obj2)), true);
        if (obj2 != obj)
        {
            ((Bitmap) (obj)).recycle();
            obj = obj2;
        }
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj1 = new ByteArrayOutputStream();
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, ((OutputStream) (obj1)));
        obj1 = ((ByteArrayOutputStream) (obj1)).toByteArray();
        ((Bitmap) (obj)).recycle();
        obj = obj1;
_L7:
        App.a(s, ((byte []) (obj)), mediadata, (byte)1, 0, uri.getQueryParameter(z[140]), uri);
        return;
_L2:
        obj1 = a(uri, 100, 100);
        if (obj1 != null)
        {
            obj = new ByteArrayOutputStream();
            ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, ((OutputStream) (obj)));
            obj = ((ByteArrayOutputStream) (obj)).toByteArray();
            ((Bitmap) (obj1)).recycle();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void a(byte abyte0[], File file)
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        file = new BufferedOutputStream(new FileOutputStream(file));
        file.write(abyte0);
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        file.close();
        return;
        abyte0;
        file = null;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        throw abyte0;
        abyte0;
        return;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(Activity activity, dx dx1, File file, byte byte0)
    {
        boolean flag = false;
        long l;
        Log.i((new StringBuilder()).append(z[142]).append(file.getAbsolutePath()).toString());
        l = file.length();
        byte0 = au2.q;
        if (l <= (long)byte0 * 0x100000L)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        try
        {
            Log.w((new StringBuilder()).append(z[141]).append(file.length()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        if (dx1 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        dx1.f(activity.getString(0x7f0e018f, new Object[] {
            Integer.valueOf(au2.q)
        }));
        return false;
        activity;
        throw activity;
        flag = true;
        return flag;
    }

    public static boolean a(Activity activity, dx dx1, String s, File file, byte byte0, int i, boolean flag)
    {
        return a(activity, dx1, s, file, byte0, 0, flag, null);
    }

    public static boolean a(Activity activity, dx dx1, String s, File file, byte byte0, int i, boolean flag, String s1)
    {
        boolean flag1;
        try
        {
            flag1 = a(activity, dx1, file, byte0);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        if (!flag1)
        {
            return false;
        } else
        {
            return a(((Context) (activity)), s, file, byte0, i, flag, s1);
        }
    }

    public static boolean a(Activity activity, dx dx1, String s, File file, byte byte0, boolean flag)
    {
        return a(activity, dx1, s, file, byte0, 0, flag);
    }

    public static boolean a(Context context, String s, File file, byte byte0, int i, boolean flag)
    {
        return a(context, s, file, byte0, i, flag, ((String) (null)));
    }

    public static boolean a(Context context, String s, File file, byte byte0, int i, boolean flag, String s1)
    {
        Log.i((new StringBuilder()).append(z[19]).append(file.getAbsolutePath()).append(" ").append(file.length()).toString());
        if (flag)
        {
            context = a(context, file, byte0, i, true);
            Log.i((new StringBuilder()).append(z[20]).append(context.getAbsolutePath()).toString());
            a(file, ((File) (context)));
            file = context;
        }
        context = new MediaData();
        try
        {
            context.file = file;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (byte0 != 3)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        App.a(s, a(((MediaData) (context)).file.getAbsolutePath()), context, byte0, i, s1, null);
        if (!Log.f)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        App.a(s, null, context, byte0, i, s1, null);
        return true;
    }

    public static boolean a(Context context, String s, File file, byte byte0, boolean flag)
    {
        return a(context, s, file, byte0, 0, flag, ((String) (null)));
    }

    public static boolean a(MediaData mediadata)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(mediadata.file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj)));
        int i = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        int j = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        obj.inSampleSize = Math.max(((android.graphics.BitmapFactory.Options) (obj)).outWidth / 400, ((android.graphics.BitmapFactory.Options) (obj)).outHeight / 400);
        obj.inJustDecodeBounds = false;
        obj.inInputShareable = true;
        obj.inPurgeable = true;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        android.media.FaceDetector.Face aface[] = BitmapFactory.decodeFile(mediadata.file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj)));
        if (aface == null)
        {
            return false;
        }
        boolean flag;
        if ((aface.getWidth() & 1) == 1)
        {
            Object obj1 = Bitmap.createBitmap(aface, 0, 0, aface.getWidth() - 1, aface.getHeight());
            obj = obj1;
            if (aface != obj1)
            {
                float f1;
                try
                {
                    aface.recycle();
                }
                // Misplaced declaration of an exception variable
                catch (MediaData mediadata)
                {
                    throw mediadata;
                }
                obj = obj1;
            }
        } else
        {
            obj = aface;
        }
        obj1 = new FaceDetector(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), 1);
        aface = new android.media.FaceDetector.Face[1];
        if (((FaceDetector) (obj1)).findFaces(((Bitmap) (obj)), aface) <= 0)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        try
        {
            f1 = aface[0].confidence();
        }
        // Misplaced declaration of an exception variable
        catch (MediaData mediadata)
        {
            throw mediadata;
        }
        if (f1 <= 0.3F)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj1 = new PointF();
        aface[0].getMidPoint(((PointF) (obj1)));
        f1 = ((PointF) (obj1)).x;
        mediadata.faceX = (int)(((float)i * f1) / (float)((Bitmap) (obj)).getWidth());
        mediadata.faceY = (int)((((PointF) (obj1)).y * (float)j) / (float)((Bitmap) (obj)).getHeight());
        if (!Log.f)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        mediadata.faceX = -1;
        mediadata.faceY = -1;
        ((Bitmap) (obj)).recycle();
        i = mediadata.faceX;
        if (i > 0) goto _L2; else goto _L1
_L1:
        try
        {
            i = mediadata.faceY;
        }
        // Misplaced declaration of an exception variable
        catch (MediaData mediadata)
        {
            throw mediadata;
        }
        if (i <= 0) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        return flag;
        mediadata;
        throw mediadata;
        mediadata;
        throw mediadata;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static byte[] a(Context context, Uri uri, MediaData mediadata)
    {
        File file = a(context, z[154], (byte)1, 0, true);
        try
        {
            context = a(uri, file);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e((new StringBuilder()).append(z[152]).append(context.getMessage()).toString());
            throw context;
        }
        if (context == null)
        {
            try
            {
                Log.e(z[153]);
                throw new aj();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        mediadata.file = file;
        uri = new ByteArrayOutputStream();
        context.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, uri);
        uri = uri.toByteArray();
        try
        {
            if (context.getHeight() > context.getWidth())
            {
                a(mediadata);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MediaData mediadata) { }
        context.recycle();
        return uri;
    }

    public static byte[] a(Bitmap bitmap)
    {
label0:
        {
label1:
            {
                Object obj;
label2:
                {
                    obj = null;
                    if (bitmap == null)
                    {
                        break label0;
                    }
                    float f1;
                    int i;
                    try
                    {
                        Log.i((new StringBuilder()).append(z[74]).append(bitmap.getWidth()).append(z[76]).append(bitmap.getHeight()).toString());
                        if (bitmap.getWidth() != 100)
                        {
                            break label2;
                        }
                        i = bitmap.getHeight();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bitmap bitmap)
                    {
                        throw bitmap;
                    }
                    obj = bitmap;
                    if (i == 100)
                    {
                        break label1;
                    }
                }
                Log.i(z[75]);
                if (bitmap.getWidth() > bitmap.getHeight())
                {
                    obj = new Matrix();
                    f1 = 100F / (float)bitmap.getHeight();
                    ((Matrix) (obj)).setScale(f1, f1);
                    obj = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getHeight(), bitmap.getHeight(), ((Matrix) (obj)), true);
                } else
                {
                    obj = new Matrix();
                    float f2 = 100F / (float)bitmap.getWidth();
                    ((Matrix) (obj)).setScale(f2, f2);
                    obj = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getWidth(), ((Matrix) (obj)), true);
                }
                bitmap.recycle();
            }
            bitmap = new ByteArrayOutputStream();
            ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bitmap);
            bitmap = bitmap.toByteArray();
            ((Bitmap) (obj)).recycle();
            obj = bitmap;
        }
        return ((byte []) (obj));
    }

    public static byte[] a(String s)
    {
        return a(b(s));
    }

    public static byte[] a(String s, long l)
    {
        MediaMetadataRetriever mediametadataretriever;
        if (l == 0L)
        {
            try
            {
                s = a(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        }
        mediametadataretriever = new MediaMetadataRetriever();
        mediametadataretriever.setDataSource(s);
        s = a(mediametadataretriever.getFrameAtTime(l));
        return s;
        s;
_L2:
        mediametadataretriever.release();
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int b(Uri uri)
    {
        boolean flag = Log.f;
        if (uri.getScheme() == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = z[132].equals(uri.getScheme());
        if (!flag1) goto _L3; else goto _L2
_L2:
        int i;
        int j;
        j = (new ExifInterface(uri.getPath())).getAttributeInt(z[133], 1);
        i = j;
        if (!flag) goto _L5; else goto _L4
_L4:
        i = j;
_L23:
        flag1 = z[134].equals(uri.getScheme());
        if (!flag1) goto _L5; else goto _L6
_L6:
        String s1;
        try
        {
            flag1 = z[135].equals(uri.getAuthority());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        if (!flag1) goto _L5; else goto _L7
_L7:
        String s = z[130];
        String s2 = z[126];
        uri = uri.buildUpon().query(null).build();
        uri = App.d.query(uri, new String[] {
            s, s2
        }, null, null, null);
        if (uri == null) goto _L9; else goto _L8
_L8:
        flag1 = uri.moveToFirst();
        if (!flag1) goto _L11; else goto _L10
_L10:
        j = uri.getColumnCount();
        if (j != 2) goto _L13; else goto _L12
_L12:
        s1 = uri.getString(0);
        if (s1 == null) goto _L15; else goto _L14
_L14:
        j = (new ExifInterface(s1)).getAttributeInt(z[131], 1);
        i = j;
        if (!flag) goto _L17; else goto _L16
_L16:
        i = j;
_L15:
        j = uri.getInt(1);
        j;
        JVM INSTR lookupswitch 3: default 280
    //                   90: 391
    //                   180: 399
    //                   270: 406;
           goto _L17 _L18 _L19 _L20
_L17:
        j = i;
        if (!flag) goto _L21; else goto _L13
_L13:
        Log.e(z[128]);
        j = i;
        if (!flag) goto _L21; else goto _L11
_L11:
        Log.e(z[129]);
        j = i;
_L21:
        i = j;
        if (uri != null)
        {
            Object obj;
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            i = j;
        }
_L5:
        Log.i((new StringBuilder()).append(z[127]).append(i).toString());
        return i;
        uri;
        throw uri;
        uri;
        throw uri;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        throw obj;
_L18:
        i = 6;
        if (!flag) goto _L17; else goto _L19
_L19:
        i = 3;
        if (!flag) goto _L17; else goto _L20
_L20:
        i = 8;
          goto _L17
        obj;
        throw obj;
        obj;
        throw obj;
_L9:
        j = i;
          goto _L21
_L3:
        i = 0;
        if (true) goto _L23; else goto _L22
_L22:
    }

    public static int b(File file)
    {
        int j;
        boolean flag;
        flag = false;
        j = 0;
        int k = android.os.Build.VERSION.SDK_INT;
        int i = ((flag) ? 1 : 0);
        if (k < 10) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
        if (file == null) goto _L2; else goto _L3
_L3:
        MediaMetadataRetriever mediametadataretriever;
        long l;
        long l1;
        boolean flag1;
        try
        {
            flag1 = file.exists();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        i = ((flag) ? 1 : 0);
        if (!flag1) goto _L2; else goto _L4
_L4:
        mediametadataretriever = new MediaMetadataRetriever();
        mediametadataretriever.setDataSource(file.getAbsolutePath());
        l = Long.parseLong(mediametadataretriever.extractMetadata(9));
        l1 = l / 1000L;
        j = (int)l1;
        i = j;
        if (j == 0)
        {
            i = j;
            if (l != 0L)
            {
                i = 1;
            }
        }
_L6:
        mediametadataretriever.release();
_L2:
        return i;
        file;
        throw file;
        file;
        Log.a(z[95], file);
        i = j;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Bitmap b(String s)
    {
        Object obj = Class.forName(z[84]);
        Object obj1 = ((Class) (obj)).newInstance();
        Object obj2;
        Object obj3;
        obj3 = obj1;
        obj2 = obj;
        ((Class) (obj)).getMethod(z[87], new Class[] {
            java/lang/String
        }).invoke(obj1, new Object[] {
            s
        });
        obj3 = obj1;
        obj2 = obj;
        if (android.os.Build.VERSION.SDK_INT > 9) goto _L2; else goto _L1
_L1:
        obj3 = obj1;
        obj2 = obj;
        Object obj4 = (Bitmap)((Class) (obj)).getMethod(z[88], new Class[0]).invoke(obj1, new Object[0]);
_L4:
        obj2 = obj4;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj3 = obj1;
        obj2 = obj;
        int i = android.os.Build.VERSION.SDK_INT;
        obj2 = obj4;
        if (i >= 11)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj3 = obj1;
        obj2 = obj;
        i = ((Bitmap) (obj4)).getWidth();
        obj3 = obj1;
        obj2 = obj;
        int j = ((Bitmap) (obj4)).getHeight();
        obj2 = obj4;
        if (i <= j)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj3 = obj1;
        obj2 = obj;
        bi bi1 = new bi();
        obj3 = obj1;
        obj2 = obj;
        bi1.a(new File(s));
        obj3 = obj1;
        obj2 = obj;
        s = bi1.a();
        obj2 = obj4;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj3 = obj1;
        obj2 = obj;
        i = s.a();
        obj2 = obj4;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj3 = obj1;
        obj2 = obj;
        boolean flag = s.b();
        obj2 = obj4;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj3 = obj1;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[85]).append(s.a()).toString());
        obj3 = obj1;
        obj2 = obj;
        s = cl.a(((Bitmap) (obj4)), s.a());
        obj2 = s;
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        ((Class) (obj)).getMethod(z[83], new Class[0]).invoke(obj1, new Object[0]);
        return ((Bitmap) (obj2));
_L2:
        obj3 = obj1;
        obj2 = obj;
        obj4 = (byte[])(byte[])((Class) (obj)).getMethod(z[78], new Class[0]).invoke(obj1, new Object[0]);
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_992;
        }
        obj3 = obj1;
        obj2 = obj;
        obj4 = BitmapFactory.decodeByteArray(((byte []) (obj4)), 0, obj4.length);
        obj2 = obj4;
_L20:
        obj4 = obj2;
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        obj3 = obj1;
        obj2 = obj;
        obj4 = (Bitmap)((Class) (obj)).getMethod(z[92], new Class[0]).invoke(obj1, new Object[0]);
          goto _L4
        s;
        obj3 = obj1;
        obj2 = obj;
        throw s;
        s;
        obj3 = obj1;
        obj2 = obj;
        throw s;
        s;
        s = ((String) (obj1));
_L19:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        ((Class) (obj)).getMethod(z[79], new Class[0]).invoke(s, new Object[0]);
_L7:
        return null;
        s;
        obj3 = obj1;
        obj2 = obj;
        throw s;
        s;
        obj3 = obj1;
        obj2 = obj;
        throw s;
        s;
        obj3 = obj1;
        obj2 = obj;
        Log.a(s);
        obj2 = obj4;
          goto _L5
        s;
_L18:
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        ((Class) (obj)).getMethod(z[90], new Class[0]).invoke(obj1, new Object[0]);
          goto _L7
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L7
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((Bitmap) (obj2));
        }
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L7
        s;
        obj1 = null;
        obj = null;
_L17:
        obj3 = obj1;
        obj2 = obj;
        Log.a(s);
        if (obj1 != null)
        {
            try
            {
                ((Class) (obj)).getMethod(z[81], new Class[0]).invoke(obj1, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L7
        s;
        obj1 = null;
        obj = null;
_L16:
        obj3 = obj1;
        obj2 = obj;
        Log.a(s);
        if (obj1 != null)
        {
            try
            {
                ((Class) (obj)).getMethod(z[77], new Class[0]).invoke(obj1, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L7
        s;
        obj1 = null;
        obj = null;
_L15:
        obj3 = obj1;
        obj2 = obj;
        Log.a(s);
        if (obj1 != null)
        {
            try
            {
                ((Class) (obj)).getMethod(z[80], new Class[0]).invoke(obj1, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L7
        s;
        obj1 = null;
        obj = null;
_L14:
        obj3 = obj1;
        obj2 = obj;
        Log.a(s);
        if (obj1 != null)
        {
            try
            {
                ((Class) (obj)).getMethod(z[86], new Class[0]).invoke(obj1, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L7
        s;
        obj1 = null;
        obj = null;
_L13:
        obj3 = obj1;
        obj2 = obj;
        Log.a(s);
        if (obj1 != null)
        {
            try
            {
                ((Class) (obj)).getMethod(z[82], new Class[0]).invoke(obj1, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L7
        s;
        obj1 = null;
        obj = null;
_L12:
        obj3 = obj1;
        obj2 = obj;
        Log.a(s);
        if (obj1 != null)
        {
            try
            {
                ((Class) (obj)).getMethod(z[89], new Class[0]).invoke(obj1, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L7
        s;
        obj3 = null;
        obj = null;
_L11:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_882;
        }
        ((Class) (obj)).getMethod(z[91], new Class[0]).invoke(obj3, new Object[0]);
_L9:
        throw s;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (true) goto _L9; else goto _L8
_L8:
        s;
        obj3 = null;
        continue; /* Loop/switch isn't completed */
        s;
        obj = obj2;
        if (true) goto _L11; else goto _L10
_L10:
        s;
        obj1 = null;
          goto _L12
        s;
          goto _L12
        s;
        obj1 = null;
          goto _L13
        s;
          goto _L13
        s;
        obj1 = null;
          goto _L14
        s;
          goto _L14
        s;
        obj1 = null;
          goto _L15
        s;
          goto _L15
        s;
        obj1 = null;
          goto _L16
        s;
          goto _L16
        s;
        obj1 = null;
          goto _L17
        s;
          goto _L17
        s;
        obj1 = null;
        obj = null;
          goto _L18
        s;
        obj1 = null;
          goto _L18
        s;
        s = null;
        obj = null;
          goto _L19
        s;
        s = null;
          goto _L19
        obj2 = null;
          goto _L20
    }

    public static String b(int i)
    {
        long l = System.currentTimeMillis();
        return o4.b((new StringBuilder()).append(App.Z.jabber_id).append(Long.toString(l)).toString());
    }

    public static void b()
    {
        com/whatsapp/util/c1;
        JVM INSTR monitorenter ;
    }

    public static void b(Context context)
    {
        com/whatsapp/util/c1;
        JVM INSTR monitorenter ;
        if (a <= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        context = context.getSharedPreferences(z[143], 0).edit();
        a--;
        context.putInt(z[145], a);
        if (!context.commit())
        {
            Log.e(z[144]);
        }
        com/whatsapp/util/c1;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
        context;
        com/whatsapp/util/c1;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static byte c(Uri uri)
    {
        String s1 = App.d.getType(uri);
        String s = s1;
        if (s1 == null)
        {
            uri = MimeTypeMap.getFileExtensionFromUrl(uri.getPath());
            s = s1;
            if (uri != null)
            {
                s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(uri);
            }
        }
        if (s != null)
        {
            boolean flag;
            try
            {
                flag = s.startsWith(z[10]);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            if (flag)
            {
                return 2;
            }
            try
            {
                flag = s.startsWith(z[13]);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            if (flag)
            {
                return 3;
            }
            try
            {
                flag = s.startsWith(z[14]);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            if (flag)
            {
                return 1;
            }
            try
            {
                flag = s.startsWith(z[12]);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            if (flag)
            {
                return 4;
            }
            try
            {
                flag = s.startsWith(z[11]);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            if (flag)
            {
                return 0;
            }
        }
        return -1;
    }

    public static File c(Context context)
    {
        if (b == null)
        {
            context = context.getSharedPreferences(z[24], 0).getString(z[25], null);
            if (context != null)
            {
                try
                {
                    b = new File(context);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
            }
        }
        return b;
    }

    public static Bitmap d(Uri uri)
    {
        return a(uri, au2.d, au2.d);
    }

    private static boolean e(Uri uri)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        obj = null;
        uri = new DataInputStream(f(uri));
        int i = uri.readInt();
label0:
        {
            {
                if (i == 0xffd8ffe0)
                {
                    break label0;
                }
                flag1 = flag;
                if (uri != null)
                {
                    int j;
                    try
                    {
                        uri.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        return false;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        throw uri;
                    }
                    flag1 = flag;
                }
            }
            return flag1;
        }
        uri.readShort();
        j = uri.readInt();
        flag = flag1;
        if (j == 0x4a464946)
        {
            flag = true;
        }
        flag1 = flag;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return flag;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            return flag;
        }
        break MISSING_BLOCK_LABEL_45;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
_L2:
        flag1 = flag;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            return false;
        } else
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj;
        uri = null;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri) { }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        throw obj;
        uri;
        uri = ((Uri) (obj));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static InputStream f(Uri uri)
    {
        uri = uri.buildUpon().query(null).build();
        String s;
        try
        {
            s = uri.getScheme();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            try
            {
                throw uri;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (!uri.getScheme().equals(z[155]))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        return new FileInputStream(new File(uri.getPath()));
        return App.d.openInputStream(uri);
    }

    public static Matrix g(Uri uri)
    {
        boolean flag;
        flag = Log.f;
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (!TextUtils.isEmpty(uri.toString()))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        throw new FileNotFoundException((new StringBuilder()).append(z[0]).append(uri).toString());
        uri;
        throw uri;
        Matrix matrix1 = a(b(uri));
        if (uri.getQueryParameter(z[1]) == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Matrix matrix;
label0:
        {
            matrix = new Matrix();
            matrix.setValues(new float[] {
                -1F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F
            });
            obj = matrix1;
            if (matrix1 == null)
            {
                obj = matrix;
                if (!flag)
                {
                    break label0;
                }
                obj = matrix;
            }
            try
            {
                ((Matrix) (obj)).postConcat(matrix);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
_L10:
        matrix = ((Matrix) (obj));
        if (uri.getQueryParameter(z[2]) == null) goto _L4; else goto _L3
_L3:
        matrix1 = new Matrix();
        matrix1.setValues(new float[] {
            1.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 1.0F
        });
        matrix = ((Matrix) (obj));
        if (obj != null) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        matrix = matrix1;
_L6:
        try
        {
            matrix.postConcat(matrix1);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
_L4:
        obj = uri.getQueryParameter(z[3]);
        uri = matrix;
        if (obj != null)
        {
            uri = matrix;
            if (matrix == null)
            {
                uri = new Matrix();
            }
            uri.postRotate(Integer.parseInt(((String) (obj))));
        }
        return uri;
_L8:
        matrix = matrix1;
        if (true) goto _L4; else goto _L2
_L2:
        obj = matrix1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static 
    {
        Object obj;
        String as[];
        char c2;
        int i;
        as = new String[157];
        obj = "\"%+U.\000/+";
        c2 = '\uFFFF';
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
            switch (c2)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\n&bCj\004";
                i = 1;
                c2 = '\0';
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\n&bCj\032";
                c2 = '\001';
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\036%\177R3\005%e";
                c2 = '\002';
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "L8nP(\001:yV4\037p";
                c2 = '\003';
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\0348nC&\036/TZ*\r-nl!\0038T@\"\002.$\\(\001j";
                c2 = '\004';
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\0348nC&\036/TZ*\r-nl!\0038T@\"\002.$P(\0343+@.\026/1";
                c2 = '\005';
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\0348nC&\036/TZ*\r-nl!\0038T@\"\002.$P(\0343+";
                c2 = '\006';
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "L'jK}";
                c2 = '\007';
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\"%+@7\r)n\023+\t,\177\023(\002joV1\005)n";
                c2 = '\b';
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "\r?oZ(";
                c2 = '\t';
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                obj = "\030/sG";
                i = 11;
                c2 = '\n';
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\030/sGh\024g}P&\036.";
                c2 = '\013';
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\032#oV(";
                c2 = '\f';
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\005'jT\"";
                c2 = '\r';
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "-\037O";
                c2 = '\016';
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = ":\003O";
                c2 = '\017';
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "%\007L";
                c2 = '\020';
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "<\036_";
                c2 = '\021';
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\001/oZ&\n#gV2\030#g@h\037/eW*\t.bR!\005&n\0234\036)1";
                c2 = '\022';
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\001/oZ&\n#gV2\030#g@h\037/eW*\t.bR!\005&n\0234\t$o\t";
                c2 = '\023';
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\002?g_g\017?y@(\036";
                c2 = '\024';
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\n#gV";
                c2 = '\025';
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "3.jG&";
                c2 = '\026';
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\017%f\0350\004+\177@&\034:TC5\t,nA\"\002)n@";
                c2 = '\027';
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\t2\177V5\002+gl!\005&nl.\001+lV";
                c2 = '\030';
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\017+{G.\003$";
                c2 = '\031';
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\001/oZ&\n#gV2\030#g@h\017+gP2\000+\177V*\t.bR/\r9c\023";
                c2 = '\032';
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\001/oZ&\n#gV2\030#g@h\017+gP2\000+\177V*\t.bR/\r9c\034$\000%xVg";
                c2 = '\033';
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\001/oZ&\n#gV2\030#g@h\017+gP2\000+\177V*\t.bR/\r9c\034$\000%xVg";
                c2 = '\034';
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\001/oZ&\n#gV2\030#g@h\017+gP2\000+\177V*\t.bR/\r9c\034#\005-n@3\t8+";
                c2 = '\035';
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\001/oZ&\n#gV2\030#g@h\017+gP2\000+\177V*\t.bR/\r9c\034$\000%xVg";
                c2 = '\036';
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "?\002J\036uY|";
                c2 = '\037';
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "\001/oZ&\n#gV2\030#g@h\017+gP2\000+\177V*\t.bR/\r9c\034#\005-n@3\t8+Z4L$~_+";
                c2 = ' ';
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\001/oZ&\n#gV2\030#g@h\n#eW+\r8lV4\030,b_\"\005$oV?C$mV}";
                c2 = '!';
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "L%yZ \005$1";
                c2 = '"';
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "\001/oZ&\n#gV2\030#g@h\n#eW+\r8lV4\030,b_\"\005$oV?C$d\023!\005&n@g\n%y\0233\025:n\t";
                c2 = '#';
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "L>dG&\000p";
                c2 = '$';
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "\001/oZ&\n#gV2\030#g@h\n#eW+\r8lV4\030,b_\"\005$oV?L>rC\"V";
                c2 = '%';
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "A\035J";
                c2 = '&';
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "L%yZ \005$1";
                c2 = '\'';
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "\n#gV\030\005$oV?V";
                c2 = '(';
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "L6+U.\000/TW&\030/1";
                c2 = ')';
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "\n#gV\030\b+\177V";
                c2 = '*';
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "\001/oZ&\n#gV2\030#g@h\005$bG!\005&nP(\031$\177V5L,b_\"3#eW\"\024p";
                c2 = '+';
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "L6+\0233\005'n\t";
                c2 = ',';
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "\n#gV\030\005$oV?";
                c2 = '-';
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "\001/oZ&\n#gV2\030#g@h\005$bG!\005&nP(\031$\177V5C9jE\"3:yV!\037\025mR.\000/o";
                c2 = '.';
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "\001/oZ&\n#gV2\030#g@h\005$bG!\005&nP(\031$\177V5L,b_\"3#eW\"\024p";
                c2 = '/';
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "L6+U.\000/TW&\030/1";
                c2 = '0';
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "\017%f\0350\004+\177@&\034:TC5\t,nA\"\002)n@";
                c2 = '1';
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                obj = "\n#gV\030\005$oV?";
                c2 = '2';
                i = 51;
                break;

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "\n#gV\030\b+\177V";
                c2 = '3';
                break;

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "\001/oZ&\n#gV2\030#g@h\005$bG!\005&nP(\031$\177V5C9jE\"3:yV!\037\025mR.\000/o";
                c2 = '4';
                break;

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 54;
                obj = "\001/oZ&\n#gV2\030#g@h\036/jW&\016&nU.\000/eR*\te";
                c2 = '5';
                break;

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 55;
                obj = "\n#gV\030\005$oV?";
                c2 = '6';
                break;

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 56;
                obj = "\n#gV\030\b+\177V";
                c2 = '7';
                break;

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 57;
                obj = "A\035J";
                c2 = '8';
                break;

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 58;
                obj = "\017%f\0350\004+\177@&\034:TC5\t,nA\"\002)n@";
                c2 = '9';
                break;

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 59;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\b/h\\#\tedF3A%m\036*\t'dA>";
                c2 = ':';
                break;

            case 58: // ':'
                as1[i] = ((String) (obj));
                i = 60;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\002%\177l&3#fR \tp";
                c2 = ';';
                break;

            case 59: // ';'
                as1[i] = ((String) (obj));
                i = 61;
                obj = "L6+";
                c2 = '<';
                break;

            case 60: // '<'
                as1[i] = ((String) (obj));
                i = 62;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\037)j_\"C";
                c2 = '=';
                break;

            case 61: // '='
                as1[i] = ((String) (obj));
                i = 63;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\037)j_\"C%~Gj\003,&^\"\001%yJ";
                c2 = '>';
                break;

            case 62: // '>'
                as1[i] = ((String) (obj));
                i = 64;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\036%\177R3\t";
                c2 = '?';
                break;

            case 63: // '?'
                as1[i] = ((String) (obj));
                i = 65;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\036%\177R3\tedF3A%m\036*\t'dA>";
                c2 = '@';
                break;

            case 64: // '@'
                as1[i] = ((String) (obj));
                i = 66;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\002%\177l&3#fR \tp";
                c2 = 'A';
                break;

            case 65: // 'A'
                as1[i] = ((String) (obj));
                i = 67;
                obj = "\"%+U.\000/+";
                c2 = 'B';
                break;

            case 66: // 'B'
                as1[i] = ((String) (obj));
                i = 68;
                obj = "/+e](\030jg\\&\bjiZ3\001+{\0234\0308nR*L";
                c2 = 'C';
                break;

            case 67: // 'C'
                as1[i] = ((String) (obj));
                i = 69;
                obj = "L6+[\"\005-cGz";
                c2 = 'D';
                break;

            case 68: // 'D'
                as1[i] = ((String) (obj));
                i = 70;
                obj = "L6+@&\001:gV\030\037#qVz";
                c2 = 'E';
                break;

            case 69: // 'E'
                as1[i] = ((String) (obj));
                i = 71;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\017+e\0243L&dR#L#eC2\0309\177A\"\r'";
                c2 = 'F';
                break;

            case 70: // 'F'
                as1[i] = ((String) (obj));
                i = 72;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\0348nU\"\036;~R+\005>r\034\"\0368dAg\037.`Z)\030w";
                c2 = 'G';
                break;

            case 71: // 'G'
                as1[i] = ((String) (obj));
                i = 73;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\033#oG/Q";
                c2 = 'H';
                break;

            case 72: // 'H'
                as1[i] = ((String) (obj));
                i = 74;
                obj = "\0038bT\030\030\"~^%\002+b_h\033#oG/V";
                c2 = 'I';
                break;

            case 73: // 'I'
                as1[i] = ((String) (obj));
                i = 75;
                obj = "\036/xP&\000/+G/\031'i\0233\003j:\003w\024{;\003";
                c2 = 'J';
                break;

            case 74: // 'J'
                as1[i] = ((String) (obj));
                i = 76;
                obj = "C\"nZ \004>1";
                c2 = 'K';
                break;

            case 75: // 'K'
                as1[i] = ((String) (obj));
                i = 77;
                obj = "\036/gV&\037/";
                c2 = 'L';
                break;

            case 76: // 'L'
                as1[i] = ((String) (obj));
                i = 78;
                obj = "\013/\177v*\016/oW\"\b\032bP3\0318n";
                c2 = 'M';
                break;

            case 77: // 'M'
                as1[i] = ((String) (obj));
                i = 79;
                obj = "\036/gV&\037/";
                c2 = 'N';
                break;

            case 78: // 'N'
                as1[i] = ((String) (obj));
                i = 80;
                obj = "\036/gV&\037/";
                c2 = 'O';
                break;

            case 79: // 'O'
                as1[i] = ((String) (obj));
                i = 81;
                obj = "\036/gV&\037/";
                c2 = 'P';
                break;

            case 80: // 'P'
                as1[i] = ((String) (obj));
                i = 82;
                obj = "\036/gV&\037/";
                c2 = 'Q';
                break;

            case 81: // 'Q'
                as1[i] = ((String) (obj));
                i = 83;
                obj = "\036/gV&\037/";
                c2 = 'R';
                break;

            case 82: // 'R'
                as1[i] = ((String) (obj));
                i = 84;
                obj = "\r$oA(\005.%^\"\b#j\035\n\t.bR\n\t>jW&\030+YV3\036#nE\"\036";
                c2 = 'S';
                break;

            case 83: // 'S'
                as1[i] = ((String) (obj));
                i = 85;
                obj = "\001/oZ&\n#gV2\030#g@h\036%\177R3\tj}Z#\t%+G/\031'i\023";
                c2 = 'T';
                break;

            case 84: // 'T'
                as1[i] = ((String) (obj));
                i = 86;
                obj = "\036/gV&\037/";
                c2 = 'U';
                break;

            case 85: // 'U'
                as1[i] = ((String) (obj));
                i = 87;
                obj = "\037/\177w&\030+X\\2\036)n";
                c2 = 'V';
                break;

            case 86: // 'V'
                as1[i] = ((String) (obj));
                i = 88;
                obj = "\017+{G2\036/MA&\001/";
                c2 = 'W';
                break;

            case 87: // 'W'
                as1[i] = ((String) (obj));
                i = 89;
                obj = "\036/gV&\037/";
                c2 = 'X';
                break;

            case 88: // 'X'
                as1[i] = ((String) (obj));
                i = 90;
                obj = "\036/gV&\037/";
                c2 = 'Y';
                break;

            case 89: // 'Y'
                as1[i] = ((String) (obj));
                i = 91;
                obj = "\036/gV&\037/";
                c2 = 'Z';
                break;

            case 90: // 'Z'
                as1[i] = ((String) (obj));
                i = 92;
                obj = "\013/\177u5\r'nr38#fV";
                c2 = '[';
                break;

            case 91: // '['
                as1[i] = ((String) (obj));
                i = 93;
                obj = "\002+\177Z1\tjcV&\034jxZ=\tp";
                c2 = '\\';
                break;

            case 92: // '\\'
                as1[i] = ((String) (obj));
                i = 94;
                obj = "L!I";
                c2 = ']';
                break;

            case 93: // ']'
                as1[i] = ((String) (obj));
                i = 95;
                obj = "\013/\177^\"\b#jW2\036+\177Z(\0029nP(\002.x";
                c2 = '^';
                break;

            case 94: // '^'
                as1[i] = ((String) (obj));
                i = 96;
                obj = "\001+sl.\030/f@";
                c2 = '_';
                break;

            case 95: // '_'
                as1[i] = ((String) (obj));
                i = 97;
                obj = "\005'jT\"C`";
                c2 = '`';
                break;

            case 96: // '`'
                as1[i] = ((String) (obj));
                i = 98;
                obj = "\036/hZ7\005/eG";
                c2 = 'a';
                break;

            case 97: // 'a'
                as1[i] = ((String) (obj));
                i = 99;
                obj = "\r$oA(\005.%Z)\030/eGi\r)\177Z(\002d[z\004'";
                c2 = 'b';
                break;

            case 98: // 'b'
                as1[i] = ((String) (obj));
                i = 100;
                obj = "\r$oA(\005.%C5\003<bW\"\036dFV#\005+XG(\036/%V?\0308j\035\n-\022Tq\0368\017X";
                c2 = 'c';
                break;

            case 99: // 'c'
                as1[i] = ((String) (obj));
                i = 101;
                obj = "\r$oA(\005.%^\"\b#j\035&\017>b\\)B\003Fr\000)\025Hr\0278\037Yv";
                c2 = 'd';
                break;

            case 100: // 'd'
                as1[i] = ((String) (obj));
                i = 102;
                obj = "\r$oA(\005.%Z)\030/eGi\r)\177Z(\002dLv\0233\tD}\023)\004_";
                c2 = 'e';
                break;

            case 101: // 'e'
                as1[i] = ((String) (obj));
                i = 103;
                obj = "\r$oA(\005.%Z)\030/eGi\t2\177A&B9bI\" #fZ3";
                c2 = 'f';
                break;

            case 102: // 'f'
                as1[i] = ((String) (obj));
                i = 104;
                obj = "\r$oA(\005.%Z)\030/eGi\r)\177Z(\002d[z\004'";
                c2 = 'g';
                break;

            case 103: // 'g'
                as1[i] = ((String) (obj));
                i = 105;
                obj = "\r$oA(\005.%Z)\030/eGi\r)\177Z(\002d[z\004'";
                c2 = 'h';
                break;

            case 104: // 'h'
                as1[i] = ((String) (obj));
                i = 106;
                obj = "\017%f\0350\004+\177@&\034:%R$\030#d]i;\002Jg\024-\032[l\025)\tDa\003%\004L";
                c2 = 'i';
                break;

            case 105: // 'i'
                as1[i] = ((String) (obj));
                i = 107;
                obj = "\r?oZ(C`";
                c2 = 'j';
                break;

            case 106: // 'j'
                as1[i] = ((String) (obj));
                i = 108;
                obj = "\037%~]#\036/h\\5\b/y";
                c2 = 'k';
                break;

            case 107: // 'k'
                as1[i] = ((String) (obj));
                i = 109;
                obj = "L6+";
                c2 = 'l';
                break;

            case 108: // 'l'
                as1[i] = ((String) (obj));
                i = 110;
                obj = "\r$oA(\005.%Z)\030/eGi\r)\177Z(\002d[z\004'";
                c2 = 'm';
                break;

            case 109: // 'm'
                as1[i] = ((String) (obj));
                i = 111;
                obj = "\r?oZ(C`";
                c2 = 'n';
                break;

            case 110: // 'n'
                as1[i] = ((String) (obj));
                i = 112;
                obj = "B {T";
                c2 = 'o';
                break;

            case 111: // 'o'
                as1[i] = ((String) (obj));
                i = 113;
                obj = "\001?xZ$";
                c2 = 'p';
                break;

            case 112: // 'p'
                as1[i] = ((String) (obj));
                i = 114;
                obj = "\001+sl.\030/f@";
                c2 = 'q';
                break;

            case 113: // 'q'
                as1[i] = ((String) (obj));
                i = 115;
                obj = "\r$oA(\005.%Z)\030/eGi\r)\177Z(\002d[z\004'";
                c2 = 'r';
                break;

            case 114: // 'r'
                as1[i] = ((String) (obj));
                i = 116;
                obj = "\r$oA(\005.%Z)\030/eGi\t2\177A&B\003Ez\023%\013Gl\016\"\036N}\023?";
                c2 = 's';
                break;

            case 115: // 's'
                as1[i] = ((String) (obj));
                i = 117;
                obj = "B'{\007";
                c2 = 't';
                break;

            case 116: // 't'
                as1[i] = ((String) (obj));
                i = 118;
                obj = "\032%bP\"\036/h\\5\b/y";
                c2 = 'u';
                break;

            case 117: // 'u'
                as1[i] = ((String) (obj));
                i = 119;
                obj = "\001/oZ&A,b_\"A?\177Z+\037ejC7L";
                c2 = 'v';
                break;

            case 118: // 'v'
                as1[i] = ((String) (obj));
                i = 120;
                obj = "\001%\177\\5\003&j\035$\001:";
                c2 = 'w';
                break;

            case 119: // 'w'
                as1[i] = ((String) (obj));
                i = 121;
                obj = "\005'jT\"C`";
                c2 = 'x';
                break;

            case 120: // 'x'
                as1[i] = ((String) (obj));
                i = 122;
                obj = "\003?\177C2\030";
                c2 = 'y';
                break;

            case 121: // 'y'
                as1[i] = ((String) (obj));
                i = 123;
                obj = "\r$oA(\005.%^\"\b#j\035&\017>b\\)B\034Bw\002#\025Hr\0278\037Yv";
                c2 = 'z';
                break;

            case 122: // 'z'
                as1[i] = ((String) (obj));
                i = 124;
                obj = "\003?\177C2\030";
                c2 = '{';
                break;

            case 123: // '{'
                as1[i] = ((String) (obj));
                i = 125;
                obj = "\"/sF4";
                c2 = '|';
                break;

            case 124: // '|'
                as1[i] = ((String) (obj));
                i = 126;
                obj = "\0038bV)\030+\177Z(\002";
                c2 = '}';
                break;

            case 125: // '}'
                as1[i] = ((String) (obj));
                i = 127;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\0038bV)\030+\177Z(\002j";
                c2 = '~';
                break;

            case 126: // '~'
                as1[i] = ((String) (obj));
                i = 128;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\002%T\\5\005/eG&\030#d]\030\005$m\\";
                c2 = '\177';
                break;

            case 127: // '\177'
                as1[i] = ((String) (obj));
                i = 129;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\017?y@(\036\025b@\030\t'{G>";
                c2 = '\200';
                break;

            case 128: 
                as1[i] = ((String) (obj));
                i = 130;
                obj = "3.jG&";
                c2 = '\201';
                break;

            case 129: 
                as1[i] = ((String) (obj));
                i = 131;
                obj = "#8bV)\030+\177Z(\002";
                c2 = '\202';
                break;

            case 130: 
                as1[i] = ((String) (obj));
                i = 132;
                obj = "\n#gV";
                c2 = '\203';
                break;

            case 131: 
                as1[i] = ((String) (obj));
                i = 133;
                obj = "#8bV)\030+\177Z(\002";
                c2 = '\204';
                break;

            case 132: 
                as1[i] = ((String) (obj));
                i = 134;
                obj = "\017%eG\"\002>";
                c2 = '\205';
                break;

            case 133: 
                as1[i] = ((String) (obj));
                i = 135;
                obj = "\001/oZ&";
                c2 = '\206';
                break;

            case 134: 
                as1[i] = ((String) (obj));
                i = 136;
                obj = "\001/oZ&\031>b_4C-n]\"\036+\177V\"\024>nA)\r&b^&\013/mZ+\texR1\t\025{A\"\n9TU&\005&nW";
                c2 = '\207';
                break;

            case 135: 
                as1[i] = ((String) (obj));
                i = 137;
                obj = "\017%f\0350\004+\177@&\034:TC5\t,nA\"\002)n@";
                c2 = '\210';
                break;

            case 136: 
                as1[i] = ((String) (obj));
                i = 138;
                obj = "\t2\177V5\002+gl!\005&nl.\001+lV";
                c2 = '\211';
                break;

            case 137: 
                as1[i] = ((String) (obj));
                i = 139;
                obj = "\036%\177R3\005%e";
                c2 = '\212';
                break;

            case 138: 
                as1[i] = ((String) (obj));
                i = 140;
                obj = "\017+{G.\003$";
                c2 = '\213';
                break;

            case 139: 
                as1[i] = ((String) (obj));
                i = 141;
                obj = "\001/oZ&\n#gV2\030#g@h\017\"nP,\001/oZ&\n#gV4\0050n\0343\003%+_&\036-n\t";
                c2 = '\214';
                break;

            case 140: 
                as1[i] = ((String) (obj));
                i = 142;
                obj = "\001/oZ&\n#gV2\030#g@h\017\"nP,\001/oZ&\n#gV4\0050n\0234\036)1";
                c2 = '\215';
                break;

            case 141: 
                as1[i] = ((String) (obj));
                i = 143;
                obj = "\017%f\0350\004+\177@&\034:TC5\t,nA\"\002)n@";
                c2 = '\216';
                break;

            case 142: 
                as1[i] = ((String) (obj));
                i = 144;
                obj = "\001/oZ&\n#gV2\030#g@h\005$bG!\005&nP(\031$\177V5C9jE\"3:yV!\037\025mR.\000/o";
                c2 = '\217';
                break;

            case 143: 
                as1[i] = ((String) (obj));
                i = 145;
                obj = "\n#gV\030\005$oV?";
                c2 = '\220';
                break;

            case 144: 
                as1[i] = ((String) (obj));
                i = 146;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\n8d^g\0318b\t";
                c2 = '\221';
                break;

            case 145: 
                as1[i] = ((String) (obj));
                i = 147;
                obj = "L6+";
                c2 = '\222';
                break;

            case 146: 
                as1[i] = ((String) (obj));
                i = 148;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\n#eR+39bI\"V";
                c2 = '\223';
                break;

            case 147: 
                as1[i] = ((String) (obj));
                i = 149;
                obj = "\"%+U.\000/+";
                c2 = '\224';
                break;

            case 148: 
                as1[i] = ((String) (obj));
                i = 150;
                obj = "\037+fC+\t\025y\\3\r>nl.\001+lVh\003%f\023";
                c2 = '\225';
                break;

            case 149: 
                as1[i] = ((String) (obj));
                i = 151;
                obj = "\r$oA(\005.%Z)\030/eGi\r)\177Z(\002dFv\003%\013T`\004-\004Ev\0253\031Hr\t3\fB\177\002";
                c2 = '\226';
                break;

            case 150: 
                as1[i] = ((String) (obj));
                i = 152;
                obj = "\001/oZ&\n#gV2\030#g@h\013/\177Z*\r-nR)\b9n]#C9nP2\036#\177J\"\024)nC3\005%e";
                c2 = '\227';
                break;

            case 151: 
                as1[i] = ((String) (obj));
                i = 153;
                obj = "\001/oZ&\n#gV2\030#g@h\013/\177Z*\r-nR)\b9n]#C>cF*\016\025iZ3\001+{\023.\037jeF+\0";
                c2 = '\230';
                break;

            case 152: 
                as1[i] = ((String) (obj));
                i = 154;
                obj = "B {T";
                c2 = '\231';
                break;

            case 153: 
                as1[i] = ((String) (obj));
                i = 155;
                obj = "\n#gV";
                c2 = '\232';
                break;

            case 154: 
                as1[i] = ((String) (obj));
                i = 156;
                obj = "\\z;\003";
                c2 = '\233';
                break;

            case 155: 
                as1[i] = ((String) (obj));
                z = as;
                c = new DecimalFormat(z[156], new DecimalFormatSymbols(Locale.US));
                a = -1;
                f = new android.graphics.BitmapFactory.Options();
                f.inDither = true;
                d = new b7(10);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c3 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 3652
    //                   0 3675
    //                   1 3682
    //                   2 3689
    //                   3 3696;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_3696;
_L3:
        byte byte0 = 71;
_L9:
        obj[j] = (char)(byte0 ^ c3);
        j++;
          goto _L8
_L4:
        byte0 = 108;
          goto _L9
_L5:
        byte0 = 74;
          goto _L9
_L6:
        byte0 = 11;
          goto _L9
        byte0 = 51;
          goto _L9
    }
}
