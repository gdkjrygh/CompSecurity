// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            b, PlusOneButton

public final class a
    implements android.view.View.OnClickListener, b
{

    final PlusOneButton a;
    private final b b;

    public a(PlusOneButton plusonebutton, b b1)
    {
        a = plusonebutton;
        super();
        b = b1;
    }

    public final void a(Intent intent)
    {
        android.content.Context context = a.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(a));
        }
    }

    public final void onClick(View view)
    {
        view = (Intent)PlusOneButton.a(a).getTag();
        if (b != null)
        {
            b.a(view);
            return;
        } else
        {
            a(view);
            return;
        }
    }
}
