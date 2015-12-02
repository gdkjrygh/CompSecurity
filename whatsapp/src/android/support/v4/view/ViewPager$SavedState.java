// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;

public class loader extends android.view.SavedState
{

    public static final android.os.r.SavedState._cls1 CREATOR;
    private static final String z[];
    Parcelable adapterState;
    ClassLoader loader;
    int position;

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(Integer.toHexString(System.identityHashCode(this))).append(z[1]).append(position).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.riteToParcel(parcel, i);
        parcel.writeInt(position);
        parcel.writeParcelable(adapterState, i);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "^+X\006i}7M1e\177<KOWy/\\\005Wl8M\004\177";
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
                obj = "8)V\022ml0V\0179";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                class _cls1
                    implements ParcelableCompatCreatorCallbacks
                {

                    public ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
                    {
                        return new ViewPager.SavedState(parcel, classloader);
                    }

                    public Object createFromParcel(Parcel parcel, ClassLoader classloader)
                    {
                        return createFromParcel(parcel, classloader);
                    }

                    public ViewPager.SavedState[] newArray(int l)
                    {
                        return new ViewPager.SavedState[l];
                    }

                    public Object[] newArray(int l)
                    {
                        return newArray(l);
                    }

            _cls1()
            {
            }
                }

                CREATOR = ParcelableCompat.newCreator(new _cls1());
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 148
    //                   0 168
    //                   1 174
    //                   2 180
    //                   3 186;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_186;
_L3:
        byte byte0 = 4;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 24;
          goto _L9
_L5:
        byte0 = 89;
          goto _L9
_L6:
        byte0 = 57;
          goto _L9
        byte0 = 97;
          goto _L9
    }

    _cls1(Parcel parcel, ClassLoader classloader)
    {
        super(parcel);
        ClassLoader classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = getClass().getClassLoader();
        }
        position = parcel.readInt();
        adapterState = parcel.readParcelable(classloader1);
        loader = classloader1;
    }

    public loader(Parcelable parcelable)
    {
        super(parcelable);
    }
}
