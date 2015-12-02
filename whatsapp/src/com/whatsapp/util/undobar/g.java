// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.undobar;

import android.view.View;

// Referenced classes of package com.whatsapp.util.undobar:
//            UndoBarController, f

class g
    implements android.view.View.OnClickListener
{

    final UndoBarController a;

    g(UndoBarController undobarcontroller)
    {
        a = undobarcontroller;
        super();
    }

    public void onClick(View view)
    {
        if (UndoBarController.a(a) != null)
        {
            UndoBarController.a(a).b(UndoBarController.b(a));
        }
        UndoBarController.a(a, false);
    }
}
