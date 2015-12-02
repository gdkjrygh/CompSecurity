// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v4.util.SparseArrayCompat;
import android.view.MenuItem;
import android.widget.Toast;
import cic;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.launch.LauncherActivity;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.core.support.v7.app.CoreAppCompatActivity;
import cyn;
import cys;
import czh;
import czi;
import czj;
import czu;
import dal;
import dbf;
import dce;
import dfp;
import doc;
import dtg;
import dtp;
import dul;
import dxf;
import gmg;
import gqg;
import gqj;
import gqk;
import ijg;
import ijj;
import ijm;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.client.core.app:
//            RiderApplication, NetworkErrorFragment

public abstract class RiderActivity extends CoreAppCompatActivity
    implements ServiceConnection, czh, czi, gqk
{

    public static final cic a = new cic() {

        public final String name()
        {
            return "";
        }

    };
    protected AlertDialog b;
    public dal c;
    public Collection d;
    public dce e;
    public gmg f;
    public cys g;
    private final Handler h = new Handler(Looper.getMainLooper());
    private final Set i = new HashSet();
    private final SparseArrayCompat j = new SparseArrayCompat();
    private czj k;
    private boolean l;
    private czh m;
    private boolean n;

    public RiderActivity()
    {
        l = false;
        n = false;
    }

    private boolean f()
    {
        boolean flag = false;
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        if (!getPackageManager().queryIntentActivities(intent, 0).isEmpty())
        {
            flag = true;
        }
        return flag;
    }

    private void g()
    {
        z();
    }

    private boolean h()
    {
        return (b == null || !b.isShowing()) && !isFinishing();
    }

    public final void A()
    {
        this;
        JVM INSTR monitorenter ;
        FragmentManager fragmentmanager = getSupportFragmentManager();
        if (fragmentmanager.getBackStackEntryCount() > 0)
        {
            fragmentmanager.popBackStack();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void B()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = getFragmentManager().getBackStackEntryCount() - 1;
_L2:
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        A();
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        throw exception;
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

    public abstract czj a(dfp dfp);

    public void a(int i1, int j1, Bundle bundle)
    {
        if (i1 == 2100 && j1 == -1 && f())
        {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    public final void a(int i1, Fragment fragment)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = fragment.getClass().getName();
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(i1, fragment, s1);
        fragmenttransaction.addToBackStack(s1);
        fragmenttransaction.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        fragment;
        throw fragment;
    }

    public final void a(int i1, Fragment fragment, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        FragmentTransaction fragmenttransaction;
        s1 = fragment.getClass().getName();
        fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        fragmenttransaction.replace(i1, fragment, s1);
_L1:
        fragmenttransaction.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        fragmenttransaction.add(i1, fragment, s1);
          goto _L1
        fragment;
        throw fragment;
    }

    public final void a(int i1, doc doc1)
    {
        j.put(i1, doc1);
    }

    public abstract void a(czj czj);

    public void a(gqg gqg1, Ping ping, Response response)
    {
        if (gqg1.b().equals("PingClient"))
        {
            y();
        } else
        {
            z();
        }
        if (dul.a(ping) && !ping.getClient().getHasConfirmedMobile())
        {
            if (ping.getClient().getHasToOptInSmsNotifications())
            {
                gqg1 = "com.ubercab.ACTION_MOBILE_VERIFICATION_SMS";
            } else
            {
                gqg1 = "com.ubercab.ACTION_MOBILE_VERIFICATION_TOKEN";
            }
            startActivity(new Intent(gqg1));
            return;
        } else
        {
            h.post(new Runnable(ping) {

                final Ping a;
                final RiderActivity b;

                public final void run()
                {
                    b.a_(a.getDescription());
                    if (dul.a(a, 0) && b.c.v())
                    {
                        ijg.a(dbf.af.name()).d("DispatchResponse_ERROR_LOGOUT", new Object[0]);
                        b.c.P();
                        b.v();
                    }
                }

            
            {
                b = RiderActivity.this;
                a = ping;
                super();
            }
            });
            return;
        }
    }

    public volatile void a(gqg gqg1, gqj gqj, Response response)
    {
        a(gqg1, (Ping)gqj, response);
    }

    public void a(gqg gqg1, RetrofitError retrofiterror)
    {
        y();
    }

    public final volatile void a(gqj gqj)
    {
    }

    public final void a(String s1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        if (h())
        {
            b = dtg.a(this, s1, true, null);
            b.setOnCancelListener(oncancellistener);
            b.show();
        }
    }

    public final void a(String s1, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        if (h())
        {
            b = dtg.a(this, s1, true, ondismisslistener);
            b.show();
        }
    }

    public final void a_(String s1)
    {
        Toast.makeText(this, s1, 1).show();
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(ijm.a(context));
    }

    public final doc b(int i1)
    {
        i1 = j.indexOfKey(i1);
        if (i1 < 0)
        {
            return null;
        } else
        {
            doc doc1 = (doc)j.valueAt(i1);
            j.removeAt(i1);
            return doc1;
        }
    }

    public void b(Bundle bundle)
    {
    }

    public final void b(gqg gqg1, gqj gqj, Response response)
    {
        g();
    }

    public final void b(String s1, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        if (h())
        {
            b = dtg.a(this, s1, false, ondismisslistener);
            b.show();
        }
    }

    public final czj c()
    {
        return a(((RiderApplication)getApplication()).b());
    }

    public final czj d()
    {
        return k;
    }

    public Collection e()
    {
        return Collections.emptySet();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 != 9010 || intent == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        try
        {
            intent = (PendingIntent)intent.getParcelableExtra("google_play_services_error");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            ijg.d(intent, "Error sending pending intent from Google Play service error.", new Object[0]);
            return;
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        intent.send();
    }

    public void onBackPressed()
    {
        if (l)
        {
            super.onBackPressed();
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        if (m != null)
        {
            k = m.c();
            m.a(k);
        } else
        {
            k = c();
            a(k);
        }
        i.addAll(d);
        i.addAll(e());
        if (t() && e.a() == null)
        {
            super.onCreate(null);
            v();
            return;
        }
        super.onCreate(bundle);
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((czu)iterator.next()).a()) { }
        l = true;
        b(bundle);
    }

    public void onDestroy()
    {
        if (b != null && b.isShowing())
        {
            b.dismiss();
        }
        super.onDestroy();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((czu)iterator.next()).c()) { }
    }

    public final void onRequestPermissionsResult(int i1, String as[], int ai[])
    {
        super.onRequestPermissionsResult(i1, as, ai);
        g.a(this, i1, as, ai);
    }

    public void onResume()
    {
        super.onResume();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((czu)iterator.next()).b()) { }
    }

    public void onResumeFragments()
    {
        super.onResumeFragments();
        l = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        for (bundle = i.iterator(); bundle.hasNext(); bundle.next()) { }
        l = false;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        n = true;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        n = false;
    }

    public void onStart()
    {
        super.onStart();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onStop()
    {
        super.onStop();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public abstract cic s();

    public boolean t()
    {
        return false;
    }

    public final void u()
    {
        if (b != null && b.isShowing())
        {
            b.dismiss();
            b = null;
        }
    }

    public final void v()
    {
        Intent intent = getIntent();
        Object obj = new Intent(this, com/ubercab/client/feature/launch/LauncherActivity);
        ((Intent) (obj)).addCategory("android.intent.category.DEFAULT");
        ((Intent) (obj)).setPackage(getPackageName());
        obj = ((Intent) (obj)).resolveActivity(getPackageManager());
        Intent intent1 = new Intent();
        intent1.setComponent(((ComponentName) (obj)));
        intent1.addFlags(0x10000000);
        intent1.addFlags(32768);
        if (this instanceof TripActivity)
        {
            intent1.putExtra("trip_notification_action", intent.getAction());
        }
        intent1.setData(intent.getData());
        startActivity(intent1);
        finish();
        overridePendingTransition(0, 0);
    }

    public final void w()
    {
        while (f.a(dbf.aB) || dxf.a(this) || a(dtp) != null || !l) 
        {
            return;
        }
        String s1;
        if (f())
        {
            s1 = getString(0x7f07020e);
        } else
        {
            s1 = getString(0x7f0702f8);
        }
        dtp.a(this, 2100, getString(0x7f070210), getString(0x7f07020f), s1);
        getSupportFragmentManager().executePendingTransactions();
    }

    public final void x()
    {
        if (f.a(dbf.aB)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        cyn cyn1;
        cyn1 = (cyn)a(cyn);
        if (!dxf.a(this))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (cyn1 == null) goto _L1; else goto _L3
_L3:
        cyn1.dismissAllowingStateLoss();
        return;
        if (cyn1 != null) goto _L1; else goto _L4
_L4:
        String s1;
        if (f())
        {
            s1 = getString(0x7f07020e);
        } else
        {
            s1 = getString(0x7f0702f8);
        }
        cyn.a(this, getString(0x7f070210), getString(0x7f07020f), s1);
        getSupportFragmentManager().executePendingTransactions();
        return;
    }

    public final void y()
    {
        while (!l || (NetworkErrorFragment)a(com/ubercab/client/core/app/NetworkErrorFragment) != null) 
        {
            return;
        }
        NetworkErrorFragment networkerrorfragment = new NetworkErrorFragment();
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.add(networkerrorfragment, com/ubercab/client/core/app/NetworkErrorFragment.getName());
        fragmenttransaction.commitAllowingStateLoss();
    }

    public final void z()
    {
        NetworkErrorFragment networkerrorfragment = (NetworkErrorFragment)a(com/ubercab/client/core/app/NetworkErrorFragment);
        if (networkerrorfragment != null)
        {
            networkerrorfragment.dismissAllowingStateLoss();
        }
    }

}
