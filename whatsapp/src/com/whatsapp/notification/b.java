// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.whatsapp.App;
import com.whatsapp.ak8;
import com.whatsapp.iz;
import com.whatsapp.og;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class b
    implements TextWatcher
{

    final PopupNotification a;

    b(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        String s;
        boolean flag1;
label0:
        {
            flag1 = PopupNotification.q;
            App.aP();
            s = editable.toString();
            if (s.length() > 0)
            {
                PopupNotification.n(a).setVisibility(0);
            }
            if (PopupNotification.q(a) == null)
            {
                break label0;
            }
            if (s.length() != 0)
            {
                App.a(PopupNotification.q(a).a, 0);
                if (!flag1)
                {
                    break label0;
                }
            }
            App.x(PopupNotification.q(a).a);
        }
label1:
        {
            c.a(editable, a);
            boolean flag;
            if (s.trim().length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            PopupNotification.n(a).setEnabled(flag);
            if (PopupNotification.r(a).getVisibility() == 8 && !flag)
            {
                PopupNotification.r(a).startAnimation(ak8.a(true));
                PopupNotification.r(a).setVisibility(0);
                PopupNotification.n(a).startAnimation(ak8.a(false));
                PopupNotification.n(a).setVisibility(8);
                if (!flag1)
                {
                    break label1;
                }
            }
            if (PopupNotification.r(a).getVisibility() == 0 && flag)
            {
                PopupNotification.r(a).startAnimation(ak8.a(false));
                PopupNotification.r(a).setVisibility(8);
                PopupNotification.n(a).startAnimation(ak8.a(true));
                PopupNotification.n(a).setVisibility(0);
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(PopupNotification.b(a), charsequence);
    }
}
