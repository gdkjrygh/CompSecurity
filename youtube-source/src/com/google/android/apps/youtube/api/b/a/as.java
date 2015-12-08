// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ar, at

public abstract class as extends Binder
    implements ar
{

    public as()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
    }

    public static ar a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
        if (iinterface != null && (iinterface instanceof ar))
        {
            return (ar)iinterface;
        } else
        {
            return new at(ibinder);
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
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            c();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            e();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            f();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            g();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            h();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            i();
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            j();
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            k();
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            if (parcel.readInt() != 0)
            {
                parcel = (SubtitleTrack)SubtitleTrack.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IControlsOverlayService");
            l();
            parcel1.writeNoException();
            return true;
        }
    }
}
