// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.undobar;


// Referenced classes of package com.whatsapp.util.undobar:
//            UndoBarController, c

class e
    implements Runnable
{

    final UndoBarController a;

    e(UndoBarController undobarcontroller)
    {
        a = undobarcontroller;
        super();
    }

    public void run()
    {
        if (UndoBarController.a(a) instanceof c)
        {
            ((c)UndoBarController.a(a)).a(UndoBarController.b(a));
        }
        UndoBarController.a(a, false);
    }
}
