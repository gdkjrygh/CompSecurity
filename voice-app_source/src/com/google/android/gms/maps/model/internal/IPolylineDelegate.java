// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public interface IPolylineDelegate
    extends IInterface
{
    public static abstract class zza extends Binder
        implements IPolylineDelegate
    {

        public static IPolylineDelegate zzcR(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            if (iinterface != null && (iinterface instanceof IPolylineDelegate))
            {
                return (IPolylineDelegate)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            boolean flag8 = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                remove();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                parcel = getId();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                setPoints(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                parcel = getPoints();
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                setWidth(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                float f = getWidth();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                setColor(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i = getColor();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                setZIndex(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                float f1 = getZIndex();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                setVisible(flag3);
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                boolean flag4 = isVisible();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag4)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                boolean flag5 = flag8;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                setGeodesic(flag5);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                boolean flag6 = isGeodesic();
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag6)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                boolean flag7 = equalsRemote(zzcR(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if (flag7)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i = hashCodeRemote();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;
            }
        }
    }

    private static class zza.zza
        implements IPolylineDelegate
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public boolean equalsRemote(IPolylineDelegate ipolylinedelegate)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            if (ipolylinedelegate == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            ipolylinedelegate = ipolylinedelegate.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(ipolylinedelegate);
            zznF.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            ipolylinedelegate = null;
              goto _L1
            ipolylinedelegate;
            parcel1.recycle();
            parcel.recycle();
            throw ipolylinedelegate;
        }

        public int getColor()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public List getPoints()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createTypedArrayList(LatLng.CREATOR);
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public float getWidth()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            f = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public float getZIndex()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            f = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int hashCodeRemote()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isGeodesic()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
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

        public boolean isVisible()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
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

        public void remove()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            zznF.transact(1, parcel, parcel1, 0);
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

        public void setColor(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            parcel.writeInt(i);
            zznF.transact(7, parcel, parcel1, 0);
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

        public void setGeodesic(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(13, parcel, parcel1, 0);
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

        public void setPoints(List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            parcel.writeTypedList(list);
            zznF.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public void setVisible(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(11, parcel, parcel1, 0);
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

        public void setWidth(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            parcel.writeFloat(f);
            zznF.transact(5, parcel, parcel1, 0);
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

        public void setZIndex(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            parcel.writeFloat(f);
            zznF.transact(9, parcel, parcel1, 0);
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

        zza.zza(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract boolean equalsRemote(IPolylineDelegate ipolylinedelegate)
        throws RemoteException;

    public abstract int getColor()
        throws RemoteException;

    public abstract String getId()
        throws RemoteException;

    public abstract List getPoints()
        throws RemoteException;

    public abstract float getWidth()
        throws RemoteException;

    public abstract float getZIndex()
        throws RemoteException;

    public abstract int hashCodeRemote()
        throws RemoteException;

    public abstract boolean isGeodesic()
        throws RemoteException;

    public abstract boolean isVisible()
        throws RemoteException;

    public abstract void remove()
        throws RemoteException;

    public abstract void setColor(int i)
        throws RemoteException;

    public abstract void setGeodesic(boolean flag)
        throws RemoteException;

    public abstract void setPoints(List list)
        throws RemoteException;

    public abstract void setVisible(boolean flag)
        throws RemoteException;

    public abstract void setWidth(float f)
        throws RemoteException;

    public abstract void setZIndex(float f)
        throws RemoteException;
}
