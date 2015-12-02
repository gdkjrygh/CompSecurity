// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, og, a1n, MessageDetailsActivity, 
//            ub

class fx
    implements android.view.View.OnClickListener
{

    final a1n a;
    final int b;

    fx(a1n a1n1, int i)
    {
        a = a1n1;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        og og1;
        int i;
        i = App.am;
        og1 = (og)view.getTag();
        if (og1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (og1.a.equals(a1n.b(a)))
            {
                a1n.a(a, null);
                a1n.a(a, null);
                if (i == 0)
                {
                    break label0;
                }
            }
            a1n.a(a, og1.a);
        }
label1:
        {
label2:
            {
label3:
                {
                    if (a1n.b(a) == null)
                    {
                        break label2;
                    }
                    if (((ub)MessageDetailsActivity.b(a.a).get(b)).a() != 5)
                    {
                        a1n.a(a, b, view, true);
                        if (i == 0)
                        {
                            break label3;
                        }
                    }
                    a1n.a(a, null);
                }
                if (a1n.c(a) == null)
                {
                    break label1;
                }
                a1n.a(a, a1n.a(a), a1n.c(a), false);
                if (i == 0)
                {
                    break label1;
                }
            }
            a1n.a(a, b, view, false);
        }
        if (a1n.b(a) == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a1n.a(a, view);
        a1n.a(a, b);
        if (i == 0) goto _L1; else goto _L3
_L3:
        a1n.a(a, null);
        a1n.a(a, 0);
        return;
    }
}
