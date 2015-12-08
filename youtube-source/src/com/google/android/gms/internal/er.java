// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

// Referenced classes of package com.google.android.gms.internal:
//            ep

final class er
    implements ep
{

    private IBinder a;

    er(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(int i, ParcelFileDescriptor parcelfiledescriptor)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceViewImageLoadedCallback");
        parcel.writeInt(i);
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        parcelfiledescriptor;
        parcel1.recycle();
        parcel.recycle();
        throw parcelfiledescriptor;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
