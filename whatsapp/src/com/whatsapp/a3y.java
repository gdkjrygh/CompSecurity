// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.RemoteException;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            dc, _7, App

class a3y
    implements Runnable
{

    private static final String z;
    final dc a;
    _7 b;

    a3y(dc dc1, _7 _p7)
    {
        a = dc1;
        super();
        b = _p7;
    }

    public void run()
    {
        if (dc.g(a) != 1) goto _L2; else goto _L1
_L1:
        b.a();
        dc.d(a).removeMessages(5);
        dc.d(a).sendEmptyMessageDelayed(5, 60000L);
_L3:
        return;
        RemoteException remoteexception;
        remoteexception;
        Log.e((new StringBuilder()).append(z).append(remoteexception.toString()).toString());
        android.os.Message message = dc.d(a).obtainMessage(3, 0, 0, this);
        dc.d(a).sendMessageAtFrontOfQueue(message);
        message = dc.d(a).obtainMessage(4, 0, 0, null);
        dc.d(a).sendMessageAtFrontOfQueue(message);
        if (App.am == 0) goto _L3; else goto _L2
_L2:
        android.os.Message message1 = dc.d(a).obtainMessage(3, 0, 0, this);
        dc.d(a).sendMessageAtFrontOfQueue(message1);
        return;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "%\027\026j8;\002Bj<;\027\bb/z\004\nj2!\023Bb%6\023\037s4:\030O".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 93;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 85;
          goto _L8
_L3:
        byte0 = 118;
          goto _L8
_L4:
        byte0 = 111;
          goto _L8
        byte0 = 7;
          goto _L8
    }
}
