// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.b;
import com.google.android.gms.maps.model.a.g;
import com.google.android.gms.maps.model.a.h;
import com.google.android.gms.maps.model.a.j;
import com.google.android.gms.maps.model.a.k;
import com.google.android.gms.maps.model.a.m;
import com.google.android.gms.maps.model.a.n;
import com.google.android.gms.maps.model.a.p;
import com.google.android.gms.maps.model.a.q;
import com.google.android.gms.maps.model.a.s;
import com.google.android.gms.maps.model.a.t;
import com.google.android.gms.maps.model.d;

// Referenced classes of package com.google.android.gms.maps.a:
//            d, w, ac, af, 
//            ai, ao, ar, au, 
//            ax, ba, bd, bg, 
//            bj, g, t, q, 
//            s, p

final class f
    implements com.google.android.gms.maps.a.d
{

    private IBinder a;

    f(IBinder ibinder)
    {
        a = ibinder;
    }

    public final CameraPosition a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = CameraPosition.CREATOR;
        obj = com.google.android.gms.maps.model.d.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((CameraPosition) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final a a(PolylineOptions polylineoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polylineoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        polylineoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        polylineoptions = com.google.android.gms.maps.model.a.b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return polylineoptions;
        parcel.writeInt(0);
          goto _L1
        polylineoptions;
        parcel1.recycle();
        parcel.recycle();
        throw polylineoptions;
    }

    public final g a(CircleOptions circleoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (circleoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        circleoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        circleoptions = com.google.android.gms.maps.model.a.h.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return circleoptions;
        parcel.writeInt(0);
          goto _L1
        circleoptions;
        parcel1.recycle();
        parcel.recycle();
        throw circleoptions;
    }

    public final j a(GroundOverlayOptions groundoverlayoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        groundoverlayoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        groundoverlayoptions = com.google.android.gms.maps.model.a.k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return groundoverlayoptions;
        parcel.writeInt(0);
          goto _L1
        groundoverlayoptions;
        parcel1.recycle();
        parcel.recycle();
        throw groundoverlayoptions;
    }

    public final m a(MarkerOptions markeroptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        markeroptions.writeToParcel(parcel, 0);
_L1:
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        markeroptions = com.google.android.gms.maps.model.a.n.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return markeroptions;
        parcel.writeInt(0);
          goto _L1
        markeroptions;
        parcel1.recycle();
        parcel.recycle();
        throw markeroptions;
    }

    public final p a(PolygonOptions polygonoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polygonoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        polygonoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        polygonoptions = q.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return polygonoptions;
        parcel.writeInt(0);
          goto _L1
        polygonoptions;
        parcel1.recycle();
        parcel.recycle();
        throw polygonoptions;
    }

    public final s a(TileOverlayOptions tileoverlayoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (tileoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        tileoverlayoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        tileoverlayoptions = t.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return tileoverlayoptions;
        parcel.writeInt(0);
          goto _L1
        tileoverlayoptions;
        parcel1.recycle();
        parcel.recycle();
        throw tileoverlayoptions;
    }

    public final void a(int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
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

    public final void a(int i1, int j1, int k1, int l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        parcel.writeInt(l1);
        a.transact(39, parcel, parcel1, 0);
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

    public final void a(com.google.android.gms.dynamic.k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final void a(com.google.android.gms.dynamic.k k1, int i1, w w1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        k1 = obj;
        if (w1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k1 = w1.asBinder();
        parcel.writeStrongBinder(k1);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final void a(com.google.android.gms.dynamic.k k1, w w1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        k1 = obj;
        if (w1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        k1 = w1.asBinder();
        parcel.writeStrongBinder(k1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final void a(ac ac1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ac1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ac1 = ac1.asBinder();
_L1:
        parcel.writeStrongBinder(ac1);
        a.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ac1 = null;
          goto _L1
        ac1;
        parcel1.recycle();
        parcel.recycle();
        throw ac1;
    }

    public final void a(af af1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (af1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        af1 = af1.asBinder();
_L1:
        parcel.writeStrongBinder(af1);
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        af1 = null;
          goto _L1
        af1;
        parcel1.recycle();
        parcel.recycle();
        throw af1;
    }

    public final void a(ai ai1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ai1 = ai1.asBinder();
_L1:
        parcel.writeStrongBinder(ai1);
        a.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ai1 = null;
          goto _L1
        ai1;
        parcel1.recycle();
        parcel.recycle();
        throw ai1;
    }

    public final void a(ao ao1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ao1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ao1 = ao1.asBinder();
_L1:
        parcel.writeStrongBinder(ao1);
        a.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ao1 = null;
          goto _L1
        ao1;
        parcel1.recycle();
        parcel.recycle();
        throw ao1;
    }

    public final void a(ar ar1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ar1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ar1 = ar1.asBinder();
_L1:
        parcel.writeStrongBinder(ar1);
        a.transact(42, parcel, parcel1, 0);
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

    public final void a(au au1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (au1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        au1 = au1.asBinder();
_L1:
        parcel.writeStrongBinder(au1);
        a.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        au1 = null;
          goto _L1
        au1;
        parcel1.recycle();
        parcel.recycle();
        throw au1;
    }

    public final void a(ax ax1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ax1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ax1 = ax1.asBinder();
_L1:
        parcel.writeStrongBinder(ax1);
        a.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ax1 = null;
          goto _L1
        ax1;
        parcel1.recycle();
        parcel.recycle();
        throw ax1;
    }

    public final void a(ba ba1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ba1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ba1 = ba1.asBinder();
_L1:
        parcel.writeStrongBinder(ba1);
        a.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ba1 = null;
          goto _L1
        ba1;
        parcel1.recycle();
        parcel.recycle();
        throw ba1;
    }

    public final void a(bd bd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (bd1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        bd1 = bd1.asBinder();
_L1:
        parcel.writeStrongBinder(bd1);
        a.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        bd1 = null;
          goto _L1
        bd1;
        parcel1.recycle();
        parcel.recycle();
        throw bd1;
    }

    public final void a(bg bg1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (bg1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        bg1 = bg1.asBinder();
_L1:
        parcel.writeStrongBinder(bg1);
        a.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        bg1 = null;
          goto _L1
        bg1;
        parcel1.recycle();
        parcel.recycle();
        throw bg1;
    }

    public final void a(bj bj1, com.google.android.gms.dynamic.k k1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (bj1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        bj1 = bj1.asBinder();
_L1:
        parcel.writeStrongBinder(bj1);
        bj1 = obj;
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        bj1 = k1.asBinder();
        parcel.writeStrongBinder(bj1);
        a.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        bj1 = null;
          goto _L1
        bj1;
        parcel1.recycle();
        parcel.recycle();
        throw bj1;
    }

    public final void a(com.google.android.gms.maps.a.g g1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        g1 = g1.asBinder();
_L1:
        parcel.writeStrongBinder(g1);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        g1 = null;
          goto _L1
        g1;
        parcel1.recycle();
        parcel.recycle();
        throw g1;
    }

    public final void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
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

    public final IBinder asBinder()
    {
        return a;
    }

    public final float b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void b(com.google.android.gms.dynamic.k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final boolean b(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final float c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
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
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
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

    public final void d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

    public final void d(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(41, parcel, parcel1, 0);
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
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

    public final int f()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final boolean g()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final boolean h()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final boolean i()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Location j()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Location location = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return location;
_L2:
        location = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final com.google.android.gms.maps.a.s k()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        com.google.android.gms.maps.a.s s;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        s = com.google.android.gms.maps.a.t.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final com.google.android.gms.maps.a.p l()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        com.google.android.gms.maps.a.p p;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        p = com.google.android.gms.maps.a.q.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return p;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final com.google.android.gms.dynamic.k m()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        com.google.android.gms.dynamic.k k1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        k1 = com.google.android.gms.dynamic.l.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final boolean n()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
