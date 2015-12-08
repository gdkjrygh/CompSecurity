// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.stats.b;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.internal:
//            y, au, ab, aa

final class z extends y
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final b d = com.google.android.gms.common.stats.b.a();
    private final long e = 5000L;

    z(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(z z1)
    {
        return z1.a;
    }

    private boolean a(aa aa1, ServiceConnection serviceconnection, String s)
    {
        au.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        ab ab1 = (ab)a.get(aa1);
        if (ab1 != null) goto _L2; else goto _L1
_L1:
        ab1 = new ab(this, aa1);
        ab1.a(serviceconnection, s);
        ab1.a(s);
        a.put(aa1, ab1);
        aa1 = ab1;
_L7:
        boolean flag = aa1.a();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, ab1);
        if (ab1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(aa1).toString());
        }
        break MISSING_BLOCK_LABEL_136;
        aa1;
        hashmap;
        JVM INSTR monitorexit ;
        throw aa1;
        ab1.a(serviceconnection, s);
        ab1.b();
        JVM INSTR tableswitch 1 2: default 206
    //                   1 172
    //                   2 194;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(ab1.e(), ab1.d());
        aa1 = ab1;
        continue; /* Loop/switch isn't completed */
_L5:
        ab1.a(s);
        aa1 = ab1;
        continue; /* Loop/switch isn't completed */
_L3:
        aa1 = ab1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(z z1)
    {
        return z1.b;
    }

    private void b(aa aa1, ServiceConnection serviceconnection, String s)
    {
        au.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        ab ab1 = (ab)a.get(aa1);
        if (ab1 != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service config: ").append(aa1).toString());
        aa1;
        hashmap;
        JVM INSTR monitorexit ;
        throw aa1;
        if (!ab1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(aa1).toString());
        }
        ab1.b(serviceconnection, s);
        if (ab1.c())
        {
            aa1 = c.obtainMessage(0, ab1);
            c.sendMessageDelayed(aa1, e);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    static b c(z z1)
    {
        return z1.d;
    }

    public boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new aa(s), serviceconnection, s1);
    }

    public void b(String s, ServiceConnection serviceconnection, String s1)
    {
        b(new aa(s), serviceconnection, s1);
    }

    public boolean handleMessage(Message message)
    {
        ab ab1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            ab1 = (ab)message.obj;
            break;
        }
        synchronized (a)
        {
            if (ab1.c())
            {
                if (ab1.a())
                {
                    ab1.b("GmsClientSupervisor");
                }
                a.remove(ab.a(ab1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
