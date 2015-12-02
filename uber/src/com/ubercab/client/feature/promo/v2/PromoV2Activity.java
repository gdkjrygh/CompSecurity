// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import far;
import fas;
import fau;
import faz;
import fba;
import fbb;
import fbd;
import fbe;
import n;

public class PromoV2Activity extends RiderActivity
    implements fau, fbe
{

    public chp h;
    public cev i;
    private int j;

    public PromoV2Activity()
    {
    }

    public static final Intent a(Context context)
    {
        context = new Intent(context, com/ubercab/client/feature/promo/v2/PromoV2Activity);
        context.putExtra("starting_mode", 1);
        return context;
    }

    private void a(fbb fbb1)
    {
        fbb1.a(this);
    }

    private fbb b(dfp dfp)
    {
        return faz.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(fas) == null)
        {
            a(0x7f0e03f1, fas.a(), true);
        }
    }

    private void g()
    {
        if (a(fbd) == null)
        {
            a(0x7f0e03f1, fbd.a(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int k, int l, Bundle bundle)
    {
        super.a(k, l, bundle);
        j;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 54
    //                   1 33;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        if ((bundle = (fbd)a(fbd)) != null)
        {
            bundle.a(k, l);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((bundle = (fas)a(fas)) != null)
        {
            bundle.a(k, l);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(com.ubercab.client.feature.signup.SignupData.PromoCode promocode, String s1)
    {
        setResult(-1, (new Intent()).putExtra("promo_code", promocode).putExtra("promo_code_string", s1));
        finish();
    }

    public final volatile void a(czj czj)
    {
        a((fbb)czj);
    }

    public final void a(String s1)
    {
        (new android.app.AlertDialog.Builder(this)).setMessage(s1).setTitle(getString(0x7f070381)).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener(s1) {

            final String a;
            final PromoV2Activity b;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                b.i.c(new far());
                b.setResult(-1, (new Intent()).putExtra("description", a));
                b.finish();
            }

            
            {
                b = PromoV2Activity.this;
                a = s1;
                super();
            }
        }).show();
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030159);
        j = getIntent().getIntExtra("starting_mode", 0);
        switch (j)
        {
        default:
            return;

        case 1: // '\001'
            g();
            return;

        case 0: // '\0'
            f();
            return;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        h.a(n.cR);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
