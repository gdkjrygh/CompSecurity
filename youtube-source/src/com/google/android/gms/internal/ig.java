// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ie

final class ig
    implements ie
{

    private IBinder a;

    ig(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(String s, Bundle bundle, Bundle bundle1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
        parcel.writeString(s);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel.writeInt(1);
        bundle1.writeToParcel(parcel, 0);
_L4:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel.recycle();
        throw s;
        parcel.writeInt(0);
          goto _L4
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
