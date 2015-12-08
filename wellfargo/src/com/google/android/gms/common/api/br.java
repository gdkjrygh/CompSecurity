// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            q, r, n

class br extends Loader
    implements q, r
{

    public final n a;
    private boolean b;
    private ConnectionResult c;

    public br(Context context, n n1)
    {
        super(context);
        a = n1;
    }

    private void b(ConnectionResult connectionresult)
    {
        c = connectionresult;
        if (isStarted() && !isAbandoned())
        {
            deliverResult(connectionresult);
        }
    }

    public void a(int i)
    {
    }

    public void a(Bundle bundle)
    {
        b = false;
        b(ConnectionResult.a);
    }

    public void a(ConnectionResult connectionresult)
    {
        b = true;
        b(connectionresult);
    }

    public boolean a()
    {
        return b;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        a.a(s, filedescriptor, printwriter, as);
    }

    protected void onReset()
    {
        c = null;
        b = false;
        a.b(this);
        a.b(this);
        a.c();
    }

    protected void onStartLoading()
    {
        super.onStartLoading();
        a.a(this);
        a.a(this);
        if (c != null)
        {
            deliverResult(c);
        }
        if (!a.d() && !a.e() && !b)
        {
            a.b();
        }
    }

    protected void onStopLoading()
    {
        a.c();
    }
}
