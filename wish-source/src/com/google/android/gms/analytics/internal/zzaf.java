// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zze, zzae, zzb

class zzaf extends BroadcastReceiver
{

    static final String zzIs = com/google/android/gms/analytics/internal/zzaf.getName();
    private final zze zzFD;
    private boolean zzIt;
    private boolean zzIu;

    zzaf(zze zze1)
    {
        zzv.zzr(zze1);
        zzFD = zze1;
    }

    private Context getContext()
    {
        return zzFD.getContext();
    }

    private zzb zzfZ()
    {
        return zzFD.zzfZ();
    }

    private zzae zzgH()
    {
        return zzFD.zzgH();
    }

    private void zziW()
    {
        zzgH();
        zzfZ();
    }

    public boolean isConnected()
    {
        if (!zzIt)
        {
            zzFD.zzgH().zzaI("Connectivity unknown. Receiver not registered");
        }
        return zzIu;
    }

    public boolean isRegistered()
    {
        return zzIt;
    }

    public void onReceive(Context context, Intent intent)
    {
        zziW();
        context = intent.getAction();
        zzFD.zzgH().zza("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = zziY();
            if (zzIu != flag)
            {
                zzIu = flag;
                zzfZ().zzG(flag);
            }
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context))
        {
            if (!intent.hasExtra(zzIs))
            {
                zzfZ().zzgA();
                return;
            }
        } else
        {
            zzFD.zzgH().zzd("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

    public void unregister()
    {
        if (!isRegistered())
        {
            return;
        }
        zzFD.zzgH().zzaF("Unregistering connectivity change receiver");
        zzIt = false;
        zzIu = false;
        Context context = getContext();
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            zzgH().zze("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public void zziV()
    {
        zziW();
        if (zzIt)
        {
            return;
        } else
        {
            Context context = getContext();
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentfilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentfilter);
            zzIu = zziY();
            zzFD.zzgH().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(zzIu));
            zzIt = true;
            return;
        }
    }

    public void zziX()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            return;
        } else
        {
            Context context = getContext();
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(context.getPackageName());
            intent.putExtra(zzIs, true);
            context.sendOrderedBroadcast(intent, null);
            return;
        }
    }

    protected boolean zziY()
    {
        Object obj = (ConnectivityManager)getContext().getSystemService("connectivity");
        boolean flag;
        try
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        }
        catch (SecurityException securityexception)
        {
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        flag = ((NetworkInfo) (obj)).isConnected();
        if (flag)
        {
            return true;
        }
        return false;
    }

}
