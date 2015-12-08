// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.iid:
//            InstanceIDListenerService, zza, InstanceID

public class zzd
{

    SharedPreferences zzaxq;
    Context zzpH;

    public zzd(Context context)
    {
        this(context, "com.google.android.gms.appid");
    }

    public zzd(Context context, String s)
    {
        zzpH = context;
        zzaxq = context.getSharedPreferences(s, 4);
        zzde((new StringBuilder()).append(s).append("-no-backup").toString());
    }

    private void zzde(String s)
    {
        s = new File((new ContextCompat()).getNoBackupFilesDir(zzpH), s);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            if (s.createNewFile() && !isEmpty())
            {
                Log.i("InstanceID/Store", "App restored, clearing state");
                InstanceIDListenerService.zza(zzpH, this);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("InstanceID/Store", 3))
            {
                Log.d("InstanceID/Store", (new StringBuilder()).append("Error creating file in no backup dir: ").append(s.getMessage()).toString());
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private String zzf(String s, String s1, String s2)
    {
        return (new StringBuilder()).append(s).append("|T|").append(s1).append("|").append(s2).toString();
    }

    String get(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = zzaxq.getString(s, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    String get(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = zzaxq.getString((new StringBuilder()).append(s).append("|S|").append(s1).toString(), null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    boolean isEmpty()
    {
        return zzaxq.getAll().isEmpty();
    }

    public void zza(String s, String s1, String s2, String s3, String s4)
    {
        this;
        JVM INSTR monitorenter ;
        s = zzf(s, s1, s2);
        s1 = zzaxq.edit();
        s1.putString(s, s3);
        s1.putString("appVersion", s4);
        s1.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000L));
        s1.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void zzdf(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor;
        editor = zzaxq.edit();
        Iterator iterator = zzaxq.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.startsWith(s))
            {
                editor.remove(s1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_78;
        s;
        throw s;
        editor.commit();
        this;
        JVM INSTR monitorexit ;
    }

    public KeyPair zzdg(String s)
    {
        return zzdj(s);
    }

    void zzdh(String s)
    {
        zzdf((new StringBuilder()).append(s).append("|").toString());
    }

    public void zzdi(String s)
    {
        zzdf((new StringBuilder()).append(s).append("|T|").toString());
    }

    KeyPair zzdj(String s)
    {
        String s1;
        Object obj;
        s1 = get(s, "|P|");
        obj = get(s, "|K|");
        if (obj == null)
        {
            return null;
        }
        s = Base64.decode(s1, 8);
        byte abyte0[] = Base64.decode(((String) (obj)), 8);
        obj = KeyFactory.getInstance("RSA");
        s = new KeyPair(((KeyFactory) (obj)).generatePublic(new X509EncodedKeySpec(s)), ((KeyFactory) (obj)).generatePrivate(new PKCS8EncodedKeySpec(abyte0)));
        return s;
        s;
_L2:
        Log.w("InstanceID/Store", (new StringBuilder()).append("Invalid key stored ").append(s).toString());
        InstanceIDListenerService.zza(zzpH, this);
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    KeyPair zze(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        KeyPair keypair;
        keypair = com.google.android.gms.iid.zza.zzud();
        zzaxq.edit().putString((new StringBuilder()).append(s).append("|P|").toString(), InstanceID.zzm(keypair.getPublic().getEncoded())).putString((new StringBuilder()).append(s).append("|K|").toString(), InstanceID.zzm(keypair.getPrivate().getEncoded())).putString((new StringBuilder()).append(s).append("|S|").append("cre").toString(), Long.toString(l)).commit();
        this;
        JVM INSTR monitorexit ;
        return keypair;
        s;
        throw s;
    }

    public String zzg(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        s = zzf(s, s1, s2);
        s = zzaxq.getString(s, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void zzh(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        s = zzf(s, s1, s2);
        s1 = zzaxq.edit();
        s1.remove(s);
        s1.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void zzul()
    {
        this;
        JVM INSTR monitorenter ;
        zzaxq.edit().clear().commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
