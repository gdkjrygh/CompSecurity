// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.js;

import com.urbanairship.actions.ActionCompletionCallback;
import com.urbanairship.actions.ActionResult;

// Referenced classes of package com.urbanairship.js:
//            UAJavascriptInterface

class val.callbackKey
    implements ActionCompletionCallback
{

    final UAJavascriptInterface this$0;
    final String val$callbackKey;
    final String val$name;

    public void onFinish(ActionResult actionresult)
    {
        String s = UAJavascriptInterface.access$100(UAJavascriptInterface.this, val$name, actionresult);
        UAJavascriptInterface.access$200(UAJavascriptInterface.this, s, actionresult.getValue(), val$callbackKey);
    }

    lback()
    {
        this$0 = final_uajavascriptinterface;
        val$name = s;
        val$callbackKey = String.this;
        super();
    }
}
