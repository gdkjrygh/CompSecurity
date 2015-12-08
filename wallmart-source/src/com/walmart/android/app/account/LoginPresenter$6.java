// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;


// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter

class this._cls0
    implements com.walmart.android.wmservice.thCallback
{

    final LoginPresenter this$0;

    public void onFailure(int i)
    {
        LoginPresenter.access$800(LoginPresenter.this, i);
    }

    public void onSuccess()
    {
        LoginPresenter.access$700(LoginPresenter.this);
    }

    Callback()
    {
        this$0 = LoginPresenter.this;
        super();
    }
}
