// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.youtube.api.b.a.aj;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ch, cj

public abstract class ci extends Binder
    implements ch
{

    public ci()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
    }

    public static ch a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
        if (iinterface != null && (iinterface instanceof ch))
        {
            return (ch)iinterface;
        } else
        {
            return new cj(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            a(aj.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            c();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            d();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(parcel);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            e();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            f();
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            c(parcel);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            flag = flag1;
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            b(flag);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            g();
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            h();
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            i();
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            if (parcel.readInt() != 0)
            {
                parcel = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            d(parcel);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IAnnotationOverlayClient");
            flag = flag2;
            break;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        }
        c(flag);
        parcel1.writeNoException();
        return true;
    }
}
