// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.password;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import chp;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.ui.AutoCompleteFloatingLabelEditText;
import com.ubercab.ui.Button;
import cwz;
import hbk;
import hbm;
import hbo;
import hbt;
import hch;
import hep;
import heq;
import hev;
import hex;
import hez;
import hjg;
import hrs;
import hrx;
import hsj;
import i;
import ica;
import ico;
import java.util.List;

public class ForgotPasswordActivity extends RdsActivity
    implements hez
{

    public chp c;
    public hch d;
    public hjg e;
    AutoCompleteFloatingLabelEditText f;
    Button g;

    public ForgotPasswordActivity()
    {
    }

    public static Intent a(Context context, String s)
    {
        return (new Intent(context, com/ubercab/rds/feature/password/ForgotPasswordActivity)).putExtra("com.ubercab.rds.EMAIL", s);
    }

    private void a(hev hev1)
    {
        hev1.a(this);
    }

    static boolean a(ForgotPasswordActivity forgotpasswordactivity)
    {
        return forgotpasswordactivity.g();
    }

    static boolean b(ForgotPasswordActivity forgotpasswordactivity)
    {
        return forgotpasswordactivity.a;
    }

    static boolean c(ForgotPasswordActivity forgotpasswordactivity)
    {
        return forgotpasswordactivity.a;
    }

    static void d(ForgotPasswordActivity forgotpasswordactivity)
    {
        forgotpasswordactivity.h();
    }

    private boolean g()
    {
        return (new hsj()).a(f, new hrx(new hrs(hbo.ub__rds__required), new hrs(hbo.ub__rds__invalid_email))).a().isEmpty();
    }

    private void h()
    {
        cwz.a(this);
        hex.a(this).a(this);
    }

    private hev i()
    {
        return hep.a().a(new hbt(getApplication())).a();
    }

    protected final volatile void a(Object obj)
    {
        a((hev)obj);
    }

    protected final Object c()
    {
        return i();
    }

    public final void f()
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.rds.EMAIL", f.i().toString());
        setResult(-1, intent);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__password_activity_forgot);
        a(getString(hbo.ub__rds__forgot_password));
        f = (AutoCompleteFloatingLabelEditText)findViewById(hbk.ub__forgot_password_edittext_email);
        g = (Button)findViewById(hbk.ub__forgot_password_button_submit);
        f.d(getIntent().getStringExtra("com.ubercab.rds.EMAIL"));
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final ForgotPasswordActivity a;

            public final void onClick(View view)
            {
                a.c.a(i.m);
                if (!ForgotPasswordActivity.a(a))
                {
                    return;
                } else
                {
                    view = a.f.i().toString();
                    a.d.a(view);
            /* block-local class not found */
            class _cls1 {}

                    a.e.a(view).a(ico.a()).b(new _cls1());
                    return;
                }
            }

            
            {
                a = ForgotPasswordActivity.this;
                super();
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        if (TextUtils.isEmpty(f.i()))
        {
            cwz.a(this, f);
            f.requestFocus();
        }
    }
}
