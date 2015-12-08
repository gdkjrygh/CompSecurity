// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.managegood.a;

import android.content.Context;
import android.content.Intent;
import com.go.weatherex.managegood.b.a;
import com.go.weatherex.managegood.view.ManageGoodPaymentActivity;
import com.jiubang.playsdk.main.f;

public class c
{

    private static volatile c a = null;
    private f b;

    private c()
    {
        b = null;
    }

    public static c a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/go/weatherex/managegood/a/c;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new c();
        }
        com/go/weatherex/managegood/a/c;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/go/weatherex/managegood/a/c;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Context context, a a1)
    {
        Intent intent = new Intent(context, com/go/weatherex/managegood/view/ManageGoodPaymentActivity);
        intent.putExtra("extra_manage_good_payment_info", a1);
        context.startActivity(intent);
    }

    public void a(f f)
    {
        b = f;
    }

    public f b()
    {
        return b;
    }

}
