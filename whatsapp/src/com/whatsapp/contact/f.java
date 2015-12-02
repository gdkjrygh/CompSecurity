// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.protocol.cb;

// Referenced classes of package com.whatsapp.contact:
//            o

public class f
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR;
    private static final String z;
    private final cb a;

    public f(cb cb1)
    {
        if (cb1 == null)
        {
            throw new NullPointerException(z);
        } else
        {
            a = cb1;
            return;
        }
    }

    public cb a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.c);
        parcel.writeString(a.a);
        parcel.writeInt(a.b);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "RS7()RO+k\021TY-k\022N^y)\031\001D,'\020".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            CREATOR = new o();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 80
    //                   0 98
    //                   1 104
    //                   2 110
    //                   3 116;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_116;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 124;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 33;
          goto _L8
_L3:
        byte0 = 42;
          goto _L8
_L4:
        byte0 = 89;
          goto _L8
        byte0 = 75;
          goto _L8
    }
}
