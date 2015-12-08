// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import java.util.AbstractList;
import java.util.List;

// Referenced classes of package com.spatial4j.core.shape.impl:
//            BufferedLineString, BufferedLine

final class a extends AbstractList
{

    private List a;

    public final Object get(int i)
    {
        if (i == 0)
        {
            return ((BufferedLine)a.get(0)).getA();
        } else
        {
            return ((BufferedLine)a.get(i - 1)).getB();
        }
    }

    public final int size()
    {
        return a.size() + 1;
    }

    (BufferedLineString bufferedlinestring, List list)
    {
        a = list;
        super();
    }
}
