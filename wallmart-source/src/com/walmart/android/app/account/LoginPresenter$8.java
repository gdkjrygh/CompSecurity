// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.os.Handler;
import com.walmart.android.data.AssociateLogin;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter, AssociateLoginPresenter

class  extends AsyncCallbackOnThread
{

    final LoginPresenter this$0;

    public void onFailureSameThread(Integer integer, AssociateLogin associatelogin)
    {
        LoginPresenter.access$800(LoginPresenter.this, integer.intValue());
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (AssociateLogin)obj1);
    }

    public void onSuccessSameThread(AssociateLogin associatelogin)
    {
        LoginPresenter.access$1400(LoginPresenter.this, 3);
        if (associatelogin.getAssociateLoginRequired())
        {
            associatelogin = new AssociateLoginPresenter(mActivity);
            associatelogin.setAccountListener(mAccountListener);
            LoginPresenter.access$1500(LoginPresenter.this, associatelogin);
            return;
        } else
        {
            LoginPresenter.access$1300(LoginPresenter.this, false);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((AssociateLogin)obj);
    }

    senter(Handler handler)
    {
        this$0 = LoginPresenter.this;
        super(handler);
    }
}
