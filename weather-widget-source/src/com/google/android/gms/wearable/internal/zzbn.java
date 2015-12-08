// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzax, zzaw, zzbo, zzbi, 
//            zzs

public class zzbn extends zzj
{

    private final ExecutorService zzaRv = Executors.newCachedThreadPool();
    private final zzax zzbaU = new zzax();
    private final zzax zzbaV = new zzax();
    private final zzax zzbaW = new zzax();
    private final zzax zzbaX = new zzax();
    private final zzax zzbaY = new zzax();
    private final zzax zzbaZ = new zzax();
    private final zzax zzbba = new zzax();
    private final Map zzbbb = new HashMap();

    public zzbn(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zzf zzf)
    {
        super(context, looper, 14, zzf, connectioncallbacks, onconnectionfailedlistener);
    }

    private FutureTask zza(ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        return new FutureTask(new Callable(parcelfiledescriptor, abyte0) {

            final byte zzQu[];
            final ParcelFileDescriptor zzbbc;
            final zzbn zzbbd;

            public Object call()
                throws Exception
            {
                return zzCI();
            }

            public Boolean zzCI()
            {
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(zzbbc).toString());
                }
                autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(zzbbc);
                Object obj;
                autocloseoutputstream.write(zzQu);
                autocloseoutputstream.flush();
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(zzbbc).toString());
                }
                obj = Boolean.valueOf(true);
                IOException ioexception;
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzbbc).toString());
                    }
                    autocloseoutputstream.close();
                }
                catch (IOException ioexception1)
                {
                    return ((Boolean) (obj));
                }
                return ((Boolean) (obj));
                obj;
                Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(zzbbc).toString());
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzbbc).toString());
                    }
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception) { }
                return Boolean.valueOf(false);
                obj;
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzbbc).toString());
                    }
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception) { }
                throw obj;
            }

            
            {
                zzbbd = zzbn.this;
                zzbbc = parcelfiledescriptor;
                zzQu = abyte0;
                super();
            }
        });
    }

    private FutureTask zzb(com.google.android.gms.common.api.zzc.zzb zzb1, String s, Uri uri, long l, long l1)
    {
        zzx.zzv(zzb1);
        zzx.zzv(s);
        zzx.zzv(uri);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "startOffset is negative: %s", new Object[] {
            Long.valueOf(l)
        });
        if (l1 >= -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "invalid length: %s", new Object[] {
            Long.valueOf(l1)
        });
        return new FutureTask(new Runnable(uri, zzb1, s, l, l1) {

            final Uri zzaKy;
            final long zzaZU;
            final long zzaZV;
            final zzbn zzbbd;
            final com.google.android.gms.common.api.zzc.zzb zzbbe;
            final String zzbbf;

            public void run()
            {
                Object obj;
                if (Log.isLoggable("WearableClient", 2))
                {
                    Log.v("WearableClient", "Executing sendFileToChannelTask");
                }
                if (!"file".equals(zzaKy.getScheme()))
                {
                    Log.w("WearableClient", "Channel.sendFile used with non-file URI");
                    zzbbe.zzx(new Status(10, "Channel.sendFile used with non-file URI"));
                    return;
                }
                File file = new File(zzaKy.getPath());
                try
                {
                    obj = ParcelFileDescriptor.open(file, 0x10000000);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("WearableClient", (new StringBuilder()).append("File couldn't be opened for Channel.sendFile: ").append(file).toString());
                    zzbbe.zzx(new Status(13));
                    return;
                }
                ((zzaw)zzbbd.zzoA()).zza(new zzbm.zzr(zzbbe), zzbbf, ((ParcelFileDescriptor) (obj)), zzaZU, zzaZV);
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
                }
                return;
                Object obj1;
                obj1;
                Log.w("WearableClient", "Channel.sendFile failed.", ((Throwable) (obj1)));
                zzbbe.zzx(new Status(8));
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
                }
                return;
                obj1;
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                }
                catch (IOException ioexception)
                {
                    Log.w("WearableClient", "Failed to close sourceFd", ioexception);
                }
                throw obj1;
            }

            
            {
                zzbbd = zzbn.this;
                zzaKy = uri;
                zzbbe = zzb1;
                zzbbf = s;
                zzaZU = l;
                zzaZV = l1;
                super();
            }
        }, null);
    }

    private FutureTask zzb(com.google.android.gms.common.api.zzc.zzb zzb1, String s, Uri uri, boolean flag)
    {
        zzx.zzv(zzb1);
        zzx.zzv(s);
        zzx.zzv(uri);
        return new FutureTask(new Runnable(uri, zzb1, flag, s) {

            final Uri zzaKy;
            final boolean zzaZT;
            final zzbn zzbbd;
            final com.google.android.gms.common.api.zzc.zzb zzbbe;
            final String zzbbf;

            public void run()
            {
                Object obj;
                if (Log.isLoggable("WearableClient", 2))
                {
                    Log.v("WearableClient", "Executing receiveFileFromChannelTask");
                }
                if (!"file".equals(zzaKy.getScheme()))
                {
                    Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
                    zzbbe.zzx(new Status(10, "Channel.receiveFile used with non-file URI"));
                    return;
                }
                File file = new File(zzaKy.getPath());
                int i;
                if (zzaZT)
                {
                    i = 0x2000000;
                } else
                {
                    i = 0;
                }
                try
                {
                    obj = ParcelFileDescriptor.open(file, i | 0x20000000);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("WearableClient", (new StringBuilder()).append("File couldn't be opened for Channel.receiveFile: ").append(file).toString());
                    zzbbe.zzx(new Status(13));
                    return;
                }
                ((zzaw)zzbbd.zzoA()).zza(new zzbm.zzu(zzbbe), zzbbf, ((ParcelFileDescriptor) (obj)));
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
                }
                return;
                Object obj1;
                obj1;
                Log.w("WearableClient", "Channel.receiveFile failed.", ((Throwable) (obj1)));
                zzbbe.zzx(new Status(8));
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
                }
                return;
                obj1;
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                }
                catch (IOException ioexception)
                {
                    Log.w("WearableClient", "Failed to close targetFd", ioexception);
                }
                throw obj1;
            }

            
            {
                zzbbd = zzbn.this;
                zzaKy = uri;
                zzbbe = zzb1;
                zzaZT = flag;
                zzbbf = s;
                super();
            }
        }, null);
    }

    private zzax zzfw(String s)
    {
        zzax zzax2 = (zzax)zzbbb.get(s);
        zzax zzax1 = zzax2;
        if (zzax2 == null)
        {
            zzax1 = new zzax();
            zzbbb.put(s, zzax1);
        }
        return zzax1;
    }

    public void disconnect()
    {
        zzbaU.zzb(this);
        zzbaV.zzb(this);
        zzbaX.zzb(this);
        zzbaY.zzb(this);
        zzbaZ.zzb(this);
        zzbba.zzb(this);
        Map map = zzbbb;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzbbb.values().iterator(); iterator.hasNext(); ((zzax)iterator.next()).zzb(this)) { }
        break MISSING_BLOCK_LABEL_100;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.disconnect();
        return;
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzec(ibinder);
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: statusCode ").append(i).toString());
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        zzbaU.zzeb(ibinder);
        zzbaV.zzeb(ibinder);
        zzbaX.zzeb(ibinder);
        zzbaY.zzeb(ibinder);
        zzbaZ.zzeb(ibinder);
        zzbba.zzeb(ibinder);
        Map map = zzbbb;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzbbb.values().iterator(); iterator.hasNext(); ((zzax)iterator.next()).zzeb(ibinder)) { }
        break MISSING_BLOCK_LABEL_144;
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
_L2:
        super.zza(i, ibinder, bundle, j);
        return;
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, Uri uri)
        throws RemoteException
    {
        ((zzaw)zzoA()).zza(new zzbm.zzk(zzb1), uri);
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, Uri uri, int i)
        throws RemoteException
    {
        ((zzaw)zzoA()).zza(new zzbm.zzl(zzb1), uri, i);
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, Asset asset)
        throws RemoteException
    {
        ((zzaw)zzoA()).zza(new zzbm.zzm(zzb1), asset);
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        throws RemoteException
    {
        synchronized (zzbbb)
        {
            zzfw(s).zza(this, zzb1, capabilitylistener, zzbo.zza(capabilitylistener, s));
        }
        return;
        zzb1;
        map;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        throws RemoteException
    {
        if (s == null)
        {
            zzbaW.zza(this, zzb1, channellistener, zzbo.zzb(channellistener));
            return;
        } else
        {
            channellistener = new zzbi(s, channellistener);
            zzbaW.zza(this, zzb1, channellistener, zzbo.zza(channellistener, s));
            return;
        }
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener)
        throws RemoteException
    {
        zzbaX.zza(this, zzb1, datalistener);
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        zzbaX.zza(this, zzb1, datalistener, zzbo.zza(datalistener, aintentfilter));
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, DataItemAsset dataitemasset)
        throws RemoteException
    {
        zza(zzb1, Asset.createFromRef(dataitemasset.getId()));
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
        throws RemoteException
    {
        zzbaY.zza(this, zzb1, messagelistener);
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        zzbaY.zza(this, zzb1, messagelistener, zzbo.zza(messagelistener, aintentfilter));
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        zzbaZ.zza(this, zzb1, nodelistener, zzbo.zza(nodelistener));
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        for (Iterator iterator = putdatarequest.getAssets().entrySet().iterator(); iterator.hasNext();)
        {
            Asset asset = (Asset)((java.util.Map.Entry)iterator.next()).getValue();
            if (asset.getData() == null && asset.getDigest() == null && asset.getFd() == null && asset.getUri() == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Put for ").append(putdatarequest.getUri()).append(" contains invalid asset: ").append(asset).toString());
            }
        }

        PutDataRequest putdatarequest1 = PutDataRequest.zzo(putdatarequest.getUri());
        putdatarequest1.setData(putdatarequest.getData());
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = putdatarequest.getAssets().entrySet().iterator(); iterator1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator1.next();
            Asset asset1 = (Asset)((java.util.Map.Entry) (obj)).getValue();
            if (asset1.getData() == null)
            {
                putdatarequest1.putAsset((String)((java.util.Map.Entry) (obj)).getKey(), (Asset)((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                ParcelFileDescriptor aparcelfiledescriptor[];
                try
                {
                    aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.common.api.zzc.zzb zzb1)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Unable to create ParcelFileDescriptor for asset in request: ").append(putdatarequest).toString(), zzb1);
                }
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: replacing data with FD in asset: ").append(asset1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]).toString());
                }
                putdatarequest1.putAsset((String)((java.util.Map.Entry) (obj)).getKey(), Asset.createFromFd(aparcelfiledescriptor[0]));
                obj = zza(aparcelfiledescriptor[1], asset1.getData());
                arraylist.add(obj);
                zzaRv.submit(((Runnable) (obj)));
            }
        }

        ((zzaw)zzoA()).zza(new zzbm.zzq(zzb1, arraylist), putdatarequest1);
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, String s, Uri uri, long l, long l1)
    {
        try
        {
            s = zzb(zzb1, s, uri, l, l1);
            zzaRv.submit(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb1.zzx(new Status(8));
        }
        throw s;
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, String s, Uri uri, boolean flag)
    {
        try
        {
            s = zzb(zzb1, s, uri, flag);
            zzaRv.submit(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb1.zzx(new Status(8));
        }
        throw s;
    }

    public void zza(com.google.android.gms.common.api.zzc.zzb zzb1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        ((zzaw)zzoA()).zza(new zzbm.zzt(zzb1), s, s1, abyte0);
    }

    public void zzb(com.google.android.gms.common.api.zzc.zzb zzb1, Uri uri, int i)
        throws RemoteException
    {
        ((zzaw)zzoA()).zzb(new zzbm.zze(zzb1), uri, i);
    }

    public void zzb(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        throws RemoteException
    {
        synchronized (zzbbb)
        {
            zzax zzax1 = zzfw(s);
            zzax1.zza(this, zzb1, capabilitylistener);
            if (zzax1.isEmpty())
            {
                zzbbb.remove(s);
            }
        }
        return;
        zzb1;
        map;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    public void zzb(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        throws RemoteException
    {
        if (s == null)
        {
            zzbaW.zza(this, zzb1, channellistener);
            return;
        } else
        {
            channellistener = new zzbi(s, channellistener);
            zzbaW.zza(this, zzb1, channellistener);
            return;
        }
    }

    public void zzb(com.google.android.gms.common.api.zzc.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        zzbaZ.zza(this, zzb1, nodelistener);
    }

    public void zzd(com.google.android.gms.common.api.zzc.zzb zzb1, int i)
        throws RemoteException
    {
        ((zzaw)zzoA()).zza(new zzbm.zzf(zzb1), i);
    }

    public void zze(com.google.android.gms.common.api.zzc.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((zzaw)zzoA()).zza(new zzbm.zzp(zzb1), s, s1);
    }

    protected zzaw zzec(IBinder ibinder)
    {
        return zzaw.zza.zzea(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public void zzg(com.google.android.gms.common.api.zzc.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((zzaw)zzoA()).zza(new zzbm.zzg(zzb1), s, i);
    }

    public void zzh(com.google.android.gms.common.api.zzc.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((zzaw)zzoA()).zzb(new zzbm.zzd(zzb1), s, i);
    }

    public void zzn(com.google.android.gms.common.api.zzc.zzb zzb1)
        throws RemoteException
    {
        ((zzaw)zzoA()).zzb(new zzbm.zzl(zzb1));
    }

    public void zzo(com.google.android.gms.common.api.zzc.zzb zzb1)
        throws RemoteException
    {
        ((zzaw)zzoA()).zzc(new zzbm.zzn(zzb1));
    }

    public void zzp(com.google.android.gms.common.api.zzc.zzb zzb1)
        throws RemoteException
    {
        ((zzaw)zzoA()).zzd(new zzbm.zzj(zzb1));
    }

    public void zzr(com.google.android.gms.common.api.zzc.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzaw)zzoA()).zzd(new zzbm.zza(zzb1), s);
    }

    public void zzs(com.google.android.gms.common.api.zzc.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzaw)zzoA()).zze(new zzbm.zzs(zzb1), s);
    }

    public void zzt(com.google.android.gms.common.api.zzc.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzaw)zzoA()).zzf(new zzbm.zzc(zzb1), s);
    }

    public void zzu(com.google.android.gms.common.api.zzc.zzb zzb1, String s)
        throws RemoteException
    {
        zzs zzs1 = new zzs();
        ((zzaw)zzoA()).zza(new zzbm.zzh(zzb1, zzs1), zzs1, s);
    }

    public void zzv(com.google.android.gms.common.api.zzc.zzb zzb1, String s)
        throws RemoteException
    {
        zzs zzs1 = new zzs();
        ((zzaw)zzoA()).zzb(new zzbm.zzi(zzb1, zzs1), zzs1, s);
    }
}
