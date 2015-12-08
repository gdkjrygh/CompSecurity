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
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzp extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    private class zza
        implements GoogleApiClient.OnConnectionFailedListener
    {

        public final int zzaaO;
        public final GoogleApiClient zzaaP;
        public final GoogleApiClient.OnConnectionFailedListener zzaaQ;
        final zzp zzaaR;

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            printwriter.append(s).append("GoogleApiClient #").print(zzaaO);
            printwriter.println(":");
            zzaaP.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzp.zzd(zzaaR).post(zzaaR. new zzb(zzaaO, connectionresult));
        }

        public void zznK()
        {
            zzaaP.unregisterConnectionFailedListener(this);
            zzaaP.disconnect();
        }

        public zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzaaR = zzp.this;
            super();
            zzaaO = i;
            zzaaP = googleapiclient;
            zzaaQ = onconnectionfailedlistener;
            googleapiclient.registerConnectionFailedListener(this);
        }
    }

    private class zzb
        implements Runnable
    {

        final zzp zzaaR;
        private final int zzaaS;
        private final ConnectionResult zzaaT;

        public void run()
        {
            if (!zzp.zza(zzaaR) || zzp.zzb(zzaaR))
            {
                return;
            }
            zzp.zza(zzaaR, true);
            zzp.zza(zzaaR, zzaaS);
            zzp.zza(zzaaR, zzaaT);
            if (zzaaT.hasResolution())
            {
                try
                {
                    int i = zzaaR.getActivity().getSupportFragmentManager().getFragments().indexOf(zzaaR);
                    zzaaT.startResolutionForResult(zzaaR.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzp.zzc(zzaaR);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(zzaaT.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(zzaaT.getErrorCode(), zzaaR.getActivity(), zzaaR, 2, zzaaR);
                return;
            } else
            {
                zzp.zza(zzaaR, zzaaS, zzaaT);
                return;
            }
        }

        public zzb(int i, ConnectionResult connectionresult)
        {
            zzaaR = zzp.this;
            super();
            zzaaS = i;
            zzaaT = connectionresult;
        }
    }


    private boolean mStarted;
    private boolean zzaaJ;
    private int zzaaK;
    private ConnectionResult zzaaL;
    private final Handler zzaaM = new Handler(Looper.getMainLooper());
    private final SparseArray zzaaN = new SparseArray();

    public zzp()
    {
        zzaaK = -1;
    }

    static int zza(zzp zzp1, int i)
    {
        zzp1.zzaaK = i;
        return i;
    }

    static ConnectionResult zza(zzp zzp1, ConnectionResult connectionresult)
    {
        zzp1.zzaaL = connectionresult;
        return connectionresult;
    }

    public static zzp zza(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzx.zzch("Must be called from main thread of process");
            fragmentactivity = fragmentactivity.getSupportFragmentManager();
            zzp zzp1;
            try
            {
                zzp1 = (zzp)fragmentactivity.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (zzp1 != null)
            {
                fragmentactivity = zzp1;
                if (!zzp1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = null;
        }
        return fragmentactivity;
    }

    private void zza(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zza)zzaaN.get(i);
        if (obj != null)
        {
            zzbi(i);
            obj = ((zza) (obj)).zzaaQ;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zznJ();
    }

    static void zza(zzp zzp1, int i, ConnectionResult connectionresult)
    {
        zzp1.zza(i, connectionresult);
    }

    static boolean zza(zzp zzp1)
    {
        return zzp1.mStarted;
    }

    static boolean zza(zzp zzp1, boolean flag)
    {
        zzp1.zzaaJ = flag;
        return flag;
    }

    public static zzp zzb(FragmentActivity fragmentactivity)
    {
        zzp zzp1 = zza(fragmentactivity);
        FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
        fragmentactivity = zzp1;
        if (zzp1 == null)
        {
            fragmentactivity = new zzp();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commitAllowingStateLoss();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    static boolean zzb(zzp zzp1)
    {
        return zzp1.zzaaJ;
    }

    static void zzc(zzp zzp1)
    {
        zzp1.zznJ();
    }

    static Handler zzd(zzp zzp1)
    {
        return zzp1.zzaaM;
    }

    private void zznJ()
    {
        zzaaJ = false;
        zzaaK = -1;
        zzaaL = null;
        for (int i = 0; i < zzaaN.size(); i++)
        {
            ((zza)zzaaN.valueAt(i)).zzaaP.connect();
        }

    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < zzaaN.size(); i++)
        {
            ((zza)zzaaN.valueAt(i)).dump(s, filedescriptor, printwriter, as);
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
        mStarted = true;
        if (!zzaaJ)
        {
            for (int i = 0; i < zzaaN.size(); i++)
            {
                ((zza)zzaaN.valueAt(i)).zzaaP.connect();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        mStarted = false;
        for (int i = 0; i < zzaaN.size(); i++)
        {
            ((zza)zzaaN.valueAt(i)).zzaaP.disconnect();
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
        onconnectionfailedlistener = new zza(i, googleapiclient, onconnectionfailedlistener);
        zzaaN.put(i, onconnectionfailedlistener);
        if (mStarted && !zzaaJ)
        {
            googleapiclient.connect();
        }
    }

    public void zzbi(int i)
    {
        zza zza1 = (zza)zzaaN.get(i);
        zzaaN.remove(i);
        if (zza1 != null)
        {
            zza1.zznK();
        }
    }
}
