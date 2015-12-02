// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.util.List;

public class bY extends Exception
{

    public bY()
    {
    }

    public bY(String s)
    {
        super(s);
    }

    public bY(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public bY(String s, List list)
    {
        super(s, (Throwable)list.get(0));
    }

    public bY(Throwable throwable)
    {
        super(throwable);
    }
}
