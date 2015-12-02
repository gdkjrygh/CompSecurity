// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.protocol.bg;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            tr, MessageDetailsActivity, ub, App, 
//            k, og

class a10
    implements Comparator
{

    tr a;
    final MessageDetailsActivity b;

    a10(MessageDetailsActivity messagedetailsactivity)
    {
        b = messagedetailsactivity;
        super();
        a = new tr(b.getApplicationContext());
    }

    public int a(ub ub1, ub ub2)
    {
        boolean flag2 = false;
        boolean flag1 = true;
        int i = bg.a(ub2.a(), ub1.a());
        if (i == 0)
        {
            i = ((flag1) ? 1 : 0);
            if (ub1.a != null)
            {
                if (ub2.a == null)
                {
                    return -1;
                }
                ub1 = App.az.e(ub1.a);
                ub2 = App.az.e(ub2.a);
                boolean flag;
                if (!TextUtils.isEmpty(((og) (ub1)).n))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i = ((flag2) ? 1 : 0);
                if (!TextUtils.isEmpty(((og) (ub2)).n))
                {
                    i = 1;
                }
                if (flag == i)
                {
                    return a.a(ub1, ub2);
                }
                i = ((flag1) ? 1 : 0);
                if (flag)
                {
                    return -1;
                }
            }
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ub)obj, (ub)obj1);
    }
}
