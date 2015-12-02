// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.util.Pair;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            akd, dc

class k5
    implements ServiceConnection
{

    private static final String z[];
    final dc a;
    final Runnable b;

    k5(dc dc1, Runnable runnable)
    {
        a = dc1;
        b = runnable;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.i(z[0]);
        componentname = com.android.vending.billing.IInAppBillingService.Stub.asInterface(ibinder);
        componentname = Pair.create(new akd(a, componentname, this), b);
        componentname = dc.d(a).obtainMessage(1, 0, 0, componentname);
        dc.d(a).sendMessageAtFrontOfQueue(componentname);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.i(z[1]);
        componentname = dc.d(a).obtainMessage(2, 0, 0, null);
        dc.d(a).sendMessageAtFrontOfQueue(componentname);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\n1!\026o\024$u\026k\0241?\036xU?6Vy\037\".\022i\037\177;\024d\0245;\017o\036";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\n1!\026o\024$u\026k\0241?\036xU?6Vy\037\".\022i\037\177<\022y\031?6\025o\031$=\037";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 122;
          goto _L9
_L5:
        byte0 = 80;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 123;
          goto _L9
    }
}
