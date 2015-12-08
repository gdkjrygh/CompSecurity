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
import com.google.android.gms.common.internal.zzv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzl extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    private class zza
        implements GoogleApiClient.OnConnectionFailedListener
    {

        public final int zzRf;
        public final GoogleApiClient zzRg;
        public final GoogleApiClient.OnConnectionFailedListener zzRh;
        final zzl zzRi;

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            printwriter.append("#").print(zzRf);
            printwriter.append(" ");
            zzRg.dump(s, filedescriptor, printwriter, as);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzl.zzd(zzRi).post(zzRi. new zzb(zzRf, connectionresult));
        }

        public void zzlg()
        {
            zzRg.unregisterConnectionFailedListener(this);
            zzRg.disconnect();
        }

        public zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzRi = zzl.this;
            super();
            zzRf = i;
            zzRg = googleapiclient;
            zzRh = onconnectionfailedlistener;
            googleapiclient.registerConnectionFailedListener(this);
        }
    }

    private class zzb
        implements Runnable
    {

        final zzl zzRi;
        private final int zzRj;
        private final ConnectionResult zzRk;

        public void run()
        {
            if (!zzl.zza(zzRi) || zzl.zzb(zzRi))
            {
                return;
            }
            zzl.zza(zzRi, true);
            zzl.zza(zzRi, zzRj);
            zzl.zza(zzRi, zzRk);
            if (zzRk.hasResolution())
            {
                try
                {
                    int i = zzRi.getActivity().getSupportFragmentManager().getFragments().indexOf(zzRi);
                    zzRk.startResolutionForResult(zzRi.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzl.zzc(zzRi);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(zzRk.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(zzRk.getErrorCode(), zzRi.getActivity(), zzRi, 2, zzRi);
                return;
            } else
            {
                zzl.zza(zzRi, zzRj, zzRk);
                return;
            }
        }

        public zzb(int i, ConnectionResult connectionresult)
        {
            zzRi = zzl.this;
            super();
            zzRj = i;
            zzRk = connectionresult;
        }
    }


    private boolean mStarted;
    private boolean zzRa;
    private int zzRb;
    private ConnectionResult zzRc;
    private final Handler zzRd = new Handler(Looper.getMainLooper());
    private final SparseArray zzRe = new SparseArray();

    public zzl()
    {
        zzRb = -1;
    }

    static int zza(zzl zzl1, int i)
    {
        zzl1.zzRb = i;
        return i;
    }

    static ConnectionResult zza(zzl zzl1, ConnectionResult connectionresult)
    {
        zzl1.zzRc = connectionresult;
        return connectionresult;
    }

    public static zzl zza(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzv.zzbI("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzl zzl1;
            try
            {
                zzl1 = (zzl)fragmentmanager.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (zzl1 != null)
            {
                fragmentactivity = zzl1;
                if (!zzl1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzl();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void zza(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zza)zzRe.get(i);
        if (obj != null)
        {
            zzax(i);
            obj = ((zza) (obj)).zzRh;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zzlf();
    }

    static void zza(zzl zzl1, int i, ConnectionResult connectionresult)
    {
        zzl1.zza(i, connectionresult);
    }

    static boolean zza(zzl zzl1)
    {
        return zzl1.mStarted;
    }

    static boolean zza(zzl zzl1, boolean flag)
    {
        zzl1.zzRa = flag;
        return flag;
    }

    static boolean zzb(zzl zzl1)
    {
        return zzl1.zzRa;
    }

    static void zzc(zzl zzl1)
    {
        zzl1.zzlf();
    }

    static Handler zzd(zzl zzl1)
    {
        return zzl1.zzRd;
    }

    private void zzlf()
    {
        zzRa = false;
        zzRb = -1;
        zzRc = null;
        for (int i = 0; i < zzRe.size(); i++)
        {
            ((zza)zzRe.valueAt(i)).zzRg.connect();
        }

    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < zzRe.size(); i++)
        {
            ((zza)zzRe.valueAt(i)).dump(s, filedescriptor, printwriter, as);
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
        mStarted = true;
        if (!zzRa)
        {
            for (int i = 0; i < zzRe.size(); i++)
            {
                ((zza)zzRe.valueAt(i)).zzRg.connect();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        mStarted = false;
        for (int i = 0; i < zzRe.size(); i++)
        {
            ((zza)zzRe.valueAt(i)).zzRg.disconnect();
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
        onconnectionfailedlistener = new zza(i, googleapiclient, onconnectionfailedlistener);
        zzRe.put(i, onconnectionfailedlistener);
        if (mStarted && !zzRa)
        {
            googleapiclient.connect();
        }
    }

    public void zzax(int i)
    {
        zza zza1 = (zza)zzRe.get(i);
        zzRe.remove(i);
        if (zza1 != null)
        {
            zza1.zzlg();
        }
    }
}
