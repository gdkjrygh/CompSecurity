// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;


// Referenced classes of package io.theholygrail.dingo.navigation:
//            NavigationBridge, NavigationBridgeCallback, ExternalUrlOptions

class val.urlOptions
    implements Runnable
{

    final NavigationBridge this$0;
    final ExternalUrlOptions val$urlOptions;

    public void run()
    {
        mCallback.presentExternalUrl(val$urlOptions);
    }

    lback()
    {
        this$0 = final_navigationbridge;
        val$urlOptions = ExternalUrlOptions.this;
        super();
    }
}
