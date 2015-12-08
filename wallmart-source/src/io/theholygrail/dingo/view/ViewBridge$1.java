// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.view;


// Referenced classes of package io.theholygrail.dingo.view:
//            ViewBridge, ViewBridgeCallback

class this._cls0
    implements Runnable
{

    final ViewBridge this$0;

    public void run()
    {
        if (mCallback != null)
        {
            mCallback.show();
        }
    }

    lback()
    {
        this$0 = ViewBridge.this;
        super();
    }
}
