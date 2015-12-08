// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.util.Log;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.Projection;
import com.wsi.android.framework.wxdata.exceptions.BitmapCorruptedException;
import com.wsi.android.framework.wxdata.geodata.items.GeoObject;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceUtils
{

    public static final String TAG = com/wsi/android/framework/wxdata/utils/ServiceUtils.getSimpleName();

    public ServiceUtils()
    {
    }

    public static int calculatePixelDistance(GeoObject geoobject, GeoObject geoobject1)
    {
        return convertKmToPixels(distanceBetweenGeoObjects(geoobject, geoobject1), Math.max(geoobject.getZoomLevel(), geoobject1.getZoomLevel()));
    }

    public static boolean checkBitmap(byte abyte0[])
        throws BitmapCorruptedException
    {
        boolean flag = true;
        if (abyte0 == null)
        {
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        if (options.outWidth < 0 || options.outHeight < 0)
        {
            flag = false;
        }
        return flag;
    }

    public static int convertKmToPixels(double d, int i)
    {
        return (int)((double)getPixelsPerKm(i) * d);
    }

    public static int convertKmToPixels(double d, Projection projection)
    {
        return (int)((double)getPixelsPerKm(projection) * d);
    }

    public static boolean deleteFile(Context context, String s)
    {
        return context.deleteFile(s);
    }

    public static double distanceBetweenGeoObjects(GeoObject geoobject, GeoObject geoobject1)
    {
        return 6371.0087890625D * Math.acos(Math.sin(Math.toRadians(geoobject.getGeoY())) * Math.sin(Math.toRadians(geoobject1.getGeoY())) + Math.cos(Math.toRadians(geoobject.getGeoY())) * Math.cos(Math.toRadians(geoobject1.getGeoY())) * Math.cos(Math.toRadians(geoobject1.getGeoX() - geoobject.getGeoX())));
    }

    public static String encodeForUrl(String s)
    {
        return Uri.encode(s);
    }

    public static Bitmap getBitmapFromFile(Context context, String s)
        throws IOException, BitmapCorruptedException
    {
        return getBitmapFromFile(context.openFileInput(s));
    }

    public static Bitmap getBitmapFromFile(FileInputStream fileinputstream)
        throws BitmapCorruptedException
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(fileinputstream, 16384);
        Bitmap bitmap = BitmapFactory.decodeStream(bufferedinputstream);
        try
        {
            bufferedinputstream.close();
        }
        catch (IOException ioexception)
        {
            Log.e(com/wsi/android/framework/wxdata/utils/ServiceUtils.getSimpleName(), ioexception.toString());
        }
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            Log.e(com/wsi/android/framework/wxdata/utils/ServiceUtils.getSimpleName(), fileinputstream.toString());
        }
        if (bitmap == null)
        {
            throw new BitmapCorruptedException();
        } else
        {
            return bitmap;
        }
    }

    public static Bitmap getBitmapFromFileErrorFree(Context context, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        context = getBitmapFromFile(context, s);
        return context;
        context;
        Log.e(TAG, (new StringBuilder()).append("The memory limit has been reached: ").append(context.getMessage()).toString());
        System.gc();
_L2:
        return null;
        context;
        Log.e(TAG, (new StringBuilder()).append("An error occurred while getting a bitmap from file '").append(s).append("'.").toString(), context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Bitmap getBitmapfromBytes(byte abyte0[])
        throws BitmapCorruptedException
    {
        if (abyte0 == null)
        {
            throw new BitmapCorruptedException();
        }
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new ByteArrayInputStream(abyte0), 16384);
        abyte0 = BitmapFactory.decodeStream(bufferedinputstream);
        try
        {
            bufferedinputstream.close();
        }
        catch (IOException ioexception)
        {
            Log.e(com/wsi/android/framework/wxdata/utils/ServiceUtils.getSimpleName(), ioexception.toString());
        }
        if (abyte0 == null)
        {
            throw new BitmapCorruptedException();
        } else
        {
            return abyte0;
        }
    }

    public static int getColorAsInt(String s, int i)
    {
        String s1;
        if (s == null || "".equals(s))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s1 = s;
        if (!s.startsWith("#"))
        {
            s1 = (new StringBuilder()).append("#").append(s).toString();
        }
        int k = Color.parseColor(s1);
        int j;
        j = k;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        j = Color.argb(i, Color.red(k), Color.green(k), Color.blue(k));
        return j;
        s;
        logParseException((new StringBuilder()).append("Failed to parse the string [").append(s1).append("] as color.").toString(), s);
        return 0;
    }

    public static long getCurrentTimeMs()
    {
        return System.currentTimeMillis();
    }

    public static Date getDateValue(String s, SimpleDateFormat simpledateformat)
    {
        if (s == null || "".equals(s))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        simpledateformat = simpledateformat.parse(s);
        return simpledateformat;
        simpledateformat;
        logParseException((new StringBuilder()).append("Failed to parse the string [").append(s).append("] as a Date.").toString(), simpledateformat);
        return null;
    }

    public static float getFloatValue(String s)
    {
        if (s == null || "".equals(s))
        {
            break MISSING_BLOCK_LABEL_51;
        }
        double d = Double.parseDouble(s);
        return (float)d;
        NumberFormatException numberformatexception;
        numberformatexception;
        logParseException((new StringBuilder()).append("Failed to parse the string [").append(s).append("] as a Float.").toString(), numberformatexception);
        return 0.0F;
    }

    public static int getIntValue(String s)
    {
        if (s == null || "".equals(s))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        int i = Integer.parseInt(s);
        return i;
        NumberFormatException numberformatexception;
        numberformatexception;
        logParseException((new StringBuilder()).append("Failed to parse the string [").append(s).append("] as a Integer.").toString(), numberformatexception);
        return 0;
    }

    public static float getPixelsPerKm(int i)
    {
        return (float)(256 << i) / 40030.23F;
    }

    public static float getPixelsPerKm(Projection projection)
    {
        Object obj = new GeoPoint(0, 0);
        GeoPoint geopoint = new GeoPoint(0, 0xaba94ff);
        Point point = new Point();
        projection.toPixels(((GeoPoint) (obj)), point);
        obj = new Point();
        projection.toPixels(geopoint, ((Point) (obj)));
        return (float)(Math.abs(((Point) (obj)).x - point.x) * 2) / 40030.23F;
    }

    public static long getUsedSize(Context context, String s)
    {
        long l = 0L;
        context = context.getFilesDir();
        long l1 = l;
        if (context != null)
        {
            context = context.listFiles();
            l1 = l;
            if (context != null)
            {
                int j = context.length;
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= j)
                    {
                        break;
                    }
                    File file = context[i];
                    l1 = l;
                    if (file.isFile())
                    {
                        l1 = l;
                        if (file.getName().startsWith(s))
                        {
                            l1 = l + file.length();
                        }
                    }
                    i++;
                    l = l1;
                } while (true);
            }
        }
        return l1;
    }

    public static void logParseException(String s, Exception exception)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.e(TAG, s, exception);
            return;
        } else
        {
            Log.e(TAG, (new StringBuilder()).append(s).append(exception.toString()).toString());
            return;
        }
    }

    public static byte[] readBytes(Context context, String s)
        throws IOException, FileNotFoundException
    {
        return readBytes(context.openFileInput(s));
    }

    private static byte[] readBytes(FileInputStream fileinputstream)
        throws IOException
    {
        Object obj = new ByteArrayOutputStream();
        byte abyte1[] = new byte[16384];
_L1:
        int i = fileinputstream.read(abyte1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ((ByteArrayOutputStream) (obj)).write(abyte1, 0, i);
          goto _L1
        obj;
        fileinputstream.close();
        throw obj;
        byte abyte0[] = ((ByteArrayOutputStream) (obj)).toByteArray();
        fileinputstream.close();
        return abyte0;
    }

    public static byte[] readBytes(String s)
        throws IOException, FileNotFoundException
    {
        return readBytes(new FileInputStream(s));
    }

    public static byte[] readBytesErrorFree(Context context, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        context = readBytes(context, s);
        return context;
        context;
        Log.e(TAG, (new StringBuilder()).append("The memory limit has been reached: ").append(context.getMessage()).toString());
        System.gc();
_L2:
        return null;
        context;
        Log.e(TAG, (new StringBuilder()).append("Cannot find the file '").append(s).append("'.").toString());
        continue; /* Loop/switch isn't completed */
        context;
        Log.e(TAG, (new StringBuilder()).append("An error occurred while getting a binary data from file '").append(s).append("'.").toString(), context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void writeBytes(Context context, byte abyte0[], String s)
        throws IOException
    {
        FileOutputStream fileoutputstream;
        BufferedOutputStream bufferedoutputstream;
        fileoutputstream = context.openFileOutput(s, 0);
        bufferedoutputstream = new BufferedOutputStream(fileoutputstream, 16384);
        bufferedoutputstream.write(abyte0);
        bufferedoutputstream.close();
        fileoutputstream.close();
        return;
        abyte0;
        deleteFile(context, s);
        throw abyte0;
        context;
        bufferedoutputstream.close();
        fileoutputstream.close();
        throw context;
    }

    public static void writeBytes(File file, byte abyte0[])
        throws IOException
    {
        FileOutputStream fileoutputstream;
        BufferedOutputStream bufferedoutputstream;
        fileoutputstream = new FileOutputStream(file);
        bufferedoutputstream = new BufferedOutputStream(fileoutputstream, 16384);
        bufferedoutputstream.write(abyte0);
        bufferedoutputstream.close();
        fileoutputstream.close();
        return;
        abyte0;
        file.delete();
        throw abyte0;
        file;
        bufferedoutputstream.close();
        fileoutputstream.close();
        throw file;
    }

}
