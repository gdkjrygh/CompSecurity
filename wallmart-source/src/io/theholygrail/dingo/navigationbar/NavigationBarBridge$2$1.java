// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigationbar;

import io.theholygrail.jsbridge.JSValue;

// Referenced classes of package io.theholygrail.dingo.navigationbar:
//            NavigationBarBridge, NavigationBarBridgeCallback, Button

class this._cls1
    implements ack.OnClickListener
{

    final View this$1;

    public void onClick(String s)
    {
        if (callbackValue.isFunction().booleanValue())
        {
            callbackValue.callFunction(mWebView, new Object[] {
                s
            }, null);
        }
    }

    l.callbackValue()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class io/theholygrail/dingo/navigationbar/NavigationBarBridge$2

/* anonymous class */
    class NavigationBarBridge._cls2
        implements Runnable
    {

        final NavigationBarBridge this$0;
        final Button val$buttons[];
        final JSValue val$callbackValue;

        public void run()
        {
            if (mCallback != null)
            {
                NavigationBarBridge._cls2._cls1 _lcls1 = null;
                if (buttons != null)
                {
                    _lcls1 = new NavigationBarBridge._cls2._cls1();
                }
                mCallback.setButtons(buttons, _lcls1);
            }
        }

            
            {
                this$0 = final_navigationbarbridge;
                buttons = abutton;
                callbackValue = JSValue.this;
                super();
            }
    }

}
