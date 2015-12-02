// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            BroadcastDetails, Broadcasts

class y7
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final String z;
    final Broadcasts a;

    y7(Broadcasts broadcasts)
    {
        a = broadcasts;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (c4)view.getTag();
        view = new Intent(a, com/whatsapp/BroadcastDetails);
        view.putExtra(z, ((c4) (adapterview)).y.c);
        a.startActivity(view);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "`D".toCharArray();
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
        byte byte0 = 63;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 9;
          goto _L8
_L3:
        byte0 = 32;
          goto _L8
_L4:
        byte0 = 49;
          goto _L8
        byte0 = 40;
          goto _L8
    }
}
