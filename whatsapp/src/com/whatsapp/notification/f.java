// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.dx;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class f
    implements dx
{

    final PopupNotification a;

    f(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void a(int i)
    {
        App.b(App.au.getApplicationContext(), i, 0);
    }

    public void a(int i, int j)
    {
    }

    public boolean a()
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public void c()
    {
    }

    public boolean d()
    {
        return false;
    }

    public void f(String s)
    {
        App.b(App.au.getApplicationContext(), s, 0);
    }
}
