// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.iid:
//            zzd, zzc

public class InstanceID
{

    public static final String ERROR_BACKOFF = "RETRY_LATER";
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String ERROR_TIMEOUT = "TIMEOUT";
    static Map zzaAO = new HashMap();
    private static zzd zzaAP;
    private static zzc zzaAQ;
    static String zzaAU;
    Context mContext;
    KeyPair zzaAR;
    String zzaAS;
    long zzaAT;

    protected InstanceID(Context context, String s, Bundle bundle)
    {
        zzaAS = "";
        mContext = context.getApplicationContext();
        zzaAS = s;
    }

    public static InstanceID getInstance(Context context)
    {
        return zza(context, null);
    }

    public static InstanceID zza(Context context, Bundle bundle)
    {
        com/google/android/gms/iid/InstanceID;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        String s = "";
          goto _L3
_L5:
        InstanceID instanceid;
        Context context1;
        context1 = context.getApplicationContext();
        if (zzaAP == null)
        {
            zzaAP = new zzd(context1);
            zzaAQ = new zzc(context1);
        }
        zzaAU = Integer.toString(zzaB(context1));
        instanceid = (InstanceID)zzaAO.get(s);
        context = instanceid;
        if (instanceid != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        context = new InstanceID(context1, s, bundle);
        zzaAO.put(s, context);
        com/google/android/gms/iid/InstanceID;
        JVM INSTR monitorexit ;
        return context;
_L2:
        s = bundle.getString("subtype");
          goto _L3
        context;
        throw context;
_L3:
        if (s == null)
        {
            s = "";
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static String zza(KeyPair keypair)
    {
        keypair = keypair.getPublic().getEncoded();
        try
        {
            keypair = MessageDigest.getInstance("SHA1").digest(keypair);
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
        keypair[0] = (byte)((keypair[0] & 0xf) + 112 & 0xff);
        keypair = Base64.encodeToString(keypair, 0, 8, 11);
        return keypair;
    }

    static int zzaB(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("InstanceID", (new StringBuilder()).append("Never happens: can't find own package ").append(context).toString());
            return 0;
        }
        return i;
    }

    static String zzm(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 11);
    }

    public void deleteInstanceID()
        throws IOException
    {
        zzb("*", "*", null);
        zzvz();
    }

    public void deleteToken(String s, String s1)
        throws IOException
    {
        zzb(s, s1, null);
    }

    public long getCreationTime()
    {
        if (zzaAT == 0L)
        {
            String s = zzaAP.get(zzaAS, "cre");
            if (s != null)
            {
                zzaAT = Long.parseLong(s);
            }
        }
        return zzaAT;
    }

    public String getId()
    {
        return zza(zzvy());
    }

    public String getToken(String s, String s1)
        throws IOException
    {
        return getToken(s, s1, null);
    }

    public String getToken(String s, String s1, Bundle bundle)
        throws IOException
    {
        boolean flag1 = false;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        boolean flag = true;
        Object obj;
        if (zzvC())
        {
            obj = null;
        } else
        {
            obj = zzaAP.zzg(zzaAS, s, s1);
        }
        if (obj == null)
        {
            obj = bundle;
            if (bundle == null)
            {
                obj = new Bundle();
            }
            if (((Bundle) (obj)).getString("ttl") != null)
            {
                flag = false;
            }
            if ("jwt".equals(((Bundle) (obj)).getString("type")))
            {
                flag = flag1;
            }
            bundle = zzc(s, s1, ((Bundle) (obj)));
            Log.w("InstanceID", (new StringBuilder()).append("token: ").append(bundle).toString());
            obj = bundle;
            if (bundle != null)
            {
                obj = bundle;
                if (flag)
                {
                    zzaAP.zza(zzaAS, s, s1, bundle, zzaAU);
                    return bundle;
                }
            }
        }
        return ((String) (obj));
    }

    public void zzb(String s, String s1, Bundle bundle)
        throws IOException
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        zzaAP.zzh(zzaAS, s, s1);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putString("sender", s);
        if (s1 != null)
        {
            bundle1.putString("scope", s1);
        }
        bundle1.putString("subscription", s);
        bundle1.putString("delete", "1");
        bundle1.putString("X-delete", "1");
        if ("".equals(zzaAS))
        {
            s1 = s;
        } else
        {
            s1 = zzaAS;
        }
        bundle1.putString("subtype", s1);
        if (!"".equals(zzaAS))
        {
            s = zzaAS;
        }
        bundle1.putString("X-subtype", s);
        s = zzaAQ.zza(bundle1, zzvy());
        zzaAQ.zzp(s);
    }

    public String zzc(String s, String s1, Bundle bundle)
        throws IOException
    {
        if (s1 != null)
        {
            bundle.putString("scope", s1);
        }
        bundle.putString("sender", s);
        if ("".equals(zzaAS))
        {
            s1 = s;
        } else
        {
            s1 = zzaAS;
        }
        if (!bundle.containsKey("legacy.register"))
        {
            bundle.putString("subscription", s);
            bundle.putString("subtype", s1);
            bundle.putString("X-subscription", s);
            bundle.putString("X-subtype", s1);
        }
        s = zzaAQ.zza(bundle, zzvy());
        return zzaAQ.zzp(s);
    }

    zzd zzvA()
    {
        return zzaAP;
    }

    zzc zzvB()
    {
        return zzaAQ;
    }

    boolean zzvC()
    {
        String s = zzaAP.get("appVersion");
        long l;
        if (s != null && s.equals(zzaAU))
        {
            if ((s = zzaAP.get("lastToken")) != null && System.currentTimeMillis() / 1000L - Long.valueOf(l = Long.parseLong(s)).longValue() <= 0x93a80L)
            {
                return false;
            }
        }
        return true;
    }

    KeyPair zzvy()
    {
        if (zzaAR == null)
        {
            zzaAR = zzaAP.zzdr(zzaAS);
        }
        if (zzaAR == null)
        {
            zzaAT = System.currentTimeMillis();
            zzaAR = zzaAP.zze(zzaAS, zzaAT);
        }
        return zzaAR;
    }

    void zzvz()
    {
        zzaAT = 0L;
        zzaAP.zzds(zzaAS);
        zzaAR = null;
    }

}
