// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            r, n, bm, bo

class bn
    implements r
{

    public final int a;
    public final n b;
    public final r c;
    final bm d;

    public bn(bm bm1, int i, n n1, r r1)
    {
        d = bm1;
        super();
        a = i;
        b = n1;
        c = r1;
        n1.a(this);
    }

    public void a()
    {
        b.b(this);
        b.c();
    }

    public void a(ConnectionResult connectionresult)
    {
        bm.d(d).post(new bo(d, a, connectionresult));
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("GoogleApiClient #").print(a);
        printwriter.println(":");
        b.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
    }
}
