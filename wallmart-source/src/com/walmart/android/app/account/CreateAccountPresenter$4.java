// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.CreateAccountSuccessEvent;
import com.walmart.android.service.MessageBus;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.account:
//            CreateAccountPresenter

class this._cls0
    implements com.walmart.android.wmservice.untCallback
{

    final CreateAccountPresenter this$0;

    public void onFailure(int i, String as[])
    {
        CreateAccountPresenter.access$700(CreateAccountPresenter.this, 1);
        if (as != null)
        {
            int k = as.length;
            for (int j = 0; j < k; j++)
            {
                String s = as[j];
                CreateAccountPresenter.access$800(CreateAccountPresenter.this, s);
            }

        }
        if (CreateAccountPresenter.access$900(CreateAccountPresenter.this) != null)
        {
            CreateAccountPresenter.access$1000(CreateAccountPresenter.this);
            return;
        } else
        {
            CreateAccountPresenter.access$1100(CreateAccountPresenter.this, i);
            return;
        }
    }

    public void onSuccess()
    {
        CreateAccountPresenter.access$400(CreateAccountPresenter.this, 1);
        java.util.Iterator iterator = (new ArrayList(mDelegates)).iterator();
        delegateFinish(false, true, CreateAccountPresenter.access$500(CreateAccountPresenter.this), iterator);
        MessageBus.getBus().post(new CreateAccountSuccessEvent(CreateAccountPresenter.access$600(CreateAccountPresenter.this)));
    }

    Event()
    {
        this$0 = CreateAccountPresenter.this;
        super();
    }
}
