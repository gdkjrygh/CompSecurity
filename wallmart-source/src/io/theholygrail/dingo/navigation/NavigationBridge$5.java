// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;


// Referenced classes of package io.theholygrail.dingo.navigation:
//            NavigationBridge, NavigationBridgeCallback

class this._cls0
    implements Runnable
{

    final NavigationBridge this$0;

    public void run()
    {
        mCallback.dismissModal();
    }

    lback()
    {
        this$0 = NavigationBridge.this;
        super();
    }
}
