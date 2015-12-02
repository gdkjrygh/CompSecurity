// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_TagUserBody

public abstract class TagUserBody
{

    public TagUserBody()
    {
    }

    public static TagUserBody create(String s)
    {
        return (new Shape_TagUserBody()).setName(s);
    }

    public abstract String getName();

    abstract TagUserBody setName(String s);
}
