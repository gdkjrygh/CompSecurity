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

    private static final Object zzaOF = new Object();
    private static zzz zzaPU;
    private String zzaPV;
    private String zzaPW;
    private zzas zzaPX;
    private zzcd zzaPi;

    private zzz(Context context)
    {
        this(((zzas) (zzat.zzaO(context))), ((zzcd) (new zzcs())));
    }

    zzz(zzas zzas1, zzcd zzcd1)
    {
        zzaPX = zzas1;
        zzaPi = zzcd1;
    }

    public static zzar zzaM(Context context)
    {
        synchronized (zzaOF)
        {
            if (zzaPU == null)
            {
                zzaPU = new zzz(context);
            }
            context = zzaPU;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean zzeH(String s)
    {
        if (!zzaPi.zzkp())
        {
            zzbg.zzaE("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (zzaPV != null)
        {
            s1 = s;
            if (zzaPW != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(zzaPV).append("?").append(zzaPW).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    zzbg.v((new StringBuilder()).append("Sending wrapped url hit: ").append(s1).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    zzbg.zzd("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        zzaPX.zzeL(s1);
        return true;
    }

}
