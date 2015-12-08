// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;

import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package com.jiubang.core.c:
//            l, k

public abstract class j extends Handler
{

    private static Looper a = null;
    final WeakReference b;
    private Handler c;

    public j(ContentResolver contentresolver)
    {
        b = new WeakReference(contentresolver);
        com/jiubang/core/c/j;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            contentresolver = new HandlerThread("WeatherAsyncQueryWorker");
            contentresolver.start();
            a = contentresolver.getLooper();
        }
        com/jiubang/core/c/j;
        JVM INSTR monitorexit ;
        c = a(a);
        return;
        contentresolver;
        com/jiubang/core/c/j;
        JVM INSTR monitorexit ;
        throw contentresolver;
    }

    protected Handler a(Looper looper)
    {
        return new l(this, looper);
    }

    protected void a(int i, Object obj, int i1)
    {
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
    }

    protected void a(int i, Object obj, Uri uri)
    {
    }

    public final void a(int i, Object obj, Uri uri, ContentValues contentvalues)
    {
        Message message = c.obtainMessage(i);
        message.arg1 = 2;
        k k1 = new k();
        k1.b = this;
        k1.a = uri;
        k1.h = obj;
        k1.i = contentvalues;
        message.obj = k1;
        c.sendMessage(message);
    }

    public final void a(int i, Object obj, Uri uri, ContentValues contentvalues, String s, String as[])
    {
        Message message = c.obtainMessage(i);
        message.arg1 = 3;
        k k1 = new k();
        k1.b = this;
        k1.a = uri;
        k1.h = obj;
        k1.i = contentvalues;
        k1.d = s;
        k1.e = as;
        message.obj = k1;
        c.sendMessage(message);
    }

    public final void a(int i, Object obj, Uri uri, String s, String as[])
    {
        Message message = c.obtainMessage(i);
        message.arg1 = 4;
        k k1 = new k();
        k1.b = this;
        k1.a = uri;
        k1.h = obj;
        k1.d = s;
        k1.e = as;
        message.obj = k1;
        c.sendMessage(message);
    }

    public void a(int i, Object obj, Uri uri, String as[], String s, String as1[], String s1)
    {
        Message message = c.obtainMessage(i);
        message.arg1 = 1;
        k k1 = new k();
        k1.b = this;
        k1.a = uri;
        k1.c = as;
        k1.d = s;
        k1.e = as1;
        k1.f = s1;
        k1.h = obj;
        message.obj = k1;
        c.sendMessage(message);
    }

    public final void a(int i, Object obj, String s, ArrayList arraylist)
    {
        Message message = c.obtainMessage(i);
        message.arg1 = 5;
        k k1 = new k();
        k1.b = this;
        k1.j = s;
        k1.h = obj;
        k1.k = arraylist;
        message.obj = k1;
        c.sendMessage(message);
    }

    protected void a(int i, Object obj, ContentProviderResult acontentproviderresult[])
    {
    }

    protected void b(int i, Object obj, int i1)
    {
    }

    public void handleMessage(Message message)
    {
        k k1 = (k)message.obj;
        int i = message.what;
        switch (message.arg1)
        {
        default:
            return;

        case 1: // '\001'
            a(i, k1.h, (Cursor)k1.g);
            return;

        case 2: // '\002'
            a(i, k1.h, (Uri)k1.g);
            return;

        case 3: // '\003'
            a(i, k1.h, ((Integer)k1.g).intValue());
            return;

        case 4: // '\004'
            b(i, k1.h, ((Integer)k1.g).intValue());
            return;

        case 5: // '\005'
            a(i, k1.h, (ContentProviderResult[])(ContentProviderResult[])k1.g);
            break;
        }
    }

}
