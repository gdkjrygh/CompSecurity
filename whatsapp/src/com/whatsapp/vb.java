// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            afb

class vb
    implements Runnable
{

    final afb a;

    vb(afb afb1)
    {
        a = afb1;
        super();
    }

    public void run()
    {
        a.a.dismiss();
    }
}
