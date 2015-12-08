// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.view.PhotoDrawable;

public class CheckablePhotoView extends RelativeLayout
{
    public static interface PhotoViewListener
    {

        public abstract void onEnlargeClick();
    }


    private ImageView mEnlargeIcon;
    private PhotoViewListener mListener;
    private ImageView mPhoto;
    private View mSelectedOverlay;
    private ImageView mUnavailableOverlay;
    private ImageView mUnavailableWarning;

    public CheckablePhotoView(Context context)
    {
        super(context);
    }

    public CheckablePhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CheckablePhotoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean bitmapLoaded()
    {
        return mPhoto.getVisibility() == 0 && mPhoto.getDrawable() != null;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mPhoto = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.image);
        mUnavailableOverlay = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.unavailable_overlay);
        mUnavailableOverlay.setOnClickListener(new android.view.View.OnClickListener() {

            final CheckablePhotoView this$0;

            public void onClick(View view)
            {
                DialogFactory.createAlertDialog(getContext().getString(com.walmartlabs.android.photo.R.string.photo_corrupt_title), getContext().getString(com.walmartlabs.android.photo.R.string.photo_does_not_exist), getContext()).show();
            }

            
            {
                this$0 = CheckablePhotoView.this;
                super();
            }
        });
        mUnavailableWarning = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.unavailable_icon);
        mSelectedOverlay = findViewById(com.walmartlabs.android.photo.R.id.selected);
        mEnlargeIcon = (ImageView)findViewById(com.walmartlabs.android.photo.R.id.enlarge);
        mEnlargeIcon.setOnClickListener(new android.view.View.OnClickListener() {

            final CheckablePhotoView this$0;

            public void onClick(View view)
            {
                if (mListener != null)
                {
                    mListener.onEnlargeClick();
                }
            }

            
            {
                this$0 = CheckablePhotoView.this;
                super();
            }
        });
    }

    public void reset()
    {
        mPhoto.setVisibility(8);
        mUnavailableOverlay.setVisibility(8);
        mUnavailableWarning.setVisibility(8);
        mListener = null;
    }

    public void setChecked(boolean flag)
    {
        View view = mSelectedOverlay;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    public void setPhotoSource(PhotoDrawable photodrawable, boolean flag)
    {
        mPhoto.setImageDrawable(photodrawable);
        if (PhotoUtils.canAnimate() && !flag)
        {
            mPhoto.setAlpha(0.0F);
        }
        mPhoto.setVisibility(0);
        if (!PhotoUtils.canAnimate() || flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        mPhoto.animate().alpha(1.0F).setDuration(300L);
        return;
        photodrawable;
        mPhoto.setAlpha(1.0F);
        return;
    }

    public void setPhotoViewListener(PhotoViewListener photoviewlistener)
    {
        mListener = photoviewlistener;
    }

    public void setUnavailable(boolean flag)
    {
        byte byte0 = 8;
        ImageView imageview = mUnavailableOverlay;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        imageview = mUnavailableWarning;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        imageview = mEnlargeIcon;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        imageview.setVisibility(i);
    }

}
