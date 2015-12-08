// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class c
{

    private final Bundle a;
    private List b;

    private c(Bundle bundle, List list)
    {
        a = bundle;
        b = list;
    }

    c(Bundle bundle, List list, byte byte0)
    {
        this(bundle, list);
    }

    static Bundle a(c c1)
    {
        return c1.a;
    }

    public static c a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new c(bundle, null);
        } else
        {
            return null;
        }
    }

    static void b(c c1)
    {
        c1.p();
    }

    static List c(c c1)
    {
        return c1.b;
    }

    private void p()
    {
        if (b == null)
        {
            b = a.getParcelableArrayList("controlFilters");
            if (b == null)
            {
                b = Collections.emptyList();
            }
        }
    }

    public final String a()
    {
        return a.getString("id");
    }

    public final String b()
    {
        return a.getString("name");
    }

    public final String c()
    {
        return a.getString("status");
    }

    public final boolean d()
    {
        return a.getBoolean("enabled", true);
    }

    public final boolean e()
    {
        return a.getBoolean("connecting", false);
    }

    public final List f()
    {
        p();
        return b;
    }

    public final int g()
    {
        return a.getInt("playbackType", 1);
    }

    public final int h()
    {
        return a.getInt("playbackStream", -1);
    }

    public final int i()
    {
        return a.getInt("volume");
    }

    public final int j()
    {
        return a.getInt("volumeMax");
    }

    public final int k()
    {
        return a.getInt("volumeHandling", 0);
    }

    public final int l()
    {
        return a.getInt("presentationDisplayId", -1);
    }

    public final Bundle m()
    {
        return a.getBundle("extras");
    }

    public final boolean n()
    {
        p();
        return !TextUtils.isEmpty(a()) && !TextUtils.isEmpty(b()) && !b.contains(null);
    }

    public final Bundle o()
    {
        return a;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteDescriptor{ ");
        stringbuilder.append("id=").append(a());
        stringbuilder.append(", name=").append(b());
        stringbuilder.append(", description=").append(c());
        stringbuilder.append(", isEnabled=").append(d());
        stringbuilder.append(", isConnecting=").append(e());
        stringbuilder.append(", controlFilters=").append(Arrays.toString(f().toArray()));
        stringbuilder.append(", playbackType=").append(g());
        stringbuilder.append(", playbackStream=").append(h());
        stringbuilder.append(", volume=").append(i());
        stringbuilder.append(", volumeMax=").append(j());
        stringbuilder.append(", volumeHandling=").append(k());
        stringbuilder.append(", presentationDisplayId=").append(l());
        stringbuilder.append(", extras=").append(m());
        stringbuilder.append(", isValid=").append(n());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
