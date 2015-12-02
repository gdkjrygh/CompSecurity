// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            r7, b, SettingsChat

class cb
    implements Runnable
{

    final r7 a;

    cb(r7 r7_1)
    {
        a = r7_1;
        super();
    }

    public void run()
    {
        a.a.a.removeDialog(6);
    }
}
