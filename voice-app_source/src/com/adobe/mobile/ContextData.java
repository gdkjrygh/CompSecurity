// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;

final class ContextData
{

    protected HashMap contextData;
    protected Object value;

    ContextData()
    {
        value = null;
        contextData = new HashMap();
    }

    protected boolean containsKey(String s)
    {
        return contextData.containsKey(s);
    }

    protected ContextData get(String s)
    {
        return (ContextData)contextData.get(s);
    }

    protected void put(String s, ContextData contextdata)
    {
        contextData.put(s, contextdata);
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = "";
        if (value != null)
        {
            s = value.toString();
        }
        s = (new StringBuilder()).append(super.toString()).append(s).toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
