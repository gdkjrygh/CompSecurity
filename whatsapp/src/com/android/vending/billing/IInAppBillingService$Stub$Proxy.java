// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.vending.billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.android.vending.billing:
//            IInAppBillingService

class a
    implements IInAppBillingService
{

    private static final String z[];
    private IBinder a;

    public IBinder asBinder()
    {
        return a;
    }

    public int consumePurchase(int i, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken(z[1]);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(5, parcel, parcel1, 0);
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

    public Bundle getBuyIntent(int i, String s, String s1, String s2, String s3)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = a;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken(z[2]);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        s = (Bundle)Bundle.CREATOR.cel(parcel1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        DialogToastActivity.g++;
        s = null;
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Bundle getPurchases(int i, String s, String s1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        boolean flag;
        parcel.writeInterfaceToken(z[3]);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s = (Bundle)Bundle.CREATOR.cel(parcel1);
        flag = a;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        s = null;
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Bundle getSkuDetails(int i, String s, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = a;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken(z[4]);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        parcel.writeInt(0);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        s = (Bundle)Bundle.CREATOR.cel(parcel1);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = null;
        parcel1.recycle();
        parcel.recycle();
        if (DialogToastActivity.g != 0)
        {
            if (!flag1)
            {
                flag = true;
            }
            a = flag;
        }
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public int isBillingSupported(int i, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken(z[0]);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(1, parcel, parcel1, 0);
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

    static 
    {
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "FCh}~KHw<vA\002s6qAEk41GEi?vKK+\032VKmu#]L@i:qB\177`!iLO`".toCharArray();
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
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 180
    //                   0 203
    //                   1 210
    //                   2 217
    //                   3 223;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_223;
_L3:
        byte byte1 = 31;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 37;
          goto _L9
_L5:
        byte1 = 44;
          goto _L9
_L6:
        byte1 = 5;
          goto _L9
        byte1 = 83;
          goto _L9
    }

    A(IBinder ibinder)
    {
        a = ibinder;
    }
}
