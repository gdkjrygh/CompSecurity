// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountCreator, AccountLinkingTask

private class <init> extends BroadcastReceiver
{

    final AccountCreator this$0;

    public void onReceive(Context context, Intent intent)
    {
        AccountCreator.access$100(AccountCreator.this).unregisterReceiver(this);
        (new AccountLinkingTask(AccountCreator.access$200(AccountCreator.this), AccountCreator.access$300(AccountCreator.this), AccountCreator.access$400(AccountCreator.this), AccountCreator.access$100(AccountCreator.this))).execute(new Void[0]);
    }

    private ()
    {
        this$0 = AccountCreator.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
