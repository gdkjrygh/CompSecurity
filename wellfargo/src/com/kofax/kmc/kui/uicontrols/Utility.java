// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Log;
import java.io.ByteArrayOutputStream;

public final class Utility
{

    public static final String HTC_ONE_MAX = "HTC One max";
    public static final String LENOVO_YOGA = "B8000-F";
    public static final String LG_G3 = "LG-D850";
    public static final String LG_OPTIMUS_G = "LG-E970";
    public static final String LG_OPTIMUS_G_PRO = "LG-E980";
    public static final String MOTO_G_1034 = "XT1034";
    public static final String MOTO_G_MODEL = "XT1032";
    public static final String SAMSUNG = "samsung";
    public static final String SAMSUNG_GALAXY_S5 = "SAMSUNG-SM-G900A";
    public static final String SAMSUNG_MEGA_1 = "GT-I9205";
    public static final String SAMSUNG_MEGA_2 = "GT-I9200";
    public static final String SAMSUNG_MEGA_3 = "GT-I9152";
    public static final String SAMSUNG_MEGA_4 = "GT-I9150";
    public static final String SAMSUNG_NOTE_3 = "SAMSUNG-SM-N900V";
    public static final String SAMSUNG_S4 = "GT-I9505G";
    public static final String SAMSUNG_S4_MINI = "GT-I9195";
    public static final String SONY_XPERIA_TL = "LT30at";
    public static final String SONY_XPERIA_Z = "c6806_GPe";
    private static final String a = "Utility";

    public Utility()
    {
    }

    public static Bitmap Rotate(Bitmap bitmap, float f)
    {
        if (f == 0.0F)
        {
            return bitmap;
        }
        Object obj;
        try
        {
            obj = new Matrix();
            ((Matrix) (obj)).postRotate(f);
            obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            System.gc();
            Log.e("Utility", bitmap.toString());
            bitmap.printStackTrace();
            if (false)
            {
                throw new NullPointerException();
            } else
            {
                throw bitmap;
            }
        }
        bitmap.recycle();
        System.gc();
        return ((Bitmap) (obj));
    }

    public static Bitmap Rotate(byte abyte0[], float f)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = null;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return Rotate(BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options), f);
    }

    public static Bitmap imageDataToBitmap(byte abyte0[], int i, int j, int k, int l)
    {
        byte abyte1[] = abyte0;
        if (k == 17)
        {
            abyte1 = new ByteArrayOutputStream();
            (new YuvImage(abyte0, 17, i, j, null)).compressToJpeg(new Rect(0, 0, i, j), 90, abyte1);
            abyte1 = abyte1.toByteArray();
        }
        if (l != 0)
        {
            return Rotate(abyte1, l);
        } else
        {
            return BitmapFactory.decodeByteArray(abyte1, 0, abyte1.length);
        }
    }
}
