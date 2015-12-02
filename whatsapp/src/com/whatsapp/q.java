// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            VerifyNumber

class q extends PhoneStateListener
{

    private static final String z[];
    final VerifyNumber a;

    q(VerifyNumber verifynumber)
    {
        a = verifynumber;
        super();
    }

    public void onCallForwardingIndicatorChanged(boolean flag)
    {
    }

    public void onCallStateChanged(int i, String s)
    {
    }

    public void onCellLocationChanged(CellLocation celllocation)
    {
        if (celllocation != null);
    }

    public void onDataActivity(int i)
    {
    }

    public void onDataConnectionStateChanged(int i)
    {
    }

    public void onDataConnectionStateChanged(int i, int j)
    {
    }

    public void onMessageWaitingIndicatorChanged(boolean flag)
    {
    }

    public void onServiceStateChanged(ServiceState servicestate)
    {
        if (servicestate == null)
        {
            return;
        } else
        {
            a.n = servicestate.getRoaming();
            Log.i((new StringBuilder()).append(z[4]).append(servicestate.getOperatorAlphaLong()).toString());
            Log.i((new StringBuilder()).append(z[0]).append(servicestate.getOperatorAlphaShort()).toString());
            Log.i((new StringBuilder()).append(z[1]).append(servicestate.getOperatorNumeric()).toString());
            Log.i((new StringBuilder()).append(z[2]).append(a.n).toString());
            Log.i((new StringBuilder()).append(z[3]).append(servicestate.getState()).toString());
            a.a(servicestate);
            return;
        }
    }

    public void onSignalStrengthChanged(int i)
    {
    }

    public void onSignalStrengthsChanged(SignalStrength signalstrength)
    {
        if (signalstrength != null);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "2\016\037}J=\005\030yN!\031BgI6\035\004wIi\030\031uX!D\002dI6\n\031{^i\n\001dD%F\036|C6\037M";
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
                obj = "2\016\037}J=\005\030yN!\031BgI6\035\004wIi\030\031uX!D\002dI6\n\031{^i\005\030yI6\002\0164";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "2\016\037}J=\005\030yN!\031BgI6\035\004wIi\030\031uX!D\037{M)\002\003s\f";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "2\016\037}J=\005\030yN!\031BgI6\035\004wIi\030\031uX!D\036`M0\016M";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "2\016\037}J=\005\030yN!\031BgI6\035\004wIi\030\031uX!D\002dI6\n\031{^i\n\001dD%F\001{B#K";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 44;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 68;
          goto _L9
_L5:
        byte1 = 107;
          goto _L9
_L6:
        byte1 = 109;
          goto _L9
        byte1 = 20;
          goto _L9
    }
}
