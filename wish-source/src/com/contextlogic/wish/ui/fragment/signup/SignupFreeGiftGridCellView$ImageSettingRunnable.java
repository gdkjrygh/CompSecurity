// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupFreeGiftGridCellView

private class cancelled
    implements Runnable
{

    private boolean cancelled;
    private String imageUrl;
    final SignupFreeGiftGridCellView this$0;

    public void markCancelled()
    {
        cancelled = true;
    }

    public void run()
    {
        if (!cancelled)
        {
            SignupFreeGiftGridCellView.access$000(SignupFreeGiftGridCellView.this).getImageView().setImageUrl(imageUrl);
        }
    }

    public (String s)
    {
        this$0 = SignupFreeGiftGridCellView.this;
        super();
        imageUrl = s;
        cancelled = false;
    }
}
