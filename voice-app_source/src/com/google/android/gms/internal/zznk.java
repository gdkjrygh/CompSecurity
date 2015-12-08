// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zznm

public class zznk extends zzi
{
    public static final class zza extends zznl.zza
    {

        private Activity mActivity;
        private final int zzZY;

        private void setActivity(Activity activity)
        {
            mActivity = activity;
        }

        static void zza(zza zza1, Activity activity)
        {
            zza1.setActivity(activity);
        }

        public void zzh(int i, Bundle bundle)
        {
            if (i != 1) goto _L2; else goto _L1
_L1:
            Intent intent = new Intent();
            intent.putExtras(bundle);
            bundle = mActivity.createPendingResult(zzZY, intent, 0x40000000);
            if (bundle != null) goto _L4; else goto _L3
_L3:
            return;
_L4:
            try
            {
                bundle.send(1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("AddressClientImpl", "Exception settng pending result", bundle);
            }
            return;
_L2:
            PendingIntent pendingintent = null;
            if (bundle != null)
            {
                pendingintent = (PendingIntent)bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, pendingintent);
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(mActivity, zzZY);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception starting pending intent", bundle);
                }
                return;
            }
            bundle = mActivity.createPendingResult(zzZY, new Intent(), 0x40000000);
            if (bundle != null)
            {
                try
                {
                    bundle.send(1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception setting pending result", bundle);
                }
                return;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public zza(int i, Activity activity)
        {
            zzZY = i;
            mActivity = activity;
        }
    }


    private Activity mActivity;
    private final int mTheme;
    private final String zzOx;
    private zza zzawz;

    public zznk(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, int i)
    {
        super(activity, looper, 12, connectioncallbacks, onconnectionfailedlistener);
        zzOx = s;
        mActivity = activity;
        mTheme = i;
    }

    public void disconnect()
    {
        super.disconnect();
        if (zzawz != null)
        {
            zza.zza(zzawz, null);
            zzawz = null;
        }
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.identity.service.BIND";
    }

    public boolean requiresAccount()
    {
        return true;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzbO(ibinder);
    }

    public void zza(UserAddressRequest useraddressrequest, int i)
    {
        zzuc();
        zzawz = new zza(i, mActivity);
        try
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(zzOx))
            {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(zzOx, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", mTheme);
            zzub().zza(zzawz, useraddressrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UserAddressRequest useraddressrequest)
        {
            Log.e("AddressClientImpl", "Exception requesting user address", useraddressrequest);
        }
        useraddressrequest = new Bundle();
        useraddressrequest.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
        zzawz.zzh(1, useraddressrequest);
    }

    protected zznm zzbO(IBinder ibinder)
    {
        return zznm.zza.zzbQ(ibinder);
    }

    protected zznm zzub()
        throws DeadObjectException
    {
        return (zznm)super.zznM();
    }

    protected void zzuc()
    {
        super.zznL();
    }
}
