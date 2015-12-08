// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.content.Context;
import android.content.ContextWrapper;

class v extends ContextWrapper
{

    public v(Context context)
    {
        super(context);
    }

    public Context getApplicationContext()
    {
        return this;
    }
}
