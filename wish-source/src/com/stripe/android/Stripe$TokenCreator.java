// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android;

import com.stripe.android.model.Card;
import java.util.concurrent.Executor;

// Referenced classes of package com.stripe.android:
//            Stripe, TokenCallback

static interface 
{

    public abstract void create(Card card, String s, Executor executor, TokenCallback tokencallback);
}
