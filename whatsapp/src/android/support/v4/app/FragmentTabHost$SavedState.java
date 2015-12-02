// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

class <init> extends android.view.avedState
{

    public static final android.os..SavedState._cls1 CREATOR;
    private static final String z[];
    String curTab;

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(Integer.toHexString(System.identityHashCode(this))).append(z[1]).append(curTab).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.Parcel(parcel, i);
        parcel.writeString(curTab);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "K\001%#\023h\0350\020\037o;+7\n# %2\033i 0%\nh\b";
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
                obj = "-\02016*l\021y";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                class _cls1
                    implements android.os.Parcelable.Creator
                {

                    public FragmentTabHost.SavedState createFromParcel(Parcel parcel)
                    {
                        return new FragmentTabHost.SavedState(parcel, null);
                    }

                    public Object createFromParcel(Parcel parcel)
                    {
                        return createFromParcel(parcel);
                    }

                    public FragmentTabHost.SavedState[] newArray(int l)
                    {
                        return new FragmentTabHost.SavedState[l];
                    }

                    public Object[] newArray(int l)
                    {
                        return newArray(l);
                    }

            _cls1()
            {
            }
                }

                CREATOR = new _cls1();
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
        byte byte0 = 126;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 13;
          goto _L9
_L5:
        byte0 = 115;
          goto _L9
_L6:
        byte0 = 68;
          goto _L9
        byte0 = 68;
          goto _L9
    }

    private _cls1(Parcel parcel)
    {
        super(parcel);
        curTab = parcel.readString();
    }

    curTab(Parcel parcel, curTab curtab)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
