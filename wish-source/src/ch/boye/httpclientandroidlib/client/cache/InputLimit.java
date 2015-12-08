// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.cache;


public class InputLimit
{

    private boolean reached;
    private final long value;

    public InputLimit(long l)
    {
        value = l;
        reached = false;
    }

    public long getValue()
    {
        return value;
    }

    public boolean isReached()
    {
        return reached;
    }

    public void reached()
    {
        reached = true;
    }
}
