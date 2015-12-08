// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzar, zzat, zzcs, zzcd, 
//            zzbg, zzas

class zzz
    implements zzar
{

    private static final Object zzaBX = new Object();
    private static zzz zzaDm;
    private zzcd zzaCA;
    private String zzaDn;
    private String zzaDo;
    private zzas zzaDp;

    private zzz(Context context)
    {
        this(((zzas) (zzat.zzaq(context))), ((zzcd) (new zzcs())));
    }

    zzz(zzas zzas1, zzcd zzcd1)
    {
        zzaDp = zzas1;
        zzaCA = zzcd1;
    }

    public static zzar zzao(Context context)
    {
        synchronized (zzaBX)
        {
            if (zzaDm == null)
            {
                zzaDm = new zzz(context);
            }
            context = zzaDm;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean zzdK(String s)
    {
        if (!zzaCA.zziT())
        {
            zzbg.zzan("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (zzaDn != null)
        {
            s1 = s;
            if (zzaDo != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(zzaDn).append("?").append(zzaDo).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    zzbg.zzam((new StringBuilder()).append("Sending wrapped url hit: ").append(s1).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    zzbg.zzd("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        zzaDp.zzdO(s1);
        return true;
    }

}
