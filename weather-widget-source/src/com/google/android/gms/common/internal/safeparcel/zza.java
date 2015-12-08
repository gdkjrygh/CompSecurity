// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class com.google.android.gms.common.internal.safeparcel.zza
{
    public static class zza extends RuntimeException
    {

        public zza(String s, Parcel parcel)
        {
            super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        }
    }


    public static String[] zzA(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            String as[] = parcel.createStringArray();
            parcel.setDataPosition(i + j);
            return as;
        }
    }

    public static ArrayList zzB(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        int l = parcel.readInt();
        for (i = 0; i < l; i++)
        {
            arraylist.add(Integer.valueOf(parcel.readInt()));
        }

        parcel.setDataPosition(k + j);
        return arraylist;
    }

    public static ArrayList zzC(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(i + j);
            return arraylist;
        }
    }

    public static Parcel zzD(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            Parcel parcel1 = Parcel.obtain();
            parcel1.appendFrom(parcel, j, i);
            parcel.setDataPosition(i + j);
            return parcel1;
        }
    }

    public static Parcel[] zzE(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        int l = parcel.readInt();
        Parcel aparcel[] = new Parcel[l];
        i = 0;
        while (i < l) 
        {
            int i1 = parcel.readInt();
            if (i1 != 0)
            {
                int j1 = parcel.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel, j1, i1);
                aparcel[i] = parcel1;
                parcel.setDataPosition(i1 + j1);
            } else
            {
                aparcel[i] = null;
            }
            i++;
        }
        parcel.setDataPosition(k + j);
        return aparcel;
    }

    public static int zza(Parcel parcel, int i)
    {
        if ((i & 0xffff0000) != 0xffff0000)
        {
            return i >> 16 & 0xffff;
        } else
        {
            return parcel.readInt();
        }
    }

    public static Parcelable zza(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    private static void zza(Parcel parcel, int i, int j)
    {
        i = zza(parcel, i);
        if (i != j)
        {
            throw new zza((new StringBuilder()).append("Expected size ").append(j).append(" got ").append(i).append(" (0x").append(Integer.toHexString(i)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    private static void zza(Parcel parcel, int i, int j, int k)
    {
        if (j != k)
        {
            throw new zza((new StringBuilder()).append("Expected size ").append(k).append(" got ").append(j).append(" (0x").append(Integer.toHexString(j)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static void zza(Parcel parcel, int i, List list, ClassLoader classloader)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return;
        } else
        {
            parcel.readList(list, classloader);
            parcel.setDataPosition(i + j);
            return;
        }
    }

    public static int zzai(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static int zzaj(Parcel parcel)
    {
        int j = zzai(parcel);
        int k = zza(parcel, j);
        int i = parcel.dataPosition();
        if (zzbH(j) != 20293)
        {
            throw new zza((new StringBuilder()).append("Expected object header. Got 0x").append(Integer.toHexString(j)).toString(), parcel);
        }
        j = i + k;
        if (j < i || j > parcel.dataSize())
        {
            throw new zza((new StringBuilder()).append("Size read is invalid start=").append(i).append(" end=").append(j).toString(), parcel);
        } else
        {
            return j;
        }
    }

    public static void zzb(Parcel parcel, int i)
    {
        parcel.setDataPosition(zza(parcel, i) + parcel.dataPosition());
    }

    public static Object[] zzb(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    public static int zzbH(int i)
    {
        return 0xffff & i;
    }

    public static ArrayList zzc(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = parcel.createTypedArrayList(creator);
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    public static boolean zzc(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean zzd(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        if (j == 0)
        {
            return null;
        }
        zza(parcel, i, j, 4);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public static byte zze(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return (byte)parcel.readInt();
    }

    public static short zzf(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return (short)parcel.readInt();
    }

    public static int zzg(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer zzh(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        if (j == 0)
        {
            return null;
        } else
        {
            zza(parcel, i, j, 4);
            return Integer.valueOf(parcel.readInt());
        }
    }

    public static long zzi(Parcel parcel, int i)
    {
        zza(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long zzj(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        if (j == 0)
        {
            return null;
        } else
        {
            zza(parcel, i, j, 8);
            return Long.valueOf(parcel.readLong());
        }
    }

    public static BigInteger zzk(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(i + j);
            return new BigInteger(abyte0);
        }
    }

    public static float zzl(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double zzm(Parcel parcel, int i)
    {
        zza(parcel, i, 8);
        return parcel.readDouble();
    }

    public static BigDecimal zzn(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            int k = parcel.readInt();
            parcel.setDataPosition(i + j);
            return new BigDecimal(new BigInteger(abyte0), k);
        }
    }

    public static String zzo(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            String s = parcel.readString();
            parcel.setDataPosition(i + j);
            return s;
        }
    }

    public static IBinder zzp(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(i + j);
            return ibinder;
        }
    }

    public static Bundle zzq(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(i + j);
            return bundle;
        }
    }

    public static byte[] zzr(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(i + j);
            return abyte0;
        }
    }

    public static byte[][] zzs(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return (byte[][])null;
        }
        int l = parcel.readInt();
        byte abyte0[][] = new byte[l][];
        for (i = 0; i < l; i++)
        {
            abyte0[i] = parcel.createByteArray();
        }

        parcel.setDataPosition(k + j);
        return abyte0;
    }

    public static boolean[] zzt(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            boolean aflag[] = parcel.createBooleanArray();
            parcel.setDataPosition(i + j);
            return aflag;
        }
    }

    public static int[] zzu(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            int ai[] = parcel.createIntArray();
            parcel.setDataPosition(i + j);
            return ai;
        }
    }

    public static long[] zzv(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            long al[] = parcel.createLongArray();
            parcel.setDataPosition(i + j);
            return al;
        }
    }

    public static BigInteger[] zzw(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        int l = parcel.readInt();
        BigInteger abiginteger[] = new BigInteger[l];
        for (i = 0; i < l; i++)
        {
            abiginteger[i] = new BigInteger(parcel.createByteArray());
        }

        parcel.setDataPosition(k + j);
        return abiginteger;
    }

    public static float[] zzx(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            float af[] = parcel.createFloatArray();
            parcel.setDataPosition(i + j);
            return af;
        }
    }

    public static double[] zzy(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            double ad[] = parcel.createDoubleArray();
            parcel.setDataPosition(i + j);
            return ad;
        }
    }

    public static BigDecimal[] zzz(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        int l = parcel.readInt();
        BigDecimal abigdecimal[] = new BigDecimal[l];
        for (i = 0; i < l; i++)
        {
            byte abyte0[] = parcel.createByteArray();
            int i1 = parcel.readInt();
            abigdecimal[i] = new BigDecimal(new BigInteger(abyte0), i1);
        }

        parcel.setDataPosition(k + j);
        return abigdecimal;
    }
}
