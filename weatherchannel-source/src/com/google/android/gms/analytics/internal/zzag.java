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
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf, zzb

class zzag extends BroadcastReceiver
{

    static final String zzMo = com/google/android/gms/analytics/internal/zzag.getName();
    private final zzf zzJy;
    private boolean zzMp;
    private boolean zzMq;

    zzag(zzf zzf1)
    {
        zzu.zzu(zzf1);
        zzJy = zzf1;
    }

    private Context getContext()
    {
        return zzJy.getContext();
    }

    private zzaf zzhQ()
    {
        return zzJy.zzhQ();
    }

    private zzb zzhl()
    {
        return zzJy.zzhl();
    }

    private void zzke()
    {
        zzhQ();
        zzhl();
    }

    public boolean isConnected()
    {
        if (!zzMp)
        {
            zzJy.zzhQ().zzaW("Connectivity unknown. Receiver not registered");
        }
        return zzMq;
    }

    public boolean isRegistered()
    {
        return zzMp;
    }

    public void onReceive(Context context, Intent intent)
    {
        zzke();
        context = intent.getAction();
        zzJy.zzhQ().zza("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = zzkg();
            if (zzMq != flag)
            {
                zzMq = flag;
                zzhl().zzG(flag);
            }
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context))
        {
            if (!intent.hasExtra(zzMo))
            {
                zzhl().zzhK();
                return;
            }
        } else
        {
            zzJy.zzhQ().zzd("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

    public void unregister()
    {
        if (!isRegistered())
        {
            return;
        }
        zzJy.zzhQ().zzaT("Unregistering connectivity change receiver");
        zzMp = false;
        zzMq = false;
        Context context = getContext();
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            zzhQ().zze("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public void zzkd()
    {
        zzke();
        if (zzMp)
        {
            return;
        } else
        {
            Context context = getContext();
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentfilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentfilter);
            zzMq = zzkg();
            zzJy.zzhQ().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(zzMq));
            zzMp = true;
            return;
        }
    }

    public void zzkf()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            return;
        } else
        {
            Context context = getContext();
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(context.getPackageName());
            intent.putExtra(zzMo, true);
            context.sendOrderedBroadcast(intent, null);
            return;
        }
    }

    protected boolean zzkg()
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
