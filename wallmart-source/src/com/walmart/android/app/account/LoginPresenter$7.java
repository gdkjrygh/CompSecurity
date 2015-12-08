// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.os.Handler;
import com.walmart.android.data.LoginResult;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter

class  extends AsyncCallbackOnThread
{

    final LoginPresenter this$0;

    public void onFailureSameThread(Integer integer, LoginResult loginresult)
    {
        LoginPresenter.access$900(LoginPresenter.this, 5);
        if (integer.intValue() == 0x15f92)
        {
            LoginPresenter.access$1000(LoginPresenter.this, 1);
            return;
        } else
        {
            LoginPresenter.access$1100(LoginPresenter.this, 2);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (LoginResult)obj1);
    }

    public void onSuccessSameThread(LoginResult loginresult)
    {
        LoginPresenter.access$1200(LoginPresenter.this, 5);
        LoginPresenter.access$1300(LoginPresenter.this, true);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((LoginResult)obj);
    }

    (Handler handler)
    {
        this$0 = LoginPresenter.this;
        super(handler);
    }
}
