// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.appindexing:
//            Thing

public final class Action extends Thing
{
    public static final class Builder extends Thing.Builder
    {

        public Action build()
        {
            zzv.zzb(zzKa.get("object"), "setObject is required before calling build().");
            zzv.zzb(zzKa.get("type"), "setType is required before calling build().");
            Bundle bundle = (Bundle)zzKa.getParcelable("object");
            zzv.zzb(bundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            zzv.zzb(bundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            return new Action(zzKa);
        }

        public volatile Thing build()
        {
            return build();
        }

        public Builder put(String s, Thing thing)
        {
            return (Builder)super.put(s, thing);
        }

        public Builder put(String s, String s1)
        {
            return (Builder)super.put(s, s1);
        }

        public volatile Thing.Builder put(String s, Thing thing)
        {
            return put(s, thing);
        }

        public volatile Thing.Builder put(String s, String s1)
        {
            return put(s, s1);
        }

        public Builder setName(String s)
        {
            return (Builder)super.put("name", s);
        }

        public volatile Thing.Builder setName(String s)
        {
            return setName(s);
        }

        public Builder setObject(Thing thing)
        {
            zzv.zzr(thing);
            return (Builder)super.put("object", thing);
        }

        public Builder setUrl(Uri uri)
        {
            if (uri != null)
            {
                super.put("url", uri.toString());
            }
            return this;
        }

        public volatile Thing.Builder setUrl(Uri uri)
        {
            return setUrl(uri);
        }

        public Builder(String s)
        {
            zzv.zzr(s);
            super.put("type", s);
        }
    }


    private Action(Bundle bundle)
    {
        super(bundle);
    }


    public static Action newAction(String s, String s1, Uri uri, Uri uri1)
    {
        Builder builder = new Builder(s);
        s1 = (new Thing.Builder()).setName(s1);
        if (uri == null)
        {
            s = null;
        } else
        {
            s = uri.toString();
        }
        return builder.setObject(s1.setId(s).setUrl(uri1).build()).build();
    }
}
