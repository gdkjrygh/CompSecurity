// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.internal:
//            zzop

private static final class u.zzu extends u.zzu
{

    private final com.google.android.gms.common.api.nit> zzOs;

    public void zzia(int i)
        throws RemoteException
    {
        zzOs.zm(new Status(i));
    }

    public (com.google.android.gms.common.api. , zzi zzi)
    {
        super(zzi);
        zzOs = (com.google.android.gms.common.api.Os)zzu.zzu();
    }
}
