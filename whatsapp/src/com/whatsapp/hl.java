// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            y4, vj

class hl
    implements Runnable
{

    final y4 a;

    hl(y4 y4_1)
    {
        a = y4_1;
        super();
    }

    public void run()
    {
        vj.b(a.a).removeMessages(1);
        vj.a(a.a).showDialog(201);
    }
}
