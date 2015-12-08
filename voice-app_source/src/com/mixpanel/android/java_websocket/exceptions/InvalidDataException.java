// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.exceptions;


public class InvalidDataException extends Exception
{

    private static final long serialVersionUID = 0x33ca2ae9af8edac6L;
    private int closecode;

    public InvalidDataException(int i)
    {
        closecode = i;
    }

    public InvalidDataException(int i, String s)
    {
        super(s);
        closecode = i;
    }

    public InvalidDataException(int i, String s, Throwable throwable)
    {
        super(s, throwable);
        closecode = i;
    }

    public InvalidDataException(int i, Throwable throwable)
    {
        super(throwable);
        closecode = i;
    }

    public int getCloseCode()
    {
        return closecode;
    }
}
