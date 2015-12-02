// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.UUID;

public final class gln
    implements glq
{

    private final String a = UUID.randomUUID().toString();

    public gln(gmc gmc1)
    {
        gmc1.b(a);
    }

    private String d()
    {
        return a;
    }

    public final String a()
    {
        return "crash_uuid";
    }

    public final Class b()
    {
        return java/lang/String;
    }

    public final Object c()
    {
        return d();
    }
}
