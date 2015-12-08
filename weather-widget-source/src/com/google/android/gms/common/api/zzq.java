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
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzq extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static class zza extends Loader
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient zzaaP;
        private boolean zzaaU;
        private ConnectionResult zzaaV;

        private void zzh(ConnectionResult connectionresult)
        {
            zzaaV = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.dump(s, filedescriptor, printwriter, as);
            zzaaP.dump(s, filedescriptor, printwriter, as);
        }

        public void onConnected(Bundle bundle)
        {
            zzaaU = false;
            zzh(ConnectionResult.zzYi);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzaaU = true;
            zzh(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            zzaaV = null;
            zzaaU = false;
            zzaaP.unregisterConnectionCallbacks(this);
            zzaaP.unregisterConnectionFailedListener(this);
            zzaaP.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            zzaaP.registerConnectionCallbacks(this);
            zzaaP.registerConnectionFailedListener(this);
            if (zzaaV != null)
            {
                deliverResult(zzaaV);
            }
            if (!zzaaP.isConnected() && !zzaaP.isConnecting() && !zzaaU)
            {
                zzaaP.connect();
            }
        }

        protected void onStopLoading()
        {
            zzaaP.disconnect();
        }

        public boolean zznL()
        {
            return zzaaU;
        }

        public zza(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            zzaaP = googleapiclient;
        }
    }

    private static class zzb
    {

        public final GoogleApiClient zzaaP;
        public final GoogleApiClient.OnConnectionFailedListener zzaaQ;

        private zzb(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzaaP = googleapiclient;
            zzaaQ = onconnectionfailedlistener;
        }

    }

    private class zzc
        implements Runnable
    {

        private final int zzaaS;
        private final ConnectionResult zzaaT;
        final zzq zzaaW;

        public void run()
        {
            if (zzaaT.hasResolution())
            {
                try
                {
                    int i = zzaaW.getActivity().getSupportFragmentManager().getFragments().indexOf(zzaaW);
                    zzaaT.startResolutionForResult(zzaaW.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzq.zza(zzaaW);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(zzaaT.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(zzaaT.getErrorCode(), zzaaW.getActivity(), zzaaW, 2, zzaaW);
                return;
            } else
            {
                zzq.zza(zzaaW, zzaaS, zzaaT);
                return;
            }
        }

        public zzc(int i, ConnectionResult connectionresult)
        {
            zzaaW = zzq.this;
            super();
            zzaaS = i;
            zzaaT = connectionresult;
        }
    }


    private boolean zzaaJ;
    private int zzaaK;
    private ConnectionResult zzaaL;
    private final Handler zzaaM = new Handler(Looper.getMainLooper());
    private final SparseArray zzaaN = new SparseArray();

    public zzq()
    {
        zzaaK = -1;
    }

    private void zza(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zzb)zzaaN.get(i);
        if (obj != null)
        {
            zzbi(i);
            obj = ((zzb) (obj)).zzaaQ;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zznJ();
    }

    static void zza(zzq zzq1)
    {
        zzq1.zznJ();
    }

    static void zza(zzq zzq1, int i, ConnectionResult connectionresult)
    {
        zzq1.zza(i, connectionresult);
    }

    private void zzb(int i, ConnectionResult connectionresult)
    {
        if (!zzaaJ)
        {
            zzaaJ = true;
            zzaaK = i;
            zzaaL = connectionresult;
            zzaaM.post(new zzc(i, connectionresult));
        }
    }

    public static zzq zzc(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzx.zzch("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzq zzq1;
            try
            {
                zzq1 = (zzq)fragmentmanager.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (zzq1 != null)
            {
                fragmentactivity = zzq1;
                if (!zzq1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzq();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLoaderLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void zznJ()
    {
        int i = 0;
        zzaaJ = false;
        zzaaK = -1;
        zzaaL = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < zzaaN.size(); i++)
        {
            int j = zzaaN.keyAt(i);
            zza zza1 = zzbk(j);
            if (zza1 != null && zza1.zznL())
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
            zznJ();
            return;
        } else
        {
            zza(zzaaK, zzaaL);
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
        while (i < zzaaN.size()) 
        {
            int j = zzaaN.keyAt(i);
            activity = zzbk(j);
            if (activity != null && ((zzb)zzaaN.valueAt(i)).zzaaP != ((zza) (activity)).zzaaP)
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
        zza(zzaaK, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            zzaaJ = bundle.getBoolean("resolving_error", false);
            zzaaK = bundle.getInt("failed_client_id", -1);
            if (zzaaK >= 0)
            {
                zzaaL = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new zza(getActivity(), ((zzb)zzaaN.get(i)).zzaaP);
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
        bundle.putBoolean("resolving_error", zzaaJ);
        if (zzaaK >= 0)
        {
            bundle.putInt("failed_client_id", zzaaK);
            bundle.putInt("failed_status", zzaaL.getErrorCode());
            bundle.putParcelable("failed_resolution", zzaaL.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!zzaaJ)
        {
            for (int i = 0; i < zzaaN.size(); i++)
            {
                getLoaderManager().initLoader(zzaaN.keyAt(i), null, this);
            }

        }
    }

    public void zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzx.zzb(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (zzaaN.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        googleapiclient = new zzb(googleapiclient, onconnectionfailedlistener);
        zzaaN.put(i, googleapiclient);
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

    public void zzbi(int i)
    {
        zzaaN.remove(i);
        getLoaderManager().destroyLoader(i);
    }

    public GoogleApiClient zzbj(int i)
    {
        if (getActivity() != null)
        {
            zza zza1 = zzbk(i);
            if (zza1 != null)
            {
                return zza1.zzaaP;
            }
        }
        return null;
    }

    zza zzbk(int i)
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
