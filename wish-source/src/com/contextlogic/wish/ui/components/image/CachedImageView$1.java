// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.image;


// Referenced classes of package com.contextlogic.wish.ui.components.image:
//            CachedImageView, SafeTouchImageView

class 
    implements com.ortiz.touch.ouchImageViewListener
{

    final CachedImageView this$0;
    final SafeTouchImageView val$touchImageView;

    public void onMove()
    {
        CachedImageView.access$000(CachedImageView.this, val$touchImageView.isZoomed());
    }

    ()
    {
        this$0 = final_cachedimageview;
        val$touchImageView = SafeTouchImageView.this;
        super();
    }
}
