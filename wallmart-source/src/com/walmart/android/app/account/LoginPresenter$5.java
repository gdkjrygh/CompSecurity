// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.view.View;

// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter, CreateAccountPresenter

class this._cls0
    implements android.view.ner
{

    final LoginPresenter this$0;

    public void onClick(View view)
    {
        view = new CreateAccountPresenter(mActivity, LoginPresenter.access$400(LoginPresenter.this));
        view.setAccountListener(mAccountListener);
        view.addAccountDelegates(mDelegates);
        view.setMergeType(getMergeType());
        LoginPresenter.access$600(LoginPresenter.this, view);
    }

    enter()
    {
        this$0 = LoginPresenter.this;
        super();
    }
}
