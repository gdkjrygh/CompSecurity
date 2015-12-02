// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.whatsapp:
//            App, qd

public class  extends DialogFragment
{

    private static final String z[];

    private static DialogFragment a(int i)
    {
          = new <init>();
        Bundle bundle = new Bundle();
        bundle.putInt(z[2], i);
        .setArguments(bundle);
        return ;
    }

    private static DialogFragment a(String s)
    {
        z z1 = new <init>();
        Bundle bundle = new Bundle();
        bundle.putString(z[3], s);
        z1.setArguments(bundle);
        return z1;
    }

    static DialogFragment b(int i)
    {
        return a(i);
    }

    static DialogFragment b(String s)
    {
        return a(s);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
label0:
        {
            int i = getArguments().getInt(z[1]);
            if (i == 0)
            {
                bundle = getArguments().getString(z[0]);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            bundle = getString(i);
        }
        return (new android.app..getString(getActivity())).getActivity(bundle).getActivity(true).getActivity(0x7f0e02ba, new qd(this)).();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "e\005!\031\000o\005";
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
                obj = "a\004";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "a\004";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "e\005!\031\000o\005";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 97;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 8;
          goto _L9
_L5:
        byte0 = 96;
          goto _L9
_L6:
        byte0 = 82;
          goto _L9
        byte0 = 106;
          goto _L9
    }

    public ()
    {
    }
}
