// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            q, ax, bh

class az
    implements q
{

    final ax a;

    az(ax ax1)
    {
        a = ax1;
        super();
    }

    public void a(int i)
    {
        ax.a(a).lock();
        ax.b(a).a(i);
        ax.a(a).unlock();
        return;
        Exception exception;
        exception;
        ax.a(a).unlock();
        throw exception;
    }

    public void a(Bundle bundle)
    {
        ax.a(a).lock();
        ax.b(a).a(bundle);
        ax.a(a).unlock();
        return;
        bundle;
        ax.a(a).unlock();
        throw bundle;
    }
}
