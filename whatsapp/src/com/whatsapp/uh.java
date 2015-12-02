// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, ViewProfilePhoto, og

class uh extends Handler
{

    final ViewProfilePhoto a;

    uh(ViewProfilePhoto viewprofilephoto)
    {
        a = viewprofilephoto;
        super();
    }

    public void handleMessage(Message message)
    {
        message = App.au;
        int i;
        if (ViewProfilePhoto.a(a).k())
        {
            i = 0x7f0e0188;
        } else
        {
            i = 0x7f0e018b;
        }
        App.b(message, i, 0);
        a.findViewById(0x7f0b0088).setVisibility(8);
    }
}
