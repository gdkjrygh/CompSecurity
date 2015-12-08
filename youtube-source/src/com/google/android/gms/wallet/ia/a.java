// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.ia;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.b;

public abstract class a
{

    private b Pr;
    private com.google.android.gms.wallet.shared.a Ps;
    protected Bundle mArgs;
    protected Intent mIntent;

    public a(Context context, String s, String s1)
    {
        mIntent = new Intent();
        mIntent.setPackage("com.google.android.gms");
        mIntent.setAction(s);
        mArgs = new Bundle();
        Ps = ApplicationParameters.newBuilder().a(mArgs);
        Pr = BuyFlowConfig.newBuilder().b(context.getPackageName()).c(s1);
    }

    public Intent build()
    {
        BuyFlowConfig buyflowconfig = Pr.a(Ps.a()).a();
        mIntent.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyflowconfig);
        return onIntentBuilt(mIntent, buyflowconfig);
    }

    protected Intent onIntentBuilt(Intent intent, BuyFlowConfig buyflowconfig)
    {
        return intent;
    }

    public a setBuyerAccount(Account account)
    {
        Ps.a(account);
        return this;
    }

    public a setEnvironment(int i)
    {
        Ps.a(i);
        return this;
    }

    public a setTheme(int i)
    {
        Ps.b(i);
        return this;
    }

    public a setTransactionId(String s)
    {
        Pr.a(s);
        return this;
    }
}
