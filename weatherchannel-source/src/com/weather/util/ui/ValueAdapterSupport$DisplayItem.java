// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.ui;

import com.google.common.base.Preconditions;

// Referenced classes of package com.weather.util.ui:
//            ValueAdapterSupport

private static final class <init>
{

    private final String text;
    private final Object value;

    public String toString()
    {
        return text;
    }


    private _cls9(String s, Object obj)
    {
        text = (String)Preconditions.checkNotNull(s);
        value = obj;
    }

    value(String s, Object obj, value value1)
    {
        this(s, obj);
    }
}
