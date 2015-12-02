// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            App, RegisterName, aky, dw

class r4 extends Handler
{

    final RegisterName a;

    r4(RegisterName registername)
    {
        a = registername;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        if (RegisterName.j() == null || !aky.a(RegisterName.j())) goto _L2; else goto _L1
_L1:
        if (!aky.c(RegisterName.j())) goto _L4; else goto _L3
_L3:
        if (RegisterName.c(a) == null) goto _L2; else goto _L5
_L5:
        RegisterName.c(a).a(1);
        if (i == 0) goto _L2; else goto _L4
_L4:
        a.removeDialog(0);
        aky.b(RegisterName.j());
        JVM INSTR tableswitch 1 3: default 92
    //                   1 93
    //                   2 92
    //                   3 105;
           goto _L2 _L6 _L2 _L7
_L2:
        return;
_L6:
        a.showDialog(1);
        if (i == 0) goto _L2; else goto _L7
_L7:
        a.showDialog(109);
        return;
    }
}
