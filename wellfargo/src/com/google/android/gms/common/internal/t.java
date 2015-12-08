// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;

// Referenced classes of package com.google.android.gms.common.internal:
//            n, m

public final class t extends n
{

    public final IBinder e;
    final m f;

    public t(m m1, int i, IBinder ibinder, Bundle bundle)
    {
        f = m1;
        super(m1, i, bundle);
        e = ibinder;
    }

    protected void a(ConnectionResult connectionresult)
    {
        if (m.e(f) != null)
        {
            m.e(f).a(connectionresult);
        }
        f.a(connectionresult);
    }

    protected boolean a()
    {
        String s;
        try
        {
            s = e.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if (!f.e().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(f.e()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = f.a(e);
            if (iinterface != null && m.a(f, 2, 3, iinterface))
            {
                Bundle bundle = f.a_();
                if (m.b(f) != null)
                {
                    m.b(f).a(bundle);
                }
                return true;
            }
        }
        return false;
    }
}
