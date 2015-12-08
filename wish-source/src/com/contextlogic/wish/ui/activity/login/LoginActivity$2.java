// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;


// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class this._cls0
    implements com.contextlogic.wish.api.service.fferService.SuccessCallback
{

    final LoginActivity this$0;

    public void onServiceSucceeded(String s)
    {
        LoginActivity.access$100(LoginActivity.this, s);
    }

    rvice.SuccessCallback()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
