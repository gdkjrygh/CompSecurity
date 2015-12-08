// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.compat;


// Referenced classes of package com.stripe.android.compat:
//            AsyncTask

static class atus
{

    static final int $SwitchMap$com$stripe$android$compat$AsyncTask$Status[];

    static 
    {
        $SwitchMap$com$stripe$android$compat$AsyncTask$Status = new int[atus.values().length];
        try
        {
            $SwitchMap$com$stripe$android$compat$AsyncTask$Status[atus.RUNNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$stripe$android$compat$AsyncTask$Status[atus.FINISHED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
