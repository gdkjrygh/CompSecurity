// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.view.ViewTreeObserver;

// Referenced classes of package com.walmartlabs.ui:
//            ZoomableImageView

class this._cls0
    implements android.view.lobalLayoutListener
{

    final ZoomableImageView this$0;

    public void onGlobalLayout()
    {
        if (getWidth() != ZoomableImageView.access$200(ZoomableImageView.this))
        {
            ZoomableImageView.access$300(ZoomableImageView.this);
            ZoomableImageView.access$202(ZoomableImageView.this, getWidth());
            getViewTreeObserver().removeGlobalOnLayoutListener(ZoomableImageView.access$400(ZoomableImageView.this));
            ZoomableImageView.access$402(ZoomableImageView.this, null);
        }
    }

    ayoutListener()
    {
        this$0 = ZoomableImageView.this;
        super();
    }
}
