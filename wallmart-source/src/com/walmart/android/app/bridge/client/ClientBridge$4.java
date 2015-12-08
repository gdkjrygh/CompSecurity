// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;


// Referenced classes of package com.walmart.android.app.bridge.client:
//            ClientBridge, ClientBridgeCallback

class this._cls0
    implements Runnable
{

    final ClientBridge this$0;

    public void run()
    {
        if (mCallback != null)
        {
            mCallback.showHome();
        }
    }

    lback()
    {
        this$0 = ClientBridge.this;
        super();
    }
}
