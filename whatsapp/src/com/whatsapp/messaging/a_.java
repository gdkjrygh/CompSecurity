// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.net.wifi.WifiManager;
import android.view.View;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            CaptivePortalActivity, h

class a_
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final CaptivePortalActivity a;
    final String b;
    final int c;

    a_(CaptivePortalActivity captiveportalactivity, int i, String s)
    {
        a = captiveportalactivity;
        c = i;
        b = s;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            Log.i((new StringBuilder()).append(z[2]).append(c).append(z[4]).append(b).toString());
            view = (WifiManager)a.getSystemService(z[5]);
            if (!view.removeNetwork(c))
            {
                Log.w((new StringBuilder()).append(z[0]).append(c).append(z[3]).append(b).toString());
                if (h.a == 0)
                {
                    break label0;
                }
            }
            if (!view.saveConfiguration())
            {
                Log.w((new StringBuilder()).append(z[1]).append(c).append(z[8]).append(b).toString());
            }
        }
        if (!view.disconnect())
        {
            Log.w((new StringBuilder()).append(z[6]).append(c).append(z[7]).append(b).toString());
        }
        a.finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "\021K)b_\006\016*h]\024A6f\t\005O-aL\007\016\"b[CY-k@C@!y^\f\\/-";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\020O2h\t\000A*k@\004[6l]\nA*-O\002G(hMCH+\177\t\024G\"d\t\rK0zF\021Ed";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\005A6jL\027Z-cNCY-k@C@!y^\f\\/-";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "C@%`L\007\016";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "C@%`L\007\016";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\024G\"d";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\005O-aL\007\0160b\t\007G7nF\r@!n]CH6bDCY-k@C@!y^\f\\/-";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "C@%`L\007\016";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "C@%`L\007\016";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 41;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 99;
          goto _L9
_L5:
        byte1 = 46;
          goto _L9
_L6:
        byte1 = 68;
          goto _L9
        byte1 = 13;
          goto _L9
    }
}
