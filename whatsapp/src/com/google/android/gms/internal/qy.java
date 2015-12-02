// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            qp

final class qy
{

    final byte azi[];
    final int tag;

    void a(qp qp1)
    {
        qp1.hd(tag);
        qp1.t(azi);
    }

    int c()
    {
        return 0 + qp.he(tag) + azi.length;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof qy))
            {
                return false;
            }
            obj = (qy)obj;
            if (tag != ((qy) (obj)).tag || !Arrays.equals(azi, ((qy) (obj)).azi))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(azi);
    }
}
