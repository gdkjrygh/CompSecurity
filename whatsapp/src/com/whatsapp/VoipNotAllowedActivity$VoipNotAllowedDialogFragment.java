// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.whatsapp:
//            App, k, og, jy, 
//            au2, wu, pv

public class  extends DialogFragment
{

    private static final String z[];

    static DialogFragment a(String s)
    {
        return b(s);
    }

    private static DialogFragment b(String s)
    {
        b b1 = new <init>();
        Bundle bundle = new Bundle();
        bundle.putString(z[0], s);
        b1.setArguments(bundle);
        return b1;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        int i;
label0:
        {
            int j = App.am;
            bundle = getArguments().getString(z[1]);
            bundle = App.az.e(bundle);
            if (((og) (bundle)).G == jy.FORWARD || !au2.e.a(((og) (bundle)).a))
            {
                i = 0x7f0e0498;
                if (j == 0)
                {
                    break label0;
                }
            }
            if (((og) (bundle)).G == jy.UPGRADE)
            {
                i = 0x7f0e0499;
                if (j == 0)
                {
                    break label0;
                }
            }
            i = 0x7f0e049a;
        }
        return (new android.app..z(getActivity())).getActivity(getString(i, new Object[] {
            bundle.a(getActivity())
        })).getActivity(true).getActivity(0x7f0e02ba, new pv(this)).();
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
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int l;
        as1 = as;
        obj = "|S\005".toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
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
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 54;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 22;
          goto _L9
_L5:
        byte0 = 58;
          goto _L9
_L6:
        byte0 = 97;
          goto _L9
        byte0 = 38;
          goto _L9
    }

    public ()
    {
    }
}
