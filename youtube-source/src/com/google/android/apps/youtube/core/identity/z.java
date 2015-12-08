// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            UserProfile, f

public final class z
{

    private volatile int a;
    private final String b;
    private final String c;
    private final Uri d;

    public z(String s, String s1, Uri uri)
    {
        b = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        d = uri;
    }

    public static z a(f f1, UserProfile userprofile)
    {
        String s = userprofile.displayUsername;
        if (f1.d())
        {
            f1 = "";
        } else
        {
            f1 = f1.b();
        }
        return new z(s, f1, userprofile.thumbnailUri);
    }

    public final String a()
    {
        return b;
    }

    final void a(SharedPreferences sharedpreferences)
    {
        String s;
        if (d == null)
        {
            s = null;
        } else
        {
            s = d.toString();
        }
        sharedpreferences.edit().putString("profile_display_email", c).putString("profile_display_name", b).putString("profile_thumbnail_uri", s).apply();
    }

    public final String b()
    {
        return c;
    }

    public final Uri c()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof z))
            {
                return false;
            }
            obj = (z)obj;
            if (!com.google.android.apps.youtube.common.fromguava.b.a(b, ((z) (obj)).b) || !com.google.android.apps.youtube.common.fromguava.b.a(c, ((z) (obj)).c) || !com.google.android.apps.youtube.common.fromguava.b.a(d, ((z) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = a;
        int i = j;
        if (j == 0)
        {
            int k;
            if (b == null)
            {
                i = 0;
            } else
            {
                i = b.hashCode();
            }
            if (c == null)
            {
                k = 0;
            } else
            {
                k = c.hashCode();
            }
            if (d != null)
            {
                l = d.hashCode();
            }
            i = (k + (i + 527) * 31) * 31 + l;
            a = i;
        }
        return i;
    }
}
