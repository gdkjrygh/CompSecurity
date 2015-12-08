// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Intent;

// Referenced classes of package io.card.payment:
//            ae, ah, ay

public final class ag
{

    private static final ae a;

    public static String a(ah ah1)
    {
        return a.a(ah1);
    }

    public static void a(Intent intent)
    {
        a.a(intent.getStringExtra("io.card.payment.languageOrLocale"));
    }

    static 
    {
        a = new ae(io/card/payment/ah, ay.a);
    }
}
