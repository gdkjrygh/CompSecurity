// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.text.method.TextKeyListener;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            d9, a92, App

class f7
    implements android.view.View.OnClickListener
{

    final d9 a;

    f7(d9 d9_1)
    {
        a = d9_1;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            view = c.a(d9.e(a).getText().toString());
            if (view.trim().length() > 0 || com.whatsapp.d9.c(a) == 0)
            {
                d9.f(a).a(view.trim());
                d9.a(a, false);
                d9.a(a, null);
                a.dismiss();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(a.getContext(), com.whatsapp.d9.c(a), 0);
        }
        d9.b(a).removeDialog(50);
        TextKeyListener.clear(d9.e(a).getText());
    }
}
