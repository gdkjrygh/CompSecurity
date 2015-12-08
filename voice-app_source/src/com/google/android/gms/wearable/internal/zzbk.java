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
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
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
//            zzau, zzat, zzbl, zzbf, 
//            zzq

public class zzbk extends zzi
{

    private final ExecutorService zzaNb = Executors.newCachedThreadPool();
    private final zzau zzaUR = new zzau();
    private final zzau zzaUS = new zzau();
    private final zzau zzaUT = new zzau();
    private final zzau zzaUU = new zzau();
    private final zzau zzaUV = new zzau();
    private final zzau zzaUW = new zzau();
    private final Map zzaUX = new HashMap();

    public zzbk(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze1)
    {
        super(context, looper, 14, connectioncallbacks, onconnectionfailedlistener, zze1);
    }

    private FutureTask zza(ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        return new FutureTask(new Callable(parcelfiledescriptor, abyte0) {

            final byte zzOn[];
            final ParcelFileDescriptor zzaUY;
            final zzbk zzaUZ;

            public Object call()
                throws Exception
            {
                return zzBg();
            }

            public Boolean zzBg()
            {
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(zzaUY).toString());
                }
                autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(zzaUY);
                Object obj;
                autocloseoutputstream.write(zzOn);
                autocloseoutputstream.flush();
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(zzaUY).toString());
                }
                obj = Boolean.valueOf(true);
                IOException ioexception;
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzaUY).toString());
                    }
                    autocloseoutputstream.close();
                }
                catch (IOException ioexception1)
                {
                    return ((Boolean) (obj));
                }
                return ((Boolean) (obj));
                obj;
                Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(zzaUY).toString());
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzaUY).toString());
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
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzaUY).toString());
                    }
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception) { }
                throw obj;
            }

            
            {
                zzaUZ = zzbk.this;
                zzaUY = parcelfiledescriptor;
                zzOn = abyte0;
                super();
            }
        });
    }

    private FutureTask zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, long l, long l1)
    {
        com.google.android.gms.common.internal.zzu.zzu(zzb1);
        com.google.android.gms.common.internal.zzu.zzu(s);
        com.google.android.gms.common.internal.zzu.zzu(uri);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzu.zzb(flag, "startOffset is negative: %s", new Object[] {
            Long.valueOf(l)
        });
        if (l1 >= -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzu.zzb(flag, "invalid length: %s", new Object[] {
            Long.valueOf(l1)
        });
        return new FutureTask(new Runnable(uri, zzb1, s, l, l1) {

            final com.google.android.gms.common.api.zza.zzb zzaFp;
            final Uri zzaGx;
            final long zzaTT;
            final long zzaTU;
            final zzbk zzaUZ;
            final String zzaVa;

            public void run()
            {
                Object obj;
                if (Log.isLoggable("WearableClient", 2))
                {
                    Log.v("WearableClient", "Executing sendFileToChannelTask");
                }
                if (!"file".equals(zzaGx.getScheme()))
                {
                    Log.w("WearableClient", "Channel.sendFile used with non-file URI");
                    zzaFp.zzr(new Status(10, "Channel.sendFile used with non-file URI"));
                    return;
                }
                File file = new File(zzaGx.getPath());
                try
                {
                    obj = ParcelFileDescriptor.open(file, 0x10000000);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("WearableClient", (new StringBuilder()).append("File couldn't be opened for Channel.sendFile: ").append(file).toString());
                    zzaFp.zzr(new Status(13));
                    return;
                }
                ((zzat)zzaUZ.zznM()).zza(new zzbj.zzr(zzaFp), zzaVa, ((ParcelFileDescriptor) (obj)), zzaTT, zzaTU);
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
                zzaFp.zzr(new Status(8));
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
                zzaUZ = zzbk.this;
                zzaGx = uri;
                zzaFp = zzb1;
                zzaVa = s;
                zzaTT = l;
                zzaTU = l1;
                super();
            }
        }, null);
    }

    private FutureTask zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, boolean flag)
    {
        com.google.android.gms.common.internal.zzu.zzu(zzb1);
        com.google.android.gms.common.internal.zzu.zzu(s);
        com.google.android.gms.common.internal.zzu.zzu(uri);
        return new FutureTask(new Runnable(uri, zzb1, flag, s) {

            final com.google.android.gms.common.api.zza.zzb zzaFp;
            final Uri zzaGx;
            final boolean zzaTS;
            final zzbk zzaUZ;
            final String zzaVa;

            public void run()
            {
                Object obj;
                if (Log.isLoggable("WearableClient", 2))
                {
                    Log.v("WearableClient", "Executing receiveFileFromChannelTask");
                }
                if (!"file".equals(zzaGx.getScheme()))
                {
                    Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
                    zzaFp.zzr(new Status(10, "Channel.receiveFile used with non-file URI"));
                    return;
                }
                File file = new File(zzaGx.getPath());
                int i;
                if (zzaTS)
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
                    zzaFp.zzr(new Status(13));
                    return;
                }
                ((zzat)zzaUZ.zznM()).zza(new zzbj.zzu(zzaFp), zzaVa, ((ParcelFileDescriptor) (obj)));
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
                zzaFp.zzr(new Status(8));
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
                zzaUZ = zzbk.this;
                zzaGx = uri;
                zzaFp = zzb1;
                zzaTS = flag;
                zzaVa = s;
                super();
            }
        }, null);
    }

    private zzau zzfh(String s)
    {
        zzau zzau2 = (zzau)zzaUX.get(s);
        zzau zzau1 = zzau2;
        if (zzau2 == null)
        {
            zzau1 = new zzau();
            zzaUX.put(s, zzau1);
        }
        return zzau1;
    }

    public void disconnect()
    {
        zzaUR.zzb(this);
        zzaUT.zzb(this);
        zzaUU.zzb(this);
        zzaUV.zzb(this);
        zzaUW.zzb(this);
        Map map = zzaUX;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzaUX.values().iterator(); iterator.hasNext(); ((zzau)iterator.next()).zzb(this)) { }
        break MISSING_BLOCK_LABEL_92;
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

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzdS(ibinder);
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: statusCode ").append(i).toString());
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        zzaUR.zzdR(ibinder);
        zzaUT.zzdR(ibinder);
        zzaUU.zzdR(ibinder);
        zzaUV.zzdR(ibinder);
        zzaUW.zzdR(ibinder);
        Map map = zzaUX;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzaUX.values().iterator(); iterator.hasNext(); ((zzau)iterator.next()).zzdR(ibinder)) { }
        break MISSING_BLOCK_LABEL_136;
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

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Uri uri)
        throws RemoteException
    {
        ((zzat)zznM()).zza(new zzbj.zzk(zzb1), uri);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Uri uri, int i)
        throws RemoteException
    {
        ((zzat)zznM()).zza(new zzbj.zzl(zzb1), uri, i);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Asset asset)
        throws RemoteException
    {
        ((zzat)zznM()).zza(new zzbj.zzm(zzb1), asset);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        throws RemoteException
    {
        synchronized (zzaUX)
        {
            zzfh(s).zza(this, zzb1, capabilitylistener, zzbl.zza(capabilitylistener, s));
        }
        return;
        zzb1;
        map;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        throws RemoteException
    {
        if (s == null)
        {
            zzaUS.zza(this, zzb1, channellistener, zzbl.zzb(channellistener));
            return;
        } else
        {
            channellistener = new zzbf(s, channellistener);
            zzaUS.zza(this, zzb1, channellistener, zzbl.zza(channellistener, s));
            return;
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener)
        throws RemoteException
    {
        zzaUT.zza(this, zzb1, datalistener);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        zzaUT.zza(this, zzb1, datalistener, zzbl.zza(datalistener, aintentfilter));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, DataItemAsset dataitemasset)
        throws RemoteException
    {
        zza(zzb1, Asset.createFromRef(dataitemasset.getId()));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
        throws RemoteException
    {
        zzaUU.zza(this, zzb1, messagelistener);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        zzaUU.zza(this, zzb1, messagelistener, zzbl.zza(messagelistener, aintentfilter));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        zzaUV.zza(this, zzb1, nodelistener, zzbl.zza(nodelistener));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, PutDataRequest putdatarequest)
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

        PutDataRequest putdatarequest1 = PutDataRequest.zzn(putdatarequest.getUri());
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
                catch (com.google.android.gms.common.api.zza.zzb zzb1)
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
                zzaNb.submit(((Runnable) (obj)));
            }
        }

        ((zzat)zznM()).zza(new zzbj.zzq(zzb1, arraylist), putdatarequest1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, long l, long l1)
    {
        try
        {
            s = zzb(zzb1, s, uri, l, l1);
            zzaNb.submit(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb1.zzr(new Status(8));
        }
        throw s;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, boolean flag)
    {
        try
        {
            s = zzb(zzb1, s, uri, flag);
            zzaNb.submit(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb1.zzr(new Status(8));
        }
        throw s;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        ((zzat)zznM()).zza(new zzbj.zzt(zzb1), s, s1, abyte0);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, Uri uri, int i)
        throws RemoteException
    {
        ((zzat)zznM()).zzb(new zzbj.zze(zzb1), uri, i);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        throws RemoteException
    {
        synchronized (zzaUX)
        {
            zzau zzau1 = zzfh(s);
            zzau1.zza(this, zzb1, capabilitylistener);
            if (zzau1.isEmpty())
            {
                zzaUX.remove(s);
            }
        }
        return;
        zzb1;
        map;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        throws RemoteException
    {
        if (s == null)
        {
            zzaUS.zza(this, zzb1, channellistener);
            return;
        } else
        {
            channellistener = new zzbf(s, channellistener);
            zzaUS.zza(this, zzb1, channellistener);
            return;
        }
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        zzaUV.zza(this, zzb1, nodelistener);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((zzat)zznM()).zza(new zzbj.zzf(zzb1), i);
    }

    protected zzat zzdS(IBinder ibinder)
    {
        return zzat.zza.zzdQ(ibinder);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((zzat)zznM()).zza(new zzbj.zzp(zzb1), s, s1);
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((zzat)zznM()).zza(new zzbj.zzg(zzb1), s, i);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((zzat)zznM()).zzb(new zzbj.zzd(zzb1), s, i);
    }

    public void zzl(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzat)zznM()).zzb(new zzbj.zzl(zzb1));
    }

    public void zzm(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzat)zznM()).zzc(new zzbj.zzn(zzb1));
    }

    public void zzn(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzat)zznM()).zzd(new zzbj.zzj(zzb1));
    }

    public void zzr(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzat)zznM()).zzd(new zzbj.zza(zzb1), s);
    }

    public void zzs(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzat)zznM()).zze(new zzbj.zzs(zzb1), s);
    }

    public void zzt(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzat)zznM()).zzf(new zzbj.zzc(zzb1), s);
    }

    public void zzu(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        zzq zzq1 = new zzq();
        ((zzat)zznM()).zza(new zzbj.zzh(zzb1, zzq1), zzq1, s);
    }

    public void zzv(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        zzq zzq1 = new zzq();
        ((zzat)zznM()).zzb(new zzbj.zzi(zzb1, zzq1), zzq1, s);
    }
}
