// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            App, og, abu, ConversationsFragment

class n2
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final ConversationsFragment.ExitGroupDialogFragment a;
    final og b;

    n2(ConversationsFragment.ExitGroupDialogFragment exitgroupdialogfragment, og og1)
    {
        a = exitgroupdialogfragment;
        b = og1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            Log.i(z[0]);
            if (App.i())
            {
                Log.i((new StringBuilder()).append(z[1]).append(b).toString());
                App.d(b.a, true);
                x.a(new abu(this));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(a.getActivity().getBaseContext(), 0x7f0e0183, 0);
        }
        ConversationsFragment.b(ConversationsFragment.e() + 1);
        a.dismiss();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "hNl|<yRc~0dOq%,xDp'-yX/f<jWgM+dTr";
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
                i = 1;
                obj = "hNl|<yRc~0dOq%<sHv%>yNwzc";
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
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 89;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 11;
          goto _L9
_L5:
        byte0 = 33;
          goto _L9
_L6:
        byte0 = 2;
          goto _L9
        byte0 = 10;
          goto _L9
    }
}
