// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.util.Log;

public abstract class _listenerType
    implements 
{

    private static final String a = "KMC_EXCEPTION";
    protected final Object _listener;
    protected final Class _listenerType;

    public Object getListener()
    {
        return _listener;
    }

    public Class getListenerType()
    {
        return _listenerType;
    }

    protected void logException(Exception exception)
    {
        Log.e("KMC_EXCEPTION", exception.getMessage(), exception);
    }

    public (Object obj, Class class1)
    {
        if (obj == null)
        {
            throw new NullPointerException("listener parameter is null");
        } else
        {
            _listener = obj;
            _listenerType = class1;
            return;
        }
    }
}
