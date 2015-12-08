// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.au;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            bn, n, r

public class bm extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{

    private boolean a;
    private boolean b;
    private int c;
    private ConnectionResult d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final SparseArray f = new SparseArray();

    public bm()
    {
        c = -1;
    }

    static int a(bm bm1, int i)
    {
        bm1.c = i;
        return i;
    }

    static ConnectionResult a(bm bm1, ConnectionResult connectionresult)
    {
        bm1.d = connectionresult;
        return connectionresult;
    }

    public static bm a(FragmentActivity fragmentactivity)
    {
label0:
        {
            au.b("Must be called from main thread of process");
            fragmentactivity = fragmentactivity.getSupportFragmentManager();
            bm bm1;
            try
            {
                bm1 = (bm)fragmentactivity.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (bm1 != null)
            {
                fragmentactivity = bm1;
                if (!bm1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = null;
        }
        return fragmentactivity;
    }

    private void a()
    {
        b = false;
        c = -1;
        d = null;
        for (int i = 0; i < f.size(); i++)
        {
            ((bn)f.valueAt(i)).b.b();
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (bn)f.get(i);
        if (obj != null)
        {
            a(i);
            obj = ((bn) (obj)).c;
            if (obj != null)
            {
                ((r) (obj)).a(connectionresult);
            }
        }
        a();
    }

    static void a(bm bm1, int i, ConnectionResult connectionresult)
    {
        bm1.a(i, connectionresult);
    }

    static boolean a(bm bm1)
    {
        return bm1.a;
    }

    static boolean a(bm bm1, boolean flag)
    {
        bm1.b = flag;
        return flag;
    }

    public static bm b(FragmentActivity fragmentactivity)
    {
        bm bm1 = a(fragmentactivity);
        FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
        fragmentactivity = bm1;
        if (bm1 == null)
        {
            fragmentactivity = new bm();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commitAllowingStateLoss();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    static boolean b(bm bm1)
    {
        return bm1.b;
    }

    static void c(bm bm1)
    {
        bm1.a();
    }

    static Handler d(bm bm1)
    {
        return bm1.e;
    }

    public void a(int i)
    {
        bn bn1 = (bn)f.get(i);
        f.remove(i);
        if (bn1 != null)
        {
            bn1.a();
        }
    }

    public void a(int i, n n1, r r1)
    {
        au.a(n1, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (f.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        r1 = new bn(this, i, n1, r1);
        f.put(i, r1);
        if (a && !b)
        {
            n1.b();
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < f.size(); i++)
        {
            ((bn)f.valueAt(i)).a(s, filedescriptor, printwriter, as);
        }

    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 55
    //                   2 39;
           goto _L1 _L2 _L3
_L1:
        i = 0;
_L5:
        if (i != 0)
        {
            a();
            return;
        } else
        {
            a(c, d);
            return;
        }
_L3:
        if (com.google.android.gms.common.d.a(getActivity()) != 0) goto _L1; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (j != -1) goto _L1; else goto _L6
_L6:
        i = ((flag) ? 1 : 0);
          goto _L5
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a(c, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = bundle.getBoolean("resolving_error", false);
            c = bundle.getInt("failed_client_id", -1);
            if (c >= 0)
            {
                d = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", b);
        if (c >= 0)
        {
            bundle.putInt("failed_client_id", c);
            bundle.putInt("failed_status", d.c());
            bundle.putParcelable("failed_resolution", d.d());
        }
    }

    public void onStart()
    {
        super.onStart();
        a = true;
        if (!b)
        {
            for (int i = 0; i < f.size(); i++)
            {
                ((bn)f.valueAt(i)).b.b();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        a = false;
        for (int i = 0; i < f.size(); i++)
        {
            ((bn)f.valueAt(i)).b.c();
        }

    }
}
