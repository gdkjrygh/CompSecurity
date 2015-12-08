// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzqx

static final class zzZY extends zzZY
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

    public on(Activity activity, int i)
    {
        super(null);
        zzaSu = new WeakReference(activity);
        zzZY = i;
    }
}
