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
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzm extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    private class zza
        implements GoogleApiClient.OnConnectionFailedListener
    {

        public final int zzYa;
        public final GoogleApiClient zzYb;
        public final GoogleApiClient.OnConnectionFailedListener zzYc;
        final zzm zzYd;

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            printwriter.append(s).append("GoogleApiClient #").print(zzYa);
            printwriter.println(":");
            zzYb.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzm.zzd(zzYd).post(zzYd. new zzb(zzYa, connectionresult));
        }

        public void zzmW()
        {
            zzYb.unregisterConnectionFailedListener(this);
            zzYb.disconnect();
        }

        public zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzYd = zzm.this;
            super();
            zzYa = i;
            zzYb = googleapiclient;
            zzYc = onconnectionfailedlistener;
            googleapiclient.registerConnectionFailedListener(this);
        }
    }

    private class zzb
        implements Runnable
    {

        final zzm zzYd;
        private final int zzYe;
        private final ConnectionResult zzYf;

        public void run()
        {
            if (!zzm.zza(zzYd) || zzm.zzb(zzYd))
            {
                return;
            }
            zzm.zza(zzYd, true);
            zzm.zza(zzYd, zzYe);
            zzm.zza(zzYd, zzYf);
            if (zzYf.hasResolution())
            {
                try
                {
                    int i = zzYd.getActivity().getSupportFragmentManager().getFragments().indexOf(zzYd);
                    zzYf.startResolutionForResult(zzYd.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzm.zzc(zzYd);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(zzYf.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(zzYf.getErrorCode(), zzYd.getActivity(), zzYd, 2, zzYd);
                return;
            } else
            {
                zzm.zza(zzYd, zzYe, zzYf);
                return;
            }
        }

        public zzb(int i, ConnectionResult connectionresult)
        {
            zzYd = zzm.this;
            super();
            zzYe = i;
            zzYf = connectionresult;
        }
    }


    private boolean mStarted;
    private boolean zzXV;
    private int zzXW;
    private ConnectionResult zzXX;
    private final Handler zzXY = new Handler(Looper.getMainLooper());
    private final SparseArray zzXZ = new SparseArray();

    public zzm()
    {
        zzXW = -1;
    }

    static int zza(zzm zzm1, int i)
    {
        zzm1.zzXW = i;
        return i;
    }

    static ConnectionResult zza(zzm zzm1, ConnectionResult connectionresult)
    {
        zzm1.zzXX = connectionresult;
        return connectionresult;
    }

    public static zzm zza(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzu.zzbY("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzm zzm1;
            try
            {
                zzm1 = (zzm)fragmentmanager.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
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
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void zza(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zza)zzXZ.get(i);
        if (obj != null)
        {
            zzbb(i);
            obj = ((zza) (obj)).zzYc;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zzmV();
    }

    static void zza(zzm zzm1, int i, ConnectionResult connectionresult)
    {
        zzm1.zza(i, connectionresult);
    }

    static boolean zza(zzm zzm1)
    {
        return zzm1.mStarted;
    }

    static boolean zza(zzm zzm1, boolean flag)
    {
        zzm1.zzXV = flag;
        return flag;
    }

    static boolean zzb(zzm zzm1)
    {
        return zzm1.zzXV;
    }

    static void zzc(zzm zzm1)
    {
        zzm1.zzmV();
    }

    static Handler zzd(zzm zzm1)
    {
        return zzm1.zzXY;
    }

    private void zzmV()
    {
        zzXV = false;
        zzXW = -1;
        zzXX = null;
        for (int i = 0; i < zzXZ.size(); i++)
        {
            ((zza)zzXZ.valueAt(i)).zzYb.connect();
        }

    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < zzXZ.size(); i++)
        {
            ((zza)zzXZ.valueAt(i)).dump(s, filedescriptor, printwriter, as);
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
        mStarted = true;
        if (!zzXV)
        {
            for (int i = 0; i < zzXZ.size(); i++)
            {
                ((zza)zzXZ.valueAt(i)).zzYb.connect();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        mStarted = false;
        for (int i = 0; i < zzXZ.size(); i++)
        {
            ((zza)zzXZ.valueAt(i)).zzYb.disconnect();
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
        onconnectionfailedlistener = new zza(i, googleapiclient, onconnectionfailedlistener);
        zzXZ.put(i, onconnectionfailedlistener);
        if (mStarted && !zzXV)
        {
            googleapiclient.connect();
        }
    }

    public void zzbb(int i)
    {
        zza zza1 = (zza)zzXZ.get(i);
        zzXZ.remove(i);
        if (zza1 != null)
        {
            zza1.zzmW();
        }
    }
}
