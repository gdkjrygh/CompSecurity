// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//            ANRError$$, ANRError

private class <init> extends Throwable
{

    final ANRError$$ this$0;

    public Throwable fillInStackTrace()
    {
        setStackTrace(ANRError$$.access$100(ANRError$$.this));
        return this;
    }

    private ( 1)
    {
        this$0 = ANRError$$.this;
        super(ANRError$$.access$000(ANRError$$.this), 1);
    }

    _cls00(_cls00 _pcls00, _cls00 _pcls00_1)
    {
        this(_pcls00);
    }
}
