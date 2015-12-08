// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.content.Intent;

// Referenced classes of package com.walmart.android.app.account:
//            AccountListener, AccountActivity

class this._cls0
    implements AccountListener
{

    final AccountActivity this$0;

    public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
    {
        Intent intent = new Intent();
        intent.putExtra("guest_login", flag);
        intent.putExtra("account_created", flag1);
        intent.putExtra("email_signup", flag2);
        setResult(1, intent);
        finish();
    }

    ()
    {
        this$0 = AccountActivity.this;
        super();
    }
}
