// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.zzc;
import com.google.android.gms.drive.events.zzf;
import com.google.android.gms.drive.events.zzi;
import com.google.android.gms.drive.events.zzj;
import com.google.android.gms.drive.events.zzl;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse, zzx

public class zzac extends zzam.zza
{
    private static class zza extends Handler
    {

        private final Context mContext;

        private static void zza(zzl zzl1, QueryResultEventParcelable queryresulteventparcelable)
        {
            com.google.android.gms.common.data.DataHolder dataholder = queryresulteventparcelable.zzpx();
            if (dataholder != null)
            {
                zzl1.zza(new zzj(new MetadataBuffer(dataholder)) {

                    final MetadataBuffer zzafF;

            
            {
                zzafF = metadatabuffer;
                super();
            }
                });
            }
            if (queryresulteventparcelable.zzpy())
            {
                zzl1.zzck(queryresulteventparcelable.zzpz());
            }
        }

        public void handleMessage(Message message)
        {
            Object obj;
            switch (message.what)
            {
            default:
                zzx.zze(mContext, "EventCallback", "Don't know how to handle this event");
                return;

            case 1: // '\001'
                obj = (Pair)message.obj;
                break;
            }
            message = (zzf)((Pair) (obj)).first;
            obj = (DriveEvent)((Pair) (obj)).second;
            switch (((DriveEvent) (obj)).getType())
            {
            default:
                com.google.android.gms.drive.internal.zzx.zzu("EventCallback", (new StringBuilder()).append("Unexpected event: ").append(obj).toString());
                return;

            case 1: // '\001'
                ((ChangeListener)message).onChange((ChangeEvent)obj);
                return;

            case 2: // '\002'
                ((CompletionListener)message).onCompletion((CompletionEvent)obj);
                return;

            case 3: // '\003'
                zza((zzl)message, (QueryResultEventParcelable)obj);
                return;

            case 4: // '\004'
                ((zzc)message).zza((ChangesAvailableEvent)obj);
                return;

            case 5: // '\005'
            case 6: // '\006'
                ((zzi)message).zza((ProgressEvent)obj);
                break;
            }
        }

        public void zza(zzf zzf1, DriveEvent driveevent)
        {
            sendMessage(obtainMessage(1, new Pair(zzf1, driveevent)));
        }

        private zza(Looper looper, Context context)
        {
            super(looper);
            mContext = context;
        }

    }


    private final int zzaca;
    private final zzf zzafC;
    private final zza zzafD;
    private final List zzafE = new ArrayList();

    public zzac(Looper looper, Context context, int i, zzf zzf)
    {
        zzaca = i;
        zzafC = zzf;
        zzafD = new zza(looper, context);
    }

    public void zzc(OnEventResponse oneventresponse)
        throws RemoteException
    {
        oneventresponse = oneventresponse.zzpO();
        boolean flag;
        if (zzaca == oneventresponse.getType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        zzu.zzU(zzafE.contains(Integer.valueOf(oneventresponse.getType())));
        zzafD.zza(zzafC, oneventresponse);
    }

    public void zzcA(int i)
    {
        zzafE.add(Integer.valueOf(i));
    }

    public boolean zzcB(int i)
    {
        return zzafE.contains(Integer.valueOf(i));
    }
}
