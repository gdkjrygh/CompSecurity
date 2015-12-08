// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.iid:
//            InstanceID, MessengerCompat, InstanceIDListenerService

public class zzc
{

    static String zzaxd = null;
    static int zzaxe = 0;
    static int zzaxf = 0;
    static int zzaxg = 0;
    PendingIntent zzavT;
    Messenger zzavX;
    Map zzaxh;
    Messenger zzaxi;
    MessengerCompat zzaxj;
    long zzaxk;
    long zzaxl;
    int zzaxm;
    int zzaxn;
    long zzaxo;
    Context zzpH;

    public zzc(Context context)
    {
        zzaxh = new HashMap();
        zzpH = context;
    }

    static transient String zza(KeyPair keypair, String as[])
    {
        java.security.PrivateKey privatekey;
        try
        {
            as = TextUtils.join("\n", as).getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            Log.e("InstanceID/Rpc", "Unable to encode string", keypair);
            return null;
        }
        privatekey = keypair.getPrivate();
        if (privatekey instanceof RSAPrivateKey)
        {
            keypair = "SHA256withRSA";
        } else
        {
            keypair = "SHA256withECDSA";
        }
        try
        {
            keypair = Signature.getInstance(keypair);
            keypair.initSign(privatekey);
            keypair.update(as);
            keypair = InstanceID.zzm(keypair.sign());
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            Log.e("InstanceID/Rpc", "Unable to sign registration request", keypair);
            return null;
        }
        return keypair;
    }

