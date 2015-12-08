// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, BatchEntry

public class 
    implements r, Serializable
{

    private Object result;
    private int status;

    public BatchEntry build()
    {
        return new BatchEntry(result, status, (byte)0);
    }

    public volatile Object build()
    {
        return build();
    }

    public int getStatusCode()
    {
        return status;
    }

    public status setResult(Object obj)
    {
        result = obj;
        return this;
    }

    public result setStatusCode(int i)
    {
        status = i;
        return this;
    }

    public ()
    {
    }
}
