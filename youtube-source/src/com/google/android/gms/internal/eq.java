// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

// Referenced classes of package com.google.android.gms.internal:
//            ep

public abstract class eq extends Binder
    implements ep
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.audience.dynamite.IAudienceViewImageLoadedCallback");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewImageLoadedCallback");
            i = parcel.readInt();
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(i, parcel);
        parcel1.writeNoException();
        return true;
    }
}
