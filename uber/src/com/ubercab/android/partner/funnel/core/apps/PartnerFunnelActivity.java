// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.core.apps;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import cic;
import cof;
import com.ubercab.core.support.v7.app.CoreActionBarActivity;
import cpu;
import cqv;
import cre;
import crf;
import crr;
import crs;
import crt;
import crz;
import ijm;
import java.util.Collection;
import java.util.Iterator;

public abstract class PartnerFunnelActivity extends CoreActionBarActivity
    implements cre
{

    public static final cic a = new cic() {

        public final String name()
        {
            return "";
        }

    };
    public cpu b;
    public Collection c;
    private AlertDialog d;
    private crf e;
    private crr f;
    private cre g;

    public PartnerFunnelActivity()
    {
    }

    private void b(int i, Fragment fragment)
    {
        this;
        JVM INSTR monitorenter ;
        String s = fragment.getClass().getName();
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(i, fragment, s);
        fragmenttransaction.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        fragment;
        throw fragment;
    }

    private void f()
    {
        try
        {
            startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            finish();
        }
    }

    private void g()
    {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.addFlags(32768);
        intent.addFlags(0x10000000);
        startActivity(intent);
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

    public final crf a()
    {
        return a(crt.a());
    }

    public abstract crf a(crs crs);

    public void a(int i, int j, Bundle bundle)
    {
        if (i != 300) goto _L2; else goto _L1
_L1:
        if (j != -1) goto _L4; else goto _L3
_L3:
        g();
_L6:
        return;
_L4:
        finish();
        return;
_L2:
        if (i == 301)
        {
            if (j == -1)
            {
                f();
                return;
            } else
            {
                finish();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(int i, Fragment fragment)
    {
        this;
        JVM INSTR monitorenter ;
        b(i, fragment);
        this;
        JVM INSTR monitorexit ;
        return;
        fragment;
        throw fragment;
    }

    public abstract void a(crf crf);

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(ijm.a(context));
    }

    public final void b(String s)
    {
        if (d == null || !d.isShowing())
        {
            d = crz.a(this, s);
            d.show();
        }
    }

    public final void c()
    {
        if (d != null && d.isShowing())
        {
            d.dismiss();
            d = null;
        }
    }

    public final crr d()
    {
        return f;
    }

    public int e()
    {
        return cof.Theme_Uber_Partner_Funnel_White;
    }

    public void onCreate(Bundle bundle)
    {
        if (g != null)
        {
            e = g.a();
            g.a(e);
        } else
        {
            e = a();
            a(e);
        }
        f = (crr)e;
        setTheme(e());
        super.onCreate(bundle);
        for (bundle = c.iterator(); bundle.hasNext(); ((cqv)bundle.next()).a()) { }
    }

    public void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            NavUtils.navigateUpFromSameTask(this);
            break;
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((cqv)iterator.next()).d()) { }
    }

    protected void onResume()
    {
        super.onResume();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((cqv)iterator.next()).c()) { }
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((cqv)iterator.next()).b()) { }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        for (bundle = c.iterator(); bundle.hasNext(); bundle.next()) { }
    }

    public void onStart()
    {
        super.onStart();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onStop()
    {
        super.onStop();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); iterator.next()) { }
    }

}
