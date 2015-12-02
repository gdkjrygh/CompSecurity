// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel, FragmentActivity

public abstract class z extends Binder
    implements INotificationSideChannel
{

    private static final String z[];

    public static INotificationSideChannel asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface(z[0]);
        class Proxy
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
            //                           0 169
            //                           1 175
            //                           2 181
            //                           3 187;
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

            Proxy(IBinder ibinder)
            {
                mRemote = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof INotificationSideChannel))
        {
            return (INotificationSideChannel)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        i;
        JVM INSTR lookupswitch 4: default 44
    //                   1: 65
    //                   2: 129
    //                   3: 156
    //                   1598968902: 54;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return super.onTransact(i, parcel, parcel1, j);
_L5:
        parcel1.writeString(z[4]);
        return true;
_L2:
        String s;
        parcel.enforceInterface(z[3]);
        parcel1 = parcel.readString();
        i = parcel.readInt();
        s = parcel.readString();
        if (parcel.readInt() == 0) goto _L7; else goto _L6
_L6:
        parcel = (Notification)Notification.CREATOR.arcel(parcel);
        if (FragmentActivity.a == 0) goto _L8; else goto _L7
_L7:
        parcel = null;
_L8:
        notify(parcel1, i, s, parcel);
        return true;
_L3:
        parcel.enforceInterface(z[2]);
        cancel(parcel.readString(), parcel.readInt(), parcel.readString());
        return true;
_L4:
        parcel.enforceInterface(z[5]);
        cancelAll(parcel.readString());
        return true;
    }

    static 
    {
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "\r;F\013(\0051\f\n2\034%M\0133B#\026W&\034%\f0\t\003!K\037.\0174V\020(\002\006K\035\"/=C\027)\t9".toCharArray();
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
                i = 5;
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 196
    //                   0 219
    //                   1 226
    //                   2 233
    //                   3 240;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_240;
_L3:
        byte byte1 = 71;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 108;
          goto _L9
_L5:
        byte1 = 85;
          goto _L9
_L6:
        byte1 = 34;
          goto _L9
        byte1 = 121;
          goto _L9
    }

    public Proxy()
    {
        attachInterface(this, z[1]);
    }
}
