// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import com.mixpanel.android.util.ActivityImageUtils;
import com.mixpanel.android.util.StackBlurManager;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            BackgroundCapture

private static class mCalculatedHighlightColor extends AsyncTask
{

    private int mCalculatedHighlightColor;
    private final stener mListener;
    private final Activity mParentActivity;
    private Bitmap mSourceImage;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        if (mSourceImage != null)
        {
            try
            {
                StackBlurManager.process(mSourceImage, 20);
                (new Canvas(mSourceImage)).drawColor(BackgroundCapture.access$0(), android.graphics.);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                mSourceImage = null;
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                mSourceImage = null;
                return null;
            }
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        mListener.onBackgroundCaptured(mSourceImage, mCalculatedHighlightColor);
    }

    protected void onPreExecute()
    {
        mSourceImage = ActivityImageUtils.getScaledScreenshot(mParentActivity, 2, 2, true);
        mCalculatedHighlightColor = ActivityImageUtils.getHighlightColorFromBitmap(mSourceImage);
    }

    public stener(Activity activity, stener stener)
    {
        mParentActivity = activity;
        mListener = stener;
        mCalculatedHighlightColor = 0xff000000;
    }
}
