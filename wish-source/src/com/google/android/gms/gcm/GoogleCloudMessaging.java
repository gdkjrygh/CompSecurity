// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleCloudMessaging
{

    private static String zzaoN = null;
    public static int zzaoO = 0x4c4b40;
    public static int zzaoP = 0x632ea0;
    public static int zzaoQ = 0x6acfc0;
    static GoogleCloudMessaging zzaoR;
    private static final AtomicInteger zzaoU = new AtomicInteger(1);
    private PendingIntent zzaoS;
    private Map zzaoT;
    private final BlockingQueue zzaoV = new LinkedBlockingQueue();
    final Messenger zzaoW = new Messenger(new Handler(Looper.getMainLooper()) {

        final GoogleCloudMessaging zzaoX;

        public void handleMessage(Message message)
        {
            if (message == null || !(message.obj instanceof Intent))
            {
                Log.w("GCM", "Dropping invalid message");
            }
            message = (Intent)message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
            {
                GoogleCloudMessaging.zza(zzaoX).add(message);
            } else
            if (!GoogleCloudMessaging.zza(zzaoX, message))
            {
                message.setPackage(GoogleCloudMessaging.zzb(zzaoX).getPackageName());
                GoogleCloudMessaging.zzb(zzaoX).sendBroadcast(message);
                return;
            }
        }

            
            {
                zzaoX = GoogleCloudMessaging.this;
                super(looper);
            }
    });
    private Context zzmH;

    public GoogleCloudMessaging()
    {
        zzaoT = Collections.synchronizedMap(new HashMap());
    }

    public static GoogleCloudMessaging getInstance(Context context)
    {
        com/google/android/gms/gcm/GoogleCloudMessaging;
        JVM INSTR monitorenter ;
        if (zzaoR == null)
        {
            zzaoR = new GoogleCloudMessaging();
            zzaoR.zzmH = context.getApplicationContext();
        }
        context = zzaoR;
        com/google/android/gms/gcm/GoogleCloudMessaging;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private String zza(Intent intent, String s)
        throws IOException
    {
        if (intent == null)
        {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        s = intent.getStringExtra(s);
        if (s != null)
        {
            return s;
        }
        intent = intent.getStringExtra("error");
        if (intent != null)
        {
            throw new IOException(intent);
        } else
        {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static BlockingQueue zza(GoogleCloudMessaging googlecloudmessaging)
    {
        return googlecloudmessaging.zzaoV;
    }

    static boolean zza(GoogleCloudMessaging googlecloudmessaging, Intent intent)
    {
        return googlecloudmessaging.zzj(intent);
    }

    public static String zzae(Context context)
    {
        if (zzaoN == null)
        {
            zzaoN = "com.google.android.gms";
        }
        return zzaoN;
    }

    public static int zzaf(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getPackageInfo(zzae(context), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return i;
    }

    static Context zzb(GoogleCloudMessaging googlecloudmessaging)
    {
        return googlecloudmessaging.zzmH;
    }

    private boolean zzj(Intent intent)
    {
        String s = intent.getStringExtra("In-Reply-To");
        Object obj = s;
        if (s == null)
        {
            obj = s;
            if (intent.hasExtra("error"))
            {
                obj = intent.getStringExtra("google.message_id");
            }
        }
        if (obj != null)
        {
            obj = (Handler)zzaoT.remove(obj);
            if (obj != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return ((Handler) (obj)).sendMessage(message);
            }
        }
        return false;
    }

    private Intent zzs(Bundle bundle)
        throws IOException
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (zzaf(zzmH) < 0)
        {
            throw new IOException("Google Play Services missing");
        }
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle = new Intent("com.google.android.c2dm.intent.REGISTER");
        bundle.setPackage(zzae(zzmH));
        zzk(bundle);
        bundle.putExtra("google.message_id", zzsm());
        bundle.putExtras(bundle1);
        bundle.putExtra("google.messenger", zzaoW);
        zzmH.startService(bundle);
        try
        {
            bundle = (Intent)zzaoV.poll(30000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new IOException(bundle.getMessage());
        }
        return bundle;
    }

    private String zzsm()
    {
        return (new StringBuilder()).append("google.rpc").append(String.valueOf(zzaoU.getAndIncrement())).toString();
    }

    public transient String register(String as[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        as = zzc(as);
        Bundle bundle = new Bundle();
        bundle.putString("sender", as);
        as = zza(zzs(bundle), "registration_id");
        this;
        JVM INSTR monitorexit ;
        return as;
        as;
        throw as;
    }

    transient String zzc(String as[])
    {
        if (as == null || as.length == 0)
        {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        for (int i = 1; i < as.length; i++)
        {
            stringbuilder.append(',').append(as[i]);
        }

        return stringbuilder.toString();
    }

    void zzk(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaoS == null)
        {
            Intent intent1 = new Intent();
            intent1.setPackage("com.google.example.invalidpackage");
            zzaoS = PendingIntent.getBroadcast(zzmH, 0, intent1, 0);
        }
        intent.putExtra("app", zzaoS);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

}
