// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

class idw
    implements Serializable
{

    private static final long serialVersionUID = 3L;
    private final Throwable a;

    public idw(Throwable throwable)
    {
        a = throwable;
    }

    static Throwable a(idw idw1)
    {
        return idw1.a;
    }

    public String toString()
    {
        return (new StringBuilder("Notification=>Error:")).append(a).toString();
    }
}
