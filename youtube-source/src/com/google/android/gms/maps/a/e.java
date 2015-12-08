// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.Binder;
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
import com.google.android.gms.maps.model.a.g;
import com.google.android.gms.maps.model.a.m;
import com.google.android.gms.maps.model.a.p;
import com.google.android.gms.maps.model.a.s;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.k;

// Referenced classes of package com.google.android.gms.maps.a:
//            d, f, x, g, 
//            i, s, p, af, 
//            ah, ao, aq, au, 
//            aw, ax, az, ba, 
//            bc, ai, ak, ac, 
//            ae, bg, bi, bd, 
//            bf, bj, bl, ar, 
//            at

public abstract class e extends Binder
    implements d
{

    public static d a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (iinterface != null && (iinterface instanceof d))
        {
            return (d)iinterface;
        } else
        {
            return new com.google.android.gms.maps.a.f(ibinder);
        }
    }

    public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
    {
        boolean flag5 = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag12 = false;
        boolean flag4 = false;
        boolean flag13 = false;
        boolean flag = false;
        Object obj6 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj5 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj = null;
        switch (i1)
        {
        default:
            return super.onTransact(i1, parcel, parcel1, j1);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = a();
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

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f1 = b();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f2 = c();
            parcel1.writeNoException();
            parcel1.writeFloat(f2);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(l.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            b(l.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(l.a(parcel.readStrongBinder()), com.google.android.gms.maps.a.x.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(l.a(parcel.readStrongBinder()), parcel.readInt(), com.google.android.gms.maps.a.x.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj2 = PolylineOptions.CREATOR;
                parcel = com.google.android.gms.maps.model.l.a(parcel);
            } else
            {
                parcel = null;
            }
            obj2 = a(parcel);
            parcel1.writeNoException();
            parcel = obj;
            if (obj2 != null)
            {
                parcel = ((a) (obj2)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            p p1;
            if (parcel.readInt() != 0)
            {
                parcel = PolygonOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            p1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj6;
            if (p1 != null)
            {
                parcel = p1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            m m1;
            if (parcel.readInt() != 0)
            {
                j j2 = MarkerOptions.CREATOR;
                parcel = j.a(parcel);
            } else
            {
                parcel = null;
            }
            m1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj2));
            if (m1 != null)
            {
                parcel = m1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            com.google.android.gms.maps.model.a.j j3;
            if (parcel.readInt() != 0)
            {
                f f3 = GroundOverlayOptions.CREATOR;
                parcel = f.a(parcel);
            } else
            {
                parcel = null;
            }
            j3 = a(parcel);
            parcel1.writeNoException();
            parcel = obj3;
            if (j3 != null)
            {
                parcel = j3.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            s s1;
            if (parcel.readInt() != 0)
            {
                com.google.android.gms.maps.model.p p2 = TileOverlayOptions.CREATOR;
                parcel = com.google.android.gms.maps.model.p.a(parcel);
            } else
            {
                parcel = null;
            }
            s1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj4;
            if (s1 != null)
            {
                parcel = s1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            i1 = f();
            parcel1.writeNoException();
            parcel1.writeInt(i1);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            flag5 = g();
            parcel1.writeNoException();
            i1 = ((flag) ? 1 : 0);
            if (flag5)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            }
            a(flag5);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag6 = h();
            parcel1.writeNoException();
            i1 = ((flag1) ? 1 : 0);
            if (flag6)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag7;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            flag7 = b(flag7);
            parcel1.writeNoException();
            i1 = ((flag2) ? 1 : 0);
            if (flag7)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag8 = i();
            parcel1.writeNoException();
            i1 = ((flag3) ? 1 : 0);
            if (flag8)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag9 = flag12;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            c(flag9);
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = j();
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

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj7;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.a.g))
                {
                    parcel = (com.google.android.gms.maps.a.g)iinterface;
                } else
                {
                    parcel = new i(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            com.google.android.gms.maps.a.s s2 = k();
            parcel1.writeNoException();
            parcel = obj8;
            if (s2 != null)
            {
                parcel = s2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            com.google.android.gms.maps.a.p p3 = l();
            parcel1.writeNoException();
            parcel = obj9;
            if (p3 != null)
            {
                parcel = p3.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj10;
            } else
            {
                android.os.IInterface iinterface1 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                if (iinterface1 != null && (iinterface1 instanceof af))
                {
                    parcel = (af)iinterface1;
                } else
                {
                    parcel = new ah(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj11;
            } else
            {
                android.os.IInterface iinterface2 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                if (iinterface2 != null && (iinterface2 instanceof ao))
                {
                    parcel = (ao)iinterface2;
                } else
                {
                    parcel = new aq(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj12;
            } else
            {
                android.os.IInterface iinterface3 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                if (iinterface3 != null && (iinterface3 instanceof au))
                {
                    parcel = (au)iinterface3;
                } else
                {
                    parcel = new aw(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj13;
            } else
            {
                android.os.IInterface iinterface4 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                if (iinterface4 != null && (iinterface4 instanceof ax))
                {
                    parcel = (ax)iinterface4;
                } else
                {
                    parcel = new az(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj14;
            } else
            {
                android.os.IInterface iinterface5 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                if (iinterface5 != null && (iinterface5 instanceof ba))
                {
                    parcel = (ba)iinterface5;
                } else
                {
                    parcel = new bc(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj15;
            } else
            {
                android.os.IInterface iinterface6 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                if (iinterface6 != null && (iinterface6 instanceof ai))
                {
                    parcel = (ai)iinterface6;
                } else
                {
                    parcel = new ak(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj16;
            } else
            {
                android.os.IInterface iinterface7 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                if (iinterface7 != null && (iinterface7 instanceof ac))
                {
                    parcel = (ac)iinterface7;
                } else
                {
                    parcel = new ae(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            com.google.android.gms.dynamic.k k1 = m();
            parcel1.writeNoException();
            parcel = obj17;
            if (k1 != null)
            {
                parcel = k1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            g g1;
            if (parcel.readInt() != 0)
            {
                com.google.android.gms.maps.model.e e1 = CircleOptions.CREATOR;
                parcel = com.google.android.gms.maps.model.e.a(parcel);
            } else
            {
                parcel = null;
            }
            g1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj5;
            if (g1 != null)
            {
                parcel = g1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj18;
            } else
            {
                android.os.IInterface iinterface8 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                if (iinterface8 != null && (iinterface8 instanceof bg))
                {
                    parcel = (bg)iinterface8;
                } else
                {
                    parcel = new bi(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj19;
            } else
            {
                android.os.IInterface iinterface9 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                if (iinterface9 != null && (iinterface9 instanceof bd))
                {
                    parcel = (bd)iinterface9;
                } else
                {
                    parcel = new bf(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            Object obj1 = parcel.readStrongBinder();
            if (obj1 == null)
            {
                obj1 = obj20;
            } else
            {
                android.os.IInterface iinterface11 = ((IBinder) (obj1)).queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                if (iinterface11 != null && (iinterface11 instanceof bj))
                {
                    obj1 = (bj)iinterface11;
                } else
                {
                    obj1 = new bl(((IBinder) (obj1)));
                }
            }
            a(((bj) (obj1)), l.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag10 = n();
            parcel1.writeNoException();
            i1 = ((flag4) ? 1 : 0);
            if (flag10)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag11 = flag13;
            if (parcel.readInt() != 0)
            {
                flag11 = true;
            }
            d(flag11);
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            break;
        }
        if (parcel == null)
        {
            parcel = obj21;
        } else
        {
            android.os.IInterface iinterface10 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
            if (iinterface10 != null && (iinterface10 instanceof ar))
            {
                parcel = (ar)iinterface10;
            } else
            {
                parcel = new at(parcel);
            }
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
