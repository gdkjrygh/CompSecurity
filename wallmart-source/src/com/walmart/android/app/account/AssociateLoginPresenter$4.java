// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.os.Handler;
import com.walmart.android.data.StatusMessage;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.account:
//            AssociateLoginPresenter

class this._cls0 extends AsyncCallbackOnThread
{

    final AssociateLoginPresenter this$0;

    public void onFailureSameThread(Integer integer, StatusMessage astatusmessage[])
    {
        AssociateLoginPresenter.access$1200(AssociateLoginPresenter.this, 3);
        if (integer.intValue() == 0x15f93)
        {
            AssociateLoginPresenter.access$1300(AssociateLoginPresenter.this, 6);
            return;
        }
        if (integer.intValue() == 0x15f92)
        {
            AssociateLoginPresenter.access$1400(AssociateLoginPresenter.this, 5);
            return;
        } else
        {
            AssociateLoginPresenter.access$1500(AssociateLoginPresenter.this, 6);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusMessage[])obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusMessage[])obj);
    }

    public void onSuccessSameThread(StatusMessage astatusmessage[])
    {
        AssociateLoginPresenter.access$1100(AssociateLoginPresenter.this);
    }

    (Handler handler)
    {
        this$0 = AssociateLoginPresenter.this;
        super(handler);
    }
}
