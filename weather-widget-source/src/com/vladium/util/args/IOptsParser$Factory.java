// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;


// Referenced classes of package com.vladium.util.args:
//            IOptsParser, OptsParser

public static abstract class 
{

    public static IOptsParser create(String s, ClassLoader classloader, String s1, String as[])
    {
        return new OptsParser(s, classloader, s1, as);
    }

    public ()
    {
    }
}
