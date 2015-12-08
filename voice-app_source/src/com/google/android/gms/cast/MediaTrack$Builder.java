// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaTrack

public static class zzSs
{

    private final MediaTrack zzSs;

    public MediaTrack build()
    {
        return zzSs;
    }

    public zzSs setContentId(String s)
    {
        zzSs.setContentId(s);
        return this;
    }

    public ntId setContentType(String s)
    {
        zzSs.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        zzSs.setCustomData(jsonobject);
        return this;
    }

    public mData setLanguage(String s)
    {
        zzSs.setLanguage(s);
        return this;
    }

    public age setLanguage(Locale locale)
    {
        zzSs.setLanguage(zzf.zzb(locale));
        return this;
    }

    public age setName(String s)
    {
        zzSs.setName(s);
        return this;
    }

    public zzSs setSubtype(int i)
        throws IllegalArgumentException
    {
        zzSs.zzaG(i);
        return this;
    }

    public (long l, int i)
        throws IllegalArgumentException
    {
        zzSs = new MediaTrack(l, i);
    }
}
