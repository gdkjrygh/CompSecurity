// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google:
//            bM, d9, O

final class bD extends bM
{

    bD(int i)
    {
        super(i, null);
    }

    public void d()
    {
        int j = d9.c;
        if (g()) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        if (i >= f()) goto _L4; else goto _L3
_L3:
        java.util.Map.Entry entry = c(i);
        if (((O)entry.getKey()).e())
        {
            entry.setValue(Collections.unmodifiableList((List)entry.getValue()));
        }
        if (j == 0) goto _L5; else goto _L4
_L4:
        Iterator iterator = c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            if (((O)entry1.getKey()).e())
            {
                entry1.setValue(Collections.unmodifiableList((List)entry1.getValue()));
            }
        } while (j == 0);
_L2:
        super.d();
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Object put(Object obj, Object obj1)
    {
        return super.a((O)obj, obj1);
    }
}
