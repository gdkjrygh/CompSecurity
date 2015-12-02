// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            VoipActivity, App

class ei
    implements android.view.View.OnClickListener
{

    final VoipActivity a;

    ei(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            view = a.findViewById(0x7f0b02e1);
            View view1 = a.findViewById(0x7f0b02dc);
            if (view == null)
            {
                break label0;
            }
            if (view.getVisibility() == 0)
            {
                view.setVisibility(8);
                view1.setVisibility(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view.setVisibility(0);
            view1.setVisibility(8);
        }
    }
}
