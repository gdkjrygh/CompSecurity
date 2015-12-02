// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, VerifySms, ChangeNumber, o4

final class k9
    implements Runnable
{

    private static final String z[];

    k9()
    {
    }

    public void run()
    {
label0:
        {
            App.Me me = App.aE();
            if (me != null)
            {
                String s = me.jabber_id;
                Log.i((new StringBuilder()).append(z[2]).append(s).append(z[0]).append(App.Z.jabber_id).toString());
                ChangeNumber.e(VerifySms.a(me.cc, me.number));
                ChangeNumber.e().sendEmptyMessage(7);
                o4.O();
                App.at();
                ChangeNumber.a(App.au);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.w(z[1]);
            o4.O();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "RN\027!}";
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
                obj = "\021H\0238'\027N\007;\"\027R]$%\001P\03583\027\017\035=`\023L\0003!\026YR5(\023N\0253$M";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\021H\0238'\027N\007;\"\027R]$%\001P\03583\027\017\035=`\035L\026k";
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
        byte byte0 = 64;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 114;
          goto _L9
_L5:
        byte0 = 32;
          goto _L9
_L6:
        byte0 = 114;
          goto _L9
        byte0 = 86;
          goto _L9
    }
}
