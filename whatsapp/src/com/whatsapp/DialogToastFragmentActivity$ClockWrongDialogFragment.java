// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            all

public class b extends DialogFragment
{

    private static final String z;
    boolean b;

    public void onConfigurationChanged(Configuration configuration)
    {
        b = false;
        dismiss();
        (new <init>()).show(getActivity().getSupportFragmentManager(), getClass().getName());
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Log.w(z);
        return all.d(getActivity());
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (b && getActivity() != null)
        {
            getActivity().finish();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "n\035SL6b\033_EvaR]Eve\031\023^ki\034Y".toCharArray();
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
        byte byte0 = 25;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 6;
          goto _L8
_L3:
        byte0 = 114;
          goto _L8
_L4:
        byte0 = 62;
          goto _L8
        byte0 = 41;
          goto _L8
    }

    public ()
    {
        b = true;
    }
}
