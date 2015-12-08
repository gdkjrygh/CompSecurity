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
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzn extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static class zza extends Loader
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient zzYb;
        private boolean zzYg;
        private ConnectionResult zzYh;

        private void zzf(ConnectionResult connectionresult)
        {
            zzYh = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.dump(s, filedescriptor, printwriter, as);
            zzYb.dump(s, filedescriptor, printwriter, as);
        }

        public void onConnected(Bundle bundle)
        {
            zzYg = false;
            zzf(ConnectionResult.zzVG);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzYg = true;
            zzf(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            zzYh = null;
            zzYg = false;
            zzYb.unregisterConnectionCallbacks(this);
            zzYb.unregisterConnectionFailedListener(this);
            zzYb.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            zzYb.registerConnectionCallbacks(this);
            zzYb.registerConnectionFailedListener(this);
            if (zzYh != null)
            {
                deliverResult(zzYh);
            }
            if (!zzYb.isConnected() && !zzYb.isConnecting() && !zzYg)
            {
                zzYb.connect();
            }
        }

        protected void onStopLoading()
        {
            zzYb.disconnect();
        }

        public boolean zzmX()
        {
            return zzYg;
        }

        public zza(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            zzYb = googleapiclient;
        }
    }

    private static class zzb
    {

        public final GoogleApiClient zzYb;
        public final GoogleApiClient.OnConnectionFailedListener zzYc;

        private zzb(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzYb = googleapiclient;
            zzYc = onconnectionfailedlistener;
        }

    }

    private class zzc
        implements Runnable
    {

        private final int zzYe;
        private final ConnectionResult zzYf;
        final zzn zzYi;

        public void run()
        {
            if (zzYf.hasResolution())
            {
                try
                {
                    int i = zzYi.getActivity().getSupportFragmentManager().getFragments().indexOf(zzYi);
                    zzYf.startResolutionForResult(zzYi.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzn.zza(zzYi);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(zzYf.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(zzYf.getErrorCode(), zzYi.getActivity(), zzYi, 2, zzYi);
                return;
            } else
            {
                zzn.zza(zzYi, zzYe, zzYf);
                return;
            }
        }

        public zzc(int i, ConnectionResult connectionresult)
        {
            zzYi = zzn.this;
            super();
            zzYe = i;
            zzYf = connectionresult;
        }
    }


    private boolean zzXV;
    private int zzXW;
    private ConnectionResult zzXX;
    private final Handler zzXY = new Handler(Looper.getMainLooper());
    private final SparseArray zzXZ = new SparseArray();

    public zzn()
    {
        zzXW = -1;
    }

    private void zza(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zzb)zzXZ.get(i);
        if (obj != null)
        {
            zzbb(i);
            obj = ((zzb) (obj)).zzYc;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zzmV();
    }

    static void zza(zzn zzn1)
    {
        zzn1.zzmV();
    }

    static void zza(zzn zzn1, int i, ConnectionResult connectionresult)
    {
        zzn1.zza(i, connectionresult);
    }

    public static zzn zzb(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzu.zzbY("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzn zzn1;
            try
            {
                zzn1 = (zzn)fragmentmanager.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (zzn1 != null)
            {
                fragmentactivity = zzn1;
                if (!zzn1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzn();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLoaderLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void zzb(int i, ConnectionResult connectionresult)
    {
        if (!zzXV)
        {
            zzXV = true;
            zzXW = i;
            zzXX = connectionresult;
            zzXY.post(new zzc(i, connectionresult));
        }
    }

    private void zzmV()
    {
        int i = 0;
        zzXV = false;
        zzXW = -1;
        zzXX = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < zzXZ.size(); i++)
        {
            int j = zzXZ.keyAt(i);
            zza zza1 = zzbd(j);
            if (zza1 != null && zza1.zzmX())
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
            zzmV();
            return;
        } else
        {
            zza(zzXW, zzXX);
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
        while (i < zzXZ.size()) 
        {
            int j = zzXZ.keyAt(i);
            activity = zzbd(j);
            if (activity != null && ((zzb)zzXZ.valueAt(i)).zzYb != ((zza) (activity)).zzYb)
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
        zza(zzXW, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            zzXV = bundle.getBoolean("resolving_error", false);
            zzXW = bundle.getInt("failed_client_id", -1);
            if (zzXW >= 0)
            {
                zzXX = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new zza(getActivity(), ((zzb)zzXZ.get(i)).zzYb);
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
        bundle.putBoolean("resolving_error", zzXV);
        if (zzXW >= 0)
        {
            bundle.putInt("failed_client_id", zzXW);
            bundle.putInt("failed_status", zzXX.getErrorCode());
            bundle.putParcelable("failed_resolution", zzXX.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!zzXV)
        {
            for (int i = 0; i < zzXZ.size(); i++)
            {
                getLoaderManager().initLoader(zzXZ.keyAt(i), null, this);
            }

        }
    }

    public void zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.zzb(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (zzXZ.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        googleapiclient = new zzb(googleapiclient, onconnectionfailedlistener);
        zzXZ.put(i, googleapiclient);
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

    public void zzbb(int i)
    {
        zzXZ.remove(i);
        getLoaderManager().destroyLoader(i);
    }

    public GoogleApiClient zzbc(int i)
    {
        if (getActivity() != null)
        {
            zza zza1 = zzbd(i);
            if (zza1 != null)
            {
                return zza1.zzYb;
            }
        }
        return null;
    }

    zza zzbd(int i)
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
