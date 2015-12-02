// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, SetStatus, u1, d6

class qz extends Handler
{

    final SetStatus a;

    qz(SetStatus setstatus)
    {
        a = setstatus;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        if (message.what != 1) goto _L2; else goto _L1
_L1:
        boolean flag;
        a.p.setText(c.b(App.aJ, a.getBaseContext()));
        message = SetStatus.l.iterator();
        flag = false;
_L6:
        if (!message.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((String)message.next()).equals(App.aJ))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        flag = true;
        if (i == 0) goto _L6; else goto _L5
_L5:
        if (!flag)
        {
            SetStatus.l.add(0, App.aJ);
        }
        a.o.notifyDataSetInvalidated();
        com.whatsapp.SetStatus.c(a);
        if (i == 0) goto _L7; else goto _L2
_L2:
        App.b(App.au, 0x7f0e0408, 0);
_L7:
        a.removeDialog(2);
        SetStatus.a(a).setOnClickListener(new d6(this));
        return;
_L4:
        flag = true;
        if (true) goto _L5; else goto _L8
_L8:
    }
}
