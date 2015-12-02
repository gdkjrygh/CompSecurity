// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.text.method.TextKeyListener;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            d9

class f1
    implements android.view.View.OnClickListener
{

    final d9 a;

    f1(d9 d9_1)
    {
        a = d9_1;
        super();
    }

    public void onClick(View view)
    {
        d9.a(a, false);
        d9.a(a, null);
        d9.b(a).removeDialog(50);
        TextKeyListener.clear(d9.e(a).getText());
        a.dismiss();
    }
}
