// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.image;

import com.walmartlabs.android.photo.util.PhotoLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class ImageUtils
{

    private static final String TAG = com/walmartlabs/android/photo/util/image/ImageUtils.getSimpleName();

    public ImageUtils()
    {
    }

    public static boolean isNotJpeg(File file)
    {
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        flag1 = true;
        flag = flag2;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        flag = flag2;
        if (!file.canRead())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = null;
        obj1 = null;
        file = new FileInputStream(file);
        flag = flag1;
        int i;
        if (file.read() != 255)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        i = file.read();
        if (i != 216)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        IOUtils.closeQuietly(file);
        return flag;
        obj;
        file = ((File) (obj1));
        obj1 = obj;
_L4:
        obj = file;
        PhotoLogger.get().w(TAG, (new StringBuilder()).append("Failed to read first bytes from file (IOException: ").append(((IOException) (obj1)).getMessage()).append(")").toString());
        IOUtils.closeQuietly(file);
        return true;
        file;
_L2:
        IOUtils.closeQuietly(((InputStream) (obj)));
        throw file;
        obj1;
        obj = file;
        file = ((File) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean isNotJpeg(String s)
    {
        return isNotJpeg(new File(s));
    }

}
