// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            og

public class tr
    implements Comparator
{

    private final Context a;

    public tr(Context context)
    {
        a = context;
    }

    private static String a(Context context, og og1)
    {
        if (og1 == null)
        {
            return null;
        }
        if (og1.f != null && og1.f.length() > 0)
        {
            return og1.f;
        } else
        {
            return og1.a(context);
        }
    }

    public int a(og og1, og og2)
    {
        String s = a(a, og1);
        String s1 = a(a, og2);
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
                if (og1.a != null || og2.a != null)
                {
                    if (og1.a == null)
                    {
                        return 1;
                    }
                    if (og2.a == null)
                    {
                        return -1;
                    } else
                    {
                        return og1.a.compareTo(og2.a);
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
        return a((og)obj, (og)obj1);
    }
}
