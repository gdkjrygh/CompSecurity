// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.jar.a.ce;
import com.google.android.apps.youtube.api.jar.a.ch;
import com.google.android.apps.youtube.api.jar.a.ck;
import com.google.android.apps.youtube.api.jar.a.cn;
import com.google.android.apps.youtube.api.jar.a.cq;
import com.google.android.apps.youtube.api.jar.a.ct;
import com.google.android.apps.youtube.api.jar.a.cw;
import com.google.android.apps.youtube.api.jar.a.cz;
import com.google.android.apps.youtube.api.jar.a.dc;
import com.google.android.apps.youtube.api.jar.a.df;
import com.google.android.apps.youtube.api.jar.a.di;
import com.google.android.apps.youtube.api.jar.a.dl;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            al, ap, ao

final class an
    implements al
{

    private IBinder a;

    an(IBinder ibinder)
    {
        a = ibinder;
    }

    public final ao a(ck ck1, cw cw1, dc dc1, df df1, ct ct1, ce ce1, di di1, 
            ch ch1, cn cn1, cq cq1, cz cz1, dl dl1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.youtube.api.service.jar.IApiPlayerFactoryService");
        if (ck1 == null) goto _L2; else goto _L1
_L1:
        ck1 = ck1.asBinder();
_L25:
        parcel.writeStrongBinder(ck1);
        if (cw1 == null) goto _L4; else goto _L3
_L3:
        ck1 = cw1.asBinder();
_L26:
        parcel.writeStrongBinder(ck1);
        if (dc1 == null) goto _L6; else goto _L5
_L5:
        ck1 = dc1.asBinder();
_L27:
        parcel.writeStrongBinder(ck1);
        if (df1 == null) goto _L8; else goto _L7
_L7:
        ck1 = df1.asBinder();
_L28:
        parcel.writeStrongBinder(ck1);
        if (ct1 == null) goto _L10; else goto _L9
_L9:
        ck1 = ct1.asBinder();
_L29:
        parcel.writeStrongBinder(ck1);
        if (ce1 == null) goto _L12; else goto _L11
_L11:
        ck1 = ce1.asBinder();
_L30:
        parcel.writeStrongBinder(ck1);
        if (di1 == null) goto _L14; else goto _L13
_L13:
        ck1 = di1.asBinder();
_L31:
        parcel.writeStrongBinder(ck1);
        if (ch1 == null) goto _L16; else goto _L15
_L15:
        ck1 = ch1.asBinder();
_L32:
        parcel.writeStrongBinder(ck1);
        if (cn1 == null) goto _L18; else goto _L17
_L17:
        ck1 = cn1.asBinder();
_L33:
        parcel.writeStrongBinder(ck1);
        if (cq1 == null) goto _L20; else goto _L19
_L19:
        ck1 = cq1.asBinder();
_L34:
        parcel.writeStrongBinder(ck1);
        if (cz1 == null) goto _L22; else goto _L21
_L21:
        ck1 = cz1.asBinder();
_L35:
        parcel.writeStrongBinder(ck1);
        if (dl1 == null) goto _L24; else goto _L23
_L23:
        ck1 = dl1.asBinder();
_L36:
        parcel.writeStrongBinder(ck1);
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        ck1 = ap.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ck1;
_L2:
        ck1 = null;
          goto _L25
_L4:
        ck1 = null;
          goto _L26
_L6:
        ck1 = null;
          goto _L27
_L8:
        ck1 = null;
          goto _L28
_L10:
        ck1 = null;
          goto _L29
_L12:
        ck1 = null;
          goto _L30
_L14:
        ck1 = null;
          goto _L31
_L16:
        ck1 = null;
          goto _L32
_L18:
        ck1 = null;
          goto _L33
_L20:
        ck1 = null;
          goto _L34
_L22:
        ck1 = null;
          goto _L35
_L24:
        ck1 = null;
          goto _L36
        ck1;
        parcel1.recycle();
        parcel.recycle();
        throw ck1;
          goto _L25
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
