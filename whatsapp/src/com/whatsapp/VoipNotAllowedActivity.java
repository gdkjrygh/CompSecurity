// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity

public class VoipNotAllowedActivity extends DialogToastFragmentActivity
{

    private static final String z[];

    public VoipNotAllowedActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i(z[2]);
        VoipNotAllowedDialogFragment.a(getIntent().getStringExtra(z[1])).show(getSupportFragmentManager(), null);
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(z[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\034R?:-\005I7&/\005J3.\"\tI?<*\036Dy.&\031I$%:";
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
                obj = "\000T2";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\034R?:-\005I7&/\005J3.\"\tI?<*\036Dy)1\017\\\"/";
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
        byte byte0 = 67;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 106;
          goto _L9
_L5:
        byte0 = 61;
          goto _L9
_L6:
        byte0 = 86;
          goto _L9
        byte0 = 74;
          goto _L9
    }

    private class VoipNotAllowedDialogFragment extends DialogFragment
    {

        private static final String z[];

        static DialogFragment a(String s)
        {
            return b(s);
        }

        private static DialogFragment b(String s)
        {
            VoipNotAllowedDialogFragment voipnotalloweddialogfragment = new VoipNotAllowedDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[0], s);
            voipnotalloweddialogfragment.setArguments(bundle);
            return voipnotalloweddialogfragment;
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
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(getString(i, new Object[] {
                bundle.a(getActivity())
            })).setCancelable(true).setNeutralButton(0x7f0e02ba, new pv(this)).create();
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
        //                       0 149
        //                       1 155
        //                       2 161
        //                       3 167;
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

        public VoipNotAllowedDialogFragment()
        {
        }
    }

}
