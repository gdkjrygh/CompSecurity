// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            og

public class vn
    implements Comparator
{

    private final Context a;

    public vn(Context context)
    {
        a = context;
    }

    public int a(og og1, og og2)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        og1 = og1.a(a);
        og2 = og2.a(a);
        boolean flag;
        int i;
        if (og1.length() > 0 && Character.isLetter(og1.charAt(0)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag2) ? 1 : 0);
        if (og2.length() > 0)
        {
            i = ((flag2) ? 1 : 0);
            if (Character.isLetter(og2.charAt(0)))
            {
                i = 1;
            }
        }
        if (flag == i)
        {
            i = og1.compareToIgnoreCase(og2);
        } else
        {
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                return -1;
            }
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((og)obj, (og)obj1);
    }
}
