// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

// Referenced classes of package com.whatsapp.gallerypicker:
//            al, a, ao

public class aq
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR;
    private static final String z;
    public int a;
    public String b;
    public a c;
    public boolean d;
    public int e;
    public Uri f;

    public aq()
    {
    }

    private aq(Parcel parcel)
    {
        c = com.whatsapp.gallerypicker.a.values()[parcel.readInt()];
        a = parcel.readInt();
        e = parcel.readInt();
        b = parcel.readString();
        f = (Uri)parcel.readParcelable(null);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    aq(Parcel parcel, ao ao)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format(Locale.US, z, new Object[] {
            c, Integer.valueOf(a), Integer.valueOf(e), b, Boolean.valueOf(d), f
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(c.ordinal());
        parcel.writeInt(a);
        parcel.writeInt(e);
        parcel.writeString(b);
        parcel.writeParcelable(f, i);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "e\re@Q`\twSdM\022eJO@\017g\032\021_LmIW\021E`\013GC\022p\032\021HLfRWG\005p\032\021_LaJDX\0319\002V\000\023mIS@\0059\002GQ".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            CREATOR = new al();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 80
    //                   0 98
    //                   1 104
    //                   2 110
    //                   3 115;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_115;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 52;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 44;
          goto _L8
_L3:
        byte0 = 96;
          goto _L8
_L4:
        byte0 = 4;
          goto _L8
        byte0 = 39;
          goto _L8
    }
}
