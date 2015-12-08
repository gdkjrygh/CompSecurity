// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;
import android.widget.RadioButton;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hb

final class hc
    implements android.content.DialogInterface.OnClickListener
{

    final RadioButton a;
    final hb b;

    hc(hb hb1, RadioButton radiobutton)
    {
        b = hb1;
        a = radiobutton;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        hb hb1 = b;
        int j;
        if (a.isChecked())
        {
            j = p.hm;
        } else
        {
            j = p.y;
        }
        hb.a(hb1, j);
        if (hb.a(b) != null)
        {
            hb.a(b).onClick(dialoginterface, i);
        }
    }
}
