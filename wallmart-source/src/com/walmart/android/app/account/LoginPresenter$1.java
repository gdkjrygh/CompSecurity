// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter

class this._cls0
    implements android.view.ner
{

    final LoginPresenter this$0;

    public void onClick(View view)
    {
        if (LoginPresenter.access$000(LoginPresenter.this))
        {
            LoginPresenter.access$300(LoginPresenter.this, LoginPresenter.access$100(LoginPresenter.this).getText().toString(), LoginPresenter.access$200(LoginPresenter.this).getText().toString());
        }
    }

    ()
    {
        this$0 = LoginPresenter.this;
        super();
    }
}
