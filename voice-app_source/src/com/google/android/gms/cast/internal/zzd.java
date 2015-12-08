// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzf, zzl, zzn

public abstract class zzd
{

    protected final zzl zzUi;
    private final String zzUj;
    private zzn zzUk;

    protected zzd(String s, String s1, String s2)
    {
        zzf.zzbD(s);
        zzUj = s;
        zzUi = new zzl(s1);
        setSessionLabel(s2);
    }

    public final String getNamespace()
    {
        return zzUj;
    }

    public void setSessionLabel(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            zzUi.zzbJ(s);
        }
    }

    public final void zza(zzn zzn1)
    {
        zzUk = zzn1;
        if (zzUk == null)
        {
            zzlJ();
        }
    }

    protected final void zza(String s, long l, String s1)
        throws IOException
    {
        zzUi.zza("Sending text message: %s to: %s", new Object[] {
            s, s1
        });
        zzUk.zza(zzUj, s, l, s1);
    }

    public void zzb(long l, int i)
    {
    }

    public void zzbB(String s)
    {
    }

    public void zzlJ()
    {
    }

    protected final long zzlK()
    {
        return zzUk.zzlu();
    }
}
