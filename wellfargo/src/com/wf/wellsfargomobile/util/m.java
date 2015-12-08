// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.graphics.Bitmap;
import android.util.Base64;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

public class m
{

    public static Bitmap a(Bitmap bitmap, int i)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap.getWidth() != i)
        {
            int j = (int)Math.floor(((double)i / (double)bitmap.getWidth()) * (double)bitmap.getHeight());
            try
            {
                bitmap1 = Bitmap.createScaledBitmap(bitmap, i, j, false);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                return bitmap;
            }
        }
        return bitmap1;
    }

    public static String a(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 2);
    }

    public static void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        bitmap.eraseColor(0xff000000);
        bitmap.recycle();
        return;
        bitmap;
    }

    public static byte[] a(Image image, com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype)
    {
        image.setImageMimeType(imagemimetype);
        image.imageWriteToFileBuffer();
_L2:
        image = image.getImageFileBuffer();
        imagemimetype = new byte[image.capacity()];
        image.get(imagemimetype);
        return imagemimetype;
        imagemimetype;
        if (imagemimetype.getErrorInfo().getErr() != ErrorInfo.KMC_ED_ALREADY_BUFFERED.getErr())
        {
            throw imagemimetype;
        }
        continue; /* Loop/switch isn't completed */
        imagemimetype;
        if (imagemimetype.getErrorInfo().getErr() != ErrorInfo.KMC_ED_ALREADY_BUFFERED.getErr())
        {
            throw imagemimetype;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static byte[] a(File file)
    {
        file = new RandomAccessFile(file, "r");
        long l = file.length();
        int i;
        i = (int)l;
        if ((long)i == l)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        throw new IOException("File size >= 2 GB");
        Exception exception;
        exception;
        file.close();
        throw exception;
        byte abyte0[];
        abyte0 = new byte[i];
        file.readFully(abyte0);
        file.close();
        return abyte0;
    }

    public static byte[] a(String s)
    {
        return a(new File(s));
    }

    public static void b(byte abyte0[])
    {
        c(abyte0);
    }

    protected static void c(byte abyte0[])
    {
        if (abyte0 != null)
        {
            for (int i = 0; i < abyte0.length; i++)
            {
                abyte0[i] = 0;
            }

        }
    }
}
