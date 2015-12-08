// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            MessageDigestHashFunction

private static final class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final String algorithmName;
    private final int bytes;
    private final String toString;

    private Object readResolve()
    {
        return new MessageDigestHashFunction(algorithmName, bytes, toString);
    }

    private (String s, int i, String s1)
    {
        algorithmName = s;
        bytes = i;
        toString = s1;
    }

    toString(String s, int i, String s1, toString tostring)
    {
        this(s, i, s1);
    }
}
