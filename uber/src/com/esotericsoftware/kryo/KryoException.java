// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.esotericsoftware.kryo;


public class KryoException extends RuntimeException
{

    private StringBuffer trace;

    public KryoException()
    {
    }

    public KryoException(String s)
    {
        super(s);
    }

    public KryoException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public KryoException(Throwable throwable)
    {
        super(throwable);
    }

    public void addTrace(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("info cannot be null.");
        }
        if (trace == null)
        {
            trace = new StringBuffer(512);
        }
        trace.append('\n');
        trace.append(s);
    }

    public String getMessage()
    {
        if (trace == null)
        {
            return super.getMessage();
        }
        StringBuffer stringbuffer = new StringBuffer(512);
        stringbuffer.append(super.getMessage());
        if (stringbuffer.length() > 0)
        {
            stringbuffer.append('\n');
        }
        stringbuffer.append("Serialization trace:");
        stringbuffer.append(trace);
        return stringbuffer.toString();
    }
}
