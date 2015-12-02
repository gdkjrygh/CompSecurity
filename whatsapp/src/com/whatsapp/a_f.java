// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Message;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp:
//            a9n, App

final class a_f
    implements android.os.Handler.Callback
{

    a_f()
    {
    }

    public boolean handleMessage(Message message)
    {
        a9n a9n1 = (a9n)g.a().a(com/whatsapp/a9n);
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            if (!a9n1.a())
            {
                App.aP();
            }
            return true;

        case 1: // '\001'
            break;
        }
        if (!a9n1.a())
        {
            App.a1();
        }
        return true;
    }
}
