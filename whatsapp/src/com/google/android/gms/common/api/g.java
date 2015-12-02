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
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common.api:
//            Api, GoogleApiClient

public class g extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private boolean KC;
    private int KD;
    private ConnectionResult KE;
    private final Handler KF = new Handler(Looper.getMainLooper());
    private final SparseArray KG = new SparseArray();

    public g()
    {
        KD = -1;
    }

    public static g a(FragmentActivity fragmentactivity)
    {
label0:
        {
            jx.aU("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            try
            {
                fragmentactivity = (g)fragmentmanager.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (fragmentactivity != null)
            {
                boolean flag;
                try
                {
                    flag = fragmentactivity.isRemoving();
                }
                // Misplaced declaration of an exception variable
                catch (FragmentActivity fragmentactivity)
                {
                    throw fragmentactivity;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            fragmentactivity = new g();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void a(int i, ConnectionResult connectionresult)
    {
        try
        {
            if (!KC)
            {
                KC = true;
                KD = i;
                KE = connectionresult;
                KF.post(new c(i, connectionresult));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ConnectionResult connectionresult)
        {
            throw connectionresult;
        }
    }

    static void a(g g1)
    {
        g1.gR();
    }

    static void a(g g1, int i, ConnectionResult connectionresult)
    {
        g1.b(i, connectionresult);
    }

    private void aq(int i)
    {
        try
        {
            if (i == KD)
            {
                gR();
            }
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw classcastexception;
        }
    }

    private void b(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)KG.get(i);
        if (obj != null)
        {
            ao(i);
            obj = ((b) (obj)).KK;
            if (obj != null)
            {
                try
                {
                    ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
                }
                // Misplaced declaration of an exception variable
                catch (ConnectionResult connectionresult)
                {
                    throw connectionresult;
                }
            }
        }
        gR();
    }

    private void gR()
    {
        int i = 0;
        int j = Api.a;
        KC = false;
        KD = -1;
        KE = null;
        LoaderManager loadermanager = getLoaderManager();
        do
        {
            if (i >= KG.size())
            {
                break;
            }
            int k = KG.keyAt(i);
            a a1 = ap(k);
            if (a1 != null)
            {
                try
                {
                    a1.gS();
                }
                catch (ClassCastException classcastexception)
                {
                    throw classcastexception;
                }
            }
            loadermanager.initLoader(k, null, this);
            i++;
        } while (j == 0);
    }

    public void a(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        int j;
        boolean flag;
        try
        {
            jx.b(googleapiclient, "GoogleApiClient instance cannot be null");
            j = KG.indexOfKey(i);
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw googleapiclient;
        }
        if (j < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        googleapiclient = new b(googleapiclient, onconnectionfailedlistener, null);
        try
        {
            KG.put(i, googleapiclient);
            if (getActivity() != null)
            {
                getLoaderManager().initLoader(i, null, this);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw googleapiclient;
        }
    }

    public void a(Loader loader, ConnectionResult connectionresult)
    {
        boolean flag;
        try
        {
            flag = connectionresult.isSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader)
        {
            try
            {
                throw loader;
            }
            // Misplaced declaration of an exception variable
            catch (Loader loader)
            {
                throw loader;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        aq(loader.getId());
        if (Api.a == 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a(loader.getId(), connectionresult);
        return;
    }

    public GoogleApiClient an(int i)
    {
        if (getActivity() != null)
        {
            Object obj = ap(i);
            if (obj != null)
            {
                try
                {
                    obj = ((a) (obj)).KH;
                }
                catch (ClassCastException classcastexception)
                {
                    throw classcastexception;
                }
                return ((GoogleApiClient) (obj));
            }
        }
        return null;
    }

    public void ao(int i)
    {
        getLoaderManager().destroyLoader(i);
        KG.remove(i);
    }

    a ap(int i)
    {
        a a1;
        try
        {
            a1 = (a)getLoaderManager().getLoader(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", classcastexception);
        }
        return a1;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        int k;
        flag1 = true;
        k = Api.a;
        flag = false;
        flag2 = false;
        i;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 96
    //                   2 69;
           goto _L1 _L2 _L3
_L1:
        flag = flag2;
_L8:
        i = ((flag) ? 1 : 0);
_L10:
        if (i == 0) goto _L5; else goto _L4
_L4:
        try
        {
            gR();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (k == 0) goto _L6; else goto _L5
_L5:
        b(KD, KE);
_L6:
        return;
_L3:
        try
        {
            i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity());
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        flag = flag2;
        if (i != 0) goto _L8; else goto _L7
_L7:
        i = ((flag1) ? 1 : 0);
        if (k == 0) goto _L10; else goto _L9
_L9:
        flag = true;
_L2:
        if (j != -1) goto _L8; else goto _L11
_L11:
        i = ((flag1) ? 1 : 0);
          goto _L10
    }

    public void onAttach(Activity activity)
    {
        int i;
        int j;
        j = Api.a;
        super.onAttach(activity);
        i = 0;
_L7:
        if (i >= KG.size()) goto _L2; else goto _L1
_L1:
        int k;
        k = KG.keyAt(i);
        activity = ap(k);
        if (activity == null) goto _L4; else goto _L3
_L3:
        Object obj = (b)KG.valueAt(i);
        obj = ((b) (obj)).KH;
        activity = ((a) (activity)).KH;
        if (obj == activity) goto _L4; else goto _L5
_L5:
        try
        {
            getLoaderManager().restartLoader(k, null, this);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        if (j == 0) goto _L6; else goto _L4
_L4:
        getLoaderManager().initLoader(k, null, this);
          goto _L6
        activity;
        throw activity;
_L8:
        i++;
          goto _L7
_L6:
        if (j == 0) goto _L8; else goto _L2
_L2:
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        b(KD, KE);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            try
            {
                KC = bundle.getBoolean("resolving_error", false);
                KD = bundle.getInt("failed_client_id", -1);
                if (KD >= 0)
                {
                    KE = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        break MISSING_BLOCK_LABEL_75;
        bundle;
        throw bundle;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new a(getActivity(), ((b)KG.get(i)).KH);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ConnectionResult)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        try
        {
            if (loader.getId() == KD)
            {
                gR();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader)
        {
            throw loader;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("resolving_error", KC);
            if (KD >= 0)
            {
                bundle.putInt("failed_client_id", KD);
                bundle.putInt("failed_status", KE.getErrorCode());
                bundle.putParcelable("failed_resolution", KE.getResolution());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    public void onStart()
    {
        int j = Api.a;
        super.onStart();
        if (!KC)
        {
            int i = 0;
            do
            {
                if (i >= KG.size())
                {
                    break;
                }
                getLoaderManager().initLoader(KG.keyAt(i), null, this);
                i++;
            } while (j == 0);
        }
    }

    private class c
        implements Runnable
    {

        private final int KL;
        private final ConnectionResult KM;
        final g KN;

        public void run()
        {
            int i = Api.a;
            if (!KM.hasResolution()) goto _L2; else goto _L1
_L1:
            int j = KN.getActivity().getSupportFragmentManager().getFragments().indexOf(KN);
            KM.startResolutionForResult(KN.getActivity(), (j + 1 << 16) + 1);
_L3:
            return;
            android.content.IntentSender.SendIntentException sendintentexception;
            sendintentexception;
            g.a(KN);
            if (i == 0) goto _L3; else goto _L2
_L2:
            boolean flag = GooglePlayServicesUtil.isUserRecoverableError(KM.getErrorCode());
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                GooglePlayServicesUtil.showErrorDialogFragment(KM.getErrorCode(), KN.getActivity(), KN, 2, KN);
            }
            // Misplaced declaration of an exception variable
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                throw sendintentexception;
            }
            if (i == 0) goto _L3; else goto _L4
_L4:
            g.a(KN, KL, KM);
            return;
            sendintentexception;
            throw sendintentexception;
            sendintentexception;
            throw sendintentexception;
        }

        public c(int i, ConnectionResult connectionresult)
        {
            KN = g.this;
            super();
            KL = i;
            KM = connectionresult;
        }
    }


    private class b
    {

        public final GoogleApiClient KH;
        public final GoogleApiClient.OnConnectionFailedListener KK;

        private b(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            KH = googleapiclient;
            KK = onconnectionfailedlistener;
        }

        b(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, _cls1 _pcls1)
        {
            this(googleapiclient, onconnectionfailedlistener);
        }
    }


    private class a extends Loader
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient KH;
        private boolean KI;
        private ConnectionResult KJ;

        private void a(ConnectionResult connectionresult)
        {
            KJ = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public void gS()
        {
            if (KI)
            {
                KI = false;
                if (isStarted() && !isAbandoned())
                {
                    KH.connect();
                }
            }
        }

        public void onConnected(Bundle bundle)
        {
            KI = false;
            a(ConnectionResult.Iu);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            KI = true;
            a(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            KJ = null;
            KI = false;
            KH.unregisterConnectionCallbacks(this);
            KH.unregisterConnectionFailedListener(this);
            KH.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            KH.registerConnectionCallbacks(this);
            KH.registerConnectionFailedListener(this);
            if (KJ != null)
            {
                deliverResult(KJ);
            }
            if (!KH.isConnected() && !KH.isConnecting() && !KI)
            {
                KH.connect();
            }
        }

        protected void onStopLoading()
        {
            KH.disconnect();
        }

        public a(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            KH = googleapiclient;
        }
    }

}
