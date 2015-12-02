// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.cj;

// Referenced classes of package com.whatsapp:
//            SetStatus

class yr
    implements cj
{

    final SetStatus a;

    yr(SetStatus setstatus)
    {
        a = setstatus;
        super();
    }

    public void a(String s)
    {
        SetStatus.b(a);
    }
}
