// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;


public class c
{

    public static void a(boolean flag, String s, long l)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.format(s, new Object[] {
                Long.valueOf(l)
            }));
        } else
        {
            return;
        }
    }
}
