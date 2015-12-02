// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            all

public class  extends DialogFragment
{

    private static final String z;

    public Dialog onCreateDialog(Bundle bundle)
    {
        Log.w(z);
        return all.b(getActivity());
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        dialoginterface = getActivity();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "qT8\034f}R4\025&~\033&\026/mL4\013,4^-\t k^1".toCharArray();
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
        byte byte0 = 73;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 25;
          goto _L8
_L3:
        byte0 = 59;
          goto _L8
_L4:
        byte0 = 85;
          goto _L8
        byte0 = 121;
          goto _L8
    }

    public ()
    {
    }
}
