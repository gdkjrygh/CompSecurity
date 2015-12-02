// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMap;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            g

class le
    implements g
{

    private IBinder le;

    public IBinder asBinder()
    {
        return le;
    }

    public d b(Bitmap bitmap)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = le;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        parcel.writeInt(1);
        bitmap.writeToParcel(parcel, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(0);
        le.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        bitmap = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        if (GoogleMap.a)
        {
            le = i + 1;
        }
        return bitmap;
        bitmap;
        parcel1.recycle();
        parcel.recycle();
        throw bitmap;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
