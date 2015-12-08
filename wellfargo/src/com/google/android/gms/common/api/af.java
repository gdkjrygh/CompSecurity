// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.au;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            ab, bg, n, i, 
//            Status, bf, h

public abstract class af extends ab
    implements bg
{

    private final i b;
    private AtomicReference c;

    protected af(i j, n n1)
    {
        super(((n)au.a(n1, "GoogleApiClient must not be null")).a());
        c = new AtomicReference();
        b = (i)au.a(j);
    }

    private void a(RemoteException remoteexception)
    {
        c(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    public void a(bf bf1)
    {
        c.set(bf1);
    }

    public final void a(h h)
    {
        try
        {
            b(h);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (h h)
        {
            a(((RemoteException) (h)));
            throw h;
        }
        // Misplaced declaration of an exception variable
        catch (h h)
        {
            a(((RemoteException) (h)));
        }
    }

    protected abstract void b(h h);

    protected void c()
    {
        bf bf1 = (bf)c.getAndSet(null);
        if (bf1 != null)
        {
            bf1.a(this);
        }
    }

    public final void c(Status status)
    {
        boolean flag;
        if (!status.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.b(flag, "Failed result must not be success");
        a(b(status));
    }

    public final i d()
    {
        return b;
    }

    public int e()
    {
        return 0;
    }
}
