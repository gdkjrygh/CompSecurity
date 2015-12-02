// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.verification:
//            MobileVerificationDialogFragment

final class d
    implements android.widget.ficationDialogFragment._cls1
{

    final List a;
    final String b;
    final String c;
    final String d;
    final MobileVerificationDialogFragment e;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)a.get(i);
        if (b.equals(adapterview))
        {
            e.c(101);
        }
        if (c.equals(adapterview))
        {
            e.c(102);
        }
        if (d.equals(adapterview))
        {
            e.c(100);
        }
        e.dismiss();
    }

    (MobileVerificationDialogFragment mobileverificationdialogfragment, List list, String s, String s1, String s2)
    {
        e = mobileverificationdialogfragment;
        a = list;
        b = s;
        c = s1;
        d = s2;
        super();
    }
}
