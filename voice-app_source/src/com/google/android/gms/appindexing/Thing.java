// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;

public class Thing
{
    public static class Builder
    {

        final Bundle zzNW = new Bundle();

        public Thing build()
        {
            return new Thing(zzNW);
        }

        public Builder put(String s, Thing thing)
        {
            zzu.zzu(s);
            if (thing != null)
            {
                zzNW.putParcelable(s, thing.zzNV);
            }
            return this;
        }

        public Builder put(String s, String s1)
        {
            zzu.zzu(s);
            if (s1 != null)
            {
                zzNW.putString(s, s1);
            }
            return this;
        }

        public Builder setDescription(String s)
        {
            put("description", s);
            return this;
        }

        public Builder setId(String s)
        {
            if (s != null)
            {
                put("id", s);
            }
            return this;
        }

        public Builder setName(String s)
        {
            zzu.zzu(s);
            put("name", s);
            return this;
        }

        public Builder setType(String s)
        {
            put("type", s);
            return this;
        }

        public Builder setUrl(Uri uri)
        {
            zzu.zzu(uri);
            put("url", uri.toString());
            return this;
        }

        public Builder()
        {
        }
    }


    final Bundle zzNV;

    Thing(Bundle bundle)
    {
        zzNV = bundle;
    }

    public Bundle zzkP()
    {
        return zzNV;
    }
}
