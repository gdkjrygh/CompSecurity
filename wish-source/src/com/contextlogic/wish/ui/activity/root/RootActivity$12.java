// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;


// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class val.variationId
    implements Runnable
{

    final RootActivity this$0;
    final String val$productId;
    final String val$variationId;

    public void run()
    {
        showCart(val$productId, val$variationId, null);
    }

    ()
    {
        this$0 = final_rootactivity;
        val$productId = s;
        val$variationId = String.this;
        super();
    }
}
