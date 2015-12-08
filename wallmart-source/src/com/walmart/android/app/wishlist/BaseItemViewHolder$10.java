// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemViewHolder

class val.endAction
    implements Runnable
{

    final BaseItemViewHolder this$0;
    final Runnable val$endAction;

    public void run()
    {
        mRegularContainer.setVisibility(4);
        if (val$endAction != null)
        {
            val$endAction.run();
        }
    }

    ()
    {
        this$0 = final_baseitemviewholder;
        val$endAction = Runnable.this;
        super();
    }
}
