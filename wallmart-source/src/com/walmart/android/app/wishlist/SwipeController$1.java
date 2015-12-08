// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SwipeController

class ener extends android.support.v7.widget.ollListener
{

    final SwipeController this$0;

    public void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        boolean flag = true;
        recyclerview = SwipeController.this;
        if (i == 1)
        {
            flag = false;
        }
        SwipeController.access$002(recyclerview, flag);
    }

    ener()
    {
        this$0 = SwipeController.this;
        super();
    }
}
