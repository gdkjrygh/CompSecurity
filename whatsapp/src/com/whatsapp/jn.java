// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, o4, ChangeNumber

class jn
    implements Runnable
{

    final ChangeNumber a;

    jn(ChangeNumber changenumber)
    {
        a = changenumber;
        super();
    }

    public void run()
    {
        App.b(App.Z);
        o4.b(o4.c(App.Z.jabber_id), App.Z.jabber_id);
        o4.o();
    }
}
