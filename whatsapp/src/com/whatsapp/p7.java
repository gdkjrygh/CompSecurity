// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Message;
import com.whatsapp.contact.b;
import com.whatsapp.contact.j;

// Referenced classes of package com.whatsapp:
//            App

final class p7
    implements android.os.Handler.Callback
{

    p7()
    {
    }

    public boolean handleMessage(Message message)
    {
        b.c(App.au);
        App.a(j.BACKGROUND_FULL);
        return true;
    }
}
