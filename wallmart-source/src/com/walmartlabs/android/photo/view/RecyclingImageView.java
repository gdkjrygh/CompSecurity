// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;

// Referenced classes of package com.walmartlabs.android.photo.view:
//            RecyclingBitmapDrawable

public class RecyclingImageView extends ImageView
{

    private boolean mClearDrawableOnDetach;

    public RecyclingImageView(Context context)
    {
        super(context);
    }

    public RecyclingImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void notifyDrawable(Drawable drawable, boolean flag)
    {
        if (!(drawable instanceof RecyclingBitmapDrawable)) goto _L2; else goto _L1
_L1:
        ((RecyclingBitmapDrawable)drawable).setIsDisplayed(flag);
_L4:
        return;
_L2:
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int i = 0;
            int j = drawable.getNumberOfLayers();
            while (i < j) 
            {
                notifyDrawable(drawable.getDrawable(i), flag);
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDetachedFromWindow()
    {
        if (mClearDrawableOnDetach)
        {
            setImageDrawable(null);
        }
        super.onDetachedFromWindow();
    }

    public void setClearDrawableOnDetach(boolean flag)
    {
        mClearDrawableOnDetach = flag;
    }

    public void setImageDrawable(Drawable drawable)
    {
        if (drawable instanceof RecyclingBitmapDrawable)
        {
            ((RecyclingBitmapDrawable)drawable).setTargetDensity(getContext().getResources().getDisplayMetrics().densityDpi);
        }
        Drawable drawable1 = getDrawable();
        super.setImageDrawable(drawable);
        notifyDrawable(drawable, true);
        notifyDrawable(drawable1, false);
    }
}
