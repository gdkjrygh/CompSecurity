// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigationbar;


// Referenced classes of package io.theholygrail.dingo.navigationbar:
//            NavigationBarBridge, NavigationBarBridgeCallback

class val.titleText
    implements Runnable
{

    final NavigationBarBridge this$0;
    final String val$titleText;

    public void run()
    {
        mCallback.setTitle(val$titleText);
    }

    lback()
    {
        this$0 = final_navigationbarbridge;
        val$titleText = String.this;
        super();
    }
}
