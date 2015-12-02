// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.method.TextKeyListener;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            ee, _x, App, aof

class zv
    implements android.view.View.OnClickListener
{

    final ee a;

    private zv(ee ee1)
    {
        a = ee1;
        super();
    }

    zv(ee ee1, aof aof)
    {
        this(ee1);
    }

    public void onClick(View view)
    {
label0:
        {
            view = String.valueOf(a.d.getText());
            if (view != null && view.length() > 0)
            {
                ee.a(a).a(view);
                TextKeyListener.clear(a.d.getText());
                a.dismiss();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(a.getContext(), 0x7f0e02a8, 0);
        }
        ee.b(a);
    }
}
