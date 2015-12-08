// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Debug;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import org.json.JSONObject;

public class ImageService
{

    public static final int THUMBNAIL_SIZE = 100;
    private static final String a = "ImageService";
    private static final int b = 1;
    private static final int c = 1;
    private static final int d = 200;
    private static final int e = 200;
    private static final int f = 24;
    private static final int g = 3;
    private static final int h = 72;
    private static final int i = 72;
    private static boolean j = false;
    private static Bitmap k = null;
    private static String l = null;
    private static String m = null;
    private static UseableImageMemoryLimit n;
    private static InterimImageFileFormat o;

    public ImageService()
    {
    }

    private static int a(Context context, Uri uri, int i1, int j1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        uri = context.getContentResolver().openInputStream(uri);
        context = BitmapFactory.decodeStream(uri, null, options);
        int k1 = options.outHeight;
        float f1 = i1 / options.outWidth;
        float f2 = j1 / k1;
        try
        {
            uri.close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e("ImageService", "Error closing input stream", uri);
        }
        if (context != null)
        {
            context.recycle();
        }
        return (int)Math.pow(2D, Math.min(f1, f2));
    }

    private static long a()
    {
        long l1;
        long l2;
        long l3;
        l3 = Runtime.getRuntime().totalMemory();
        l2 = Runtime.getRuntime().maxMemory();
        l1 = l2 / 2L;
        l3 = Math.min(l3, l1);
        _cls1.a[n.ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 63
    //                   2 70;
           goto _L1 _L2 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        l1 = l3;
_L5:
        dumpHeapStats("getLargestUseableImage()");
        return l1;
_L3:
        l1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void a(Bitmap bitmap)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("height", bitmap.getHeight());
            jsonobject.put("width", bitmap.getWidth());
            jsonobject.put("density", bitmap.getDensity());
            jsonobject.put("rowBytes", bitmap.getRowBytes());
            jsonobject.put("totalBytes", bitmap.getRowBytes() * bitmap.getHeight());
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("ImageService", "Error creating JSON for Bitmap", bitmap);
        }
        Log.d("ImageService", (new StringBuilder()).append("Bitmap -> ").append(jsonobject.toString()).toString());
    }

    public static void clearGlobalBitmap()
    {
        Log.d("ImageService", "Clearing global bitmap");
        if (k != null)
        {
            k.recycle();
            k = null;
        }
    }

