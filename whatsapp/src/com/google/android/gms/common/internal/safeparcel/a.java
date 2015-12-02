// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            b

public class a
{

    public static String[] A(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            String as[] = parcel.createStringArray();
            parcel.setDataPosition(j + k);
            return as;
        }
    }

    public static ArrayList C(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(j + k);
            return arraylist;
        }
    }

    public static int F(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static int G(Parcel parcel)
    {
        int j;
        int k;
        boolean flag;
        flag = b.a;
        k = F(parcel);
        int i1 = a(parcel, k);
        j = parcel.dataPosition();
        try
        {
            if (aH(k) != 20293)
            {
                throw new a((new StringBuilder()).append("Expected object header. Got 0x").append(Integer.toHexString(k)).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        k = j + i1;
        if (k < j)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (k <= parcel.dataSize())
        {
            break MISSING_BLOCK_LABEL_122;
        }
        throw new a((new StringBuilder()).append("Size read is invalid start=").append(j).append(" end=").append(k).toString(), parcel);
        parcel;
        throw parcel;
        if (flag)
        {
            jx.a++;
        }
        return k;
    }

    public static int a(Parcel parcel, int j)
    {
        if ((j & 0xffff0000) != 0xffff0000)
        {
            return j >> 16 & 0xffff;
        } else
        {
            return parcel.readInt();
        }
    }

    public static Parcelable a(Parcel parcel, int j, android.os.Parcelable.Creator creator)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            creator = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(j + k);
            return creator;
        }
    }

    private static void a(Parcel parcel, int j, int k)
    {
        j = a(parcel, j);
        if (j != k)
        {
            try
            {
                throw new a((new StringBuilder()).append("Expected size ").append(k).append(" got ").append(j).append(" (0x").append(Integer.toHexString(j)).append(")").toString(), parcel);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw parcel;
            }
        } else
        {
            return;
        }
    }

    private static void a(Parcel parcel, int j, int k, int i1)
    {
        if (k != i1)
        {
            try
            {
                throw new a((new StringBuilder()).append("Expected size ").append(i1).append(" got ").append(k).append(" (0x").append(Integer.toHexString(k)).append(")").toString(), parcel);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw parcel;
            }
        } else
        {
            return;
        }
    }

    public static int aH(int j)
    {
        return 0xffff & j;
    }

    public static void b(Parcel parcel, int j)
    {
        parcel.setDataPosition(a(parcel, j) + parcel.dataPosition());
    }

    public static Object[] b(Parcel parcel, int j, android.os.Parcelable.Creator creator)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
            parcel.setDataPosition(j + k);
            return creator;
        }
    }

    public static boolean c(Parcel parcel, int j)
    {
        try
        {
            a(parcel, j, 4);
            j = parcel.readInt();
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return j != 0;
    }

    public static byte e(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return (byte)parcel.readInt();
    }

    public static int g(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return parcel.readInt();
    }

    public static Integer h(Parcel parcel, int j)
    {
        int k = a(parcel, j);
        if (k == 0)
        {
            return null;
        } else
        {
            a(parcel, j, k, 4);
            return Integer.valueOf(parcel.readInt());
        }
    }

    public static long i(Parcel parcel, int j)
    {
        a(parcel, j, 8);
        return parcel.readLong();
    }

    public static float l(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return parcel.readFloat();
    }

    public static double m(Parcel parcel, int j)
    {
        a(parcel, j, 8);
        return parcel.readDouble();
    }

    public static String o(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            String s = parcel.readString();
            parcel.setDataPosition(j + k);
            return s;
        }
    }

    public static IBinder p(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(j + k);
            return ibinder;
        }
    }

    public static Bundle q(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(j + k);
            return bundle;
        }
    }

    private class a extends RuntimeException
    {

        public a(String s, Parcel parcel)
        {
            boolean flag = b.a;
            super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
            if (jx.a != 0)
            {
                if (flag)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                b.a = flag;
            }
        }
    }

}
