// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zze;
import java.util.List;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzb

public interface zzd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzd
    {

        public static zzd zzcx(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
            if (iinterface != null && (iinterface instanceof zzd))
            {
                return (zzd)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            String s = null;
            Object obj1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.plus.internal.IPlusService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zza(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zza(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zzb(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                if (parcel.readInt() != 0)
                {
                    parcel = SafeParcelResponse.CREATOR.zzV(parcel);
                } else
                {
                    parcel = null;
                }
                zza(parcel);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                parcel = getAccountName();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zzvt();
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zza(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                obj1 = com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(((zzb) (obj1)), ((Uri) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                obj1 = com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder());
                i = parcel.readInt();
                s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                zza(((zzb) (obj1)), i, s, ((Uri) (obj)), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                obj1 = zza(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((ICancelToken) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zzdp(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zzc(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zzb(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zza(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zzd(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                parcel = getAuthCode();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                boolean flag = zzvu();
                parcel1.writeNoException();
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 43: // '+'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                parcel = zzvv();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 44: // ','
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                zze(com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 45: // '-'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                obj1 = com.google.android.gms.plus.internal.zzb.zza.zzcv(parcel.readStrongBinder());
                obj = s;
                if (parcel.readInt() != 0)
                {
                    obj = SafeParcelResponse.CREATOR.zzV(parcel);
                }
                zza(((zzb) (obj1)), ((SafeParcelResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                s = parcel.readString();
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = FavaDiagnosticsEntity.CREATOR.zzN(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = FavaDiagnosticsEntity.CREATOR.zzN(parcel);
            }
            zza(s, ((FavaDiagnosticsEntity) (obj)), ((FavaDiagnosticsEntity) (obj1)));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zzd
    {

        private IBinder zzlW;

        public IBinder asBinder()
        {
            return zzlW;
        }

        public String getAccountName()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            zzlW.transact(5, parcel, parcel1, 0);
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

        public String getAuthCode()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            zzlW.transact(41, parcel, parcel1, 0);
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

        public ICancelToken zza(zzb zzb1, int i, int j, int k, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeString(s);
            zzlW.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            zzb1 = com.google.android.gms.common.internal.ICancelToken.zza.zzR(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzb1;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zza(SafeParcelResponse safeparcelresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (safeparcelresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            safeparcelresponse.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            safeparcelresponse;
            parcel1.recycle();
            parcel.recycle();
            throw safeparcelresponse;
        }

        public void zza(zzb zzb1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            zzlW.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zza(zzb zzb1, int i, String s, Uri uri, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null) goto _L2; else goto _L1
_L1:
            zzb1 = zzb1.asBinder();
_L5:
            parcel.writeStrongBinder(zzb1);
            parcel.writeInt(i);
            parcel.writeString(s);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s1);
            parcel.writeString(s2);
            zzlW.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzb1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
              goto _L5
        }

        public void zza(zzb zzb1, Uri uri, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null) goto _L2; else goto _L1
_L1:
            zzb1 = zzb1.asBinder();
_L5:
            parcel.writeStrongBinder(zzb1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            zzlW.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzb1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
            parcel.writeInt(0);
              goto _L7
        }

        public void zza(zzb zzb1, SafeParcelResponse safeparcelresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null) goto _L2; else goto _L1
_L1:
            zzb1 = zzb1.asBinder();
_L5:
            parcel.writeStrongBinder(zzb1);
            if (safeparcelresponse == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            safeparcelresponse.writeToParcel(parcel, 0);
_L6:
            zzlW.transact(45, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzb1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
              goto _L5
        }

        public void zza(zzb zzb1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeString(s);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zza(zzb zzb1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeString(s);
            parcel.writeString(s1);
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zza(zzb zzb1, List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeStringList(list);
            zzlW.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zza(String s, FavaDiagnosticsEntity favadiagnosticsentity, FavaDiagnosticsEntity favadiagnosticsentity1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcel.writeString(s);
            if (favadiagnosticsentity == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            favadiagnosticsentity.writeToParcel(parcel, 0);
_L3:
            if (favadiagnosticsentity1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            parcel.writeInt(1);
            favadiagnosticsentity1.writeToParcel(parcel, 0);
_L4:
            zzlW.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            parcel.writeInt(0);
              goto _L4
        }

        public void zzb(zzb zzb1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            zzlW.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zzb(zzb zzb1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeString(s);
            zzlW.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zzc(zzb zzb1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeString(s);
            zzlW.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zzd(zzb zzb1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeString(s);
            zzlW.transact(40, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zzdp(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcel.writeString(s);
            zzlW.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zze(zzb zzb1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (zzb1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzb1 = zzb1.asBinder();
_L1:
            parcel.writeStrongBinder(zzb1);
            parcel.writeString(s);
            zzlW.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzb1 = null;
              goto _L1
            zzb1;
            parcel1.recycle();
            parcel.recycle();
            throw zzb1;
        }

        public void zzvt()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            zzlW.transact(6, parcel, parcel1, 0);
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

        public boolean zzvu()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            zzlW.transact(42, parcel, parcel1, 0);
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

        public String zzvv()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            zzlW.transact(43, parcel, parcel1, 0);
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

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract String getAccountName()
        throws RemoteException;

    public abstract String getAuthCode()
        throws RemoteException;

    public abstract ICancelToken zza(zzb zzb1, int i, int j, int k, String s)
        throws RemoteException;

    public abstract void zza(SafeParcelResponse safeparcelresponse)
        throws RemoteException;

    public abstract void zza(zzb zzb1)
        throws RemoteException;

    public abstract void zza(zzb zzb1, int i, String s, Uri uri, String s1, String s2)
        throws RemoteException;

    public abstract void zza(zzb zzb1, Uri uri, Bundle bundle)
        throws RemoteException;

    public abstract void zza(zzb zzb1, SafeParcelResponse safeparcelresponse)
        throws RemoteException;

    public abstract void zza(zzb zzb1, String s)
        throws RemoteException;

    public abstract void zza(zzb zzb1, String s, String s1)
        throws RemoteException;

    public abstract void zza(zzb zzb1, List list)
        throws RemoteException;

    public abstract void zza(String s, FavaDiagnosticsEntity favadiagnosticsentity, FavaDiagnosticsEntity favadiagnosticsentity1)
        throws RemoteException;

    public abstract void zzb(zzb zzb1)
        throws RemoteException;

    public abstract void zzb(zzb zzb1, String s)
        throws RemoteException;

    public abstract void zzc(zzb zzb1, String s)
        throws RemoteException;

    public abstract void zzd(zzb zzb1, String s)
        throws RemoteException;

    public abstract void zzdp(String s)
        throws RemoteException;

    public abstract void zze(zzb zzb1, String s)
        throws RemoteException;

    public abstract void zzvt()
        throws RemoteException;

    public abstract boolean zzvu()
        throws RemoteException;

    public abstract String zzvv()
        throws RemoteException;
}
