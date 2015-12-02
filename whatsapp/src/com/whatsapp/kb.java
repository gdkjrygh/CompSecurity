// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            rm, aod, SettingsChat

class kb
    implements Runnable
{

    final rm a;

    kb(rm rm1)
    {
        a = rm1;
        super();
    }

    public void run()
    {
        a.a.a.removeDialog(6);
    }
}
