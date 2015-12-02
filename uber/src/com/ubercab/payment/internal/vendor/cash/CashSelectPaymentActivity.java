// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.cash;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import chp;
import com.ubercab.payment.internal.inject.SelectPaymentActivityWithInjection;
import gmg;
import gsn;
import gss;
import gxy;
import gya;
import gye;
import gyf;

public class CashSelectPaymentActivity extends SelectPaymentActivityWithInjection
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener
{

    public chp a;
    public gmg b;

    public CashSelectPaymentActivity()
    {
    }

    private void a(int i)
    {
        if (i == -1)
        {
            a(c());
            return;
        } else
        {
            setResult(0);
            finish();
            return;
        }
    }

    private void a(gya gya1)
    {
        gya1.a(this);
    }

    private gya e()
    {
        return gye.a().a(gss.a(getApplication())).a();
    }

    private void f()
    {
        AlertDialog alertdialog = gxy.a(this, b, this, this);
        if (alertdialog != null)
        {
            alertdialog.show();
            return;
        } else
        {
            a(c());
            return;
        }
    }

    protected final volatile void a(Object obj)
    {
        a((gya)obj);
    }

    protected final Object d()
    {
        return e();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a(0);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            a(0);
            return;

        case -1: 
            if (b.a(gsn.a, "go_digital"))
            {
                a(0);
                return;
            } else
            {
                a(-1);
                return;
            }

        case -2: 
            break;
        }
        if (b.a(gsn.a, "go_digital"))
        {
            a(-1);
            return;
        } else
        {
            a(0);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f();
    }
}
