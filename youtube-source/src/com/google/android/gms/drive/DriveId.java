// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.h;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.lm;

// Referenced classes of package com.google.android.gms.drive:
//            b

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int jE;
    final String uV;
    final long uW;
    final long uX;
    private volatile String uY;

    DriveId(int i, String s, long l, long l1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            uY = null;
            jE = i;
            uV = s;
            boolean flag;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gi.b(flag);
            if (s == null)
            {
                flag = flag1;
                if (l == -1L)
                {
                    break label0;
                }
            }
            flag = true;
        }
        gi.b(flag);
        uW = l;
        uX = l1;
    }

    public DriveId(String s, long l, long l1)
    {
        this(1, s, l, l1);
    }

    public static DriveId aj(String s)
    {
        gi.a(s);
        return new DriveId(s, -1L, -1L);
    }

    static DriveId d(byte abyte0[])
    {
        h h1;
        try
        {
            h1 = h.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if ("".equals(h1.c))
        {
            abyte0 = null;
        } else
        {
            abyte0 = h1.c;
        }
        return new DriveId(h1.b, abyte0, h1.d, h1.e);
    }

    public static DriveId decodeFromString(String s)
    {
        gi.b(s.startsWith("DriveId:"), (new StringBuilder("Invalid DriveId: ")).append(s).toString());
        return d(Base64.decode(s.substring(8), 10));
    }

    final byte[] cM()
    {
        h h1 = new h();
        h1.b = jE;
        Object obj;
        if (uV == null)
        {
            obj = "";
        } else
        {
            obj = uV;
        }
        h1.c = ((String) (obj));
        h1.d = uW;
        h1.e = uX;
        obj = new byte[h1.a()];
        jt.a(h1, ((byte []) (obj)), 0, obj.length);
        return ((byte []) (obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if (uY == null)
        {
            String s = Base64.encodeToString(cM(), 10);
            uY = (new StringBuilder("DriveId:")).append(s).toString();
        }
        return uY;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DriveId)
        {
            obj = (DriveId)obj;
            if (((DriveId) (obj)).uX != uX)
            {
                Log.w("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if (((DriveId) (obj)).uW == -1L && uW == -1L)
            {
                return ((DriveId) (obj)).uV.equals(uV);
            }
            if (((DriveId) (obj)).uW == uW)
            {
                return true;
            }
        }
        return false;
    }

    public String getResourceId()
    {
        return uV;
    }

    public int hashCode()
    {
        if (uW == -1L)
        {
            return uV.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(uX)).append(String.valueOf(uW)).toString().hashCode();
        }
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel);
    }

}
