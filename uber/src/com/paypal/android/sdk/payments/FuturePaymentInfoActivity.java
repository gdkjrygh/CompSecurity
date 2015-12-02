// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import bux;
import buz;
import bwq;
import byv;
import byw;
import byx;
import ccm;

public final class FuturePaymentInfoActivity extends Activity
{

    private byx a;

    public FuturePaymentInfoActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (byw)getIntent().getExtras().getSerializable("com.paypal.details.scope");
        bwq.b(this);
        bwq.a(this);
        a = new byx(this, bundle);
        setContentView(a.a);
        ccm.a(this, a.b, null);
        a.c.setText(bux.a(buz.d));
        a.c.setOnClickListener(new byv(this));
    }
}
