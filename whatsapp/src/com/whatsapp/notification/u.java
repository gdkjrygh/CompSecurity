// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.view.MotionEvent;
import com.whatsapp.App;
import com.whatsapp.GalleryView;
import com.whatsapp.mi;
import com.whatsapp.og;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class u
    implements mi
{

    boolean a;
    final PopupNotification b;

    u(PopupNotification popupnotification)
    {
        b = popupnotification;
        super();
    }

    public void a()
    {
    }

    public void a(int i)
    {
label0:
        {
            boolean flag = PopupNotification.q;
            if (a)
            {
                return;
            }
            a = true;
            if (PopupNotification.f(b).size() == 1)
            {
                b.a(0);
                if (!flag)
                {
                    break label0;
                }
            }
            if (i == 0)
            {
                PopupNotification.j(b).setCurrentScreen(PopupNotification.f(b).size() + 1);
                PopupNotification.j(b).a(PopupNotification.f(b).size());
                b.a(PopupNotification.f(b).size() - 1);
                if (!flag)
                {
                    break label0;
                }
            }
            if (i == PopupNotification.f(b).size() + 1)
            {
                PopupNotification.j(b).setCurrentScreen(0);
                PopupNotification.j(b).a(1);
                b.a(0);
                if (!flag)
                {
                    break label0;
                }
            }
            b.a(i - 1);
        }
        a = false;
    }

    public void a(MotionEvent motionevent)
    {
    }

    public void b()
    {
        App.aP();
        if (PopupNotification.d(b) != null)
        {
            PopupNotification.k(b).add(PopupNotification.d(b).y);
        }
        if (PopupNotification.q(b) != null)
        {
            PopupNotification.t(b).add(PopupNotification.q(b).a);
        }
    }

    public void b(int i)
    {
    }

    public void c()
    {
    }
}
