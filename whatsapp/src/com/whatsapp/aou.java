// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            og, App, MultipleContactPicker

class aou
    implements Runnable
{

    final MultipleContactPicker a;
    final og b;

    aou(MultipleContactPicker multiplecontactpicker, og og1)
    {
        a = multiplecontactpicker;
        b = og1;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a, false, b.a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
