// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.view.View;
import android.widget.ImageView;
import com.contextlogic.wish.WishApplication;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BitmapUtil
{

    public BitmapUtil()
    {
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i, int j)
    {
        return cropBitmap(bitmap, i, j, false);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i, int j, boolean flag)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap1 = null;
_L4:
        return bitmap1;
_L2:
        bitmap1 = bitmap;
        if (i == -1) goto _L4; else goto _L3
_L3:
        bitmap1 = bitmap;
        if (j == -1) goto _L4; else goto _L5
_L5:
        if (i < bitmap.getWidth())
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap1 = bitmap;
        if (j >= bitmap.getHeight()) goto _L4; else goto _L6
_L6:
        bitmap1 = bitmap;
        if (i > bitmap.getWidth()) goto _L4; else goto _L7
_L7:
        bitmap1 = bitmap;
        if (j > bitmap.getHeight()) goto _L4; else goto _L8
_L8:
        int k;
        int l;
        bitmap1 = null;
        l = (bitmap.getWidth() - i) / 2;
        Bitmap bitmap2;
        if (flag)
        {
            k = 0;
        } else
        {
            k = (bitmap.getHeight() - j) / 2;
        }
        bitmap2 = Bitmap.createBitmap(bitmap, l, k, i, j);
        bitmap1 = bitmap2;
        if (bitmap2 == bitmap)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        bitmap1 = bitmap2;
        bitmap.recycle();
        bitmap1 = bitmap2;
_L10:
        return bitmap1;
        Throwable throwable;
        throwable;
        System.gc();
        Runtime.getRuntime().gc();
        Bitmap bitmap3 = Bitmap.createBitmap(bitmap, l, k, i, j);
        bitmap1 = bitmap3;
        if (bitmap3 == bitmap)
        {
            continue; /* Loop/switch isn't completed */
        }
        bitmap1 = bitmap3;
        bitmap.recycle();
        bitmap1 = bitmap3;
        continue; /* Loop/switch isn't completed */
        bitmap;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static Bitmap decodeBitmap(byte abyte0[], int i, int j, boolean flag)
    {
        Object obj;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, ((android.graphics.BitmapFactory.Options) (obj)));
        int i1 = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        int j1 = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = false;
        options.inScaled = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inSampleSize = getInSampleValue(j1, i1, i, j);
        boolean flag2 = false;
        boolean flag1 = flag2;
        int l = i;
        int k = j;
        if (flag)
        {
            flag1 = flag2;
            l = i;
            k = j;
            if (j1 < i)
            {
                flag1 = flag2;
                l = i;
                k = j;
                if (i != -1)
                {
                    flag1 = flag2;
                    l = i;
                    k = j;
                    if (i1 < j)
                    {
                        flag1 = flag2;
                        l = i;
                        k = j;
                        if (j != -1)
                        {
                            float f = WishApplication.getAppInstance().getDisplayDensity();
                            l = (int)((float)j1 * f);
                            k = (int)((float)i1 * f);
                            f = (float)i / (float)l;
                            float f1 = (float)j / (float)k;
                            float f2 = (float)i1 / (float)j1;
                            Object obj1;
                            if (l > i || k > j)
                            {
                                if (f < f1)
                                {
                                    i = Math.min(i, l);
                                    j = (int)((float)i * f2);
                                } else
                                {
                                    i = (int)((float)j / f2);
                                    j = Math.min(j, k);
                                }
                            } else
                            {
                                i = l;
                                j = k;
                            }
                            flag1 = true;
                            k = j;
                            l = i;
                        }
                    }
                }
            }
        }
        obj = null;
        obj1 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        obj = obj1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        obj = obj1;
        obj1 = resizeBitmap(((Bitmap) (obj1)), l, k, flag1);
        obj = obj1;
        obj1 = cropBitmap(((Bitmap) (obj1)), l, k);
        obj = obj1;
_L2:
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        System.gc();
        Runtime.getRuntime().gc();
        try
        {
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return ((Bitmap) (obj));
        }
        obj1 = abyte0;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        obj = abyte0;
        abyte0 = resizeBitmap(abyte0, l, k, flag1);
        obj = abyte0;
        obj1 = cropBitmap(abyte0, l, k);
        return ((Bitmap) (obj1));
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Bitmap decodeBitmapFile(String s, int i, int j)
    {
        Object obj;
        Object obj1;
        BufferedInputStream bufferedinputstream;
        Object obj2;
        android.graphics.BitmapFactory.Options options;
        int l;
        obj2 = null;
        options = null;
        bufferedinputstream = null;
        obj1 = null;
        obj = null;
        l = 0;
        int i1 = (new ExifInterface(s)).getAttributeInt("Orientation", 1);
        int k = l;
        i1;
        JVM INSTR tableswitch 3 8: default 76
    //                   3 391
    //                   4 80
    //                   5 80
    //                   6 399
    //                   7 80
    //                   8 383;
           goto _L1 _L2 _L3 _L3 _L4 _L3 _L5
_L1:
        k = l;
_L3:
label0:
        {
            if (k != 90)
            {
                i1 = i;
                l = j;
                if (k != 270)
                {
                    break label0;
                }
            }
            l = i;
            i1 = j;
        }
        FileInputStream fileinputstream = new FileInputStream(s);
        bufferedinputstream = new BufferedInputStream(fileinputstream);
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedinputstream, null, ((android.graphics.BitmapFactory.Options) (obj)));
        i = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        j = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = false;
        options.inScaled = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inSampleSize = getInSampleValue(j, i, i1, l);
        obj1 = obj2;
        obj = BitmapFactory.decodeFile(s, options);
        obj1 = obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        obj1 = obj;
        obj = resizeBitmap(((Bitmap) (obj)), i1, l, false);
        obj1 = obj;
_L15:
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        System.gc();
        Runtime.getRuntime().gc();
        obj = obj1;
        s = BitmapFactory.decodeFile(s, options);
        obj = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj = s;
        s = resizeBitmap(s, i1, l, false);
        obj = s;
_L13:
        s = ((String) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        s = ((String) (obj));
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        obj1 = new Matrix();
        ((Matrix) (obj1)).postRotate(k);
        s = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), ((Matrix) (obj1)), true);
        if (s == obj)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        ((Bitmap) (obj)).recycle();
