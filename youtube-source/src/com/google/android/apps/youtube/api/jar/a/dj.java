// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.b.a.bh;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            di, dk

public abstract class dj extends Binder
    implements di
{

    public dj()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
    }

    public static di a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
        if (iinterface != null && (iinterface instanceof di))
        {
            return (di)iinterface;
        } else
        {
            return new dk(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag2 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
            a(bh.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
            a();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
            String s = parcel.readString();
            java.util.ArrayList arraylist = parcel.createStringArrayList();
            boolean flag1 = flag2;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            a(s, arraylist, flag1);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.ISurveyOverlayClient");
            b();
            parcel1.writeNoException();
            return true;
        }
    }
}
