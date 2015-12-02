// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.password;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import chp;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import com.ubercab.ui.TextView;
import cwz;
import h;
import hbh;
import hbj;
import hbk;
import hbl;
import hbm;
import hbo;
import hbt;
import hch;
import hck;
import het;
import heu;
import hfb;
import hjg;
import hrq;
import hrs;
import hsc;
import hsj;
import i;
import ica;
import ico;
import java.util.List;

public class ResetPasswordActivity extends RdsActivity
{

    private static int j;
    public chp c;
    public hch d;
    public hck e;
    public hjg f;
    Button g;
    FloatingLabelEditText h;
    TextView i;

    public ResetPasswordActivity()
    {
    }

    public static Intent a(Context context, String s)
    {
        return (new Intent(context, com/ubercab/rds/feature/password/ResetPasswordActivity)).putExtra("com.ubercab.rds.EMAIL_TOKEN", s);
    }

    static void a(ResetPasswordActivity resetpasswordactivity, String s)
    {
        resetpasswordactivity.d(s);
    }

    private void a(hfb hfb1)
    {
        hfb1.a(this);
    }

    static boolean a(ResetPasswordActivity resetpasswordactivity)
    {
        return resetpasswordactivity.f();
    }

    static boolean b(ResetPasswordActivity resetpasswordactivity)
    {
        return resetpasswordactivity.a;
    }

    static boolean c(ResetPasswordActivity resetpasswordactivity)
    {
        return resetpasswordactivity.a;
    }

    private void d(String s)
    {
        cwz.a(this);
        setResult(-1, (new Intent()).putExtra("com.ubercab.rds.EMAIL", d.b()).putExtra("com.ubercab.rds.PASSWORD", s));
        finish();
    }

    private boolean f()
    {
        return (new hsj()).a(h, new hsc(j, new hrs(getResources().getString(hbo.ub__rds__password_length_error_message, new Object[] {
            Integer.valueOf(j)
        })))).a().isEmpty();
    }

    private hfb g()
    {
        return het.a().a(new hbt(getApplication())).a();
    }

    protected final volatile void a(Object obj)
    {
        a((hfb)obj);
    }

    protected final Object c()
    {
        return g();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        d("");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__password_activity_reset);
        bundle = getResources().getDrawable(hbj.ub__close);
        hrq.a(bundle, getResources().getColor(hbh.ub__uber_black_60));
        b().a(bundle);
        a(getString(hbo.ub__rds__set_new_password));
        c.a(h.e);
        j = getResources().getInteger(hbl.ub__rds__minimum_password_length);
        i = (TextView)findViewById(hbk.ub__reset_password_textview_message);
        i.setText(getResources().getString(hbo.ub__rds__reset_password_message, new Object[] {
            Integer.valueOf(j)
        }));
        h = (FloatingLabelEditText)findViewById(hbk.ub__reset_password_edittext_password);
        g = (Button)findViewById(hbk.ub__reset_password_button_submit);
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final ResetPasswordActivity a;

            public final void onClick(View view)
            {
                a.c.a(i.n);
                if (!ResetPasswordActivity.a(a))
                {
                    return;
                } else
                {
                    view = a.h.i().toString();
            /* block-local class not found */
            class _cls1 {}

                    a.f.a(a.getIntent().getStringExtra("com.ubercab.rds.EMAIL_TOKEN"), view).a(ico.a()).b(new _cls1(view));
                    return;
                }
            }

            
            {
                a = ResetPasswordActivity.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 24
    //                   16908332 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        d("");
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onResume()
    {
        super.onResume();
        cwz.a(this, h);
        h.requestFocus();
    }
}
