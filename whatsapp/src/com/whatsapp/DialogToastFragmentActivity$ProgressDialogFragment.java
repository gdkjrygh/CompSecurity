// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.whatsapp:
//            App

public class setArguments extends DialogFragment
{

    private static final String z[];
    private boolean b;

    static DialogFragment a(int i, int j)
    {
        return b(i, j);
    }

    private static DialogFragment b(int i, int j)
    {
        b b1 = new <init>();
        Bundle bundle = new Bundle();
        bundle.putInt(z[5], i);
        bundle.putInt(z[4], j);
        b1.setArguments(bundle);
        return b1;
    }

    public void a()
    {
label0:
        {
            if (isResumed())
            {
                dismiss();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b = true;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        int i = getArguments().getInt(z[3]);
        int j = getArguments().getInt(z[2]);
        bundle = new ProgressDialog(getActivity());
        if (i != 0)
        {
            bundle.setTitle(getString(i));
        }
        bundle.setMessage(getString(j));
        bundle.setIndeterminate(true);
        bundle.setCancelable(false);
        return bundle;
    }

    public void onStart()
    {
        super.onStart();
        if (b)
        {
            dismiss();
            b = false;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "7oi\f~\034oy";
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
                obj = ".cn\023z$cB\t\177";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ".cn\023z$cB\t\177";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "7oi\f~\034oy";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = ".cn\023z$cB\t\177";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "7oi\f~\034oy";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 27;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 67;
          goto _L9
_L5:
        byte1 = 6;
          goto _L9
_L6:
        byte1 = 29;
          goto _L9
        byte1 = 96;
          goto _L9
    }

    public ()
    {
        b = false;
        Bundle bundle = new Bundle();
        bundle.putInt(z[0], 0x7f0e02f8);
        bundle.putInt(z[1], 0x7f0e0353);
        setArguments(bundle);
    }
}
