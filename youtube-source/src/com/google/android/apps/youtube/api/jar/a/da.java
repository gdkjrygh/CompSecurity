// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSnapshot;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cz, db

public abstract class da extends Binder
    implements cz
{

    public da()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
    }

    public static cz a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
        if (iinterface != null && (iinterface instanceof cz))
        {
            return (cz)iinterface;
        } else
        {
            return new db(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
            a(parcel.createTypedArrayList(SubtitleWindowSnapshot.CREATOR));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
            a();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
            b();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISubtitlesOverlayClient");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (SubtitlesStyle)SubtitlesStyle.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
