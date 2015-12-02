// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;


public class NoSuchAdviceException extends Exception
{

    private static final long serialVersionUID = 0x2d31373336313830L;
    private String name;

    public NoSuchAdviceException(String s)
    {
        name = s;
    }

    public String getName()
    {
        return name;
    }
}
