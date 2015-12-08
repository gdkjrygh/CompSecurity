// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.apps.youtube.api.b.a.as;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cn, cp

public abstract class co extends Binder
    implements cn
{

    public co()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
    }

    public static cn a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
        if (iinterface != null && (iinterface instanceof cn))
        {
            return (cn)iinterface;
        } else
        {
            return new cp(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj = null;
        boolean flag15 = false;
        boolean flag16 = false;
        boolean flag17 = false;
        boolean flag18 = false;
        boolean flag19 = false;
        boolean flag20 = false;
        boolean flag21 = false;
        boolean flag22 = false;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag23 = false;
        boolean flag24 = false;
        boolean flag2 = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            a(as.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(flag2);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            }
            b(flag2);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag3 = flag15;
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            }
            c(flag3);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag4 = flag16;
            if (parcel.readInt() != 0)
            {
                flag4 = true;
            }
            d(flag4);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag5 = flag17;
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            }
            e(flag5);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag6 = flag18;
            if (parcel.readInt() != 0)
            {
                flag6 = true;
            }
            f(flag6);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag7 = flag19;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            g(flag7);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            b();
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            c();
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            d();
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            e();
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            f();
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            g();
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            h();
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            obj = parcel.readString();
            boolean flag8 = flag20;
            if (parcel.readInt() != 0)
            {
                flag8 = true;
            }
            a(((String) (obj)), flag8);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag9 = flag21;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            h(flag9);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag10 = flag22;
            if (parcel.readInt() != 0)
            {
                flag10 = true;
            }
            i(flag10);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            a(parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            i();
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            j();
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                obj = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
            }
            boolean flag11 = a(i, ((KeyEvent) (obj)));
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag11)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            i = parcel.readInt();
            KeyEvent keyevent = obj1;
            if (parcel.readInt() != 0)
            {
                keyevent = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
            }
            boolean flag12 = b(i, keyevent);
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag12)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag13 = flag23;
            if (parcel.readInt() != 0)
            {
                flag13 = true;
            }
            j(flag13);
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            boolean flag14 = flag24;
            if (parcel.readInt() != 0)
            {
                flag14 = true;
            }
            k(flag14);
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.apps.youtube.api.jar.client.IControlsOverlayClient");
            a(parcel.createTypedArrayList(SubtitleTrack.CREATOR));
            parcel1.writeNoException();
            return true;
        }
    }
}
