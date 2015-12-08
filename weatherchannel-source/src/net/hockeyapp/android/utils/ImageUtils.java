// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageUtils
{

    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 0;

    public ImageUtils()
    {
    }

    private static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        int l = 1;
        int k = 1;
        if (i1 > j || j1 > i)
        {
            i1 /= 2;
            j1 /= 2;
            do
            {
                l = k;
                if (i1 / k <= j)
                {
                    break;
                }
                l = k;
                if (j1 / k <= i)
                {
                    break;
                }
                k *= 2;
            } while (true);
        }
        return l;
    }

    public static Bitmap decodeSampledBitmap(Context context, Uri uri, int i, int j)
        throws IOException
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
        options.inSampleSize = calculateInSampleSize(options, i, j);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
    }

    public static Bitmap decodeSampledBitmap(File file, int i, int j)
        throws IOException
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i, j);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static int determineOrientation(Context context, Uri uri)
        throws IOException
    {
        Context context1 = null;
        context = context.getContentResolver().openInputStream(uri);
        context1 = context;
        int i = determineOrientation(((InputStream) (context)));
        if (context != null)
        {
            context.close();
        }
        return i;
        context;
        if (context1 != null)
        {
            context1.close();
        }
        throw context;
    }

    public static int determineOrientation(File file)
        throws IOException
    {
        Object obj = null;
        file = new FileInputStream(file);
        int i = determineOrientation(((InputStream) (file)));
        if (file != null)
        {
            file.close();
        }
        return i;
        Exception exception;
        exception;
        file = obj;
_L2:
        if (file != null)
        {
            file.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int determineOrientation(InputStream inputstream)
    {
        int i = 1;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputstream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1)
        {
            i = 0;
        } else
        if ((float)options.outWidth / (float)options.outHeight <= 1.0F)
        {
            return 0;
        }
        return i;
    }
}
