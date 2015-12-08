// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.upload;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.service.order.OrderProgress;
import com.walmartlabs.android.photo.util.DeviceUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.util.RefreshTimer;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettings;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettingsUtils;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;

public class UploadProgressView extends RelativeLayout
{
    public static interface UploadProgressViewListener
    {

        public abstract void onCancelClick();

        public abstract void onRetryClick();
    }


    private static final int MIN_SCREEN_HEIGHT_DP_FOR_PHOTO_STACK = 540;
    private static final int STATUS_LAYOUTS[];
    private BitmapLoadTask mBitmapLoadTask;
    private boolean mDestroyed;
    private UploadProgressViewListener mListener;
    private RelativeLayout mPhotoStack;
    private String mProgressIndicatorString;
    private TextView mSendingTextView;
    private int mStackImageSize;
    private RefreshTimer mTimer;

    public UploadProgressView(Context context)
    {
        super(context);
        mProgressIndicatorString = "";
    }

    public UploadProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mProgressIndicatorString = "";
    }

    private void onModelChanged(OrderProgress orderprogress)
    {
        if (orderprogress.uploadsCancelled())
        {
            setResult(com.walmartlabs.android.photo.R.string.photo_order_cancelled, com.walmartlabs.android.photo.R.string.photo_tap_done_to_exit);
        } else
        if (orderprogress.orderDone())
        {
            if (orderprogress.orderSuccessful())
            {
                setResult(com.walmartlabs.android.photo.R.string.photo_thank_you, com.walmartlabs.android.photo.R.string.photo_look_for_your_order_email);
            } else
            {
                String s1 = getContext().getString(com.walmartlabs.android.photo.R.string.photo_order_failed);
                String s;
                if (orderprogress.uploadsSuccessful())
                {
                    s = "";
                } else
                {
                    s = orderprogress.getUploadsFailureDisplayReason();
                }
                setResult(s1, s);
            }
        } else
        if (orderprogress.uploadsDone())
        {
            setSending();
        } else
        {
            setUploading(orderprogress.currentProgress(), orderprogress.currentMax(), orderprogress.totalProgress(), orderprogress.totalMax());
        }
        if (PhotoDebugSettingsUtils.isDebugMode(getContext()) && PhotoDebugSettings.get(getContext()).displayUploadSpeed())
        {
            ((TextView)findViewById(com.walmartlabs.android.photo.R.id.upload_speed)).setVisibility(0);
            ((TextView)findViewById(com.walmartlabs.android.photo.R.id.upload_speed)).setText((new StringBuilder()).append("Last upload: ").append(orderprogress.getUploadSpeed()).append(" KB/s").toString());
        }
    }

    private void setButtonEnabled(boolean flag)
    {
        if (flag)
        {
            PhotoUtils.fadeInView(findViewById(com.walmartlabs.android.photo.R.id.button_layout));
            return;
        } else
        {
            PhotoUtils.fadeOutView(findViewById(com.walmartlabs.android.photo.R.id.button_layout));
            return;
        }
    }

    private void setButtonText(int i)
    {
        ((Button)findViewById(com.walmartlabs.android.photo.R.id.button)).setText(i);
    }

    private void setProgressEnabled(boolean flag)
    {
        if (flag)
        {
            PhotoUtils.fadeInView(findViewById(com.walmartlabs.android.photo.R.id.progress));
            return;
        } else
        {
            PhotoUtils.fadeOutView(findViewById(com.walmartlabs.android.photo.R.id.progress));
            return;
        }
    }

    private void setResult(int i, int j)
    {
        setResult(getContext().getString(i), getContext().getString(j));
    }

    private void setResult(String s, String s1)
    {
        switchToLayout(com.walmartlabs.android.photo.R.id.result_layout);
        setButtonEnabled(false);
        setProgressEnabled(false);
        ((TextView)findViewById(com.walmartlabs.android.photo.R.id.result_main)).setText(s);
        ((TextView)findViewById(com.walmartlabs.android.photo.R.id.result_aux)).setText(s1);
    }

    private void setRetry(String s, String s1)
    {
        switchToLayout(com.walmartlabs.android.photo.R.id.retry_layout);
        setProgressEnabled(false);
        setButtonEnabled(true);
        setButtonText(com.walmartlabs.android.photo.R.string.photo_retry_order);
        ((TextView)findViewById(com.walmartlabs.android.photo.R.id.retry_main)).setText(s);
        ((TextView)findViewById(com.walmartlabs.android.photo.R.id.retry_aux)).setText(s1);
    }

    private void setSending()
    {
        switchToLayout(com.walmartlabs.android.photo.R.id.sending_layout);
        setProgressEnabled(false);
        setButtonEnabled(false);
    }

    private void setUploading(long l, long l1, int i, int j)
    {
        switchToLayout(com.walmartlabs.android.photo.R.id.uploading_layout);
        setProgressEnabled(true);
        setButtonEnabled(true);
        setButtonText(com.walmartlabs.android.photo.R.string.photo_cancel_order);
        ProgressBar progressbar = (ProgressBar)findViewById(com.walmartlabs.android.photo.R.id.total);
        if (i < j)
        {
            progressbar.setProgress(i * 100 + (int)(((double)l / (double)l1) * 100D));
            progressbar.setMax(j * 100);
            setUploadingText(i + 1, j);
            return;
        } else
        {
            progressbar.setProgress(j * 100);
            progressbar.setMax(j * 100);
            setUploadingText(i, j);
            return;
        }
    }

    private void setUploadingText(int i, int j)
    {
        ((TextView)findViewById(com.walmartlabs.android.photo.R.id.upload_text)).setText((new StringBuilder()).append(getContext().getString(com.walmartlabs.android.photo.R.string.photo_uploading)).append(" ").append(i).append(" ").append(getContext().getString(com.walmartlabs.android.photo.R.string.photo_of)).append(" ").append(j).toString());
    }

    private void switchToLayout(int i)
    {
        for (int j = 0; j < STATUS_LAYOUTS.length; j++)
        {
            if (STATUS_LAYOUTS[j] != i)
            {
                PhotoUtils.fadeOutView(findViewById(STATUS_LAYOUTS[j]));
            }
        }

        PhotoUtils.fadeInView(findViewById(i));
    }

    private void unsetAndRecycleBitmap(ImageView imageview)
    {
        Object obj;
        if (imageview != null)
        {
            obj = imageview.getDrawable();
        } else
        {
            obj = null;
        }
        if (obj instanceof BitmapDrawable)
        {
            obj = ((BitmapDrawable)obj).getBitmap();
            if (obj != null)
            {
                PhotoLogger.get().d("UploadProgressView", "Unsetting and recyling bitmap");
                imageview.setImageBitmap(null);
                if (!((Bitmap) (obj)).isRecycled())
                {
                    ((Bitmap) (obj)).recycle();
                }
            }
        }
    }

    public void addPhotoToStack(DevicePhoto devicephoto, final int count)
    {
        if (devicephoto != null && mPhotoStack != null && mPhotoStack.getVisibility() == 0)
        {
            mBitmapLoadTask = new BitmapLoadTask(getContext(), 0, new com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback() {

                final UploadProgressView this$0;
                final int val$count;

                public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
                {
                    if (mDestroyed || photodrawable == null || photodrawable.getBitmap() == null) goto _L2; else goto _L1
_L1:
                    float f;
                    int i;
                    f = 0.0F;
                    i = mPhotoStack.getChildCount();
                    count % 3;
                    JVM INSTR tableswitch 0 2: default 68
                //                               0 224
                //                               1 230
                //                               2 237;
                       goto _L3 _L4 _L5 _L6
_L3:
                    obj = (ImageView)LayoutInflater.from(getContext()).inflate(com.walmartlabs.android.photo.R.layout.photo_stack_item, mPhotoStack, false);
                    mPhotoStack.addView(((View) (obj)), mPhotoStack.getChildCount() - 1);
                    if (PhotoUtils.canAnimate())
                    {
                        ((ImageView) (obj)).setAlpha(0.0F);
                    }
                    ((ImageView) (obj)).setImageBitmap(photodrawable.getBitmap());
                    if (PhotoUtils.canAnimate())
                    {
                        ((ImageView) (obj)).animate().rotationBy(f).alpha(1.0F).setDuration(500L);
                    }
                    if (i - 1 > 5 && (mPhotoStack.getChildAt(0) instanceof ImageView))
                    {
                        photodrawable = (ImageView)mPhotoStack.getChildAt(0);
                        unsetAndRecycleBitmap(photodrawable);
                        mPhotoStack.removeView(photodrawable);
                    }
_L2:
                    return;
_L4:
                    f = 0.0F;
                    continue; /* Loop/switch isn't completed */
_L5:
                    f = -15F;
                    continue; /* Loop/switch isn't completed */
_L6:
                    f = 15F;
                    if (true) goto _L3; else goto _L7
_L7:
                }

                public void onTaskCancelled(Bitmap bitmap)
                {
                }

            
            {
                this$0 = UploadProgressView.this;
                count = i;
                super();
            }
            }) {

                final UploadProgressView this$0;

                protected PhotoDrawable onPostProcessInBackground(DevicePhoto devicephoto1, PhotoDrawable photodrawable)
                {
                    if (photodrawable != null && photodrawable.getBitmap() != null)
                    {
                        int k = 0;
                        int l = 0;
                        int j = photodrawable.getBitmap().getWidth();
                        int i = photodrawable.getBitmap().getHeight();
                        if (j > i)
                        {
                            k = j / 2 - i / 2;
                            j = i;
                        } else
                        {
                            l = i / 2 - j / 2;
                            i = j;
                        }
                        photodrawable = Bitmap.createBitmap(photodrawable.getBitmap(), k, l, j, i);
                        devicephoto1 = photodrawable;
                        if (photodrawable.getWidth() > mStackImageSize)
                        {
                            devicephoto1 = Bitmap.createScaledBitmap(photodrawable, mStackImageSize, mStackImageSize, true);
                            photodrawable.recycle();
                        }
                        return asDrawable(devicephoto1);
                    } else
                    {
                        return null;
                    }
                }

                protected boolean shouldCache()
                {
                    return false;
                }

            
            {
                this$0 = UploadProgressView.this;
                super(context, i, bitmaploadcallback);
            }
            };
            mBitmapLoadTask.execute(new DevicePhoto[] {
                devicephoto
            });
        }
    }

    public void notifyDestroy()
    {
        mDestroyed = true;
        mTimer.cancel();
        if (mBitmapLoadTask != null)
        {
            mBitmapLoadTask.cancel(true);
        }
        if (mPhotoStack != null)
        {
            for (int i = 0; i < mPhotoStack.getChildCount(); i++)
            {
                Object obj = mPhotoStack.getChildAt(0);
                if (obj instanceof ImageView)
                {
                    obj = (ImageView)obj;
                    unsetAndRecycleBitmap(((ImageView) (obj)));
                    mPhotoStack.removeView(((View) (obj)));
                }
            }

        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mPhotoStack = (RelativeLayout)findViewById(com.walmartlabs.android.photo.R.id.photo_stack);
        mStackImageSize = getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_upload_stack_item_size);
        final Button button = (Button)findViewById(com.walmartlabs.android.photo.R.id.button);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final UploadProgressView this$0;
            final Button val$button;

            public void onClick(View view)
            {
                if (mListener != null && button.getText().equals(getContext().getString(com.walmartlabs.android.photo.R.string.photo_cancel_order)))
                {
                    mListener.onCancelClick();
                } else
                if (mListener != null && button.getText().equals(getContext().getString(com.walmartlabs.android.photo.R.string.photo_retry_order)))
                {
                    mListener.onRetryClick();
                    return;
                }
            }

            
            {
                this$0 = UploadProgressView.this;
                button = button1;
                super();
            }
        });
        if (mPhotoStack != null && DeviceUtils.getScreenHeightDips(getContext()) < 540)
        {
            mPhotoStack.setVisibility(8);
        }
        mSendingTextView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.sending_aux);
        mTimer = new RefreshTimer(150L) {

            final UploadProgressView this$0;

            public void onRefresh()
            {
                mProgressIndicatorString = mProgressIndicatorString.concat(".");
                if (mProgressIndicatorString.length() > 3)
                {
                    mProgressIndicatorString = "";
                }
                mSendingTextView.setText(mProgressIndicatorString);
                mTimer.start();
            }

            
            {
                this$0 = UploadProgressView.this;
                super(l);
            }
        };
        mTimer.start();
    }

    public void reset()
    {
        setUploading(0L, 0L, 0, 0);
    }

    public void setModel(OrderProgress orderprogress)
    {
        if (orderprogress != null)
        {
            onModelChanged(orderprogress);
        }
    }

    public void setUploadProgressViewListener(UploadProgressViewListener uploadprogressviewlistener)
    {
        mListener = uploadprogressviewlistener;
    }

    static 
    {
        STATUS_LAYOUTS = (new int[] {
            com.walmartlabs.android.photo.R.id.uploading_layout, com.walmartlabs.android.photo.R.id.sending_layout, com.walmartlabs.android.photo.R.id.retry_layout, com.walmartlabs.android.photo.R.id.result_layout
        });
    }




/*
    static String access$102(UploadProgressView uploadprogressview, String s)
    {
        uploadprogressview.mProgressIndicatorString = s;
        return s;
    }

*/






}
