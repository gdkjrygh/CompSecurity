// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;


// Referenced classes of package io.theholygrail.dingo.navigation:
//            NavigationBridge, NavigationBridgeCallback

class val.options
    implements Runnable
{

    final NavigationBridge this$0;
    final String val$options;

    public void run()
    {
        mCallback.animateForward(val$options);
    }

    lback()
    {
        this$0 = final_navigationbridge;
        val$options = String.this;
        super();
    }
}
