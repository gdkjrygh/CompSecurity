// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.ci;

// Referenced classes of package com.whatsapp:
//            SetStatus

class ae
    implements ci
{

    final SetStatus a;

    ae(SetStatus setstatus)
    {
        a = setstatus;
        super();
    }

    public void a(int i)
    {
        SetStatus.d(a);
    }
}
