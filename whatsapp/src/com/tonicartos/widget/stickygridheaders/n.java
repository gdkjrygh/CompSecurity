// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            f, t

class n extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR;
    private static final String z[];
    boolean a;

    private n(Parcel parcel)
    {
        super(parcel);
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    n(Parcel parcel, t t)
    {
        this(parcel);
    }

    public n(Parcelable parcelable)
    {
        super(parcelable);
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(Integer.toHexString(System.identityHashCode(this))).append(z[1]).append(a).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\037[\027\"S5h\f(\\\004J\037%]>\\93Q(y\027$Ob|\0377](|\n L)T";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "lN\f$p)N\032$J?|\n(['VC";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                CREATOR = new f();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 144
    //                   0 165
    //                   1 171
    //                   2 177
    //                   3 183;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_183;
_L3:
        byte byte0 = 56;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 76;
          goto _L9
_L5:
        byte0 = 47;
          goto _L9
_L6:
        byte0 = 126;
          goto _L9
        byte0 = 65;
          goto _L9
    }
}
