// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;

// Referenced classes of package com.google.android.gms.maps.a:
//            bj

final class bl
    implements bj
{

    private IBinder a;

    bl(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(Bitmap bitmap)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        bitmap.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bitmap;
        parcel1.recycle();
        parcel.recycle();
        throw bitmap;
    }

    public final void a(k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
