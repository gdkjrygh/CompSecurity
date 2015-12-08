// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.appindexing:
//            Thing

public static class 
{

    final Bundle zzKa = new Bundle();

    public Thing build()
    {
        return new Thing(zzKa);
    }

    public zzKa put(String s, Thing thing)
    {
        zzv.zzr(s);
        if (thing != null)
        {
            zzKa.putParcelable(s, thing.zzJZ);
        }
        return this;
    }

    public zzKa put(String s, String s1)
    {
        zzv.zzr(s);
        if (s1 != null)
        {
            zzKa.putString(s, s1);
        }
        return this;
    }

    public zzKa setId(String s)
    {
        if (s != null)
        {
            put("id", s);
        }
        return this;
    }

    public put setName(String s)
    {
        zzv.zzr(s);
        put("name", s);
        return this;
    }

    public put setUrl(Uri uri)
    {
        zzv.zzr(uri);
        put("url", uri.toString());
        return this;
    }

    public ()
    {
    }
}
