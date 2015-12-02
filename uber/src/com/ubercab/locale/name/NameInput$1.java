// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.name;

import android.view.View;
import com.ubercab.ui.FloatingLabelEditText;
import hsa;

// Referenced classes of package com.ubercab.locale.name:
//            NameInput

public final class a
    implements android.view.ChangeListener
{

    final NameInput a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (!a.isFocusable() || !a.isFocusableInTouchMode() || !flag)
        {
            return;
        }
        if (NameInput.b(NameInput.a(a)) && NameInput.c(a).a(NameInput.b(a)) == null)
        {
            NameInput.d(a).requestFocus();
            return;
        } else
        {
            NameInput.b(a).requestFocus();
            return;
        }
    }

    (NameInput nameinput)
    {
        a = nameinput;
        super();
    }
}
