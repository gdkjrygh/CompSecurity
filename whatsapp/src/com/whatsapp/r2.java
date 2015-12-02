// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.cj;

// Referenced classes of package com.whatsapp:
//            App, ChangeNumber

class r2
    implements cj
{

    final ChangeNumber a;

    r2(ChangeNumber changenumber)
    {
        a = changenumber;
        super();
    }

    public void a(String s)
    {
label0:
        {
            if (App.Z.jabber_id.equals(s))
            {
                ChangeNumber.d(a).sendEmptyMessage(1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ChangeNumber.d(a).sendEmptyMessage(2);
        }
    }
}
