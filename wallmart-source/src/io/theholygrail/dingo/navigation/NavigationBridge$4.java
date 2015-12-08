// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;


// Referenced classes of package io.theholygrail.dingo.navigation:
//            NavigationBridge, NavigationBridgeCallback, NavigationOptions

class val.navigationOptions
    implements Runnable
{

    final NavigationBridge this$0;
    final NavigationOptions val$navigationOptions;

    public void run()
    {
        mCallback.presentModal(val$navigationOptions);
    }

    lback()
    {
        this$0 = final_navigationbridge;
        val$navigationOptions = NavigationOptions.this;
        super();
    }
}
