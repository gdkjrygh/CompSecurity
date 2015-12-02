// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.asw;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;

// Referenced classes of package com.whatsapp.camera:
//            s, CameraActivity, ShutterOverlay, at

class t
    implements s
{

    private static final String z[];
    final CameraActivity a;

    t(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void a()
    {
        CameraActivity.p(a).setOn();
    }

    public void a(byte abyte0[], boolean flag)
    {
        Log.i(z[0]);
        a.findViewById(0x7f0b00f9).setVisibility(0);
        asw.a(new at(this, c1.a(a, z[1], (byte)1, 0, false), abyte0, flag), new Void[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "Qd.YjSd HqDl7E7Bl Hm@`7]sWk";
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
                obj = "\034o3Y\177";
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
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 24;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 50;
          goto _L9
_L5:
        byte0 = 5;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 60;
          goto _L9
    }
}
