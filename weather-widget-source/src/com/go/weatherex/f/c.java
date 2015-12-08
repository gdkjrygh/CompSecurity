// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.f;

import android.os.AsyncTask;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;

final class c extends AsyncTask
{

    final String a;

    c(String s)
    {
        a = s;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        avoid = d.a(true);
        long l = System.currentTimeMillis() / 1000L;
        avoid.b((new StringBuilder()).append(a).append("&ts=").append(l).toString(), new e(a), new f());
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
