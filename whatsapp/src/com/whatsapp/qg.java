// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            Conversation, App, a99, asw

class qg
    implements com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener
{

    private static final String z;
    final Conversation a;

    qg(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onMenuVisibilityChanged(boolean flag)
    {
label0:
        {
            Log.i((new StringBuilder()).append(z).append(flag).toString());
            if (!flag || Conversation.f(a) == null)
            {
                break label0;
            }
            if (Conversation.L(a) != null)
            {
                Conversation.f(a).setEnabled(Conversation.L(a).booleanValue());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.f(a).setEnabled(false);
            asw.a(new a99(this), new Void[0]);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Y5:\005*H)5\007&U4{\034!w?:\006\031S)=\021&V3 \n\fR;:\024*^z".toCharArray();
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
        byte byte0 = 79;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 58;
          goto _L8
_L3:
        byte0 = 90;
          goto _L8
_L4:
        byte0 = 84;
          goto _L8
        byte0 = 115;
          goto _L8
    }
}
