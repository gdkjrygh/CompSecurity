// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jn, jm, qw

public final class MV extends MV
{

    final jl MQ;
    public final Bundle MV;
    public final IBinder MW;
    public final int statusCode;

    protected void b(Boolean boolean1)
    {
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        jl.a(MQ, 1, null);
_L7:
        return;
        boolean1;
        throw boolean1;
_L2:
        statusCode;
        JVM INSTR lookupswitch 2: default 48
    //                   0: 146
    //                   10: 278;
           goto _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        if (MV != null)
        {
            boolean1 = (PendingIntent)MV.getParcelable("pendingIntent");
        } else
        {
            boolean1 = null;
        }
        try
        {
            if (jl.c(MQ) != null)
            {
                jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
                jl.a(MQ, null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Boolean boolean1)
        {
            throw boolean1;
        }
        jl.a(MQ, 1, null);
        jl.a(MQ).b(new ConnectionResult(statusCode, boolean1));
        return;
_L4:
        boolean1 = MW.getInterfaceDescriptor();
        if (!MQ.bL().equals(boolean1))
        {
            break MISSING_BLOCK_LABEL_207;
        }
        boolean1 = MQ.l(MW);
        if (boolean1 != null)
        {
            try
            {
                jl.a(MQ, 3, boolean1);
                jl.a(MQ).dU();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
        }
        jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
        jl.a(MQ, null);
        jl.a(MQ, 1, null);
        jl.a(MQ).b(new ConnectionResult(8, null));
        if (!qw.a) goto _L7; else goto _L6
_L6:
        jl.a(MQ, 1, null);
        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        boolean1;
        throw boolean1;
    }

    protected void g(Object obj)
    {
        b((Boolean)obj);
    }

    protected void hx()
    {
    }

    public ionResult(jl jl1, int i, IBinder ibinder, Bundle bundle)
    {
        MQ = jl1;
        super(jl1, Boolean.valueOf(true));
        statusCode = i;
        MW = ibinder;
        MV = bundle;
    }
}
