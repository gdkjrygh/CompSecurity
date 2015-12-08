// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.receiver:
//            a

public class NetWorkDynamicBroadcastReceiver extends BroadcastReceiver
{

    private static byte c[] = new byte[0];
    private static List d;
    private ConnectivityManager a;
    private NetworkInfo b;

    public NetWorkDynamicBroadcastReceiver()
    {
    }

    public static void a(a a1)
    {
        byte abyte0[] = c;
        abyte0;
        JVM INSTR monitorenter ;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (d != null)
        {
            d.remove(a1);
        }
        abyte0;
        JVM INSTR monitorexit ;
        return;
        a1;
        abyte0;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (a == null)
        {
            a = (ConnectivityManager)context.getSystemService("connectivity");
        }
        b = a.getActiveNetworkInfo();
        boolean flag;
        if (b != null && b.isAvailable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = c;
        context;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            for (intent = d.iterator(); intent.hasNext(); ((a)intent.next()).a(flag)) { }
        }
        break MISSING_BLOCK_LABEL_120;
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
        context;
        JVM INSTR monitorexit ;
_L2:
    }

}
