// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

private static class data
{

    final Object data[];
    final AsyncTask task;

    transient (AsyncTask asynctask, Object aobj[])
    {
        task = asynctask;
        data = aobj;
    }
}
