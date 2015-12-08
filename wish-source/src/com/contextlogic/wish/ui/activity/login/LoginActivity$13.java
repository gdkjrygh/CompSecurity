// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;


// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class this._cls0
    implements com.contextlogic.wish.api.service.manager.er.Callback
{

    final LoginActivity this$0;

    public void onFailure(boolean flag, boolean flag1, String s)
    {
        LoginActivity.access$1400(LoginActivity.this, flag, flag1, s);
    }

    public void onSuccess(boolean flag, hSignupFlow hsignupflow)
    {
        finishLogin(flag, hsignupflow);
    }

    hSignupFlow()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
