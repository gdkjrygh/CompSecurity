// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            c8, VoipActivity, VoiceService, Voip

class afe
    implements ServiceConnection
{

    private static final String z[];
    final VoipActivity a;

    afe(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.i(z[0]);
        componentname = (c8)ibinder;
        VoipActivity.a(a, true);
        VoipActivity.a(a, componentname.a());
        VoipActivity.d(a).a(a);
        componentname = Voip.getCallInfo();
        a.a(Voip.CallState.NONE, componentname);
        VoipActivity.a(a);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.i(z[1]);
        VoipActivity.d(a).a(null);
        VoipActivity.a(a, null);
        VoipActivity.a(a, false);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "Ti&T\013ti&TeAr&RMV\177`KJqc=RMAc\fKJLc,PAF";
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
                obj = "Ti&T\013ti&TeAr&RMV\177`KJqc=RMAc\013MWAi!JAAr*@";
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
        byte byte0 = 36;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 34;
          goto _L9
_L5:
        byte0 = 6;
          goto _L9
_L6:
        byte0 = 79;
          goto _L9
        byte0 = 36;
          goto _L9
    }
}
