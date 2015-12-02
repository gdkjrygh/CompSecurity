// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import byw;
import ccl;

public final class b extends URLSpan
{

    private Activity a;
    private Class b;
    private ccl c;
    private byw d;

    public b(URLSpan urlspan, Activity activity, Class class1, ccl ccl1, byw byw)
    {
        super(urlspan.getURL());
        a = activity;
        b = class1;
        c = ccl1;
        d = byw;
    }

    public final void onClick(View view)
    {
        view = new Intent(a, b);
        view.putExtra("com.paypal.details.scope", d);
        c.a();
        a.startActivity(view);
    }
}
