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
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzc;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.gcm:
//            zza

public class GoogleCloudMessaging
{

    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String INSTANCE_ID_SCOPE = "GCM";
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
    public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
    public static int zzavP = 0x4c4b40;
    public static int zzavQ = 0x632ea0;
    public static int zzavR = 0x6acfc0;
    static GoogleCloudMessaging zzavS;
    private static final AtomicInteger zzavV = new AtomicInteger(1);
    private PendingIntent zzavT;
    private Map zzavU;
    private final BlockingQueue zzavW = new LinkedBlockingQueue();
    final Messenger zzavX = new Messenger(new Handler(Looper.getMainLooper()) {

        final GoogleCloudMessaging zzavY;

        public void handleMessage(Message message)
        {
            if (message == null || !(message.obj instanceof Intent))
            {
                Log.w("GCM", "Dropping invalid message");
            }
            message = (Intent)message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
            {
                GoogleCloudMessaging.zza(zzavY).add(message);
            } else
            if (!GoogleCloudMessaging.zza(zzavY, message))
            {
                message.setPackage(GoogleCloudMessaging.zzb(zzavY).getPackageName());
                GoogleCloudMessaging.zzb(zzavY).sendBroadcast(message);
                return;
            }
        }

            
            {
                zzavY = GoogleCloudMessaging.this;
                super(looper);
            }
    });
    private Context zzpH;

    public GoogleCloudMessaging()
    {
        zzavU = Collections.synchronizedMap(new HashMap());
    }

    public static GoogleCloudMessaging getInstance(Context context)
    {
        com/google/android/gms/gcm/GoogleCloudMessaging;
        JVM INSTR monitorenter ;
        if (zzavS == null)
        {
            zzavS = new GoogleCloudMessaging();
            zzavS.zzpH = context.getApplicationContext();
        }
        context = zzavS;
        com/google/android/gms/gcm/GoogleCloudMessaging;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static String zza(Intent intent, String s)
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
        return googlecloudmessaging.zzavW;
    }

    private void zza(String s, String s1, long l, int i, Bundle bundle)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Object obj = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null)
        {
            ((Intent) (obj)).putExtras(bundle);
        }
        zzm(((Intent) (obj)));
        ((Intent) (obj)).setPackage(zzas(zzpH));
        ((Intent) (obj)).putExtra("google.to", s);
        ((Intent) (obj)).putExtra("google.message_id", s1);
        ((Intent) (obj)).putExtra("google.ttl", Long.toString(l));
        ((Intent) (obj)).putExtra("google.delay", Integer.toString(i));
        if (zzas(zzpH).contains(".gsf"))
        {
            obj = new Bundle();
            Iterator iterator = bundle.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                Object obj1 = bundle.get(s2);
                if (obj1 instanceof String)
                {
                    ((Bundle) (obj)).putString((new StringBuilder()).append("gcm.").append(s2).toString(), (String)obj1);
                }
            } while (true);
            ((Bundle) (obj)).putString("google.to", s);
            ((Bundle) (obj)).putString("google.message_id", s1);
            InstanceID.getInstance(zzpH).zzc("GCM", "upstream", ((Bundle) (obj)));
            return;
        } else
        {
            zzpH.sendOrderedBroadcast(((Intent) (obj)), "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
    }

    static boolean zza(GoogleCloudMessaging googlecloudmessaging, Intent intent)
    {
        return googlecloudmessaging.zzl(intent);
    }

    public static String zzas(Context context)
    {
        return com.google.android.gms.iid.zzc.zzaw(context);
    }

    public static int zzat(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getPackageInfo(zzas(context), 0).versionCode;
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
        return googlecloudmessaging.zzpH;
    }

    private boolean zzl(Intent intent)
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
            obj = (Handler)zzavU.remove(obj);
            if (obj != null)
            {
                Message message = Message.obtain();
                message.obj = intent;
                return ((Handler) (obj)).sendMessage(message);
            }
        }
        return false;
    }

    private String zztS()
    {
        return (new StringBuilder()).append("google.rpc").append(String.valueOf(zzavV.getAndIncrement())).toString();
    }

    public void close()
    {
        zzavS = null;
        zza.zzavF = null;
        zztT();
    }

    public String getMessageType(Intent intent)
    {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()))
        {
            intent = null;
        } else
        {
            String s = intent.getStringExtra("message_type");
            intent = s;
            if (s == null)
            {
                return "gcm";
            }
        }
        return intent;
    }

    public transient String register(String as[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Bundle bundle;
        as = zzc(as);
        bundle = new Bundle();
        if (!zzas(zzpH).contains(".gsf")) goto _L2; else goto _L1
_L1:
        bundle.putString("legacy.sender", as);
        as = InstanceID.getInstance(zzpH).getToken(as, "GCM", bundle);
_L4:
        this;
        JVM INSTR monitorexit ;
        return as;
_L2:
        bundle.putString("sender", as);
        as = zza(zzx(bundle), "registration_id");
        if (true) goto _L4; else goto _L3
_L3:
        as;
        throw as;
    }

    public void send(String s, String s1, long l, Bundle bundle)
        throws IOException
    {
        zza(s, s1, l, -1, bundle);
    }

    public void send(String s, String s1, Bundle bundle)
        throws IOException
    {
        send(s, s1, -1L, bundle);
    }

    public void unregister()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        InstanceID.getInstance(zzpH).deleteInstanceID();
        this;
        JVM INSTR monitorexit ;
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

    void zzm(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzavT == null)
        {
            Intent intent1 = new Intent();
            intent1.setPackage("com.google.example.invalidpackage");
            zzavT = PendingIntent.getBroadcast(zzpH, 0, intent1, 0);
        }
        intent.putExtra("app", zzavT);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    void zztT()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzavT != null)
        {
            zzavT.cancel();
            zzavT = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    Intent zzx(Bundle bundle)
        throws IOException
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        if (zzat(zzpH) < 0)
        {
            throw new IOException("Google Play Services missing");
        }
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle = new Intent("com.google.android.c2dm.intent.REGISTER");
        bundle.setPackage(zzas(zzpH));
        zzm(bundle);
        bundle.putExtra("google.message_id", zztS());
        bundle.putExtras(bundle1);
        bundle.putExtra("google.messenger", zzavX);
        zzpH.startService(bundle);
        try
        {
            bundle = (Intent)zzavW.poll(30000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new IOException(bundle.getMessage());
        }
        return bundle;
    }

}
