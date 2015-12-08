// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ba

final class bc
    implements ba
{

    private IBinder a;

    bc(IBinder ibinder)
    {
        a = ibinder;
    }

    public final int a(IBinder ibinder, IBinder ibinder1, android.view.WindowManager.LayoutParams layoutparams, int i, int j, int k, boolean flag, 
            Rect rect, Rect rect1, Rect rect2, Configuration configuration, Surface surface)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
        parcel.writeStrongBinder(ibinder);
        parcel.writeStrongBinder(ibinder1);
        if (layoutparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        layoutparams.writeToParcel(parcel, 0);
_L3:
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (surface == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        parcel.writeInt(1);
        surface.writeToParcel(parcel, 0);
_L4:
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (parcel1.readInt() != 0)
        {
            rect.readFromParcel(parcel1);
        }
        if (parcel1.readInt() != 0)
        {
            rect1.readFromParcel(parcel1);
        }
        if (parcel1.readInt() != 0)
        {
            rect2.readFromParcel(parcel1);
        }
        if (parcel1.readInt() != 0)
        {
            configuration.readFromParcel(parcel1);
        }
        if (parcel1.readInt() != 0)
        {
            surface.readFromParcel(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return i;
_L2:
        parcel.writeInt(0);
          goto _L3
        ibinder;
        parcel1.recycle();
        parcel.recycle();
        throw ibinder;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(int i, int j, int k)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(Surface surface)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.service.jar.ISurfaceHolderService");
        if (surface == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        surface.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        surface;
        parcel1.recycle();
        parcel.recycle();
        throw surface;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
