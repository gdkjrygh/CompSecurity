// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.iid:
//            zzb

public class MessengerCompat
    implements Parcelable
{
    private final class zza extends zzb.zza
    {

        Handler handler;
        final MessengerCompat zzaBe;

        public void send(Message message)
            throws RemoteException
        {
            message.arg2 = Binder.getCallingUid();
            handler.dispatchMessage(message);
        }

        zza(Handler handler1)
        {
            zzaBe = MessengerCompat.this;
            super();
            handler = handler1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzen(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzgA(i);
        }

        public MessengerCompat zzen(Parcel parcel)
        {
            parcel = parcel.readStrongBinder();
            if (parcel != null)
            {
                return new MessengerCompat(parcel);
            } else
            {
                return null;
            }
        }

        public MessengerCompat[] zzgA(int i)
        {
            return new MessengerCompat[i];
        }

    };
    Messenger zzaBc;
    zzb zzaBd;

    public MessengerCompat(Handler handler)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            zzaBc = new Messenger(handler);
            return;
        } else
        {
            zzaBd = new zza(handler);
            return;
        }
    }

    public MessengerCompat(IBinder ibinder)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            zzaBc = new Messenger(ibinder);
            return;
        } else
        {
            zzaBd = zzb.zza.zzbV(ibinder);
            return;
        }
    }

    public static int zzc(Message message)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return zzd(message);
        } else
        {
            return message.arg2;
        }
    }

    private static int zzd(Message message)
    {
        return message.sendingUid;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = getBinder().equals(((MessengerCompat)obj).getBinder());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public IBinder getBinder()
    {
        if (zzaBc != null)
        {
            return zzaBc.getBinder();
        } else
        {
            return zzaBd.asBinder();
        }
    }

    public int hashCode()
    {
        return getBinder().hashCode();
    }

    public void send(Message message)
        throws RemoteException
    {
        if (zzaBc != null)
        {
            zzaBc.send(message);
            return;
        } else
        {
            zzaBd.send(message);
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (zzaBc != null)
        {
            parcel.writeStrongBinder(zzaBc.getBinder());
            return;
        } else
        {
            parcel.writeStrongBinder(zzaBd.asBinder());
            return;
        }
    }

}
