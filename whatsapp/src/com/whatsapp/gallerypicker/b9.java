// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.net.Uri;

// Referenced classes of package com.whatsapp.gallerypicker:
//            t, bb, ar

public abstract class b9
    implements t
{

    private String a;
    private int b;
    protected ar c;
    protected String d;
    protected final int e;
    private int f;
    protected long g;
    protected ContentResolver h;
    protected String i;
    private final long j;
    protected Uri k;

    protected b9(ar ar, ContentResolver contentresolver, long l, int i1, Uri uri, String s, 
            String s1, long l1, String s2)
    {
        f = -1;
        b = -1;
        c = ar;
        h = contentresolver;
        g = l;
        e = i1;
        k = uri;
        i = s;
        d = s1;
        j = l1;
        a = s2;
    }

    public Uri a()
    {
        return k;
    }

    public String b()
    {
        return d;
    }

    public String c()
    {
        return i;
    }

    public long d()
    {
        return j;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof bb))
        {
            return false;
        } else
        {
            return k.equals(((bb)obj).k);
        }
    }

    public int hashCode()
    {
        return k.hashCode();
    }

    public String toString()
    {
        return k.toString();
    }
}
