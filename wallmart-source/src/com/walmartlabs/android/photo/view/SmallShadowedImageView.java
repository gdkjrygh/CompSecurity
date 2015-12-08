// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

// Referenced classes of package com.walmartlabs.android.photo.view:
//            ShadowedImageView

public class SmallShadowedImageView extends ShadowedImageView
{

    public SmallShadowedImageView(Context context)
    {
        super(context);
    }

    public SmallShadowedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected int getBottomShadowSize()
    {
        return getContext().getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_single_image_shadow_bottom) / 2;
    }

    protected int getRightShadowSize()
    {
        return getContext().getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_single_image_shadow_side) / 2;
    }
}
