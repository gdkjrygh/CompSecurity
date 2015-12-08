// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            b, DataHolder, f

public abstract class a
    implements b
{

    protected final DataHolder a;

    protected a(DataHolder dataholder)
    {
        a = dataholder;
        if (a != null)
        {
            a.a(this);
        }
    }

    public void a()
    {
        if (a != null)
        {
            a.i();
        }
    }

    public int b()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.g();
        }
    }

    public Iterator iterator()
    {
        return new f(this);
    }
}
