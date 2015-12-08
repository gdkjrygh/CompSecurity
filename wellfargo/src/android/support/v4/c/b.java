// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import android.os.AsyncTask;

class b
{

    static transient void a(AsyncTask asynctask, Object aobj[])
    {
        asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
    }
}
