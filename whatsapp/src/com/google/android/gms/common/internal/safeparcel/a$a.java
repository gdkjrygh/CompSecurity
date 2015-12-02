// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            b

public class  extends RuntimeException
{

    public (String s, Parcel parcel)
    {
        boolean flag = b.a;
        super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        if (jx.a != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            b.a = flag;
        }
    }
}
