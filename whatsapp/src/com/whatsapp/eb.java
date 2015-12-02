// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ContactsFragment, og, App

class eb
    implements Runnable
{

    final ContactsFragment a;
    final og b;

    eb(ContactsFragment contactsfragment, og og1)
    {
        a = contactsfragment;
        b = og1;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a.getActivity(), false, b.a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
