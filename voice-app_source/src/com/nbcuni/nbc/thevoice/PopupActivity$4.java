// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity

class this._cls0
    implements FacebookCallback
{

    final PopupActivity this$0;

    public void onCancel()
    {
        String s = (new StringBuilder("{\"commandId\":\"")).append(PopupActivity.access$10(PopupActivity.this)).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(PopupActivity.access$11(PopupActivity.this)).append("\",\"error\":{\"code\":\"FacebookLoginCancelled\"}}").toString();
        sendMessageToJS(s);
    }

    public void onError(FacebookException facebookexception)
    {
        facebookexception = (new StringBuilder("{\"commandId\":\"")).append(PopupActivity.access$10(PopupActivity.this)).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(PopupActivity.access$11(PopupActivity.this)).append("\",\"error\":{\"code\":\"FacebookLoginFailedError\"}}").toString();
        sendMessageToJS(facebookexception);
    }

    public void onSuccess(LoginResult loginresult)
    {
        if (!AccessToken.getCurrentAccessToken().getToken().equals(""))
        {
            loginresult = (new StringBuilder("{\"commandId\":\"")).append(PopupActivity.access$10(PopupActivity.this)).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(PopupActivity.access$11(PopupActivity.this)).append("\",\"payload\":{\"token\":\"").append(loginresult.getAccessToken().getToken()).append("\"}}").toString();
            sendMessageToJS(loginresult);
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((LoginResult)obj);
    }

    ()
    {
        this$0 = PopupActivity.this;
        super();
    }
}
