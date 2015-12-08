// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

static class atus
{

    static final int $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[];

    static 
    {
        $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status = new int[atus.values().length];
        try
        {
            $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[atus.RUNNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[atus.FINISHED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