    public static void copyImageToExternalStorage(File file)
    {
        File file1;
        Object obj;
        Object obj1;
        FileChannel filechannel;
        File file2;
        obj = null;
        filechannel = null;
        obj1 = null;
        file1 = null;
        file2 = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(File.separator).append(file.getName()).toString());
        file2.createNewFile();
        file = (new FileInputStream(file)).getChannel();
        obj = file;
        file1 = ((File) (obj));
        file = filechannel;
        filechannel = (new FileOutputStream(file2)).getChannel();
        file1 = ((File) (obj));
        file = filechannel;
        obj1 = filechannel;
        ((FileChannel) (obj)).transferTo(0L, ((FileChannel) (obj)).size(), filechannel);
        file1 = ((File) (obj));
        file = filechannel;
        obj1 = filechannel;
        Log.i("ImageService", (new StringBuilder()).append("copyImageToExternalStorage(), successfully moved image to external storage Path: ").append(file2.getAbsolutePath()).toString());
        if (obj != null)
        {
            ((FileChannel) (obj)).close();
        }
        if (filechannel != null)
        {
            filechannel.close();
        }
_L2:
        return;
        IOException ioexception;
        ioexception;
        obj = null;
        obj1 = file1;
_L5:
        file1 = ((File) (obj));
        file = ((File) (obj1));
        ioexception.printStackTrace();
        if (obj != null)
        {
            ((FileChannel) (obj)).close();
        }
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((FileChannel) (obj1)).close();
        return;
        Exception exception;
        exception;
        file1 = null;
        file = ((File) (obj));
        obj = exception;
_L4:
        if (file1 != null)
        {
            file1.close();
        }
        if (file != null)
        {
            file.close();
        }
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception;
          goto _L5
    }

    public static Bitmap createScaledBitmap(Bitmap bitmap, boolean flag)
    {
        long l2 = a();
        long l3 = bitmap.getRowBytes() * bitmap.getHeight();
        Log.d("ImageService", "Creating scaled bitmap...");
        Log.d("ImageService", (new StringBuilder()).append("... original bitmap size -> ").append(l3).toString());
        Bitmap bitmap1 = bitmap;
        if (l3 <= l2)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        dumpHeapStats("createScaledBitmap - preScale");
        int i1 = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        float f1 = (float)l2 / (float)l3;
        int k1 = (int)((float)i1 * f1);
        int l1 = (int)((float)j1 * f1);
        Log.d("ImageService", (new StringBuilder()).append("... scaling bitmap with factor of ").append(f1).toString());
        bitmap1 = bitmap;
        Bitmap bitmap2;
        try
        {
            bitmap2 = Bitmap.createScaledBitmap(bitmap, k1, l1, true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("ImageService", "Got OOM while trying to create scaled bitmap", bitmap);
            Log.e("ImageService", (new StringBuilder()).append("... largestImageSize -> ").append(l2).toString());
            Log.e("ImageService", (new StringBuilder()).append("... bmSize -> ").append(l3).toString());
            Log.e("ImageService", (new StringBuilder()).append("... orgHeight -> ").append(j1).append(", orgWidth -> ").append(i1).toString());
            Log.e("ImageService", (new StringBuilder()).append("... height -> ").append(l1).append(", width -> ").append(k1).toString());
            return bitmap1;
        }
        bitmap1 = bitmap;
        Log.d("ImageService", (new StringBuilder()).append("... new bitmap size -> ").append(bitmap2.getRowBytes() * bitmap2.getHeight()).toString());
        bitmap1 = bitmap;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        bitmap1 = bitmap;
        Log.d("ImageService", "... recyling old bitmap");
        bitmap1 = bitmap;
        bitmap.recycle();
        bitmap1 = null;
        dumpHeapStats("createScaledBitmap - postScale");
        bitmap1 = bitmap2;
        return bitmap1;
    }

    public static String dumpBitmapSize(Bitmap bitmap, String s)
    {
        if (bitmap == null || bitmap.isRecycled())
        {
            return "Unable to calculate size";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append((new StringBuilder()).append("Dumping bitmap data from ").append(s).append(": ").toString());
            stringbuilder.append((new StringBuilder()).append("Height -> ").append(bitmap.getHeight()).toString());
            stringbuilder.append((new StringBuilder()).append(", Width -> ").append(bitmap.getWidth()).toString());
            stringbuilder.append((new StringBuilder()).append(", Density -> ").append(bitmap.getDensity()).toString());
            stringbuilder.append((new StringBuilder()).append(", Size -> ").append(bitmap.getRowBytes() * bitmap.getHeight()).toString());
            return stringbuilder.toString();
        }
    }

    public static void dumpHeapStats(String s)
    {
        Log.d("ImageService", "*** [START] Dumping heap stats ***");
        Log.d("ImageService", (new StringBuilder()).append("--- msg -> ").append(s).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- native heap size -> ").append(Debug.getNativeHeapSize()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- native heap size (free) -> ").append(Debug.getNativeHeapFreeSize()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- native heap size (allocated) -> ").append(Debug.getNativeHeapAllocatedSize()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- totalMemory -> ").append(Runtime.getRuntime().totalMemory()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- maxMemory -> ").append(Runtime.getRuntime().maxMemory()).toString());
        Log.d("ImageService", "*** [END] Dumping heap stats ***");
    }

    public static Bitmap getBitmapFromURI(Context context, Uri uri)
    {
        Object obj = null;
        try
        {
            context = context.getContentResolver().openInputStream(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        uri = obj;
        if (context != null)
        {
            uri = BitmapFactory.decodeStream(context);
        }
        return uri;
    }

    public static Bitmap getBitmapFromURL(URL url)
    {
        try
        {
            url = (HttpURLConnection)url.openConnection();
            url.setDoInput(true);
            url.connect();
            url = BitmapFactory.decodeStream(url.getInputStream());
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            url.printStackTrace();
            return null;
        }
        return url;
    }

    public static String getEnhancedBitonalImageFileName()
    {
        return l;
    }

    public static Bitmap getGlobalBitmap()
    {
        return k;
    }

    public static InterimImageFileFormat getInterimImageFileFormat()
    {
        return o;
    }

    public static String getIpResults()
    {
        return m;
    }

    public static String getNonNullIpResults()
    {
        if (m == null)
        {
            return new String();
        } else
        {
            return m;
        }
    }

    public static UseableImageMemoryLimit getUseableImageMemoryLimits()
    {
        return n;
    }

    public static Bitmap loadBitmapFromFile(Activity activity, String s, int i1)
    {
        return loadBitmapFromURI(activity, Uri.fromFile(new File(s)), i1, -1L);
    }

    public static Bitmap loadBitmapFromURI(Activity activity, Uri uri, int i1, long l1)
    {
        Object obj;
        Object obj1;
        try
        {
            obj1 = activity.getContentResolver().openInputStream(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("ImageService", "Error loading file", activity);
            return null;
        }
        obj = new android.graphics.BitmapFactory.Options();
        obj.inPurgeable = true;
        if (i1 <= 1)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj.inSampleSize = i1;
        obj = BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj)));
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("ImageService", "Error closing input stream", ((Throwable) (obj1)));
        }
        obj1 = obj;
        if (l1 > 0L)
        {
            obj1 = obj;
            if ((long)(((Bitmap) (obj)).getRowBytes() * ((Bitmap) (obj)).getHeight()) > l1)
            {
                if (obj != null)
                {
                    ((Bitmap) (obj)).recycle();
                }
                obj1 = loadBitmapFromURI(activity, uri, i1 * 2, l1);
            }
        }
        return ((Bitmap) (obj1));
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        Log.e("ImageService", (new StringBuilder()).append("OOM while loading a bitmap at scale ").append(i1).toString());
        if (true)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        throw new NullPointerException();
        activity = loadBitmapFromURI(activity, uri, i1 * 2, l1);
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e("ImageService", "Error closing input stream", uri);
            return activity;
        }
        return activity;
        activity;
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e("ImageService", "Error closing input stream", uri);
        }
        throw activity;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, boolean flag, boolean flag1)
    {
        Object obj;
        Object obj1;
        Log.d("ImageService", "About to scale bitmap. Source information before scaling: ");
        Log.d("ImageService", (new StringBuilder()).append("... size -> ").append(bitmap.getRowBytes() * bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... height -> ").append(bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... width -> ").append(bitmap.getWidth()).toString());
        if (flag1)
        {
            bitmap = createScaledBitmap(bitmap, true);
        }
        obj = new Matrix();
        float f1;
        if (flag)
        {
            f1 = 90F;
        } else
        {
            f1 = -90F;
        }
        ((Matrix) (obj)).postRotate(f1);
        obj1 = null;
        dumpHeapStats("rotateImage - preRotate");
        Log.d("ImageService", "About to rotate bitmap. Source information: ");
        Log.d("ImageService", (new StringBuilder()).append("... size -> ").append(bitmap.getRowBytes() * bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... height -> ").append(bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... width -> ").append(bitmap.getWidth()).toString());
        obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), false);
        Log.d("ImageService", (new StringBuilder()).append("... rotated bitmap size -> ").append(((Bitmap) (obj)).getRowBytes() * ((Bitmap) (obj)).getHeight()).toString());
        bitmap.recycle();
