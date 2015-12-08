// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;

// Referenced classes of package com.walmart.android.app.account:
//            CreateAccountPresenter

class this._cls0
    implements android.view.AccountPresenter._cls1
{

    final CreateAccountPresenter this$0;

    public void onClick(View view)
    {
        CreateAccountPresenter.access$000(CreateAccountPresenter.this);
        CreateAccountPresenter.access$100(CreateAccountPresenter.this);
        ((InputMethodManager)mActivity.getSystemService("input_method")).hideSoftInputFromWindow(CreateAccountPresenter.access$200(CreateAccountPresenter.this).getWindowToken(), 0);
    }

    ()
    {
        this$0 = CreateAccountPresenter.this;
        super();
    }
}
