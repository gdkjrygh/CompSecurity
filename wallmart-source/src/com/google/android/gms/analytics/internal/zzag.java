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
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf, zzb

class zzag extends BroadcastReceiver
{

    static final String zzOo = com/google/android/gms/analytics/internal/zzag.getName();
    private final zzf zzLy;
    private boolean zzOp;
    private boolean zzOq;

    zzag(zzf zzf1)
    {
        zzx.zzv(zzf1);
        zzLy = zzf1;
    }

    private Context getContext()
    {
        return zzLy.getContext();
    }

    private zzb zzhz()
    {
        return zzLy.zzhz();
    }

    private zzaf zzie()
    {
        return zzLy.zzie();
    }

    private void zzks()
    {
        zzie();
        zzhz();
    }

    public boolean isConnected()
    {
        if (!zzOp)
        {
            zzLy.zzie().zzbb("Connectivity unknown. Receiver not registered");
        }
        return zzOq;
    }

    public boolean isRegistered()
    {
        return zzOp;
    }

    public void onReceive(Context context, Intent intent)
    {
        zzks();
        context = intent.getAction();
        zzLy.zzie().zza("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = zzku();
            if (zzOq != flag)
            {
                zzOq = flag;
                zzhz().zzI(flag);
            }
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context))
        {
            if (!intent.hasExtra(zzOo))
            {
                zzhz().zzhY();
                return;
            }
        } else
        {
            zzLy.zzie().zzd("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

    public void unregister()
    {
        if (!isRegistered())
        {
            return;
        }
        zzLy.zzie().zzaY("Unregistering connectivity change receiver");
        zzOp = false;
        zzOq = false;
        Context context = getContext();
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            zzie().zze("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public void zzkr()
    {
        zzks();
        if (zzOp)
        {
            return;
        } else
        {
            Context context = getContext();
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentfilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentfilter);
            zzOq = zzku();
            zzLy.zzie().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(zzOq));
            zzOp = true;
            return;
        }
    }

    public void zzkt()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            return;
        } else
        {
            Context context = getContext();
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(context.getPackageName());
            intent.putExtra(zzOo, true);
            context.sendOrderedBroadcast(intent, null);
            return;
        }
    }

    protected boolean zzku()
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
