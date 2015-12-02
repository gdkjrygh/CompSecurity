// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Environment;
import android.view.View;
import com.whatsapp.util.c1;

// Referenced classes of package com.whatsapp:
//            App, Conversation, ali, og

class a_z
    implements android.view.View.OnClickListener
{

    private static final String z;
    final Conversation a;

    a_z(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
label1:
            {
                int i = App.am;
                Conversation.ae(a).dismiss();
                if (!Environment.getExternalStorageState().equals(z))
                {
                    a.showDialog(15);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                if (a.aD.k())
                {
                    view = a.getString(0x7f0e01ae, new Object[] {
                        a.aD.a(a)
                    });
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                view = a.getString(0x7f0e037d, new Object[] {
                    a.aD.a(a)
                });
            }
            c1.a(a, view);
            Conversation.a0 = false;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "h\004(B\002`\017".toCharArray();
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
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 118;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 5;
          goto _L8
_L3:
        byte0 = 107;
          goto _L8
_L4:
        byte0 = 93;
          goto _L8
        byte0 = 44;
          goto _L8
    }
}
