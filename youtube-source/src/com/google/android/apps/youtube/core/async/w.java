// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class w
{

    public final Uri a;
    public final Map b;
    public final byte c[];
    private volatile int d;

    public w(Uri uri, Map map, byte abyte0[])
    {
        a = (Uri)com.google.android.apps.youtube.common.fromguava.c.a(uri);
        if (map == null)
        {
            uri = Collections.emptyMap();
        } else
        {
            uri = Collections.unmodifiableMap(map);
        }
        b = uri;
        c = abyte0;
    }

    protected static byte[] a(w w1)
    {
        byte abyte0[] = null;
        if (w1.c != null)
        {
            int i = w1.c.length;
            abyte0 = new byte[i];
            System.arraycopy(w1.c, 0, abyte0, 0, i);
        }
        return abyte0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof w))
            {
                return false;
            }
            obj = (w)obj;
            if (!a.equals(((w) (obj)).a) || !b.equals(((w) (obj)).b) || !Arrays.equals(c, ((w) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = d;
        int i = j;
        if (j == 0)
        {
            int k = a.hashCode();
            int l = b.hashCode();
            if (c == null)
            {
                i = 0;
            } else
            {
                i = Arrays.hashCode(c);
            }
            i += ((k + 527) * 31 + l) * 31;
            d = i;
        }
        return i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("{uri='")).append(a).append("', headers='").append(b).append("', content='");
        String s;
        if (c != null)
        {
            s = new String(c);
        } else
        {
            s = "null";
        }
        return stringbuilder.append(s).append("'}").toString();
    }
}
