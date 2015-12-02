// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.undobar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Animation;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.util.undobar:
//            b, UndoBarController

public class a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR;
    private static final String z[];
    Animation a;
    int b;
    Animation c;
    int d;
    long e;
    int f;

    public a(int i, int j)
    {
        e = 5000L;
        b = i;
        f = j;
    }

    public a(int i, int j, long l)
    {
        this(i, j);
        e = l;
    }

    public a(Parcel parcel)
    {
        e = 5000L;
        b = parcel.readInt();
        f = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            obj = (a)obj;
            if (d != ((a) (obj)).d || e != ((a) (obj)).e || b != ((a) (obj)).b || f != ((a) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        boolean flag = false;
        boolean flag1 = UndoBarController.i;
        String s = (new StringBuilder()).append(z[2]).append(b).append(z[3]).append(f).append(z[4]).append(d).append(z[0]).append(e).append(z[5]).append(a).append(z[1]).append(c).append('}').toString();
        if (DialogToastActivity.g != 0)
        {
            if (!flag1)
            {
                flag = true;
            }
            UndoBarController.i = flag;
        }
        return s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(b);
        parcel.writeInt(f);
        parcel.writeInt(d);
        parcel.writeLong(e);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "C\177V1C\016+[+_R";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "C\177]1E.1[)P\0336]*\f";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ":1V+s\016-a0H\003:I-R\0001`!BR";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "C\177F-E\003:`!BR";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "C\177P#c\n,\017";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "C\177[*p\0016_%E\0060\\y";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                CREATOR = new b();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 224
    //                   0 247
    //                   1 254
    //                   2 261
    //                   3 268;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_268;
_L3:
        byte byte1 = 49;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 111;
          goto _L9
_L5:
        byte1 = 95;
          goto _L9
_L6:
        byte1 = 50;
          goto _L9
        byte1 = 68;
          goto _L9
    }
}
