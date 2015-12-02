// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.whatsapp:
//            App, k, atc, m

public class  extends DialogFragment
{

    private static final String z;

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = App.az.e(getArguments().getString(z));
        return (new android.app..z(getActivity())).getActivity(0x7f0e0146).getActivity(0x7f0e0053, new atc(this, bundle)).(0x7f0e04b4, new m(this, bundle)).();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Qy2".toCharArray();
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
        byte byte0 = 87;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 59;
          goto _L8
_L3:
        byte0 = 16;
          goto _L8
_L4:
        byte0 = 86;
          goto _L8
        byte0 = 113;
          goto _L8
    }

    public ()
    {
    }
}
