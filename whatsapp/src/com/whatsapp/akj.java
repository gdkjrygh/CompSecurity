// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            cd, n9, fz

final class akj
    implements LocationListener
{

    private static final String z;
    final fz a;
    final n9 b;

    akj(fz fz, n9 n9_1)
    {
        a = fz;
        b = n9_1;
        super();
    }

    public void onLocationChanged(Location location)
    {
        if (location != null)
        {
            Log.i((new StringBuilder()).append(z).append(location.getTime()).append(" ").append(location.getAccuracy()).toString());
            x.a(new cd(a, location));
            b.a(this);
        }
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "R~Q\033\fPeM\020POcA\037\013JcLQ\034KmL\031\032G,".toCharArray();
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
        byte byte0 = 127;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 35;
          goto _L8
_L3:
        byte0 = 12;
          goto _L8
_L4:
        byte0 = 34;
          goto _L8
        byte0 = 126;
          goto _L8
    }
}
