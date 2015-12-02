// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            jt

public abstract class a extends Binder
    implements jt
{

    public static jt Q(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        class a
            implements jt
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public void e(js js1, int i, String s, Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (js1 == null)
                {
                    break MISSING_BLOCK_LABEL_110;
                }
                js1 = js1.asBinder();
_L1:
                parcel.writeStrongBinder(js1);
                parcel.writeInt(i);
                parcel.writeString(s);
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_71;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
                if (!qw.a)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                parcel.writeInt(0);
                le.transact(8, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                js1 = null;
                  goto _L1
                js1;
                parcel1.recycle();
                parcel.recycle();
                throw js1;
            }

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof jt))
        {
            return (jt)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
