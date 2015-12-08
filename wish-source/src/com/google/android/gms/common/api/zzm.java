// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
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
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzm extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static class zza extends Loader
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient zzRg;
        private boolean zzRl;
        private ConnectionResult zzRm;

        private void zzh(ConnectionResult connectionresult)
        {
            zzRm = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.dump(s, filedescriptor, printwriter, as);
            zzRg.dump(s, filedescriptor, printwriter, as);
        }

        public void onConnected(Bundle bundle)
        {
            zzRl = false;
            zzh(ConnectionResult.zzOI);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzRl = true;
            zzh(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            zzRm = null;
            zzRl = false;
            zzRg.unregisterConnectionCallbacks(this);
            zzRg.unregisterConnectionFailedListener(this);
            zzRg.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            zzRg.registerConnectionCallbacks(this);
            zzRg.registerConnectionFailedListener(this);
            if (zzRm != null)
            {
                deliverResult(zzRm);
            }
            if (!zzRg.isConnected() && !zzRg.isConnecting() && !zzRl)
            {
                zzRg.connect();
            }
        }

        protected void onStopLoading()
        {
            zzRg.disconnect();
        }

        public boolean zzlh()
        {
            return zzRl;
        }

        public zza(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            zzRg = googleapiclient;
        }
    }

    private static class zzb
    {

        public final GoogleApiClient zzRg;
        public final GoogleApiClient.OnConnectionFailedListener zzRh;

        private zzb(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzRg = googleapiclient;
            zzRh = onconnectionfailedlistener;
        }

    }

    private class zzc
        implements Runnable
    {

        private final int zzRj;
        private final ConnectionResult zzRk;
        final zzm zzRn;

        public void run()
        {
            if (zzRk.hasResolution())
            {
                try
                {
                    int i = zzRn.getActivity().getSupportFragmentManager().getFragments().indexOf(zzRn);
                    zzRk.startResolutionForResult(zzRn.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzm.zza(zzRn);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(zzRk.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(zzRk.getErrorCode(), zzRn.getActivity(), zzRn, 2, zzRn);
                return;
            } else
            {
                zzm.zza(zzRn, zzRj, zzRk);
                return;
            }
        }

        public zzc(int i, ConnectionResult connectionresult)
        {
            zzRn = zzm.this;
            super();
            zzRj = i;
            zzRk = connectionresult;
        }
    }


    private boolean zzRa;
    private int zzRb;
    private ConnectionResult zzRc;
    private final Handler zzRd = new Handler(Looper.getMainLooper());
    private final SparseArray zzRe = new SparseArray();

    public zzm()
    {
        zzRb = -1;
    }

    private void zza(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zzb)zzRe.get(i);
        if (obj != null)
        {
            zzax(i);
            obj = ((zzb) (obj)).zzRh;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zzlf();
    }

    static void zza(zzm zzm1)
    {
        zzm1.zzlf();
    }

    static void zza(zzm zzm1, int i, ConnectionResult connectionresult)
    {
        zzm1.zza(i, connectionresult);
    }

    public static zzm zzb(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzv.zzbI("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzm zzm1;
            try
            {
                zzm1 = (zzm)fragmentmanager.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (zzm1 != null)
            {
                fragmentactivity = zzm1;
                if (!zzm1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzm();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLoaderLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void zzb(int i, ConnectionResult connectionresult)
    {
        if (!zzRa)
        {
            zzRa = true;
            zzRb = i;
            zzRc = connectionresult;
            zzRd.post(new zzc(i, connectionresult));
        }
    }

    private void zzlf()
    {
        int i = 0;
        zzRa = false;
        zzRb = -1;
        zzRc = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < zzRe.size(); i++)
        {
            int j = zzRe.keyAt(i);
            zza zza1 = zzaz(j);
            if (zza1 != null && zza1.zzlh())
            {
                loadermanager.destroyLoader(j);
                loadermanager.initLoader(j, null, this);
            }
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
            zzlf();
            return;
        } else
        {
            zza(zzRb, zzRc);
            return;
        }
_L3:
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) != 0) goto _L1; else goto _L4
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
        while (i < zzRe.size()) 
        {
            int j = zzRe.keyAt(i);
            activity = zzaz(j);
            if (activity != null && ((zzb)zzRe.valueAt(i)).zzRg != ((zza) (activity)).zzRg)
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
        zza(zzRb, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            zzRa = bundle.getBoolean("resolving_error", false);
            zzRb = bundle.getInt("failed_client_id", -1);
            if (zzRb >= 0)
            {
                zzRc = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new zza(getActivity(), ((zzb)zzRe.get(i)).zzRg);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        zza(loader, (ConnectionResult)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", zzRa);
        if (zzRb >= 0)
        {
            bundle.putInt("failed_client_id", zzRb);
            bundle.putInt("failed_status", zzRc.getErrorCode());
            bundle.putParcelable("failed_resolution", zzRc.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!zzRa)
        {
            for (int i = 0; i < zzRe.size(); i++)
            {
                getLoaderManager().initLoader(zzRe.keyAt(i), null, this);
            }

        }
    }

    public void zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzv.zzb(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (zzRe.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        googleapiclient = new zzb(googleapiclient, onconnectionfailedlistener);
        zzRe.put(i, googleapiclient);
        if (getActivity() != null)
        {
            LoaderManager.enableDebugLogging(false);
            getLoaderManager().initLoader(i, null, this);
        }
    }

    public void zza(Loader loader, ConnectionResult connectionresult)
    {
        if (!connectionresult.isSuccess())
        {
            zzb(loader.getId(), connectionresult);
        }
    }

    public void zzax(int i)
    {
        zzRe.remove(i);
        getLoaderManager().destroyLoader(i);
    }

    public GoogleApiClient zzay(int i)
    {
        if (getActivity() != null)
        {
            zza zza1 = zzaz(i);
            if (zza1 != null)
            {
                return zza1.zzRg;
            }
        }
        return null;
    }

    zza zzaz(int i)
    {
        zza zza1;
        try
        {
            zza1 = (zza)getLoaderManager().getLoader(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
        }
        return zza1;
    }
}
