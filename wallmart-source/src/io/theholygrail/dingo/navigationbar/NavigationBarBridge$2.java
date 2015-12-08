// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigationbar;

import io.theholygrail.jsbridge.JSValue;

// Referenced classes of package io.theholygrail.dingo.navigationbar:
//            NavigationBarBridge, NavigationBarBridgeCallback, Button

class val.callbackValue
    implements Runnable
{

    final NavigationBarBridge this$0;
    final Button val$buttons[];
    final JSValue val$callbackValue;

    public void run()
    {
        if (mCallback != null)
        {
            lback.OnClickListener onclicklistener = null;
            if (val$buttons != null)
            {
                onclicklistener = new NavigationBarBridgeCallback.OnClickListener() {

                    final NavigationBarBridge._cls2 this$1;

                    public void onClick(String s)
                    {
                        if (callbackValue.isFunction().booleanValue())
                        {
                            callbackValue.callFunction(mWebView, new Object[] {
                                s
                            }, null);
                        }
                    }

            
            {
                this$1 = NavigationBarBridge._cls2.this;
                super();
            }
                };
            }
            mCallback.setButtons(val$buttons, onclicklistener);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_navigationbarbridge;
        val$buttons = abutton;
        val$callbackValue = JSValue.this;
        super();
    }
}
