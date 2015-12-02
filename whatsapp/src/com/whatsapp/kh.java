// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            App, og, k

public class kh
    implements Comparator
{

    private final Context a;

    public kh(Context context)
    {
        a = context;
    }

    public int a(og og1, og og2)
    {
        boolean flag2 = false;
        if (!App.az.d(og1.a))
        {
            if (App.az.d(og2.a))
            {
                return -1;
            }
            og1 = og1.a(a);
            og2 = og2.a(a);
            boolean flag;
            boolean flag1;
            if (og1.length() > 0 && Character.isLetter(og1.charAt(0)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (og2.length() > 0)
            {
                flag1 = flag2;
                if (Character.isLetter(og2.charAt(0)))
                {
                    flag1 = true;
                }
            }
            if (flag == flag1)
            {
                return og1.compareToIgnoreCase(og2);
            }
            if (flag)
            {
                return -1;
            }
        }
        return 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((og)obj, (og)obj1);
    }
}
