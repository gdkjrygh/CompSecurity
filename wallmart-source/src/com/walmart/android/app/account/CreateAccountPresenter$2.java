// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.view.View;
import com.walmart.android.app.PrivacyPolicyPresenter;

// Referenced classes of package com.walmart.android.app.account:
//            CreateAccountPresenter

class this._cls0
    implements android.view.AccountPresenter._cls2
{

    final CreateAccountPresenter this$0;

    public void onClick(View view)
    {
        CreateAccountPresenter.access$300(CreateAccountPresenter.this, new PrivacyPolicyPresenter(mActivity));
    }

    ()
    {
        this$0 = CreateAccountPresenter.this;
        super();
    }
}
