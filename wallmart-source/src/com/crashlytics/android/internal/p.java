// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.content.Context;

// Referenced classes of package com.crashlytics.android.internal:
//            z

public abstract class p
{

    private Context a;
    private boolean b;

    public p()
    {
    }

    protected final void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new IllegalArgumentException("context cannot be null.");
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        a = new z(context.getApplicationContext(), getName());
        b = true;
        c();
          goto _L1
    }

    protected abstract void c();

    public String getComponentPath()
    {
        return (new StringBuilder(".TwitterSdk/")).append(getName()).toString();
    }

    public final Context getContext()
    {
        return a;
    }

    public final String getName()
    {
        return getClass().getSimpleName().toLowerCase();
    }

    public abstract String getVersion();

    public final boolean isInitialized()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
