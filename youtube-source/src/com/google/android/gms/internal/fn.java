// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.a;

// Referenced classes of package com.google.android.gms.internal:
//            fg, fd, fr, fo

public final class fn extends fg
{

    public final int b;
    public final Bundle c;
    public final IBinder d;
    final fd e;

    public fn(fd fd1, int i, IBinder ibinder, Bundle bundle)
    {
        e = fd1;
        super(fd1, Boolean.valueOf(true));
        b = i;
        d = ibinder;
        c = bundle;
    }

    protected final void a(Object obj)
    {
label0:
        {
label1:
            {
                if ((Boolean)obj != null)
                {
                    switch (b)
                    {
                    default:
                        if (c != null)
                        {
                            obj = (PendingIntent)c.getParcelable("pendingIntent");
                        } else
                        {
                            obj = null;
                        }
                        if (fd.e(e) != null)
                        {
                            com.google.android.gms.internal.fr.a(fd.f(e)).b(e.a(), fd.e(e));
                            com.google.android.gms.internal.fd.a(e, null);
                        }
                        com.google.android.gms.internal.fd.a(e, null);
                        com.google.android.gms.internal.fd.a(e).a(new a(b, ((PendingIntent) (obj))));
                        break;

                    case 0: // '\0'
                        break label1;

                    case 10: // '\n'
                        break label0;
                    }
                }
                return;
            }
            try
            {
                obj = d.getInterfaceDescriptor();
                if (e.b().equals(obj))
                {
                    com.google.android.gms.internal.fd.a(e, e.a(d));
                    if (fd.d(e) != null)
                    {
                        com.google.android.gms.internal.fd.a(e).a();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            com.google.android.gms.internal.fr.a(fd.f(e)).b(e.a(), fd.e(e));
            com.google.android.gms.internal.fd.a(e, null);
            com.google.android.gms.internal.fd.a(e, null);
            com.google.android.gms.internal.fd.a(e).a(new a(8, null));
            return;
        }
        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }
}
