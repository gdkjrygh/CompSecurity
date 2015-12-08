// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal:
//            fs, fl

public final class fr
    implements android.os.Handler.Callback
{

    private static final Object a = new Object();
    private static fr b;
    private final Context c;
    private final HashMap d = new HashMap();
    private final Handler e;

    private fr(Context context)
    {
        e = new Handler(context.getMainLooper(), this);
        c = context.getApplicationContext();
    }

    public static fr a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new fr(context.getApplicationContext());
            }
        }
        return b;
    }

    static HashMap a(fr fr1)
    {
        return fr1.d;
    }

    public final boolean a(String s, fl fl1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        fs fs1 = (fs)d.get(s);
        if (fs1 != null) goto _L2; else goto _L1
_L1:
        fs1 = new fs(this, s);
        fs1.a(fl1);
        fl1 = (new Intent(s)).setPackage("com.google.android.gms");
        fs1.a(c.bindService(fl1, fs1.a(), 129));
        d.put(s, fs1);
        s = fs1;
_L7:
        boolean flag = s.c();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e.removeMessages(0, fs1);
        if (fs1.c(fl1))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=")).append(s).toString());
        }
        break MISSING_BLOCK_LABEL_144;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        fs1.a(fl1);
        fs1.d();
        JVM INSTR tableswitch 1 2: default 231
    //                   1 176
    //                   2 193;
           goto _L3 _L4 _L5
_L4:
        fl1.onServiceConnected(fs1.g(), fs1.f());
        s = fs1;
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new Intent(s)).setPackage("com.google.android.gms");
        fs1.a(c.bindService(s, fs1.a(), 129));
        s = fs1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = fs1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b(String s, fl fl1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        fs fs1 = (fs)d.get(s);
        if (fs1 != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service action: ")).append(s).toString());
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        if (!fs1.c(fl1))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=")).append(s).toString());
        }
        fs1.b(fl1);
        if (fs1.e())
        {
            s = e.obtainMessage(0, fs1);
            e.sendMessageDelayed(s, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final boolean handleMessage(Message message)
    {
        fs fs1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            fs1 = (fs)message.obj;
            break;
        }
        synchronized (d)
        {
            if (fs1.e())
            {
                c.unbindService(fs1.a());
                d.remove(fs1.b());
            }
        }
        return true;
    }

}
