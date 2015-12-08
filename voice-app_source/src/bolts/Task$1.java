// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Task

static final class ect
    implements Runnable
{

    final skCompletionSource val$tcs;

    public void run()
    {
        val$tcs.setResult(null);
    }

    ource(skCompletionSource skcompletionsource)
    {
        val$tcs = skcompletionsource;
        super();
    }
}
