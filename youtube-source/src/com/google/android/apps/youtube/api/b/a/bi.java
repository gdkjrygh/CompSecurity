// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bg

final class bi
    implements bg
{

    private IBinder a;

    bi(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.service.jar.ISurveyOverlayService");
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(1, parcel, parcel1, 0);
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

    public final void a(int ai[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.service.jar.ISurveyOverlayService");
        parcel.writeIntArray(ai);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ai;
        parcel1.recycle();
        parcel.recycle();
        throw ai;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
