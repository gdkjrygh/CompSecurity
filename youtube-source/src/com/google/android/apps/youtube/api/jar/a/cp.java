// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.apps.youtube.api.b.a.ar;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cn

final class cp
    implements cn
{

    private IBinder a;

    cp(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(int l, int i1, int j1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        parcel.writeInt(l);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        a.transact(20, parcel, parcel1, 0);
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

    public final void a(ar ar1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (ar1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ar1 = ar1.asBinder();
_L1:
        parcel.writeStrongBinder(ar1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ar1 = null;
          goto _L1
        ar1;
        parcel1.recycle();
        parcel.recycle();
        throw ar1;
    }

    public final void a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        parcel.writeString(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void a(String s, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        parcel.writeString(s);
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void a(List list)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        parcel.writeTypedList(list);
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
    }

    public final void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
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

    public final boolean a(int l, KeyEvent keyevent)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        parcel.writeInt(l);
        if (keyevent == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        parcel.writeInt(1);
        keyevent.writeToParcel(parcel, 0);
_L1:
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        if (l == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        keyevent;
        parcel1.recycle();
        parcel.recycle();
        throw keyevent;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(10, parcel, parcel1, 0);
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

    public final void b(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(4, parcel, parcel1, 0);
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

    public final boolean b(int l, KeyEvent keyevent)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        parcel.writeInt(l);
        if (keyevent == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        parcel.writeInt(1);
        keyevent.writeToParcel(parcel, 0);
_L1:
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        if (l == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        keyevent;
        parcel1.recycle();
        parcel.recycle();
        throw keyevent;
    }

    public final void c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(11, parcel, parcel1, 0);
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

    public final void c(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(5, parcel, parcel1, 0);
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

    public final void d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(12, parcel, parcel1, 0);
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

    public final void d(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(6, parcel, parcel1, 0);
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

    public final void e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(13, parcel, parcel1, 0);
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

    public final void e(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(7, parcel, parcel1, 0);
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

    public final void f()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(14, parcel, parcel1, 0);
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

    public final void f(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(8, parcel, parcel1, 0);
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

    public final void g()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(15, parcel, parcel1, 0);
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

    public final void g(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(9, parcel, parcel1, 0);
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

    public final void h()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(16, parcel, parcel1, 0);
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

    public final void h(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(18, parcel, parcel1, 0);
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

    public final void i()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(21, parcel, parcel1, 0);
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

    public final void i(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(19, parcel, parcel1, 0);
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

    public final void j()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        a.transact(22, parcel, parcel1, 0);
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

    public final void j(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(25, parcel, parcel1, 0);
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

    public final void k(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(26, parcel, parcel1, 0);
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
}
