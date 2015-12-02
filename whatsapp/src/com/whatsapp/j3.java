// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            NewGroup, og, qk

class j3
    implements android.view.View.OnClickListener
{

    final NewGroup a;

    j3(NewGroup newgroup)
    {
        a = newgroup;
        super();
    }

    public void onClick(View view)
    {
        NewGroup.b(a).n = NewGroup.d(a).getText().toString();
        qk.a(NewGroup.b(a), a, 12);
    }
}
