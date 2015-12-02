// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            RegisterPhone

class sc
    implements Runnable
{

    final RegisterPhone a;

    sc(RegisterPhone registerphone)
    {
        a = registerphone;
        super();
    }

    public void run()
    {
        if (!a.j && !a.isFinishing())
        {
            a.showDialog(21);
        }
    }
}