    public static String zzaw(Context context)
    {
        Iterator iterator;
        if (zzaxd != null)
        {
            return zzaxd;
        }
        zzaxe = Process.myUid();
        context = context.getPackageManager();
        iterator = context.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
_L2:
        Object obj1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_189;
        }
        obj1 = (ResolveInfo)iterator.next();
        if (context.checkPermission("com.google.android.c2dm.permission.RECEIVE", ((ResolveInfo) (obj1)).serviceInfo.packageName) != 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        ApplicationInfo applicationinfo = context.getApplicationInfo(((ResolveInfo) (obj1)).serviceInfo.packageName, 0);
        Log.w("InstanceID/Rpc", (new StringBuilder()).append("Found ").append(applicationinfo.uid).toString());
        zzaxf = applicationinfo.uid;
        zzaxd = ((ResolveInfo) (obj1)).serviceInfo.packageName;
        obj1 = zzaxd;
        return ((String) (obj1));
        Log.w("InstanceID/Rpc", (new StringBuilder()).append("Possible malicious package ").append(((ResolveInfo) (obj1)).serviceInfo.packageName).append(" declares ").append("com.google.android.c2dm.intent.REGISTER").append(" without permission").toString());
        continue; /* Loop/switch isn't completed */
        Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
        Object obj;
        try
        {
            obj = context.getApplicationInfo("com.google.android.gms", 0);
            zzaxd = ((ApplicationInfo) (obj)).packageName;
            zzaxf = ((ApplicationInfo) (obj)).uid;
            obj = zzaxd;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            try
            {
                context = context.getApplicationInfo("com.google.android.gsf", 0);
                zzaxd = ((ApplicationInfo) (context)).packageName;
                zzaxf = ((ApplicationInfo) (context)).uid;
                context = zzaxd;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                return null;
            }
            return context;
        }
        return ((String) (obj));
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1;
        namenotfoundexception1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Intent zzb(Bundle bundle, KeyPair keypair)
        throws IOException
    {
        ConditionVariable conditionvariable = new ConditionVariable();
        String s = zzuk();
        synchronized (getClass())
        {
            zzaxh.put(s, conditionvariable);
        }
        zza(bundle, keypair, s);
        conditionvariable.block(30000L);
        synchronized (getClass())
        {
            keypair = ((KeyPair) (zzaxh.remove(s)));
            if (!(keypair instanceof Intent))
            {
                break MISSING_BLOCK_LABEL_94;
            }
            keypair = (Intent)keypair;
        }
        return keypair;
        bundle;
        class1;
        JVM INSTR monitorexit ;
        throw bundle;
        if (keypair instanceof String)
        {
            throw new IOException((String)keypair);
        }
        break MISSING_BLOCK_LABEL_118;
        keypair;
        bundle;
        JVM INSTR monitorexit ;
        throw keypair;
        Log.w("InstanceID/Rpc", (new StringBuilder()).append("No response ").append(keypair).toString());
        throw new IOException("TIMEOUT");
    }

    private void zzdd(String s)
    {
        if ("com.google.android.gsf".equals(zzaxd))
        {
            zzaxm = zzaxm + 1;
            if (zzaxm >= 3)
            {
                if (zzaxm == 3)
                {
                    zzaxn = (new Random()).nextInt(1000) + 1000;
                }
                zzaxn = zzaxn * 2;
                zzaxo = SystemClock.elapsedRealtime() + (long)zzaxn;
                Log.w("InstanceID/Rpc", (new StringBuilder()).append("Backoff due to ").append(s).append(" for ").append(zzaxn).toString());
                return;
            }
        }
    }

    private void zze(Object obj, Object obj1)
    {
        Message message;
        if (obj instanceof ConditionVariable)
        {
            ((ConditionVariable)obj).open();
        }
        if (!(obj instanceof Messenger))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = (Messenger)obj;
        message = Message.obtain();
        message.obj = obj1;
        ((Messenger) (obj)).send(message);
        return;
        obj;
        Log.w("InstanceID/Rpc", (new StringBuilder()).append("Failed to send response ").append(obj).toString());
        return;
    }

    private void zzi(String s, Object obj)
    {
        synchronized (getClass())
        {
            Object obj1 = zzaxh.get(s);
            zzaxh.put(s, obj);
            zze(obj1, obj);
        }
        return;
        s;
        class1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static String zzuk()
    {
        com/google/android/gms/iid/zzc;
        JVM INSTR monitorenter ;
        String s;
        int i = zzaxg;
        zzaxg = i + 1;
        s = Integer.toString(i);
        com/google/android/gms/iid/zzc;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    private void zzx(Object obj)
    {
        Class class1 = getClass();
        class1;
        JVM INSTR monitorenter ;
        Object obj1;
        for (Iterator iterator = zzaxh.keySet().iterator(); iterator.hasNext(); zze(obj1, obj))
        {
            String s = (String)iterator.next();
            obj1 = zzaxh.get(s);
            zzaxh.put(s, obj);
        }

        break MISSING_BLOCK_LABEL_83;
        obj;
        class1;
        JVM INSTR monitorexit ;
        throw obj;
        class1;
        JVM INSTR monitorexit ;
    }

    Intent zza(Bundle bundle, KeyPair keypair)
        throws IOException
    {
        Intent intent1 = zzb(bundle, keypair);
        Intent intent = intent1;
        if (intent1 != null)
        {
            intent = intent1;
            if (intent1.hasExtra("google.messenger"))
            {
                intent = zzb(bundle, keypair);
            }
        }
        return intent;
    }

    void zza(Bundle bundle, KeyPair keypair, String s)
        throws IOException
    {
        long l = SystemClock.elapsedRealtime();
        if (zzaxo != 0L && l <= zzaxo)
        {
            Log.w("InstanceID/Rpc", (new StringBuilder()).append("Backoff mode, next request attempt: ").append(zzaxo - l).append(" interval: ").append(zzaxn).toString());
            throw new IOException("RETRY_LATER");
        }
        zzuj();
        if (zzaxd == null)
        {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        } else
        {
            zzaxk = SystemClock.elapsedRealtime();
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(zzaxd);
            bundle.putString("gmsv", Integer.toString(GoogleCloudMessaging.zzat(zzpH)));
            bundle.putString("osv", Integer.toString(android.os.Build.VERSION.SDK_INT));
            bundle.putString("app_ver", Integer.toString(InstanceID.zzau(zzpH)));
            bundle.putString("cliv", "1");
            bundle.putString("appid", InstanceID.zza(keypair));
            String s1 = InstanceID.zzm(keypair.getPublic().getEncoded());
            bundle.putString("pub2", s1);
            bundle.putString("sig", zza(keypair, new String[] {
                zzpH.getPackageName(), s1
            }));
            intent.putExtras(bundle);
            zzo(intent);
            zzb(intent, s);
            return;
        }
    }

    protected void zzb(Intent intent, String s)
    {
        zzaxk = SystemClock.elapsedRealtime();
        intent.putExtra("kid", (new StringBuilder()).append("|ID|").append(s).append("|").toString());
        intent.putExtra("X-kid", (new StringBuilder()).append("|ID|").append(s).append("|").toString());
        boolean flag = "com.google.android.gsf".equals(zzaxd);
        s = intent.getStringExtra("useGsf");
        if (s != null)
        {
            flag = "1".equals(s);
        }
        if (Log.isLoggable("InstanceID/Rpc", 3))
        {
            Log.d("InstanceID/Rpc", (new StringBuilder()).append("Sending ").append(intent.getExtras()).toString());
        }
        if (zzaxi != null)
        {
            intent.putExtra("google.messenger", zzavX);
            s = Message.obtain();
            s.obj = intent;
            try
            {
                zzaxi.send(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            if (Log.isLoggable("InstanceID/Rpc", 3))
            {
                Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
            }
        }
        if (flag)
        {
            s = new Intent("com.google.android.gms.iid.InstanceID");
            s.setPackage(zzpH.getPackageName());
            s.putExtra("GSF", intent);
            zzpH.startService(s);
            return;
        }
        intent.putExtra("google.messenger", zzavX);
        intent.putExtra("messenger2", "1");
        if (zzaxj != null)
        {
            s = Message.obtain();
            s.obj = intent;
            try
            {
                zzaxj.send(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            if (Log.isLoggable("InstanceID/Rpc", 3))
            {
                Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
            }
        }
        zzpH.startService(intent);
    }

    public void zze(Message message)
    {
        if (message == null)
        {
            return;
        }
        if (message.obj instanceof Intent)
        {
            Object obj = (Intent)message.obj;
            ((Intent) (obj)).setExtrasClassLoader(com/google/android/gms/iid/MessengerCompat.getClassLoader());
            if (((Intent) (obj)).hasExtra("google.messenger"))
            {
                obj = ((Intent) (obj)).getParcelableExtra("google.messenger");
                if (obj instanceof MessengerCompat)
                {
                    zzaxj = (MessengerCompat)obj;
                }
                if (obj instanceof Messenger)
                {
                    zzaxi = (Messenger)obj;
                }
            }
            zzr((Intent)message.obj);
            return;
        } else
        {
            Log.w("InstanceID/Rpc", "Dropping invalid message");
            return;
        }
    }

    void zzo(Intent intent)
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

    String zzp(Intent intent)
        throws IOException
    {
        if (intent == null)
        {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String s1 = intent.getStringExtra("registration_id");
        String s = s1;
        if (s1 == null)
        {
            s = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra("Retry-After", 0L);
        if (s == null);
        if (s == null)
        {
            s = intent.getStringExtra("error");
            if (s != null)
            {
                throw new IOException(s);
            } else
            {
                Log.w("InstanceID/Rpc", (new StringBuilder()).append("Unexpected response from GCM ").append(intent.getExtras()).toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else
        {
            return s;
        }
    }

    void zzq(Intent intent)
    {
        String s1 = intent.getStringExtra("error");
        if (s1 == null)
        {
            Log.w("InstanceID/Rpc", (new StringBuilder()).append("Unexpected response, no error or registration id ").append(intent.getExtras()).toString());
        } else
        {
            if (Log.isLoggable("InstanceID/Rpc", 3))
            {
                Log.d("InstanceID/Rpc", (new StringBuilder()).append("Received InstanceID error ").append(s1).toString());
            }
            String s = null;
            Object obj1 = null;
            Object obj = s1;
            if (s1.startsWith("|"))
            {
                obj = s1.split("\\|");
                if (!"ID".equals(obj[1]))
                {
                    Log.w("InstanceID/Rpc", (new StringBuilder()).append("Unexpected structured response ").append(s1).toString());
                }
                long l;
                if (obj.length > 2)
                {
                    obj1 = obj[2];
                    String s2 = obj[3];
                    s = obj1;
                    obj = s2;
                    if (s2.startsWith(":"))
                    {
                        obj = s2.substring(1);
                        s = obj1;
                    }
                } else
                {
                    obj = "UNKNOWN";
                    s = obj1;
                }
                intent.putExtra("error", ((String) (obj)));
            }
            if (s == null)
            {
                zzx(obj);
            } else
            {
                zzi(s, obj);
            }
            l = intent.getLongExtra("Retry-After", 0L);
            if (l > 0L)
            {
                zzaxl = SystemClock.elapsedRealtime();
                zzaxn = (int)l * 1000;
                zzaxo = SystemClock.elapsedRealtime() + (long)zzaxn;
                Log.w("InstanceID/Rpc", (new StringBuilder()).append("Explicit request from server to backoff: ").append(zzaxn).toString());
                return;
            }
            if ("SERVICE_NOT_AVAILABLE".equals(obj) || "AUTHENTICATION_FAILED".equals(obj))
            {
                zzdd(((String) (obj)));
                return;
            }
        }
    }

    void zzr(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("InstanceID/Rpc", 3))
        {
            Log.d("InstanceID/Rpc", "Unexpected response: null");
        }
_L4:
        return;
_L2:
        String s = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(s) || "com.google.android.gms.iid.InstanceID".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("InstanceID/Rpc", 3))
        {
            Log.d("InstanceID/Rpc", (new StringBuilder()).append("Unexpected response ").append(intent.getAction()).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj = intent.getStringExtra("registration_id");
        if (obj == null)
        {
            obj = intent.getStringExtra("unregistered");
        }
        if (obj == null)
        {
            zzq(intent);
            return;
        }
        zzaxk = SystemClock.elapsedRealtime();
        zzaxo = 0L;
        zzaxm = 0;
        zzaxn = 0;
        if (Log.isLoggable("InstanceID/Rpc", 3))
        {
            Log.d("InstanceID/Rpc", (new StringBuilder()).append("AppIDResponse: ").append(((String) (obj))).append(" ").append(intent.getExtras()).toString());
        }
        String s1 = null;
        if (((String) (obj)).startsWith("|"))
        {
            Object obj1 = ((String) (obj)).split("\\|");
            if (!"ID".equals(obj1[1]))
            {
                Log.w("InstanceID/Rpc", (new StringBuilder()).append("Unexpected structured response ").append(((String) (obj))).toString());
            }
            s1 = obj1[2];
            if (obj1.length > 4)
            {
                if ("SYNC".equals(obj1[3]))
                {
                    InstanceIDListenerService.zzav(zzpH);
                } else
                if ("RST".equals(obj1[3]))
                {
                    InstanceIDListenerService.zza(zzpH, InstanceID.getInstance(zzpH).zzug());
                    intent.removeExtra("registration_id");
                    zzi(s1, intent);
                    return;
                }
            }
            obj1 = obj1[obj1.length - 1];
            obj = obj1;
            if (((String) (obj1)).startsWith(":"))
            {
                obj = ((String) (obj1)).substring(1);
            }
            intent.putExtra("registration_id", ((String) (obj)));
        }
        if (s1 == null)
        {
            zzx(intent);
            return;
        } else
        {
            zzi(s1, intent);
            return;
        }
    }

    void zzuj()
    {
        if (zzavX != null)
        {
            return;
        } else
        {
            zzaw(zzpH);
            zzavX = new Messenger(new Handler(Looper.getMainLooper()) {

                final zzc zzaxp;

                public void handleMessage(Message message)
                {
                    zzaxp.zze(message);
                }

            
            {
                zzaxp = zzc.this;
                super(looper);
            }
            });
            return;
        }
    }

}
