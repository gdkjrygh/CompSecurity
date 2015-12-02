// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ubercab.core.support.v7.app.CoreActionBarActivity;
import com.ubercab.rds.core.model.SupportIssue;
import com.ubercab.rds.core.model.SupportTree;
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.feature.support.SupportFormActivity;
import com.ubercab.ui.Button;
import hbk;
import hbo;
import hch;
import hcp;
import hcr;
import hgj;
import hoq;
import ijm;
import java.util.List;

public abstract class RdsActivity extends CoreActionBarActivity
{

    public boolean a;
    public hch b;
    private Button c;
    private RelativeLayout d;
    private RelativeLayout e;
    private com.ubercab.ui.TextView f;
    private hcp g;
    private Object h;

    public RdsActivity()
    {
    }

    private void b(int i, Fragment fragment)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s1 = fragment.getClass().getName();
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(i, fragment, s1);
        fragmenttransaction.addToBackStack(s1);
        fragmenttransaction.commit();
        if (true) goto _L1; else goto _L3
_L3:
        fragment;
        throw fragment;
    }

    public final Fragment a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        class1 = getSupportFragmentManager().findFragmentByTag(class1.getName());
        this;
        JVM INSTR monitorexit ;
        return class1;
        class1;
        throw class1;
    }

    public final void a(int i, Fragment fragment)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s1 = fragment.getClass().getName();
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(i, fragment, s1);
        fragmenttransaction.commit();
        if (true) goto _L1; else goto _L3
_L3:
        fragment;
        throw fragment;
    }

    public final void a(SupportTree supporttree, SupportIssue supportissue, String s1, TripReceipt tripreceipt)
    {
        if ("category".equals(supportissue.getType()))
        {
            supporttree = hcr.a(supporttree, supportissue.getId());
            if (!supporttree.isEmpty())
            {
                b(hbk.ub__support_viewgroup_content, hgj.a(supporttree, tripreceipt));
            }
        } else
        if ("faq".equals(supportissue.getType()) || "form".equals(supportissue.getType()))
        {
            startActivity(SupportFormActivity.a(this, supportissue.getType(), supportissue.getId(), s1, tripreceipt));
            return;
        }
    }

    public abstract void a(Object obj);

    public final void a(String s1)
    {
        ActionBar actionbar = b();
        if (actionbar != null)
        {
            actionbar.b(true);
            TextView textview = (TextView)findViewById(getResources().getIdentifier("action_bar_title", "id", "android"));
            if (textview != null)
            {
                hoq.a(this, textview, hbo.ub__font_book);
            }
            actionbar.a(s1.toUpperCase());
        }
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(ijm.a(context));
    }

    public final void b(String s1)
    {
        d = (RelativeLayout)findViewById(hbk.ub__error_support_form);
        f = (com.ubercab.ui.TextView)findViewById(hbk.ub__error_textview_title);
        c = (Button)findViewById(hbk.ub__error_button_email);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final RdsActivity a;

            public final void onClick(View view)
            {
                hcr.a(a);
            }

            
            {
                a = RdsActivity.this;
                super();
            }
        });
        c.setVisibility(0);
        f.setText(s1);
    }

    public abstract Object c();

    public final void c(String s1)
    {
        if (g == null || !g.isShowing())
        {
            g = hcp.a(this, s1);
            g.show();
        }
    }

    public final void d()
    {
        d.setVisibility(0);
    }

    public final void e()
    {
        e = (RelativeLayout)findViewById(hbk.ub__support_loading);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (h == null)
        {
            h = c();
        }
        a(h);
        a = true;
        bundle = getIntent().getStringExtra("com.ubercab.rds.RETURN_LOCATION");
        if (!TextUtils.isEmpty(bundle))
        {
            b.b(bundle);
        }
        if (getIntent().getBooleanExtra("com.ubercab.rds.FINISH_SELF", false))
        {
            setResult(-1);
            finish();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            menuitem = getSupportFragmentManager();
            if (menuitem.getBackStackEntryCount() > 0)
            {
                menuitem.popBackStack();
            } else
            {
                setResult(0);
                finish();
            }
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onResumeFragments()
    {
        super.onResumeFragments();
        a = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        a = false;
    }

    public final void s()
    {
        e.setVisibility(0);
    }

    public final void t()
    {
        e.setVisibility(8);
    }

    public final void u()
    {
        if (g != null && g.isShowing())
        {
            g.dismiss();
            g = null;
        }
    }
}
