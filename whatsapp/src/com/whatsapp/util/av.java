// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import com.whatsapp.au;
import de.greenrobot.event.g;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.whatsapp.util:
//            Log

final class av extends AtomicReference
{

    av(String s)
    {
        super(s);
        g.a().d(this);
    }

    public void onEvent(au au1)
    {
        boolean flag = Log.f;
        au1.a();
        JVM INSTR tableswitch -1 1: default 36
    //                   -1 50
    //                   0 57
    //                   1 64;
           goto _L1 _L2 _L3 _L4
_L1:
        String s = Integer.toString(au1.a());
_L5:
        set(s);
        return;
_L2:
        s = "D";
        if (!flag) goto _L5; else goto _L3
_L3:
        s = "M";
        if (!flag) goto _L5; else goto _L4
_L4:
        s = "W";
        if (!flag) goto _L5; else goto _L1
    }
}
