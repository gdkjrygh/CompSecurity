// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzqs

public class zzqx extends zzi
{
    private static class zza extends zzqv.zza
    {

        public void zza(int i, FullWallet fullwallet, Bundle bundle)
        {
        }

        public void zza(int i, MaskedWallet maskedwallet, Bundle bundle)
        {
        }

        public void zza(int i, boolean flag, Bundle bundle)
        {
        }

        public void zza(Status status, GetBuyFlowInitializationTokenResponse getbuyflowinitializationtokenresponse, Bundle bundle)
        {
        }

        public void zza(Status status, GetInstrumentsResponse getinstrumentsresponse, Bundle bundle)
        {
        }

        public void zzb(int i, boolean flag, Bundle bundle)
        {
        }

        public void zzj(int i, Bundle bundle)
        {
        }

        private zza()
        {
        }

    }

    static final class zzb extends zza
    {

        private final int zzZY;
        private final WeakReference zzaSu;

        public void zza(int i, FullWallet fullwallet, Bundle bundle)
        {
            Activity activity = (Activity)zzaSu.get();
            if (activity == null)
            {
                Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
                return;
            }
            Object obj = null;
            if (bundle != null)
            {
                obj = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, ((PendingIntent) (obj)));
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(activity, zzZY);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (FullWallet fullwallet)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", fullwallet);
                }
                return;
            }
            obj = new Intent();
            byte byte0;
            if (bundle.isSuccess())
            {
                byte0 = -1;
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullwallet);
            } else
            {
                if (i == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            }
            fullwallet = activity.createPendingResult(zzZY, ((Intent) (obj)), 0x40000000);
            if (fullwallet == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                return;
            }
            try
            {
                fullwallet.send(byte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (FullWallet fullwallet)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", fullwallet);
            }
        }

        public void zza(int i, MaskedWallet maskedwallet, Bundle bundle)
        {
            Activity activity = (Activity)zzaSu.get();
            if (activity == null)
            {
                Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
                return;
            }
            Object obj = null;
            if (bundle != null)
            {
                obj = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, ((PendingIntent) (obj)));
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(activity, zzZY);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (MaskedWallet maskedwallet)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", maskedwallet);
                }
                return;
            }
            obj = new Intent();
            byte byte0;
            if (bundle.isSuccess())
            {
                byte0 = -1;
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedwallet);
            } else
            {
                if (i == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            }
            maskedwallet = activity.createPendingResult(zzZY, ((Intent) (obj)), 0x40000000);
            if (maskedwallet == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                return;
            }
            try
            {
                maskedwallet.send(byte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MaskedWallet maskedwallet)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", maskedwallet);
            }
        }

        public void zza(int i, boolean flag, Bundle bundle)
        {
            bundle = (Activity)zzaSu.get();
            if (bundle == null)
            {
                Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", flag);
            bundle = bundle.createPendingResult(zzZY, intent, 0x40000000);
            if (bundle == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
                return;
            }
            try
            {
                bundle.send(-1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", bundle);
            }
        }

        public void zzb(int i, boolean flag, Bundle bundle)
        {
            bundle = (Activity)zzaSu.get();
            if (bundle == null)
            {
                Log.d("WalletClientImpl", "Ignoring onIsNewUserDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("com.google.android.gms.wallet.EXTRA_IS_NEW_USER", flag);
            bundle = bundle.createPendingResult(zzZY, intent, 0x40000000);
            if (bundle == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onIsNewUserDetermined");
                return;
            }
            try
            {
                bundle.send(-1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", bundle);
            }
        }

        public void zzj(int i, Bundle bundle)
        {
            zzu.zzb(bundle, "Bundle should not be null");
            Activity activity = (Activity)zzaSu.get();
            if (activity == null)
            {
                Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
                return;
            }
            bundle = new ConnectionResult(i, (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(activity, zzZY);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", bundle);
                }
                return;
            }
            Log.e("WalletClientImpl", (new StringBuilder()).append("Create Wallet Objects confirmation UI will not be shown connection result: ").append(bundle).toString());
            bundle = new Intent();
            bundle.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
            bundle = activity.createPendingResult(zzZY, bundle, 0x40000000);
            if (bundle == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
                return;
            }
            try
            {
                bundle.send(1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", bundle);
            }
        }

        public zzb(Activity activity, int i)
        {
            zzaSu = new WeakReference(activity);
            zzZY = i;
        }
    }


    private final Activity mActivity;
    private final int mTheme;
    private final String zzOx;
    private final int zzaRH;

    public zzqx(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i, String s, int j)
    {
        super(activity, looper, 4, connectioncallbacks, onconnectionfailedlistener);
        mActivity = activity;
        zzaRH = i;
        zzOx = s;
        mTheme = j;
    }

    private Bundle zzAL()
    {
        return zza(zzaRH, mActivity.getPackageName(), zzOx, mTheme);
    }

    public static Bundle zza(int i, String s, String s1, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putString("androidPackageName", s);
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(s1, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", j);
        return bundle;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public boolean requiresAccount()
    {
        return true;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzdL(ibinder);
    }

    public void zza(FullWalletRequest fullwalletrequest, int i)
    {
        zzb zzb1 = new zzb(mActivity, i);
        Bundle bundle = zzAL();
        try
        {
            ((zzqs)zznM()).zza(fullwalletrequest, bundle, zzb1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FullWalletRequest fullwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", fullwalletrequest);
        }
        zzb1.zza(8, null, Bundle.EMPTY);
    }

    public void zza(MaskedWalletRequest maskedwalletrequest, int i)
    {
        Bundle bundle = zzAL();
        zzb zzb1 = new zzb(mActivity, i);
        try
        {
            ((zzqs)zznM()).zza(maskedwalletrequest, bundle, zzb1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", maskedwalletrequest);
        }
        zzb1.zza(8, null, Bundle.EMPTY);
    }

    public void zza(NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        Bundle bundle = zzAL();
        try
        {
            ((zzqs)zznM()).zza(notifytransactionstatusrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (NotifyTransactionStatusRequest notifytransactionstatusrequest)
        {
            return;
        }
    }

    protected zzqs zzdL(IBinder ibinder)
    {
        return zzqs.zza.zzdH(ibinder);
    }

    public void zze(String s, String s1, int i)
    {
        Bundle bundle = zzAL();
        zzb zzb1 = new zzb(mActivity, i);
        try
        {
            ((zzqs)zznM()).zza(s, s1, bundle, zzb1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", s);
        }
        zzb1.zza(8, null, Bundle.EMPTY);
    }

    public void zzjB(int i)
    {
        Bundle bundle = zzAL();
        zzb zzb1 = new zzb(mActivity, i);
        try
        {
            ((zzqs)zznM()).zza(bundle, zzb1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", remoteexception);
        }
        zzb1.zza(8, false, Bundle.EMPTY);
    }

    public void zzjC(int i)
    {
        Bundle bundle = zzAL();
        zzb zzb1 = new zzb(mActivity, i);
        try
        {
            ((zzqs)zznM()).zzb(bundle, zzb1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("WalletClientImpl", "RemoteException during isNewUser", remoteexception);
        }
        zzb1.zzb(8, false, Bundle.EMPTY);
    }
}
