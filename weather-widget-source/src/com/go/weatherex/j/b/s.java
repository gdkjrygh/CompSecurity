// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import com.go.weatherex.j.n;

// Referenced classes of package com.go.weatherex.j.b:
//            d

public class s extends n
{

    private d b;
    private d c;

    public s(d d1, d d2)
    {
        b = d1;
        c = d2;
    }

    public String b()
    {
        return (new StringBuilder()).append(b.i().b()).append("#").append(c.i().b()).toString();
    }
}