_L2:
        return ((Bitmap) (obj));
        obj1;
        obj = null;
_L5:
        Log.e("ImageService", "Error rotating bitmap", ((Throwable) (obj1)));
        obj1 = obj;
_L3:
        obj = bitmap;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((Bitmap) (obj1)).recycle();
        return bitmap;
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
_L4:
        Log.e("ImageService", "Error rotating bitmap", ((Throwable) (obj1)));
        obj1 = obj;
          goto _L3
        obj1;
          goto _L4
        obj1;
          goto _L5
    }

    public static Bitmap rotateImage(byte abyte0[], boolean flag, boolean flag1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        dumpHeapStats("rotateImage - preDecode");
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        dumpHeapStats("rotateImage - postDecode");
        return rotateBitmap(abyte0, flag, flag1);
    }

    public static void setInterimImageFileFormat(InterimImageFileFormat interimimagefileformat)
    {
        o = interimimagefileformat;
    }

    public static void setUseableImageMemoryLimits(UseableImageMemoryLimit useableimagememorylimit)
    {
        n = useableimagememorylimit;
    }

    public static void storeGlobalBitmap(Bitmap bitmap)
    {
        Log.d("ImageService", "Storing global bitmap");
        if (k != null && k != bitmap)
        {
            clearGlobalBitmap();
        }
        k = bitmap;
    }

    static 
    {
        n = UseableImageMemoryLimit.NORMAL;
        o = InterimImageFileFormat.PNG;
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[UseableImageMemoryLimit.values().length];
            try
            {
                a[UseableImageMemoryLimit.LARGE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[UseableImageMemoryLimit.MAXIMUM.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[UseableImageMemoryLimit.NORMAL.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class UseableImageMemoryLimit extends Enum
    {

        public static final UseableImageMemoryLimit LARGE;
        public static final UseableImageMemoryLimit MAXIMUM;
        public static final UseableImageMemoryLimit NORMAL;
        private static final UseableImageMemoryLimit a[];

        public static UseableImageMemoryLimit valueOf(String s)
        {
            return (UseableImageMemoryLimit)Enum.valueOf(com/kofax/kmc/kui/uicontrols/ImageService$UseableImageMemoryLimit, s);
        }

        public static UseableImageMemoryLimit[] values()
        {
            return (UseableImageMemoryLimit[])a.clone();
        }

        static 
        {
            NORMAL = new UseableImageMemoryLimit("NORMAL", 0);
            LARGE = new UseableImageMemoryLimit("LARGE", 1);
            MAXIMUM = new UseableImageMemoryLimit("MAXIMUM", 2);
            a = (new UseableImageMemoryLimit[] {
                NORMAL, LARGE, MAXIMUM
            });
        }

        private UseableImageMemoryLimit(String s, int i1)
        {
            super(s, i1);
        }
    }


    private class InterimImageFileFormat extends Enum
    {

        public static final InterimImageFileFormat JPEG;
        public static final InterimImageFileFormat PNG;
        private static final InterimImageFileFormat a[];

        public static InterimImageFileFormat valueOf(String s)
        {
            return (InterimImageFileFormat)Enum.valueOf(com/kofax/kmc/kui/uicontrols/ImageService$InterimImageFileFormat, s);
        }

        public static InterimImageFileFormat[] values()
        {
            return (InterimImageFileFormat[])a.clone();
        }

        static 
        {
            PNG = new InterimImageFileFormat("PNG", 0);
            JPEG = new InterimImageFileFormat("JPEG", 1);
            a = (new InterimImageFileFormat[] {
                PNG, JPEG
            });
        }

        private InterimImageFileFormat(String s, int i1)
        {
            super(s, i1);
        }
    }

}
