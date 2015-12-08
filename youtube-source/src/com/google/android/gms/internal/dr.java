// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

final class dr extends MutableContextWrapper
{

    private Activity a;
    private Context b;

    public dr(Context context)
    {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context)
    {
        b = context.getApplicationContext();
        if (context instanceof Activity)
        {
            context = (Activity)context;
        } else
        {
            context = null;
        }
        a = context;
        super.setBaseContext(b);
    }

    public final void startActivity(Intent intent)
    {
        if (a != null)
        {
            a.startActivity(intent);
            return;
        } else
        {
            intent.setFlags(0x10000000);
            b.startActivity(intent);
            return;
        }
    }
}
