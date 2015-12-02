// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class Api
{

    public static int a;
    private final b Jm;
    private final c Jn;
    private final ArrayList Jo;

    public Api(b b, c c, Scope ascope[])
    {
        Jm = b;
        Jn = c;
        Jo = new ArrayList(Arrays.asList(ascope));
    }

    public b gx()
    {
        return Jm;
    }

    public List gy()
    {
        return Jo;
    }

    public c gz()
    {
        return Jn;
    }
}
