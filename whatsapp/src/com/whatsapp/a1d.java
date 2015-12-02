// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            og, App, ContactPicker

class a1d
    implements Runnable
{

    final og a;
    final ContactPicker b;

    a1d(ContactPicker contactpicker, og og1)
    {
        b = contactpicker;
        a = og1;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(b, false, a.a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
