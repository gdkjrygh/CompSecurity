// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.Crop;
import com.walmartlabs.android.photo.model.products.PhotoProduct;

// Referenced classes of package com.walmartlabs.android.photo.util:
//            PhotoLogger

public class PhotoUtils
{

    private static final long SHORT_FADE_DURATION = 500L;
    private static final String TAG = com/walmartlabs/android/photo/util/PhotoUtils.getSimpleName();

    public PhotoUtils()
    {
    }

    public static void backoff(int i)
    {
        long l;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        l = (int)Math.pow(2D, i - 1) * 1000;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("backoff(").append(i).append("): Sleeping ").append(l).append(" ms").toString());
        Thread.sleep(l);
        return;
        InterruptedException interruptedexception;
        interruptedexception;
    }

    public static long backoffTime(int i)
    {
        if (i > 0)
        {
            return (long)((int)Math.pow(2D, i - 1) * 1000);
        } else
        {
            return 0L;
        }
    }

    public static int calculateSampleSize(int i, int j, int k, int l)
    {
label0:
        {
            boolean flag1 = true;
            boolean flag = true;
            int j1 = k;
            int i1 = l;
            if (i < j)
            {
                PhotoLogger.get().d(TAG, "Original bitmap is portrait mode, switch min dimensions to compare long and short edges correctly (min numbers are assumed to be landscape orientation.");
                i1 = k;
                j1 = l;
            }
            if (j <= i1)
            {
                k = ((flag1) ? 1 : 0);
                if (i <= j1)
                {
                    break label0;
                }
            }
            j /= 2;
            l = i / 2;
            i = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (j / i <= i1)
                {
                    break;
                }
                k = i;
                if (l / i <= j1)
                {
                    break;
                }
                i *= 2;
            } while (true);
        }
        return k;
    }

    public static boolean canAnimate()
    {
        return android.os.Build.VERSION.SDK_INT >= 12;
    }

    public static Bitmap decodeSampledBitmap(String s, int i, int j)
    {
        Bitmap bitmap;
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        options.inSampleSize = calculateSampleSize(options.outWidth, options.outHeight, i, j);
        options.inJustDecodeBounds = false;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Downsampling by factor: ").append(options.inSampleSize).toString());
        bitmap = null;
_L2:
        Bitmap bitmap1;
        bitmap1 = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        bitmap1 = bitmap;
        if (options.inSampleSize > 16)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        bitmap1 = BitmapFactory.decodeFile(s, options);
        bitmap = bitmap1;
        if (bitmap1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        bitmap = bitmap1;
        PhotoLogger.get().w(TAG, "Failed to decode bitmap (not OOM-related), return null");
        return bitmap1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        options.inSampleSize = options.inSampleSize * 2;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("OOM, increasing sampling interval, now: ").append(options.inSampleSize).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void fadeInView(View view)
    {
label0:
        {
            if (view != null && view.getVisibility() != 0)
            {
                if (!canAnimate())
                {
                    break label0;
                }
                view.setAlpha(0.0F);
                view.setVisibility(0);
                view.animate().alpha(1.0F).setDuration(500L).setListener(null);
            }
            return;
        }
        view.setVisibility(0);
    }

    public static void fadeOutView(View view)
    {
label0:
        {
            if (view != null && view.getVisibility() == 0)
            {
                if (!canAnimate())
                {
                    break label0;
                }
                view.animate().alpha(0.0F).setDuration(500L).setListener(new AnimatorListenerAdapter(view) {

                    final View val$view;

                    public void onAnimationEnd(Animator animator)
                    {
                        view.setVisibility(4);
                    }

            
            {
                view = view1;
                super();
            }
                });
            }
            return;
        }
        view.setVisibility(4);
    }

    public static int getProjectedDpi(DevicePhoto devicephoto, PhotoProduct photoproduct, Crop crop)
    {
        if (devicephoto == null || photoproduct == null)
        {
            return 0;
        }
        if (devicephoto.getWidth() == 0 || devicephoto.getHeight() == 0)
        {
            return 0;
        }
        int j = Math.max(devicephoto.getWidth(), devicephoto.getHeight());
        int i = Math.min(devicephoto.getWidth(), devicephoto.getHeight());
        if (crop != null)
        {
            i = (int)((float)devicephoto.getWidth() * (crop.getRight() - crop.getLeft()));
            int k = (int)((float)devicephoto.getWidth() * (crop.getBottom() - crop.getTop()));
            j = Math.max(i, k);
            i = Math.min(i, k);
        }
        i = (int)Math.min((double)j / (double)photoproduct.getWidth(), (double)i / (double)photoproduct.getHeight());
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Projected DPI for ").append(devicephoto.getName()).append(": ").append(i).toString());
        return i;
    }

    public static boolean hasDataConnectivity(Context context)
    {
        Object obj = (ConnectivityManager)context.getSystemService("connectivity");
        context = ((ConnectivityManager) (obj)).getNetworkInfo(1);
        obj = ((ConnectivityManager) (obj)).getNetworkInfo(0);
        return context != null && context.isConnected() || obj != null && ((NetworkInfo) (obj)).isConnected();
    }

    public static boolean needToRecycleBitmaps()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    public static boolean onMainThread()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean resolutionOk(DevicePhoto devicephoto, PhotoProduct photoproduct, Crop crop)
    {
        if (devicephoto != null && photoproduct != null)
        {
            if (devicephoto.getWidth() == 0 || devicephoto.getHeight() == 0)
            {
                PhotoLogger.get().d(TAG, "resolutionOk(): Photo had no dimensions loaded, will return true!");
                return true;
            }
            int j = Math.max(devicephoto.getWidth(), devicephoto.getHeight());
            int i = Math.min(devicephoto.getWidth(), devicephoto.getHeight());
            if (crop != null)
            {
                i = (int)((float)devicephoto.getWidth() * (crop.getRight() - crop.getLeft()));
                int k = (int)((float)devicephoto.getHeight() * (crop.getBottom() - crop.getTop()));
                j = Math.max(i, k);
                i = Math.min(i, k);
            }
            int l = Math.max(photoproduct.getMinimumWidthPixels(), photoproduct.getMinimumHeightPixels());
            int i1 = Math.min(photoproduct.getMinimumWidthPixels(), photoproduct.getMinimumHeightPixels());
            if (j >= l && i >= i1)
            {
                return true;
            }
        }
        return false;
    }

}
