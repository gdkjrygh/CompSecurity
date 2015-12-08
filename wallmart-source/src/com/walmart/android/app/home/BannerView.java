// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

// Referenced classes of package com.walmart.android.app.home:
//            OverscanImageView

public class BannerView extends RelativeLayout
    implements Target
{
    public static interface BitmapListener
    {

        public abstract void onBitmapLoaded(int i, int j);
    }


    private BitmapListener mBitmapListener;
    private OverscanImageView mImageView;
    private ProgressBar mProgressBar;

    public BannerView(Context context)
    {
        super(context);
    }

    public BannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private int getIndicatorColor(com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$squareup$picasso$Picasso$LoadedFrom[];

            static 
            {
                $SwitchMap$com$squareup$picasso$Picasso$LoadedFrom = new int[com.squareup.picasso.Picasso.LoadedFrom.values().length];
                try
                {
                    $SwitchMap$com$squareup$picasso$Picasso$LoadedFrom[com.squareup.picasso.Picasso.LoadedFrom.MEMORY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$squareup$picasso$Picasso$LoadedFrom[com.squareup.picasso.Picasso.LoadedFrom.DISK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$squareup$picasso$Picasso$LoadedFrom[com.squareup.picasso.Picasso.LoadedFrom.NETWORK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.squareup.picasso.Picasso.LoadedFrom[loadedfrom.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0xff00ff00;

        case 2: // '\002'
            return -256;

        case 3: // '\003'
            return 0xffff0000;
        }
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (bitmap != null && mBitmapListener != null)
        {
            mBitmapListener.onBitmapLoaded(bitmap.getWidth(), bitmap.getHeight());
        }
        mImageView.setImageBitmap(bitmap);
        ProgressBar progressbar = mProgressBar;
        byte byte0;
        if (bitmap != null)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        progressbar.setVisibility(byte0);
        if (Picasso.with(getContext()).areIndicatorsEnabled())
        {
            mImageView.setSourceIndicatorColor(getIndicatorColor(loadedfrom));
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mImageView = (OverscanImageView)findViewById(0x7f10004b);
        mProgressBar = (ProgressBar)findViewById(0x7f100096);
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    public void setBitmapListener(BitmapListener bitmaplistener)
    {
        mBitmapListener = bitmaplistener;
    }
}
