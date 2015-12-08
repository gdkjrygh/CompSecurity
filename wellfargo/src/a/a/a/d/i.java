// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import java.util.List;

// Referenced classes of package a.a.a.d:
//            h

public abstract class i
    implements h
{

    protected final boolean a = true;
    protected final Object b;
    protected final Object c[] = null;

    public i(Object obj)
    {
        b = obj;
    }

    public void a(List list)
    {
        if (a)
        {
            list.add(b);
        }
        if (c == null) goto _L2; else goto _L1
_L1:
        Object aobj[];
        int j;
        int k;
        aobj = c;
        k = aobj.length;
        j = 0;
_L5:
        if (j < k) goto _L3; else goto _L2
_L2:
        return;
_L3:
        list.add(aobj[j]);
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
