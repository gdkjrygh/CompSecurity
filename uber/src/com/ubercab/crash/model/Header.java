// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;


// Referenced classes of package com.ubercab.crash.model:
//            Shape_Header

public abstract class Header
{

    public Header()
    {
    }

    public static Header create(String s, String s1)
    {
        return (new Shape_Header()).setName(s).setValue(s1);
    }

    public abstract String getName();

    public abstract String getValue();

    abstract Header setName(String s);

    abstract Header setValue(String s);
}
