// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.internal.request.GameRequestClusterCreator;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesCallbacks, IGamesClient

public interface IGamesService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGamesService
    {

        public static IGamesService zzbM(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
            if (iinterface != null && (iinterface instanceof IGamesService))
            {
                return (IGamesService)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj3 = null;
            Object obj4 = null;
            Object obj = null;
            boolean flag1 = false;
            boolean flag76 = false;
            boolean flag77 = false;
            boolean flag70 = false;
            boolean flag73 = false;
            boolean flag78 = false;
            int k = 0;
            boolean flag79 = false;
            boolean flag80 = false;
            boolean flag81 = false;
            boolean flag82 = false;
            boolean flag74 = false;
            boolean flag75 = false;
            boolean flag72 = false;
            boolean flag83 = false;
            boolean flag84 = false;
            boolean flag85 = false;
            boolean flag86 = false;
            boolean flag87 = false;
            boolean flag88 = false;
            boolean flag89 = false;
            boolean flag90 = false;
            boolean flag91 = false;
            boolean flag92 = false;
            boolean flag93 = false;
            boolean flag = false;
            boolean flag94 = false;
            boolean flag95 = false;
            boolean flag96 = false;
            boolean flag97 = false;
            boolean flag98 = false;
            boolean flag99 = false;
            boolean flag100 = false;
            boolean flag101 = false;
            boolean flag102 = false;
            boolean flag103 = false;
            boolean flag104 = false;
            boolean flag54 = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.internal.IGamesService");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzE(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsK();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzlM();
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

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(((IBinder) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzsR();
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsv();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5064: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzcQ(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5065: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzy(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsw();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsT();
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

            case 5014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag54 = true;
                }
                zza(((IGamesCallbacks) (obj)), i, flag1, flag54);
                parcel1.writeNoException();
                return true;

            case 5016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                j = parcel.readInt();
                k = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zza(((IGamesCallbacks) (obj)), ((String) (obj3)), i, j, k, flag1);
                parcel1.writeNoException();
                return true;

            case 5020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                j = parcel.readInt();
                k = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zzb(((IGamesCallbacks) (obj)), ((String) (obj3)), i, j, k, flag1);
                parcel1.writeNoException();
                return true;

            case 5021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj3 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                zza(((IGamesCallbacks) (obj3)), ((Bundle) (obj)), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                obj4 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(((IGamesCallbacks) (obj)), ((String) (obj3)), ((IBinder) (obj4)), parcel);
                parcel1.writeNoException();
                return true;

            case 5024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                obj4 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzb(((IGamesCallbacks) (obj)), ((String) (obj3)), ((IBinder) (obj4)), parcel);
                parcel1.writeNoException();
                return true;

            case 5025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                obj4 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(((IGamesCallbacks) (obj)), ((String) (obj3)), i, ((IBinder) (obj4)), parcel);
                parcel1.writeNoException();
                return true;

            case 5026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzd(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zze(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzr(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzq(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5058: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5059: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzF(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj3 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj4 = parcel.readStrongBinder();
                i = parcel.readInt();
                String as2[] = parcel.createStringArray();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                }
                zza(((IGamesCallbacks) (obj3)), ((IBinder) (obj4)), i, as2, ((Bundle) (obj)), flag1, parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readStrongBinder();
                obj4 = parcel.readString();
                boolean flag2;
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                zza(igamescallbacks, ((IBinder) (obj3)), ((String) (obj4)), flag2, parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5034: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzb(parcel.createByteArray(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5035: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzcR(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzfD(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5037: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzd(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5038: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5039: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks1 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                obj4 = parcel.readString();
                i = parcel.readInt();
                j = parcel.readInt();
                k = parcel.readInt();
                boolean flag3 = flag76;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                zza(igamescallbacks1, ((String) (obj3)), ((String) (obj4)), i, j, k, flag3);
                parcel1.writeNoException();
                return true;

            case 5040: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks2 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                obj4 = parcel.readString();
                i = parcel.readInt();
                j = parcel.readInt();
                k = parcel.readInt();
                boolean flag4 = flag77;
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                }
                zzb(igamescallbacks2, ((String) (obj3)), ((String) (obj4)), i, j, k, flag4);
                parcel1.writeNoException();
                return true;

            case 5041: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5042: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zze(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5043: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzf(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5044: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks3 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                j = parcel.readInt();
                boolean flag5;
                boolean flag55;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag55 = true;
                } else
                {
                    flag55 = false;
                }
                zza(igamescallbacks3, i, j, flag5, flag55);
                parcel1.writeNoException();
                return true;

            case 5045: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks4 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                boolean flag6;
                boolean flag56;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag56 = true;
                } else
                {
                    flag56 = false;
                }
                zza(igamescallbacks4, ((String) (obj3)), i, flag6, flag56);
                parcel1.writeNoException();
                return true;

            case 5046: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks5 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                boolean flag7;
                boolean flag57;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                flag57 = flag70;
                if (parcel.readInt() != 0)
                {
                    flag57 = true;
                }
                zzb(igamescallbacks5, i, flag7, flag57);
                parcel1.writeNoException();
                return true;

            case 5047: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzf(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5048: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks6 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                boolean flag8;
                boolean flag58;
                if (parcel.readInt() != 0)
                {
                    flag8 = true;
                } else
                {
                    flag8 = false;
                }
                flag58 = flag73;
                if (parcel.readInt() != 0)
                {
                    flag58 = true;
                }
                zzc(igamescallbacks6, i, flag8, flag58);
                parcel1.writeNoException();
                return true;

            case 5049: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzg(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5050: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzcS(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5051: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5052: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzg(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5053: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzh(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
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

            case 5060: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzcT(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5054: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks7 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                boolean flag9 = flag78;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                zza(igamescallbacks7, ((String) (obj3)), flag9);
                parcel1.writeNoException();
                return true;

            case 5061: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzi(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5055: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzt(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5067: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag10 = zzsU();
                parcel1.writeNoException();
                i = k;
                if (flag10)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 5068: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag11 = flag79;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                }
                zzY(flag11);
                parcel1.writeNoException();
                return true;

            case 5056: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzh(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5057: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzj(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5062: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzi(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5063: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks8 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag12 = flag80;
                if (parcel.readInt() != 0)
                {
                    flag12 = true;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(igamescallbacks8, flag12, parcel);
                parcel1.writeNoException();
                return true;

            case 5066: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzcU(parcel.readString());
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

            case 5501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks9 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                boolean flag13;
                boolean flag59;
                if (parcel.readInt() != 0)
                {
                    flag13 = true;
                } else
                {
                    flag13 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag59 = true;
                } else
                {
                    flag59 = false;
                }
                zzb(igamescallbacks9, ((String) (obj3)), i, flag13, flag59);
                parcel1.writeNoException();
                return true;

            case 5502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsV();
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

            case 6001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks10 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag14 = flag81;
                if (parcel.readInt() != 0)
                {
                    flag14 = true;
                }
                zza(igamescallbacks10, flag14);
                parcel1.writeNoException();
                return true;

            case 6002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks11 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                obj4 = parcel.readString();
                boolean flag15 = flag82;
                if (parcel.readInt() != 0)
                {
                    flag15 = true;
                }
                zza(igamescallbacks11, ((String) (obj3)), ((String) (obj4)), flag15);
                parcel1.writeNoException();
                return true;

            case 6003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks12 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                boolean flag16;
                boolean flag60;
                if (parcel.readInt() != 0)
                {
                    flag16 = true;
                } else
                {
                    flag16 = false;
                }
                flag60 = flag74;
                if (parcel.readInt() != 0)
                {
                    flag60 = true;
                }
                zzd(igamescallbacks12, i, flag16, flag60);
                parcel1.writeNoException();
                return true;

            case 6004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks13 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                boolean flag17;
                boolean flag61;
                if (parcel.readInt() != 0)
                {
                    flag17 = true;
                } else
                {
                    flag17 = false;
                }
                flag61 = flag75;
                if (parcel.readInt() != 0)
                {
                    flag61 = true;
                }
                zze(igamescallbacks13, i, flag17, flag61);
                parcel1.writeNoException();
                return true;

            case 6501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks14 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                boolean flag18;
                boolean flag62;
                boolean flag71;
                if (parcel.readInt() != 0)
                {
                    flag18 = true;
                } else
                {
                    flag18 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag62 = true;
                } else
                {
                    flag62 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag71 = true;
                } else
                {
                    flag71 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag72 = true;
                }
                zza(igamescallbacks14, ((String) (obj3)), i, flag18, flag62, flag71, flag72);
                parcel1.writeNoException();
                return true;

            case 6502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks15 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                boolean flag19 = flag83;
                if (parcel.readInt() != 0)
                {
                    flag19 = true;
                }
                zzb(igamescallbacks15, ((String) (obj3)), flag19);
                parcel1.writeNoException();
                return true;

            case 6503: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks16 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag20 = flag84;
                if (parcel.readInt() != 0)
                {
                    flag20 = true;
                }
                zzb(igamescallbacks16, flag20);
                parcel1.writeNoException();
                return true;

            case 6504: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks17 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                boolean flag21 = flag85;
                if (parcel.readInt() != 0)
                {
                    flag21 = true;
                }
                zzc(igamescallbacks17, ((String) (obj3)), flag21);
                parcel1.writeNoException();
                return true;

            case 6505: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks18 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                boolean flag22 = flag86;
                if (parcel.readInt() != 0)
                {
                    flag22 = true;
                }
                zzd(igamescallbacks18, ((String) (obj3)), flag22);
                parcel1.writeNoException();
                return true;

            case 6506: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks19 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                obj4 = parcel.readString();
                boolean flag23 = flag87;
                if (parcel.readInt() != 0)
                {
                    flag23 = true;
                }
                zzb(igamescallbacks19, ((String) (obj3)), ((String) (obj4)), flag23);
                parcel1.writeNoException();
                return true;

            case 6507: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = zzj(parcel);
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

            case 7001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzk(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks20 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                obj4 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zzb(igamescallbacks20, ((String) (obj3)), i, ((IBinder) (obj4)), parcel);
                parcel1.writeNoException();
                return true;

            case 8001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzcV(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 8004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks21 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                j = parcel.readInt();
                obj3 = parcel.createStringArray();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(igamescallbacks21, i, j, ((String []) (obj3)), parcel);
                parcel1.writeNoException();
                return true;

            case 8005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzl(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzm(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readString(), (ParticipantResult[])parcel.createTypedArray(ParticipantResult.CREATOR));
                parcel1.writeNoException();
                return true;

            case 8008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), (ParticipantResult[])parcel.createTypedArray(ParticipantResult.CREATOR));
                parcel1.writeNoException();
                return true;

            case 8009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzn(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzo(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 8013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzG(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 8014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzp(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzsL();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 8025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzz(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzd(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zze(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 8026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzd(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzsW();
                parcel1.writeNoException();
                return true;

            case 8023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks22 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                boolean flag24 = flag88;
                if (parcel.readInt() != 0)
                {
                    flag24 = true;
                }
                zza(igamescallbacks22, ((String) (obj3)), i, flag24);
                parcel1.writeNoException();
                return true;

            case 8027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks23 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag25 = flag89;
                if (parcel.readInt() != 0)
                {
                    flag25 = true;
                }
                zzc(igamescallbacks23, flag25);
                parcel1.writeNoException();
                return true;

            case 9001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks24 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                boolean flag26;
                boolean flag63;
                if (parcel.readInt() != 0)
                {
                    flag26 = true;
                } else
                {
                    flag26 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag63 = true;
                } else
                {
                    flag63 = false;
                }
                zzc(igamescallbacks24, ((String) (obj3)), i, flag26, flag63);
                parcel1.writeNoException();
                return true;

            case 9002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzq(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 9003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsz();
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

            case 9004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzcW(parcel.readString());
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

            case 9005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsA();
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

            case 9006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsB();
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

            case 9007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsC();
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

            case 9008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = parcel.readInt();
                j = parcel.readInt();
                boolean flag27;
                if (parcel.readInt() != 0)
                {
                    flag27 = true;
                } else
                {
                    flag27 = false;
                }
                parcel = zzb(i, j, flag27);
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

            case 9009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = parcel.readInt();
                j = parcel.readInt();
                boolean flag28;
                if (parcel.readInt() != 0)
                {
                    flag28 = true;
                } else
                {
                    flag28 = false;
                }
                parcel = zzc(i, j, flag28);
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

            case 9010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsH();
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

            case 9011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                RoomEntity roomentity;
                if (parcel.readInt() != 0)
                {
                    roomentity = (RoomEntity)RoomEntity.CREATOR.createFromParcel(parcel);
                } else
                {
                    roomentity = null;
                }
                parcel = zza(roomentity, parcel.readInt());
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

            case 9012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsI();
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

            case 9013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsX();
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

            case 9031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj3 = (ParticipantEntity[])parcel.createTypedArray(ParticipantEntity.CREATOR);
                obj4 = parcel.readString();
                String s19 = parcel.readString();
                Uri uri;
                if (parcel.readInt() != 0)
                {
                    uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    uri = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = zza(((ParticipantEntity []) (obj3)), ((String) (obj4)), s19, uri, parcel);
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

            case 9019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzsJ();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 9020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks25 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                i = parcel.readInt();
                boolean flag29;
                boolean flag64;
                if (parcel.readInt() != 0)
                {
                    flag29 = true;
                } else
                {
                    flag29 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag64 = true;
                } else
                {
                    flag64 = false;
                }
                zzd(igamescallbacks25, ((String) (obj3)), i, flag29, flag64);
                parcel1.writeNoException();
                return true;

            case 9028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks26 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                obj3 = parcel.readString();
                obj4 = parcel.readString();
                i = parcel.readInt();
                boolean flag30;
                boolean flag65;
                if (parcel.readInt() != 0)
                {
                    flag30 = true;
                } else
                {
                    flag30 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag65 = true;
                } else
                {
                    flag65 = false;
                }
                zza(igamescallbacks26, ((String) (obj3)), ((String) (obj4)), i, flag30, flag65);
                parcel1.writeNoException();
                return true;

            case 9030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzcX(parcel.readString());
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

            case 10001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzH(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 10004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzd(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 10005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zza(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readString());
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

            case 10013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzsN();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 10023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzsO();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 10015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzsM();
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

            case 10022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                Object obj1 = obj3;
                if (parcel.readInt() != 0)
                {
                    obj1 = GameRequestCluster.CREATOR.zzdH(parcel);
                }
                parcel = zza(((GameRequestCluster) (obj1)), parcel.readString());
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

            case 10014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzu(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks27 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s2 = parcel.readString();
                i = parcel.readInt();
                boolean flag31 = flag90;
                if (parcel.readInt() != 0)
                {
                    flag31 = true;
                }
                zzb(igamescallbacks27, s2, i, flag31);
                parcel1.writeNoException();
                return true;

            case 10021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                Object obj2 = obj4;
                if (parcel.readInt() != 0)
                {
                    obj2 = ZInvitationCluster.CREATOR.zzdF(parcel);
                }
                parcel = zza(((ZInvitationCluster) (obj2)), parcel.readString(), parcel.readString());
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

            case 10018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readInt(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 10019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 10020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 11001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzj(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 11002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzsY();
                parcel1.writeNoException();
                return true;

            case 12001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String s = parcel.readString();
                boolean flag32;
                boolean flag66;
                if (parcel.readInt() != 0)
                {
                    flag32 = true;
                } else
                {
                    flag32 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag66 = true;
                } else
                {
                    flag66 = false;
                }
                parcel = zza(s, flag32, flag66, parcel.readInt());
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

            case 12002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks28 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag33 = flag91;
                if (parcel.readInt() != 0)
                {
                    flag33 = true;
                }
                zzd(igamescallbacks28, flag33);
                parcel1.writeNoException();
                return true;

            case 12003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks29 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s3 = parcel.readString();
                String s13 = parcel.readString();
                boolean flag34 = flag92;
                if (parcel.readInt() != 0)
                {
                    flag34 = true;
                }
                zzc(igamescallbacks29, s3, s13, flag34);
                parcel1.writeNoException();
                return true;

            case 12006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks30 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s4 = parcel.readString();
                boolean flag35 = flag93;
                if (parcel.readInt() != 0)
                {
                    flag35 = true;
                }
                zze(igamescallbacks30, s4, flag35);
                parcel1.writeNoException();
                return true;

            case 12007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks46 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s14 = parcel.readString();
                SnapshotMetadataChangeEntity snapshotmetadatachangeentity;
                if (parcel.readInt() != 0)
                {
                    snapshotmetadatachangeentity = SnapshotMetadataChangeEntity.CREATOR.zzdT(parcel);
                } else
                {
                    snapshotmetadatachangeentity = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(igamescallbacks46, s14, snapshotmetadatachangeentity, parcel);
                parcel1.writeNoException();
                return true;

            case 12019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(parcel);
                parcel1.writeNoException();
                return true;

            case 12020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzr(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks47 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s15 = parcel.readString();
                String s20 = parcel.readString();
                SnapshotMetadataChangeEntity snapshotmetadatachangeentity1;
                if (parcel.readInt() != 0)
                {
                    snapshotmetadatachangeentity1 = SnapshotMetadataChangeEntity.CREATOR.zzdT(parcel);
                } else
                {
                    snapshotmetadatachangeentity1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(igamescallbacks47, s15, s20, snapshotmetadatachangeentity1, parcel);
                parcel1.writeNoException();
                return true;

            case 12035: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzsP();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 12036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i = zzsQ();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 12005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzs(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzc(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks31 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s5 = parcel.readString();
                i = parcel.readInt();
                boolean flag36;
                boolean flag67;
                if (parcel.readInt() != 0)
                {
                    flag36 = true;
                } else
                {
                    flag36 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag67 = true;
                } else
                {
                    flag67 = false;
                }
                zze(igamescallbacks31, s5, i, flag36, flag67);
                parcel1.writeNoException();
                return true;

            case 12022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks32 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s6 = parcel.readString();
                i = parcel.readInt();
                boolean flag37;
                boolean flag68;
                if (parcel.readInt() != 0)
                {
                    flag37 = true;
                } else
                {
                    flag37 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag68 = true;
                } else
                {
                    flag68 = false;
                }
                zzf(igamescallbacks32, s6, i, flag37, flag68);
                parcel1.writeNoException();
                return true;

            case 12025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag38 = zzsZ();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag38)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 12026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag39 = flag94;
                if (parcel.readInt() != 0)
                {
                    flag39 = true;
                }
                zzZ(flag39);
                parcel1.writeNoException();
                return true;

            case 12027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzt(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks33 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag40 = flag95;
                if (parcel.readInt() != 0)
                {
                    flag40 = true;
                }
                zze(igamescallbacks33, flag40);
                parcel1.writeNoException();
                return true;

            case 12016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks34 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag41 = flag96;
                if (parcel.readInt() != 0)
                {
                    flag41 = true;
                }
                zzf(igamescallbacks34, flag41);
                parcel1.writeNoException();
                return true;

            case 12031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks35 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag42 = flag97;
                if (parcel.readInt() != 0)
                {
                    flag42 = true;
                }
                zza(igamescallbacks35, flag42, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 12017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzp(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzu(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzf(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks36 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                int ai[] = parcel.createIntArray();
                i = parcel.readInt();
                boolean flag43 = flag98;
                if (parcel.readInt() != 0)
                {
                    flag43 = true;
                }
                zza(igamescallbacks36, ai, i, flag43);
                parcel1.writeNoException();
                return true;

            case 12029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks37 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String as[] = parcel.createStringArray();
                boolean flag44 = flag99;
                if (parcel.readInt() != 0)
                {
                    flag44 = true;
                }
                zza(igamescallbacks37, as, flag44);
                parcel1.writeNoException();
                return true;

            case 12015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks38 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s7 = parcel.readString();
                String s16 = parcel.readString();
                int ai1[] = parcel.createIntArray();
                i = parcel.readInt();
                boolean flag45;
                if (parcel.readInt() != 0)
                {
                    flag45 = true;
                } else
                {
                    flag45 = false;
                }
                zza(igamescallbacks38, s7, s16, ai1, i, flag45);
                parcel1.writeNoException();
                return true;

            case 12028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks39 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s8 = parcel.readString();
                String s17 = parcel.readString();
                String as3[] = parcel.createStringArray();
                boolean flag46;
                if (parcel.readInt() != 0)
                {
                    flag46 = true;
                } else
                {
                    flag46 = false;
                }
                zza(igamescallbacks39, s8, s17, as3, flag46);
                parcel1.writeNoException();
                return true;

            case 12011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzd(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 12013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzd(IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzI(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 12014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zze(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzb(parcel.createIntArray());
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

            case 12034: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzcO(parcel.readString());
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

            case 12018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks40 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s9 = parcel.readString();
                String s18 = parcel.readString();
                i = parcel.readInt();
                boolean flag47;
                boolean flag69;
                if (parcel.readInt() != 0)
                {
                    flag47 = true;
                } else
                {
                    flag47 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag69 = true;
                } else
                {
                    flag69 = false;
                }
                zzb(igamescallbacks40, s9, s18, i, flag47, flag69);
                parcel1.writeNoException();
                return true;

            case 13001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag48 = flag100;
                if (parcel.readInt() != 0)
                {
                    flag48 = true;
                }
                zzaa(flag48);
                parcel1.writeNoException();
                return true;

            case 13002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String s1 = parcel.readString();
                IBinder ibinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(s1, ibinder, parcel);
                parcel1.writeNoException();
                return true;

            case 13003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks41 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag49 = flag101;
                if (parcel.readInt() != 0)
                {
                    flag49 = true;
                }
                zzg(igamescallbacks41, flag49);
                parcel1.writeNoException();
                return true;

            case 13004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks42 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                boolean flag50 = flag102;
                if (parcel.readInt() != 0)
                {
                    flag50 = true;
                }
                zzh(igamescallbacks42, flag50);
                parcel1.writeNoException();
                return true;

            case 13005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (AchievementEntity)AchievementEntity.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = zza(parcel);
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

            case 13006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks43 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s10 = parcel.readString();
                boolean flag51 = flag103;
                if (parcel.readInt() != 0)
                {
                    flag51 = true;
                }
                zzf(igamescallbacks43, s10, flag51);
                parcel1.writeNoException();
                return true;

            case 14001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zzv(parcel.readString(), parcel.readInt());
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

            case 14002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks44 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                i = parcel.readInt();
                String s11 = parcel.readString();
                String as1[] = parcel.createStringArray();
                boolean flag52;
                if (parcel.readInt() != 0)
                {
                    flag52 = true;
                } else
                {
                    flag52 = false;
                }
                zza(igamescallbacks44, i, s11, as1, flag52);
                parcel1.writeNoException();
                return true;

            case 14003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                ParticipantEntity aparticipantentity[] = (ParticipantEntity[])parcel.createTypedArray(ParticipantEntity.CREATOR);
                String s21 = parcel.readString();
                String s22 = parcel.readString();
                Uri uri1;
                Uri uri2;
                if (parcel.readInt() != 0)
                {
                    uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    uri1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    uri2 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    uri2 = null;
                }
                parcel = zza(aparticipantentity, s21, s22, uri1, uri2, parcel.readString());
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

            case 15001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks45 = IGamesCallbacks.Stub.zzbK(parcel.readStrongBinder());
                String s12 = parcel.readString();
                boolean flag53 = flag104;
                if (parcel.readInt() != 0)
                {
                    flag53 = true;
                }
                zza(igamescallbacks45, s12, flag53, parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 15002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzb(parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 15501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zza(IGamesClient.Stub.zzbL(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 15502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzJ(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 15503: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = zza(parcel);
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

            case 15504: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                zzta();
                parcel1.writeNoException();
                return true;

            case 16001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = zztb();
                parcel1.writeNoException();
                break;
            }
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
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesService");
        }
    }

    private static class Stub.Proxy
        implements IGamesService
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public void zzE(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            zznF.transact(5001, parcel, parcel1, 0);
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

        public void zzF(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            zznF.transact(5059, parcel, parcel1, 0);
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

        public void zzG(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            zznF.transact(8013, parcel, parcel1, 0);
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

        public void zzH(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            zznF.transact(10002, parcel, parcel1, 0);
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

        public void zzI(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            zznF.transact(12012, parcel, parcel1, 0);
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

        public void zzJ(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            zznF.transact(15502, parcel, parcel1, 0);
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

        public void zzY(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(5068, parcel, parcel1, 0);
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

        public void zzZ(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12026, parcel, parcel1, 0);
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

        public int zza(IGamesCallbacks igamescallbacks, byte abyte0[], String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeByteArray(abyte0);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(5033, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public Intent zza(int i, byte abyte0[], int j, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            parcel.writeInt(j);
            parcel.writeString(s);
            zznF.transact(10012, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            abyte0 = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
_L2:
            abyte0 = null;
            if (true) goto _L4; else goto _L3
_L3:
            abyte0;
            parcel1.recycle();
            parcel.recycle();
            throw abyte0;
        }

        public Intent zza(PlayerEntity playerentity)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (playerentity == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            playerentity.writeToParcel(parcel, 0);
_L3:
            zznF.transact(15503, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            playerentity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return playerentity;
_L2:
            parcel.writeInt(0);
              goto _L3
            playerentity;
            parcel1.recycle();
            parcel.recycle();
            throw playerentity;
            playerentity = null;
              goto _L4
        }

        public Intent zza(AchievementEntity achievemententity)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (achievemententity == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            achievemententity.writeToParcel(parcel, 0);
_L3:
            zznF.transact(13005, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            achievemententity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return achievemententity;
_L2:
            parcel.writeInt(0);
              goto _L3
            achievemententity;
            parcel1.recycle();
            parcel.recycle();
            throw achievemententity;
            achievemententity = null;
              goto _L4
        }

        public Intent zza(ZInvitationCluster zinvitationcluster, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (zinvitationcluster == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            zinvitationcluster.writeToParcel(parcel, 0);
_L3:
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(10021, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_125;
            }
            zinvitationcluster = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return zinvitationcluster;
_L2:
            parcel.writeInt(0);
              goto _L3
            zinvitationcluster;
            parcel1.recycle();
            parcel.recycle();
            throw zinvitationcluster;
            zinvitationcluster = null;
              goto _L4
        }

        public Intent zza(GameRequestCluster gamerequestcluster, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (gamerequestcluster == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            gamerequestcluster.writeToParcel(parcel, 0);
_L3:
            parcel.writeString(s);
            zznF.transact(10022, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            gamerequestcluster = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return gamerequestcluster;
_L2:
            parcel.writeInt(0);
              goto _L3
            gamerequestcluster;
            parcel1.recycle();
            parcel.recycle();
            throw gamerequestcluster;
            gamerequestcluster = null;
              goto _L4
        }

        public Intent zza(RoomEntity roomentity, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (roomentity == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            roomentity.writeToParcel(parcel, 0);
_L3:
            parcel.writeInt(i);
            zznF.transact(9011, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            roomentity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return roomentity;
_L2:
            parcel.writeInt(0);
              goto _L3
            roomentity;
            parcel1.recycle();
            parcel.recycle();
            throw roomentity;
            roomentity = null;
              goto _L4
        }

        public Intent zza(String s, boolean flag, boolean flag1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            int j;
            if (flag)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (flag1)
            {
                j = ((flag2) ? 1 : 0);
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeInt(i);
            zznF.transact(12001, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Intent zza(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeTypedArray(aparticipantentity, 0);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L5:
            if (uri1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri1.writeToParcel(parcel, 0);
_L6:
            zznF.transact(9031, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_162;
            }
            aparticipantentity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L7:
            parcel1.recycle();
            parcel.recycle();
            return aparticipantentity;
_L2:
            parcel.writeInt(0);
              goto _L5
            aparticipantentity;
            parcel1.recycle();
            parcel.recycle();
            throw aparticipantentity;
_L4:
            parcel.writeInt(0);
              goto _L6
            aparticipantentity = null;
              goto _L7
        }

        public Intent zza(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeTypedArray(aparticipantentity, 0);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L5:
            if (uri1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s2);
            zznF.transact(14003, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_169;
            }
            aparticipantentity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L7:
            parcel1.recycle();
            parcel.recycle();
            return aparticipantentity;
_L2:
            parcel.writeInt(0);
              goto _L5
            aparticipantentity;
            parcel1.recycle();
            parcel.recycle();
            throw aparticipantentity;
_L4:
            parcel.writeInt(0);
              goto _L6
            aparticipantentity = null;
              goto _L7
        }

        public void zza(IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeStrongBinder(ibinder);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ibinder;
            parcel1.recycle();
            parcel.recycle();
            throw ibinder;
        }

        public void zza(Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L1:
            zznF.transact(12019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            contents;
            parcel1.recycle();
            parcel.recycle();
            throw contents;
        }

        public void zza(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            zznF.transact(10016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int i, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            zznF.transact(10009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int i, int j, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            parcel.writeInt(j);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(5044, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int i, int j, String as[], Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeStringArray(as);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            zznF.transact(8004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void zza(IGamesCallbacks igamescallbacks, int i, String s, String as[], boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeStringArray(as);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(14002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(5015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int i, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            parcel.writeIntArray(ai);
            zznF.transact(10018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            zznF.transact(5058, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(8018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, Bundle bundle, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i);
            parcel.writeInt(j);
            zznF.transact(5021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void zza(IGamesCallbacks igamescallbacks, IBinder ibinder, int i, String as[], Bundle bundle, boolean flag, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L6:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStrongBinder(ibinder);
            parcel.writeInt(i);
            parcel.writeStringArray(as);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
              goto _L5
_L7:
            parcel.writeInt(i);
            parcel.writeLong(l);
            zznF.transact(5030, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L6
_L4:
            parcel.writeInt(0);
              goto _L5
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
_L9:
            i = 0;
              goto _L7
_L5:
            if (!flag) goto _L9; else goto _L8
_L8:
            i = ((flag1) ? 1 : 0);
              goto _L7
        }

        public void zza(IGamesCallbacks igamescallbacks, IBinder ibinder, String s, boolean flag, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            parcel.writeLong(l);
            zznF.transact(5031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(10011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(5019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            zznF.transact(5025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(8023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(5045, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag4;
            flag4 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag3)
            {
                i = ((flag4) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(6501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int i, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeIntArray(ai);
            zznF.transact(10019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeLong(l);
            zznF.transact(5016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, long l, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeLong(l);
            parcel.writeString(s1);
            zznF.transact(7002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            zznF.transact(5023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (snapshotmetadatachangeentity == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            snapshotmetadatachangeentity.writeToParcel(parcel, 0);
_L6:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L7:
            zznF.transact(12007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(5038, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            zznF.transact(8001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            zznF.transact(10010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(5039, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(9028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (snapshotmetadatachangeentity == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            snapshotmetadatachangeentity.writeToParcel(parcel, 0);
_L6:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_145;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L7:
            zznF.transact(12033, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(6002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, int ai[], int i, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeIntArray(ai);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            zznF.transact(10008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String s1, String as[], boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(5054, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, boolean flag, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            parcel.writeInt(i);
            zznF.transact(15001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            parcel.writeString(s1);
            parcel.writeTypedArray(aparticipantresult, 0);
            zznF.transact(8007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, byte abyte0[], ParticipantResult aparticipantresult[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            parcel.writeTypedArray(aparticipantresult, 0);
            zznF.transact(8008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeIntArray(ai);
            zznF.transact(8017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String s, String as[], int i, byte abyte0[], int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeStringArray(as);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            parcel.writeInt(j);
            zznF.transact(10005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(6001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, boolean flag, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            zznF.transact(5063, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void zza(IGamesCallbacks igamescallbacks, boolean flag, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            parcel.writeStringArray(as);
            zznF.transact(12031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeIntArray(ai);
            zznF.transact(8003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, int ai[], int i, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeIntArray(ai);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            zznF.transact(10006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesCallbacks igamescallbacks, String as[], boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zza(IGamesClient igamesclient, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamesclient == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamesclient = igamesclient.asBinder();
_L1:
            parcel.writeStrongBinder(igamesclient);
            parcel.writeLong(l);
            zznF.transact(15501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamesclient = null;
              goto _L1
            igamesclient;
            parcel1.recycle();
            parcel.recycle();
            throw igamesclient;
        }

        public void zza(String s, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznF.transact(13002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzaa(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(13001, parcel, parcel1, 0);
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

        public int zzb(byte abyte0[], String s, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeByteArray(abyte0);
            parcel.writeString(s);
            parcel.writeStringArray(as);
            zznF.transact(5034, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            abyte0;
            parcel1.recycle();
            parcel.recycle();
            throw abyte0;
        }

        public Intent zzb(int i, int j, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i);
            parcel.writeInt(j);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(9008, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent zzb(int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeIntArray(ai);
            zznF.transact(12030, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            ai = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ai;
_L2:
            ai = null;
            if (true) goto _L4; else goto _L3
_L3:
            ai;
            parcel1.recycle();
            parcel.recycle();
            throw ai;
        }

        public void zzb(long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(8019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzb(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(5046, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            zznF.transact(8012, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(8020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(12023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(5020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            zznF.transact(7003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(10017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(5501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            zznF.transact(5024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(5041, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(5040, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(12018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(6506, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(6502, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(6503, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(IGamesCallbacks igamescallbacks, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            zznF.transact(10007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzb(String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeStringArray(as);
            zznF.transact(15002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            as;
            parcel1.recycle();
            parcel.recycle();
            throw as;
        }

        public Intent zzc(int i, int j, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i);
            parcel.writeInt(j);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(9009, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzc(long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(8021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzc(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(5048, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            zznF.transact(10001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(10003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5032, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(12024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(9001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(8011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(6504, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(8027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(IGamesCallbacks igamescallbacks, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            zznF.transact(10020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzc(String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            zznF.transact(5051, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Intent zzcO(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(12034, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public String zzcQ(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(5064, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public String zzcR(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(5035, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzcS(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(5050, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int zzcT(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(5060, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Uri zzcU(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(5066, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Uri)Uri.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzcV(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(8002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Intent zzcW(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(9004, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public ParcelFileDescriptor zzcX(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            zznF.transact(9030, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzd(long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(10004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzd(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(6003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            zznF.transact(12011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(12013, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5037, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(9020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(8015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(6505, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzd(String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            zznF.transact(8026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zze(long l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l);
            parcel.writeString(s);
            zznF.transact(12014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zze(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zze(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(6004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zze(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5042, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zze(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(12021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zze(IGamesCallbacks igamescallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(8016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zze(IGamesCallbacks igamescallbacks, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zze(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12032, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzf(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5047, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzf(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5043, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzf(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            zznF.transact(12022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzf(IGamesCallbacks igamescallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(12009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzf(IGamesCallbacks igamescallbacks, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(13006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzf(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(12016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzfD(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i);
            zznF.transact(5036, parcel, parcel1, 0);
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

        public void zzg(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5049, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzg(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5052, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzg(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(13003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public RoomEntity zzh(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5053, parcel, parcel1, 0);
            parcel1.readException();
            igamescallbacks = obj;
            if (parcel1.readInt() != 0)
            {
                igamescallbacks = (RoomEntity)RoomEntity.CREATOR.createFromParcel(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return igamescallbacks;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzh(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5056, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzh(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zznF.transact(13004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzi(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(5062, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzi(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5061, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public ParcelFileDescriptor zzj(Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L3:
            zznF.transact(6507, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            uri = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return uri;
_L2:
            parcel.writeInt(0);
              goto _L3
            uri;
            parcel1.recycle();
            parcel.recycle();
            throw uri;
            uri = null;
              goto _L4
        }

        public void zzj(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            zznF.transact(11001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzj(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(5057, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzk(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(7001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzl(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(8005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public Bundle zzlM()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzm(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(8006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzn(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(8009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzo(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(8010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzp(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(8014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzp(String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(12017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzq(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(9002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzq(String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(5029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzr(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(12020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzr(String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(5028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzs(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(12005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public Intent zzsA()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9005, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent zzsB()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9006, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent zzsC()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9007, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent zzsH()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9010, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent zzsI()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9012, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int zzsJ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9019, parcel, parcel1, 0);
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

        public String zzsK()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5003, parcel, parcel1, 0);
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

        public int zzsL()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(8024, parcel, parcel1, 0);
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

        public Intent zzsM()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(10015, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int zzsN()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(10013, parcel, parcel1, 0);
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

        public int zzsO()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(10023, parcel, parcel1, 0);
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

        public int zzsP()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(12035, parcel, parcel1, 0);
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

        public int zzsQ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(12036, parcel, parcel1, 0);
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

        public void zzsR()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5006, parcel, parcel1, 0);
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

        public DataHolder zzsT()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5013, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            DataHolder dataholder = DataHolder.CREATOR.zzS(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return dataholder;
_L2:
            dataholder = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean zzsU()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5067, parcel, parcel1, 0);
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

        public DataHolder zzsV()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5502, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            DataHolder dataholder = DataHolder.CREATOR.zzS(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return dataholder;
_L2:
            dataholder = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzsW()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(8022, parcel, parcel1, 0);
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

        public Intent zzsX()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9013, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzsY()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(11002, parcel, parcel1, 0);
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

        public boolean zzsZ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(12025, parcel, parcel1, 0);
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

        public String zzsv()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5007, parcel, parcel1, 0);
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

        public String zzsw()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(5012, parcel, parcel1, 0);
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

        public Intent zzsz()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(9003, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzt(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(12027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzt(String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(5055, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzta()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(15504, parcel, parcel1, 0);
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

        public Intent zztb()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            zznF.transact(16001, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzu(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s);
            zznF.transact(12008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void zzu(String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(10014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Intent zzv(String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i);
            zznF.transact(14001, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzy(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(5065, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzz(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeString(s1);
            zznF.transact(8025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        Stub.Proxy(IBinder ibinder)
        {
            zznF = ibinder;
        }
    }


    public abstract void zzE(long l)
        throws RemoteException;

    public abstract void zzF(long l)
        throws RemoteException;

    public abstract void zzG(long l)
        throws RemoteException;

    public abstract void zzH(long l)
        throws RemoteException;

    public abstract void zzI(long l)
        throws RemoteException;

    public abstract void zzJ(long l)
        throws RemoteException;

    public abstract void zzY(boolean flag)
        throws RemoteException;

    public abstract void zzZ(boolean flag)
        throws RemoteException;

    public abstract int zza(IGamesCallbacks igamescallbacks, byte abyte0[], String s, String s1)
        throws RemoteException;

    public abstract Intent zza(int i, byte abyte0[], int j, String s)
        throws RemoteException;

    public abstract Intent zza(PlayerEntity playerentity)
        throws RemoteException;

    public abstract Intent zza(AchievementEntity achievemententity)
        throws RemoteException;

    public abstract Intent zza(ZInvitationCluster zinvitationcluster, String s, String s1)
        throws RemoteException;

    public abstract Intent zza(GameRequestCluster gamerequestcluster, String s)
        throws RemoteException;

    public abstract Intent zza(RoomEntity roomentity, int i)
        throws RemoteException;

    public abstract Intent zza(String s, boolean flag, boolean flag1, int i)
        throws RemoteException;

    public abstract Intent zza(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1)
        throws RemoteException;

    public abstract Intent zza(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1, String s2)
        throws RemoteException;

    public abstract void zza(IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void zza(Contents contents)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int i)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int i, int j, int k)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int i, int j, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int i, int j, String as[], Bundle bundle)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int i, String s, String as[], boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int i, int ai[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, Bundle bundle, int i, int j)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, IBinder ibinder, int i, String as[], Bundle bundle, boolean flag, long l)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, IBinder ibinder, String s, boolean flag, long l)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int i)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int i, int ai[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, long l)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, long l, String s1)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, int ai[], int i, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, String as[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String s1, String as[], boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, boolean flag, int i)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, byte abyte0[], ParticipantResult aparticipantresult[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, int ai[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String s, String as[], int i, byte abyte0[], int j)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, boolean flag, Bundle bundle)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, boolean flag, String as[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int ai[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, int ai[], int i, boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException;

    public abstract void zza(IGamesCallbacks igamescallbacks, String as[], boolean flag)
        throws RemoteException;

    public abstract void zza(IGamesClient igamesclient, long l)
        throws RemoteException;

    public abstract void zza(String s, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void zzaa(boolean flag)
        throws RemoteException;

    public abstract int zzb(byte abyte0[], String s, String as[])
        throws RemoteException;

    public abstract Intent zzb(int i, int j, boolean flag)
        throws RemoteException;

    public abstract Intent zzb(int ai[])
        throws RemoteException;

    public abstract void zzb(long l, String s)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, int i)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void zzb(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException;

    public abstract void zzb(String as[])
        throws RemoteException;

    public abstract Intent zzc(int i, int j, boolean flag)
        throws RemoteException;

    public abstract void zzc(long l, String s)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, String s, int i)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void zzc(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException;

    public abstract void zzc(String s, String s1, int i)
        throws RemoteException;

    public abstract Intent zzcO(String s)
        throws RemoteException;

    public abstract String zzcQ(String s)
        throws RemoteException;

    public abstract String zzcR(String s)
        throws RemoteException;

    public abstract void zzcS(String s)
        throws RemoteException;

    public abstract int zzcT(String s)
        throws RemoteException;

    public abstract Uri zzcU(String s)
        throws RemoteException;

    public abstract void zzcV(String s)
        throws RemoteException;

    public abstract Intent zzcW(String s)
        throws RemoteException;

    public abstract ParcelFileDescriptor zzcX(String s)
        throws RemoteException;

    public abstract void zzd(long l, String s)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException;

    public abstract void zzd(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void zzd(String s, String s1, int i)
        throws RemoteException;

    public abstract void zze(long l, String s)
        throws RemoteException;

    public abstract void zze(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zze(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zze(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zze(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zze(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException;

    public abstract void zze(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException;

    public abstract void zze(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void zzf(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzf(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzf(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void zzf(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException;

    public abstract void zzf(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException;

    public abstract void zzf(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void zzfD(int i)
        throws RemoteException;

    public abstract void zzg(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzg(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzg(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract RoomEntity zzh(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzh(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzh(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void zzi(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzi(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract ParcelFileDescriptor zzj(Uri uri)
        throws RemoteException;

    public abstract void zzj(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void zzj(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzk(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzl(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract Bundle zzlM()
        throws RemoteException;

    public abstract void zzm(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzn(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzo(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzp(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzp(String s, int i)
        throws RemoteException;

    public abstract void zzq(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzq(String s, int i)
        throws RemoteException;

    public abstract void zzr(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzr(String s, int i)
        throws RemoteException;

    public abstract void zzs(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract Intent zzsA()
        throws RemoteException;

    public abstract Intent zzsB()
        throws RemoteException;

    public abstract Intent zzsC()
        throws RemoteException;

    public abstract Intent zzsH()
        throws RemoteException;

    public abstract Intent zzsI()
        throws RemoteException;

    public abstract int zzsJ()
        throws RemoteException;

    public abstract String zzsK()
        throws RemoteException;

    public abstract int zzsL()
        throws RemoteException;

    public abstract Intent zzsM()
        throws RemoteException;

    public abstract int zzsN()
        throws RemoteException;

    public abstract int zzsO()
        throws RemoteException;

    public abstract int zzsP()
        throws RemoteException;

    public abstract int zzsQ()
        throws RemoteException;

    public abstract void zzsR()
        throws RemoteException;

    public abstract DataHolder zzsT()
        throws RemoteException;

    public abstract boolean zzsU()
        throws RemoteException;

    public abstract DataHolder zzsV()
        throws RemoteException;

    public abstract void zzsW()
        throws RemoteException;

    public abstract Intent zzsX()
        throws RemoteException;

    public abstract void zzsY()
        throws RemoteException;

    public abstract boolean zzsZ()
        throws RemoteException;

    public abstract String zzsv()
        throws RemoteException;

    public abstract String zzsw()
        throws RemoteException;

    public abstract Intent zzsz()
        throws RemoteException;

    public abstract void zzt(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzt(String s, int i)
        throws RemoteException;

    public abstract void zzta()
        throws RemoteException;

    public abstract Intent zztb()
        throws RemoteException;

    public abstract void zzu(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException;

    public abstract void zzu(String s, int i)
        throws RemoteException;

    public abstract Intent zzv(String s, int i)
        throws RemoteException;

    public abstract void zzy(String s, String s1)
        throws RemoteException;

    public abstract void zzz(String s, String s1)
        throws RemoteException;
}
