// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.youtube.player.internal.dynamic.a;

// Referenced classes of package com.google.android.youtube.player.internal:
//            g, i, j, l, 
//            s, u, p, r, 
//            m, o

public abstract class h extends Binder
    implements g
{

    public h()
    {
        attachInterface(this, "com.google.android.youtube.player.internal.IEmbeddedPlayer");
    }

    public static g a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
        if (iinterface != null && (iinterface instanceof g))
        {
            return (g)iinterface;
        } else
        {
            return new i(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int i1)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj4 = null;
        Object obj = null;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag6 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag15 = false;
        boolean flag5 = false;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        switch (k)
        {
        default:
            return super.onTransact(k, parcel, parcel1, i1);

        case 1598968902: 
            parcel1.writeString("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            if (parcel.readInt() != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            c(flag6);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            a(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            b(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            a(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            b(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            a(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            b(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            l();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            m();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            flag6 = o();
            parcel1.writeNoException();
            k = ((flag2) ? 1 : 0);
            if (flag6)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            flag6 = p();
            parcel1.writeNoException();
            k = ((flag3) ? 1 : 0);
            if (flag6)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            flag6 = q();
            parcel1.writeNoException();
            k = ((flag4) ? 1 : 0);
            if (flag6)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            r();
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            s();
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            k = t();
            parcel1.writeNoException();
            parcel1.writeInt(k);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            k = u();
            parcel1.writeNoException();
            parcel1.writeInt(k);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            c(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            d(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            if (parcel.readInt() != 0)
            {
                flag6 = true;
            }
            d(flag6);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            k = k();
            parcel1.writeNoException();
            parcel1.writeInt(k);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            boolean flag7 = flag13;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            b(flag7);
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            boolean flag8 = flag14;
            if (parcel.readInt() != 0)
            {
                flag8 = true;
            }
            e(flag8);
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = ((Parcel) (obj));
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                if (obj != null && (obj instanceof j))
                {
                    parcel = (j)obj;
                } else
                {
                    parcel = new l(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj1;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                if (obj != null && (obj instanceof s))
                {
                    parcel = (s)obj;
                } else
                {
                    parcel = new u(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj2;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                if (obj != null && (obj instanceof p))
                {
                    parcel = (p)obj;
                } else
                {
                    parcel = new r(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj3;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                if (obj != null && (obj instanceof m))
                {
                    parcel = (m)obj;
                } else
                {
                    parcel = new o(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            n();
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            v();
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (Configuration)Configuration.CREATOR.createFromParcel(parcel);
            }
            a(((Configuration) (obj)));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            e();
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            f();
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            g();
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            h();
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            boolean flag9 = flag15;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            a(flag9);
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            i();
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            parcel = w();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 40: // '('
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            boolean flag10 = a(((Bundle) (obj)));
            parcel1.writeNoException();
            k = ((flag5) ? 1 : 0);
            if (flag10)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            k = parcel.readInt();
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
            }
            boolean flag11 = a(k, ((KeyEvent) (obj)));
            parcel1.writeNoException();
            k = ((flag) ? 1 : 0);
            if (flag11)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            k = parcel.readInt();
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
            }
            boolean flag12 = b(k, ((KeyEvent) (obj)));
            parcel1.writeNoException();
            k = ((flag1) ? 1 : 0);
            if (flag12)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obj = j();
            parcel1.writeNoException();
            parcel = obj4;
            break;
        }
        if (obj != null)
        {
            parcel = ((a) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
