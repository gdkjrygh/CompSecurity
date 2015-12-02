// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.ConditionVariable;

final class qr
{

    final int a;
    final ConditionVariable b;
    final ConditionVariable c;

    qr(ConditionVariable conditionvariable, ConditionVariable conditionvariable1, int i)
    {
        c = conditionvariable;
        b = conditionvariable1;
        a = i;
        super();
    }

    public void a()
    {
        if (c != null)
        {
            c.block(0x2bf20L);
        }
        if (b != null && 1 == a)
        {
            b.block(0x2bf20L);
        }
    }

    public void b()
    {
        if (b != null && a == 0)
        {
            b.open();
        }
    }
}
