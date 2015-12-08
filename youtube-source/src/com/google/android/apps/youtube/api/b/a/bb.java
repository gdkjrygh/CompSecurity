// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ba, bc

public abstract class bb extends Binder
    implements ba
{

    public bb()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
    }

    public static ba a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
        if (iinterface != null && (iinterface instanceof ba))
        {
            return (ba)iinterface;
        } else
        {
            return new bc(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        IBinder ibinder;
        IBinder ibinder1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
            if (parcel.readInt() != 0)
            {
                parcel = (Surface)Surface.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
            a(parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
            a();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
            ibinder = parcel.readStrongBinder();
            ibinder1 = parcel.readStrongBinder();
            break;
        }
        android.view.WindowManager.LayoutParams layoutparams;
        Rect rect;
        Rect rect1;
        Rect rect2;
        Configuration configuration;
        int k;
        boolean flag;
        if (parcel.readInt() != 0)
        {
            layoutparams = (android.view.WindowManager.LayoutParams)android.view.WindowManager.LayoutParams.CREATOR.createFromParcel(parcel);
        } else
        {
            layoutparams = null;
        }
        i = parcel.readInt();
        j = parcel.readInt();
        k = parcel.readInt();
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        rect = new Rect();
        rect1 = new Rect();
        rect2 = new Rect();
        configuration = new Configuration();
        if (parcel.readInt() != 0)
        {
            parcel = (Surface)Surface.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        i = a(ibinder, ibinder1, layoutparams, i, j, k, flag, rect, rect1, rect2, configuration, parcel);
        parcel1.writeNoException();
        parcel1.writeInt(i);
        parcel1.writeInt(1);
        rect.writeToParcel(parcel1, 1);
        parcel1.writeInt(1);
        rect1.writeToParcel(parcel1, 1);
        parcel1.writeInt(1);
        rect2.writeToParcel(parcel1, 1);
        parcel1.writeInt(1);
        configuration.writeToParcel(parcel1, 1);
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
        } else
        {
            parcel1.writeInt(0);
        }
        return true;
    }
}
