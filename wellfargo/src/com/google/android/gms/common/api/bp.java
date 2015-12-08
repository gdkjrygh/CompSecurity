// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
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
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.au;

// Referenced classes of package com.google.android.gms.common.api:
//            br, bt, bs, r, 
//            n

public class bp extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private boolean a;
    private int b;
    private ConnectionResult c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final SparseArray e = new SparseArray();

    public bp()
    {
        b = -1;
    }

    public static bp a(FragmentActivity fragmentactivity)
    {
label0:
        {
            au.b("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            bp bp1;
            try
            {
                bp1 = (bp)fragmentmanager.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (bp1 != null)
            {
                fragmentactivity = bp1;
                if (!bp1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new bp();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLoaderLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void a()
    {
        int i = 0;
        a = false;
        b = -1;
        c = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < e.size(); i++)
        {
            int j = e.keyAt(i);
            br br1 = c(j);
            if (br1 != null && br1.a())
            {
                loadermanager.destroyLoader(j);
                loadermanager.initLoader(j, null, this);
            }
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        if (!a)
        {
            a = true;
            b = i;
            c = connectionresult;
            d.post(new bt(this, i, connectionresult));
        }
    }

    static void a(bp bp1)
    {
        bp1.a();
    }

    static void a(bp bp1, int i, ConnectionResult connectionresult)
    {
        bp1.b(i, connectionresult);
    }

    private void b(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (bs)e.get(i);
        if (obj != null)
        {
            b(i);
            obj = ((bs) (obj)).b;
            if (obj != null)
            {
                ((r) (obj)).a(connectionresult);
            }
        }
        a();
    }

    public n a(int i)
    {
        if (getActivity() != null)
        {
            br br1 = c(i);
            if (br1 != null)
            {
                return br1.a;
            }
        }
        return null;
    }

    public void a(int i, n n, r r1)
    {
        au.a(n, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (e.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        n = new bs(n, r1, null);
        e.put(i, n);
        if (getActivity() != null)
        {
            LoaderManager.enableDebugLogging(false);
            getLoaderManager().initLoader(i, null, this);
        }
    }

    public void a(Loader loader, ConnectionResult connectionresult)
    {
        if (!connectionresult.b())
        {
            a(loader.getId(), connectionresult);
        }
    }

    public void b(int i)
    {
        e.remove(i);
        getLoaderManager().destroyLoader(i);
    }

    br c(int i)
    {
        br br1;
        try
        {
            br1 = (br)getLoaderManager().getLoader(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
        }
        return br1;
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
            b(b, c);
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

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int i = 0;
        while (i < e.size()) 
        {
            int j = e.keyAt(i);
            activity = c(j);
            if (activity != null && ((bs)e.valueAt(i)).a != ((br) (activity)).a)
            {
                getLoaderManager().restartLoader(j, null, this);
            } else
            {
                getLoaderManager().initLoader(j, null, this);
            }
            i++;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        b(b, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            a = bundle.getBoolean("resolving_error", false);
            b = bundle.getInt("failed_client_id", -1);
            if (b >= 0)
            {
                c = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new br(getActivity(), ((bs)e.get(i)).a);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ConnectionResult)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", a);
        if (b >= 0)
        {
            bundle.putInt("failed_client_id", b);
            bundle.putInt("failed_status", c.c());
            bundle.putParcelable("failed_resolution", c.d());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!a)
        {
            for (int i = 0; i < e.size(); i++)
            {
                getLoaderManager().initLoader(e.keyAt(i), null, this);
            }

        }
    }
}
