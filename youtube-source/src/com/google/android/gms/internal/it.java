// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ir, ju, jq

final class it
    implements ir
{

    private IBinder a;

    it(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(String s, ju ju1, jq jq1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (ju1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        ju1.writeToParcel(parcel, 0);
_L3:
        if (jq1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel.writeInt(1);
        jq1.writeToParcel(parcel, 0);
_L4:
        a.transact(2, parcel, null, 1);
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

    public final void a(String s, ju ju1, List list)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (ju1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        parcel.writeInt(1);
        ju1.writeToParcel(parcel, 0);
_L1:
        parcel.writeTypedList(list);
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
