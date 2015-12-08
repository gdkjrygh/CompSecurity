// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.wf.wellsfargomobile.util.n;

// Referenced classes of package com.wf.wellsfargomobile:
//            SignOnFragment, MainActivity, WFApp

class at
    implements android.view.View.OnClickListener
{

    final SignOnFragment a;

    at(SignOnFragment signonfragment)
    {
        a = signonfragment;
        super();
    }

    public void onClick(View view)
    {
        if (a.a.isChecked())
        {
            SignOnFragment.c(a).a(a.getString(0x7f0800ea), a.getString(0x7f0800e9), a.getString(0x7f080040), 0x1080027);
        } else
        {
            view = WFApp.L();
            if (!view.a() && SignOnFragment.b(a).getText().length() > 0 && SignOnFragment.b(a).getText().toString().equals(view.e()))
            {
                view.c();
                SignOnFragment.b(a).setText("");
                return;
            }
        }
    }
}
