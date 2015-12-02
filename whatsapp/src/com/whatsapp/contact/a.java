// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.text.TextUtils;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.whatsapp.contact:
//            e

public class a
    implements Comparator
{

    public a()
    {
    }

    private String a(e e1)
    {
        if (e1 == null)
        {
            return null;
        }
        if (TextUtils.isEmpty(e1.b()))
        {
            return e1.c();
        } else
        {
            return e1.b();
        }
    }

    public int a(e e1, e e2)
    {
        String s = a(e1);
        String s1 = a(e2);
        if (s != null || s1 != null)
        {
            if (s == null)
            {
                return 1;
            }
            if (s1 == null)
            {
                return -1;
            }
            Collator collator = Collator.getInstance();
            collator.setStrength(0);
            collator.setDecomposition(1);
            int i = collator.compare(s, s1);
            if (i == 0)
            {
                if (e1.a() != null || e2.a() != null)
                {
                    if (e1.a() == null)
                    {
                        return 1;
                    }
                    if (e2.a() == null)
                    {
                        return -1;
                    } else
                    {
                        return e1.a().compareTo(e2.a());
                    }
                }
            } else
            {
                return i;
            }
        }
        return 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((e)obj, (e)obj1);
    }
}
