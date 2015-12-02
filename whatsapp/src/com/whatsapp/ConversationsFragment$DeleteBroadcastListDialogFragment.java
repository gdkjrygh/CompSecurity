// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            App, k, og, xc, 
//            mf

public class  extends DialogFragment
{

    private static final String z;

    public Dialog onCreateDialog(Bundle bundle)
    {
        og og1;
label0:
        {
            og1 = App.az.e(getArguments().getString(z));
            if (TextUtils.isEmpty(og1.n))
            {
                bundle = getString(0x7f0e012c);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            bundle = getString(0x7f0e012b, new Object[] {
                og1.a(getActivity())
            });
        }
        return (new android.app..getActivity(getActivity())).getActivity(c.b(bundle, getActivity().getBaseContext())).getActivity(true).getActivity(0x7f0e007b, new xc(this)).(0x7f0e010e, new mf(this, og1)).();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ",Tg".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 97;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 70;
          goto _L8
_L3:
        byte0 = 61;
          goto _L8
_L4:
        byte0 = 3;
          goto _L8
        byte0 = 100;
          goto _L8
    }

    public ()
    {
    }
}
