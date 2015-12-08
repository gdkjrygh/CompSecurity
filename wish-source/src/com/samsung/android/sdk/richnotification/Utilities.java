// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class Utilities
{

    private static int $SWITCH_TABLE$android$graphics$Bitmap$CompressFormat[];
    private static final Uri CONTENT_URI;
    public static final String DB_KEY_EXPIRY_TIME = "expiry_time";
    public static final String DB_KEY_HASH = "hash";
    public static final String DB_KEY_IMAGE = "image";
    public static final String DB_KEY_IMAGE_NAME = "name";
    public static final String DB_KEY_IMAGE_TYPE = "image_type";
    public static final String DB_KEY_PACKAGE_NAME = "package_name";
    private static final Uri IMAGE_CONTENT_URI;
    public static final String IMAGE_TYPE_JPEG = "jpg";
    public static final String IMAGE_TYPE_PNG = "png";
    private static final Uri STATIC_IMAGE_CONTENT_URI;
    public static final String STATIC_QUERY_PARAMETER_KEY = "updated";
    private static final String TAG = "Utilities";

    static int[] $SWITCH_TABLE$android$graphics$Bitmap$CompressFormat()
    {
        int ai[] = $SWITCH_TABLE$android$graphics$Bitmap$CompressFormat;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[android.graphics.Bitmap.CompressFormat.values().length];
        try
        {
            ai[android.graphics.Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[android.graphics.Bitmap.CompressFormat.PNG.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[android.graphics.Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$android$graphics$Bitmap$CompressFormat = ai;
        return ai;
    }

    private Utilities()
    {
    }

    private static byte[] convertResizedBinary(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat)
    {
        Bitmap bitmap1;
        ByteArrayOutputStream bytearrayoutputstream;
        bitmap1 = bitmap;
        if (bitmap.getWidth() > 360 || bitmap.getHeight() > 480)
        {
            float f = Math.min(360F / (float)bitmap.getWidth(), 480F / (float)bitmap.getHeight());
            bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)((float)bitmap.getWidth() * f), (int)((float)bitmap.getHeight() * f), false);
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap1.compress(compressformat, 90, bytearrayoutputstream);
        compressformat = bytearrayoutputstream.toByteArray();
        if (bitmap1 != bitmap)
        {
            bitmap1.recycle();
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return compressformat;
        }
        return compressformat;
        compressformat;
        if (bitmap1 != bitmap)
        {
            bitmap1.recycle();
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap) { }
        throw compressformat;
    }

    public static Bitmap drawableToBitmap(Drawable drawable)
    {
        if (drawable instanceof BitmapDrawable)
        {
            return Bitmap.createBitmap(((BitmapDrawable)drawable).getBitmap());
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        }
    }

    public static String makeHash(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(abyte0);
            abyte0 = (new BigInteger(1, messagedigest.digest())).toString(16);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new UnsupportedOperationException();
        }
        return abyte0;
    }

    public static Uri toUri(Context context, String s, Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, boolean flag)
    {
        ContentValues contentvalues;
        bitmap = convertResizedBinary(bitmap, compressformat);
        contentvalues = new ContentValues();
        if (flag)
        {
            contentvalues.put("name", s);
            s = STATIC_IMAGE_CONTENT_URI;
        } else
        {
            contentvalues.put("hash", makeHash(bitmap));
            s = IMAGE_CONTENT_URI;
        }
        contentvalues.put("package_name", context.getPackageName());
        contentvalues.put("image", bitmap);
        $SWITCH_TABLE$android$graphics$Bitmap$CompressFormat()[compressformat.ordinal()];
        JVM INSTR tableswitch 1 1: default 76
    //                   1 114;
           goto _L1 _L2
_L1:
        contentvalues.put("image_type", "png");
_L4:
        return context.getContentResolver().insert(s, contentvalues);
_L2:
        contentvalues.put("image_type", "jpg");
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        CONTENT_URI = Uri.parse("content://com.samsung.accessory.goproviders.sanotificationservice.rich_notification");
        IMAGE_CONTENT_URI = Uri.withAppendedPath(CONTENT_URI, "image");
        STATIC_IMAGE_CONTENT_URI = Uri.withAppendedPath(CONTENT_URI, "static_image");
    }
}
