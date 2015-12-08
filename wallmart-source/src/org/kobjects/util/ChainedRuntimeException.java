// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.util;


public class ChainedRuntimeException extends RuntimeException
{

    Exception chain;

    ChainedRuntimeException()
    {
    }

    ChainedRuntimeException(Exception exception, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = s;
        if (s == null)
        {
            s1 = "rethrown";
        }
        super(stringbuilder.append(s1).append(": ").append(exception.toString()).toString());
        chain = exception;
    }

    public static ChainedRuntimeException create(Exception exception, String s)
    {
        ChainedRuntimeException chainedruntimeexception;
        try
        {
            chainedruntimeexception = ((ChainedRuntimeException)Class.forName("org.kobjects.util.ChainedRuntimeExceptionSE").newInstance())._create(exception, s);
        }
        catch (Exception exception1)
        {
            return new ChainedRuntimeException(exception, s);
        }
        return chainedruntimeexception;
    }

    ChainedRuntimeException _create(Exception exception, String s)
    {
        throw new RuntimeException("ERR!");
    }

    public Exception getChained()
    {
        return chain;
    }

    public void printStackTrace()
    {
        super.printStackTrace();
        if (chain != null)
        {
            chain.printStackTrace();
        }
    }
}
