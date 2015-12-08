// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android;

import com.stripe.android.model.Token;

// Referenced classes of package com.stripe.android:
//            Stripe

private class <init>
{

    public final Exception error;
    final Stripe this$0;
    public final Token token;

    private (Token token1, Exception exception)
    {
        this$0 = Stripe.this;
        super();
        error = exception;
        token = token1;
    }

    token(Token token1, Exception exception, token token2)
    {
        this(token1, exception);
    }
}
