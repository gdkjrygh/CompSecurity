// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            CountryPicker, DeleteAccount

class zt
    implements android.view.View.OnClickListener
{

    final DeleteAccount a;

    zt(DeleteAccount deleteaccount)
    {
        a = deleteaccount;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(a, com/whatsapp/CountryPicker);
        view.putExtra(CountryPicker.c, a.s.getText().toString());
        a.startActivityForResult(view, 0);
        a.q.removeTextChangedListener(DeleteAccount.d(a));
    }
}