_L6:
        if (bufferedinputstream != null)
        {
            try
            {
                bufferedinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (fileinputstream == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return s;
        }
        obj = s;
_L8:
        return ((Bitmap) (obj));
_L5:
        k = 270;
        continue; /* Loop/switch isn't completed */
_L2:
        k = 180;
        continue; /* Loop/switch isn't completed */
_L4:
        k = 90;
        continue; /* Loop/switch isn't completed */
        s;
        System.gc();
        Runtime.getRuntime().gc();
        s = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), ((Matrix) (obj1)), true);
        if (s != obj)
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = ((String) (obj));
            }
            finally
            {
                obj1 = bufferedinputstream;
            }
        }
          goto _L6
        s;
        s = bufferedinputstream;
_L11:
        obj1 = null;
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        obj = obj1;
        if (s == null) goto _L8; else goto _L7
_L7:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return null;
        s;
        obj = options;
_L10:
        if (obj1 != null)
        {
            try
            {
                ((BufferedInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        s;
        obj = fileinputstream;
        continue; /* Loop/switch isn't completed */
        obj = fileinputstream;
        if (true) goto _L10; else goto _L9
_L9:
        s;
        s = fileinputstream;
          goto _L11
        s;
        obj = bufferedinputstream;
        s = fileinputstream;
          goto _L11
        s;
        if (true) goto _L13; else goto _L12
_L12:
        Throwable throwable;
        throwable;
        if (true) goto _L15; else goto _L14
_L14:
        Exception exception;
        exception;
        k = l;
        if (true) goto _L3; else goto _L16
_L16:
        return s;
    }

    public static int getInSampleValue(int i, int j, float f, float f1)
    {
        if (f != -1F || f1 != -1F)
        {
            if (f == -1F)
            {
                return Math.max(1, roundToPowerOfTwo((float)j / f1));
            }
            if (f1 == -1F)
            {
                return Math.max(1, roundToPowerOfTwo((float)i / f));
            }
            if ((float)i < f && (float)j < f1)
            {
                return 1;
            }
            float f2 = f / (float)i;
            if ((float)(int)((float)j * f2) >= f1)
            {
                return Math.max(1, roundToPowerOfTwo((float)i / f));
            }
            f2 = f1 / (float)j;
            if ((float)(int)((float)i * f2) >= f)
            {
                return Math.max(1, roundToPowerOfTwo((float)j / f1));
            }
        }
        return 1;
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, float f, float f1, boolean flag)
    {
        int i;
        int j;
        i = bitmap.getWidth();
        j = bitmap.getHeight();
        break MISSING_BLOCK_LABEL_12;
label0:
        while (true) 
        {
            do
            {
                do
                {
                    do
                    {
                        return bitmap;
                    } while (f == -1F && f1 == -1F || (f == -1F || f == (float)i) && (f1 == -1F || f1 == (float)j));
                    if (f != -1F)
                    {
                        break;
                    }
                    if (f1 < (float)j)
                    {
                        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)((f1 / (float)j) * (float)i), (int)f1, true);
                        if (bitmap1 != bitmap)
                        {
                            bitmap.recycle();
                        }
                        return bitmap1;
                    }
                } while (true);
                if (f1 != -1F || f >= (float)i)
                {
                    continue;
                }
                if (f < (float)i)
                {
                    i = (int)((f / (float)i) * (float)j);
                    Bitmap bitmap2 = Bitmap.createScaledBitmap(bitmap, (int)f, i, true);
                    if (bitmap2 != bitmap)
                    {
                        bitmap.recycle();
                    }
                    return bitmap2;
                }
                continue label0;
            } while (!flag && ((float)i < f || (float)j < f1));
            float f2 = f / (float)i;
            int k = (int)((float)j * f2);
            if ((float)k >= f1)
            {
                Bitmap bitmap3 = Bitmap.createScaledBitmap(bitmap, (int)f, k, true);
                if (bitmap3 != bitmap)
                {
                    bitmap.recycle();
                }
                return bitmap3;
            }
            f2 = f1 / (float)j;
            i = (int)((float)i * f2);
            if ((float)i >= f)
            {
                Bitmap bitmap4 = Bitmap.createScaledBitmap(bitmap, i, (int)f1, true);
                if (bitmap4 != bitmap)
                {
                    bitmap.recycle();
                }
                return bitmap4;
            }
        }
    }

    private static int roundToPowerOfTwo(float f)
    {
        return (int)Math.pow(2D, (int)Math.floor(Math.log((double)f / Math.log(2D))));
    }

    public static Bitmap safeDecodeImageResource(Context context, int i)
    {
        Bitmap bitmap;
        try
        {
            bitmap = BitmapFactory.decodeResource(context.getResources(), i);
        }
        catch (Throwable throwable)
        {
            System.gc();
            Runtime.getRuntime().gc();
            try
            {
                context = BitmapFactory.decodeResource(context.getResources(), i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            return context;
        }
        return bitmap;
    }

    public static Bitmap safeDecodeImageResource(Context context, int i, int j, int k)
    {
        Bitmap bitmap = safeDecodeImageResource(context, i);
        context = bitmap;
        if (bitmap != null)
        {
            float f = j;
            float f2 = k;
            try
            {
                context = resizeBitmap(bitmap, f, f2, true);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                System.gc();
                Runtime.getRuntime().gc();
                float f1 = j;
                float f3 = k;
                try
                {
                    context = resizeBitmap(bitmap, f1, f3, true);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return bitmap;
                }
                return context;
            }
        }
        return context;
    }

    public static boolean safeSetBackgroundResource(View view, int i)
    {
        try
        {
            view.setBackgroundResource(i);
        }
        catch (Throwable throwable)
        {
            System.gc();
            Runtime.getRuntime().gc();
            try
            {
                view.setBackgroundResource(i);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean safeSetImageResource(ImageView imageview, int i)
    {
        try
        {
            imageview.setImageResource(i);
        }
        catch (Throwable throwable)
        {
            System.gc();
            Runtime.getRuntime().gc();
            try
            {
                imageview.setImageResource(i);
            }
            // Misplaced declaration of an exception variable
            catch (ImageView imageview)
            {
                return false;
            }
            return true;
        }
        return true;
    }
}
