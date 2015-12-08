// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.content.Context;
import android.graphics.Bitmap;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.util:
//            PhotoLogger, PhotoUtils

public class PhotoSamplingUtils
{

    private static final String TAG = com/walmartlabs/android/photo/util/PhotoSamplingUtils.getSimpleName();

    public PhotoSamplingUtils()
    {
    }

    public static String downsample(Context context, DevicePhoto devicephoto, int i, int j)
    {
        long l = System.currentTimeMillis();
        int ai[] = devicephoto.getDimensions(context);
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("downsample(): [Before] ").append(ai[0]).append("x").append(ai[1]).append(" - ").append(devicephoto.getSize()).toString());
        Bitmap bitmap = PhotoUtils.decodeSampledBitmap(devicephoto.getLocation(), i, j);
        context = new File(context.getDir("photo_temp", 0), (new StringBuilder()).append("downsampled_").append(devicephoto.getName()).toString());
        recompressToJPEG(bitmap, context);
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("downsample(): [After] ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append(" - ").append(context.length()).append(" (").append(System.currentTimeMillis() - l).append("ms)").toString());
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("downsample(): [File] ").append(context.getAbsolutePath()).toString());
        return context.getAbsolutePath();
    }

    public static String downsampleToMinDpi(Context context, PhotoSpecification photospecification, int i)
    {
        int l = 0;
        int j = 0;
        for (Iterator iterator = photospecification.getProductConfigurations().iterator(); iterator.hasNext();)
        {
            ProductConfiguration productconfiguration = (ProductConfiguration)iterator.next();
            int j1 = productconfiguration.getProduct().getWidth();
            int i1 = productconfiguration.getProduct().getHeight();
            int k = l;
            if (j1 > l)
            {
                k = j1;
            }
            l = j;
            if (i1 > j)
            {
                l = i1;
            }
            j = l;
            l = k;
        }

        return downsample(context, photospecification.getPhoto(), l * i, j * i);
    }

    private static void recompressToJPEG(Bitmap bitmap, File file)
    {
        try
        {
            file = new FileOutputStream(file);
            BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(file, 0x10000);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, bufferedoutputstream);
            bufferedoutputstream.flush();
            bufferedoutputstream.close();
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return;
        }
    }

}
