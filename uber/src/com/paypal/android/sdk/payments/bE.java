// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.text.style.URLSpan;
import android.view.View;
import ccl;

public final class bE extends URLSpan
{

    private ccl a;

    public bE(URLSpan urlspan, ccl ccl1)
    {
        super(urlspan.getURL());
        a = ccl1;
    }

    public final void onClick(View view)
    {
        a.a();
        super.onClick(view);
    }
}
