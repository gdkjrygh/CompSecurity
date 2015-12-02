// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            m7

public class  extends DialogFragment
{

    private static final String z;

    public Dialog onCreateDialog(Bundle bundle)
    {
        Log.i(z);
        return m7.a(getActivity());
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "i<l)\016e:` Nfsr#Gu$`>D,2c#Tu~u#\fd+q%Sd".toCharArray();
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
    //                   1 91
    //                   2 97
    //                   3 102;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_102;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 33;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 1;
          goto _L8
_L3:
        byte0 = 83;
          goto _L8
_L4:
        byte0 = 1;
          goto _L8
        byte0 = 76;
          goto _L8
    }

    public ()
    {
    }
}
