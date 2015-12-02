// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel, FragmentActivity

class mRemote
    implements INotificationSideChannel
{

    private static final String z[];
    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public void cancel(String s, int i, String s1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(z[0]);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
        mRemote.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void cancelAll(String s)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(z[1]);
        parcel.writeString(s);
        mRemote.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void notify(String s, int i, String s1, Notification notification)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(z[2]);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        parcel.writeInt(1);
        notification.writeToParcel(parcel, 0);
        if (FragmentActivity.a == 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        parcel.writeInt(0);
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "!0RAz):\030@`0.YAan(\002\035t0.\030z[/*_U|#?BZz.\r_Wp\0036W]{%2".toCharArray();
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
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 148
    //                   0 169
    //                   1 175
    //                   2 181
    //                   3 187;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_187;
_L3:
        byte byte0 = 21;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 94;
          goto _L9
_L6:
        byte0 = 54;
          goto _L9
        byte0 = 51;
          goto _L9
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
