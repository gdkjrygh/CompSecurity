// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;


// Referenced classes of package com.contextlogic.wish.googleplus:
//            GooglePlusManager

class lletClientCallback
    implements com.contextlogic.wish.api.service.llback
{

    final GooglePlusManager this$0;
    final lletClientCallback val$callback;

    public void onServiceFailed()
    {
        if (val$callback != null)
        {
            val$callback.onWalletClientLoadFailed(413);
        }
        clearWalletClientCallback();
    }

    lletClientCallback()
    {
        this$0 = final_googleplusmanager;
        val$callback = lletClientCallback.this;
        super();
    }
}
