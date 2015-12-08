// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.api.jar.a.cf;
import com.google.android.apps.youtube.api.jar.a.ci;
import com.google.android.apps.youtube.api.jar.a.cl;
import com.google.android.apps.youtube.api.jar.a.co;
import com.google.android.apps.youtube.api.jar.a.cr;
import com.google.android.apps.youtube.api.jar.a.cu;
import com.google.android.apps.youtube.api.jar.a.cx;
import com.google.android.apps.youtube.api.jar.a.da;
import com.google.android.apps.youtube.api.jar.a.dd;
import com.google.android.apps.youtube.api.jar.a.dg;
import com.google.android.apps.youtube.api.jar.a.dj;
import com.google.android.apps.youtube.api.jar.a.dm;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            al, an, ao

public abstract class am extends Binder
    implements al
{

    public am()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.IApiPlayerFactoryService");
    }

    public static al a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerFactoryService");
        if (iinterface != null && (iinterface instanceof al))
        {
            return (al)iinterface;
        } else
        {
            return new an(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        com.google.android.apps.youtube.api.jar.a.ck ck;
        com.google.android.apps.youtube.api.jar.a.cw cw;
        com.google.android.apps.youtube.api.jar.a.dc dc;
        com.google.android.apps.youtube.api.jar.a.df df;
        com.google.android.apps.youtube.api.jar.a.ct ct;
        com.google.android.apps.youtube.api.jar.a.ce ce;
        com.google.android.apps.youtube.api.jar.a.di di;
        com.google.android.apps.youtube.api.jar.a.ch ch;
        com.google.android.apps.youtube.api.jar.a.cn cn;
        com.google.android.apps.youtube.api.jar.a.cq cq;
        com.google.android.apps.youtube.api.jar.a.cz cz;
        com.google.android.apps.youtube.api.jar.a.dl dl;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.IApiPlayerFactoryService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.IApiPlayerFactoryService");
            ck = cl.a(parcel.readStrongBinder());
            cw = cx.a(parcel.readStrongBinder());
            dc = dd.a(parcel.readStrongBinder());
            df = dg.a(parcel.readStrongBinder());
            ct = cu.a(parcel.readStrongBinder());
            ce = cf.a(parcel.readStrongBinder());
            di = dj.a(parcel.readStrongBinder());
            ch = ci.a(parcel.readStrongBinder());
            cn = co.a(parcel.readStrongBinder());
            cq = cr.a(parcel.readStrongBinder());
            cz = da.a(parcel.readStrongBinder());
            dl = dm.a(parcel.readStrongBinder());
            break;
        }
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        parcel = a(ck, cw, dc, df, ct, ce, di, ch, cn, cq, cz, dl, flag);
        parcel1.writeNoException();
        if (parcel != null)
        {
            parcel = parcel.asBinder();
        } else
        {
            parcel = null;
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
