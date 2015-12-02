// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.cash;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import chp;
import com.ubercab.payment.internal.inject.AddPaymentActivityWithInjection;
import com.ubercab.payment.model.CollectedData;
import e;
import f;
import gmg;
import gsn;
import gst;
import gxv;
import gxy;
import gyc;
import gyd;
import java.util.HashMap;
import java.util.Map;

public final class CashAddPaymentActivity extends AddPaymentActivityWithInjection
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener
{

    public chp a;
    public gmg b;

    public CashAddPaymentActivity()
    {
    }

    private void a(int l)
    {
        if (l == -1)
        {
            k();
            return;
        } else
        {
            setResult(0);
            finish();
            return;
        }
    }

    private void a(gxv gxv1)
    {
        gxv1.a(this);
    }

    private gxv i()
    {
        return gyc.a().a(new gst(getApplication())).a();
    }

    private void j()
    {
        AlertDialog alertdialog = gxy.a(this, b, this, this);
        if (alertdialog != null)
        {
            if (b.a(gsn.a, "go_digital"))
            {
                a.a(e.U);
            } else
            {
                a.a(e.T);
            }
            alertdialog.show();
            return;
        } else
        {
            k();
            return;
        }
    }

    private void k()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("token_type", "cash");
        a(CollectedData.create(hashmap));
    }

    protected final volatile void a(Object obj)
    {
        a((gxv)obj);
    }

    protected final Object h()
    {
        return i();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(0);
    }

    public final void onClick(DialogInterface dialoginterface, int l)
    {
        switch (l)
        {
        default:
            a(0);
            return;

        case -1: 
            if (b.a(gsn.a, "go_digital"))
            {
                a.a(f.aa);
                a(0);
                return;
            } else
            {
                a.a(f.Y);
                a(-1);
                return;
            }

        case -2: 
            break;
        }
        if (b.a(gsn.a, "go_digital"))
        {
            a.a(f.Z);
            a(-1);
            return;
        } else
        {
            a.a(f.X);
            a(0);
            return;
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if ("data_collection".equals(f()))
        {
            j();
            return;
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
