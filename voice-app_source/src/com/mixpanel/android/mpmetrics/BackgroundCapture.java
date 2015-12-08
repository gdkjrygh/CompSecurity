// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.AsyncTask;
import com.mixpanel.android.util.ActivityImageUtils;
import com.mixpanel.android.util.StackBlurManager;

class BackgroundCapture
{
    private static class BackgroundCaptureTask extends AsyncTask
    {

        private int mCalculatedHighlightColor;
        private final OnBackgroundCapturedListener mListener;
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
                    (new Canvas(mSourceImage)).drawColor(BackgroundCapture.GRAY_72PERCENT_OPAQUE, android.graphics.PorterDuff.Mode.SRC_ATOP);
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

        public BackgroundCaptureTask(Activity activity, OnBackgroundCapturedListener onbackgroundcapturedlistener)
        {
            mParentActivity = activity;
            mListener = onbackgroundcapturedlistener;
            mCalculatedHighlightColor = 0xff000000;
        }
    }

    public static interface OnBackgroundCapturedListener
    {

        public abstract void onBackgroundCaptured(Bitmap bitmap, int i);
    }


    private static final int GRAY_72PERCENT_OPAQUE = Color.argb(186, 28, 28, 28);
    private static final String LOGTAG = "MixpanelAPI.BackgroundCapture";

    BackgroundCapture()
    {
    }

    public static void captureBackground(final Activity parentActivity, final OnBackgroundCapturedListener listener)
    {
        parentActivity.runOnUiThread(new Runnable() {

            private final OnBackgroundCapturedListener val$listener;
            private final Activity val$parentActivity;

            public void run()
            {
                (new BackgroundCaptureTask(parentActivity, listener)).execute(new Void[0]);
            }

            
            {
                parentActivity = activity;
                listener = onbackgroundcapturedlistener;
                super();
            }
        });
    }


}
