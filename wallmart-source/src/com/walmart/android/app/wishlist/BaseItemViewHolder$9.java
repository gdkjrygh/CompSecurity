// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;


// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemViewHolder

class stener extends io.codetail.animation.eAnimatorListener
{

    final BaseItemViewHolder this$0;
    final Runnable val$endAction;

    public void onAnimationEnd()
    {
        if (val$endAction != null)
        {
            val$endAction.run();
        }
    }

    stener()
    {
        this$0 = final_baseitemviewholder;
        val$endAction = Runnable.this;
        super();
    }
}
