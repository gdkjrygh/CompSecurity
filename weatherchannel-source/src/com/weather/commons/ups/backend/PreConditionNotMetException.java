// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;


public class PreConditionNotMetException extends Exception
{

    private static final long serialVersionUID = 1L;

    public PreConditionNotMetException(String s)
    {
        super((new StringBuilder()).append("Precondition not met: ").append(s).toString());
    }
}
