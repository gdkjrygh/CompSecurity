// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.akr;
import com.whatsapp.asv;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class o
    implements asv
{

    final akr a;
    int b;
    final PopupNotification c;
    final ProgressBar d;
    final ImageButton e;
    final TextView f;

    o(PopupNotification popupnotification, ImageButton imagebutton, ProgressBar progressbar, akr akr1, TextView textview)
    {
        c = popupnotification;
        e = imagebutton;
        d = progressbar;
        a = akr1;
        f = textview;
        super();
        b = -1;
    }

    public void a()
    {
        e.setImageResource(0x7f020587);
    }

    public void a(int i)
    {
        i = Math.min(i, d.getMax());
        if (b != i / 1000)
        {
            b = i / 1000;
            f.setText(DateUtils.formatElapsedTime(b));
        }
        if (d.getProgress() < i)
        {
            d.setProgress(i);
        }
    }

    public void a(boolean flag)
    {
        View view = c.findViewById(0x7f0b014c);
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    public void b()
    {
        e.setImageResource(0x7f020584);
    }

    public void c()
    {
        e.setImageResource(0x7f020587);
        d.setProgress(0);
        f.setText(DateUtils.formatElapsedTime(a.q() / 1000));
    }

    public void d()
    {
        e.setImageResource(0x7f020584);
        d.setMax(a.q());
        b = -1;
    }
}
