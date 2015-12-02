// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.f;
import de.greenrobot.event.g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import org.V;
import org.t;

// Referenced classes of package com.whatsapp:
//            App, NtpUpdateReceiver, d

class al1
    implements Runnable
{

    private static final String z[];
    final NtpUpdateReceiver a;

    al1(NtpUpdateReceiver ntpupdatereceiver)
    {
        a = ntpupdatereceiver;
        super();
    }

    public void run()
    {
        Object obj;
        V v;
        t t1;
        try
        {
            obj = App.aB.a(NtpUpdateReceiver.a(a));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.c((new StringBuilder()).append(z[0]).append(NtpUpdateReceiver.a(a)).toString(), ((Throwable) (obj)));
            return;
        }
        v = new V();
        v.a(20000);
        try
        {
            v.a();
            t1 = v.a((InetAddress)((List) (obj)).get(0));
            v.b();
        }
        catch (IOException ioexception)
        {
            Log.c((new StringBuilder()).append(z[2]).append(NtpUpdateReceiver.a(a)).append(z[1]).append(((List) (obj)).get(0)).toString(), ioexception);
            return;
        }
        t1.b();
        obj = t1.a();
        if (obj != null)
        {
            long l = System.currentTimeMillis();
            long l1 = SystemClock.elapsedRealtime();
            long l2 = ((Long) (obj)).longValue();
            g.a().b(new d((l2 + l) - l1));
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "H#;\beXm.\005)O()\005eK(z\004}Mm)\017{K((J";
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
                obj = "\035,.J{X>5\006\177X)z\013mY??\031z\035";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "H#;\beXm.\005)O(.\030`X;?JgI=z\036`P(z\f{R z";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 9;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 61;
          goto _L9
_L5:
        byte0 = 77;
          goto _L9
_L6:
        byte0 = 90;
          goto _L9
        byte0 = 106;
          goto _L9
    }
}
