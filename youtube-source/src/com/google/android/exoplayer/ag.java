// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaFormat;
import com.google.android.exoplayer.e.k;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ag
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final List g;
    private int h;
    private int i;
    private int j;
    private MediaFormat k;

    private ag(String s, int l, int i1, int j1, int k1, int l1, List list)
    {
        a = s;
        b = l;
        c = i1;
        d = j1;
        e = k1;
        f = l1;
        s = list;
        if (list == null)
        {
            s = Collections.emptyList();
        }
        g = s;
        h = -1;
        i = -1;
    }

    public static ag a(String s, int l, int i1, int j1, List list)
    {
        return new ag(s, -1, i1, j1, -1, -1, list);
    }

    private final void a(MediaFormat mediaformat)
    {
        a(mediaformat, "max-width", h);
        a(mediaformat, "max-height", i);
    }

    private static final void a(MediaFormat mediaformat, String s, int l)
    {
        if (l != -1)
        {
            mediaformat.setInteger(s, l);
        }
    }

    public static ag b(String s, int l, int i1, int j1, List list)
    {
        return new ag(s, l, -1, -1, i1, j1, list);
    }

    public final MediaFormat a()
    {
        if (k == null)
        {
            MediaFormat mediaformat = new MediaFormat();
            mediaformat.setString("mime", a);
            a(mediaformat, "max-input-size", b);
            a(mediaformat, "width", c);
            a(mediaformat, "height", d);
            a(mediaformat, "channel-count", e);
            a(mediaformat, "sample-rate", f);
            for (int l = 0; l < g.size(); l++)
            {
                mediaformat.setByteBuffer((new StringBuilder("csd-")).append(l).toString(), ByteBuffer.wrap((byte[])g.get(l)));
            }

            a(mediaformat);
            k = mediaformat;
        }
        return k;
    }

    public final void a(int l, int i1)
    {
        h = l;
        i = i1;
        if (k != null)
        {
            a(k);
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (getClass() == obj.getClass())
            {
                obj = (ag)obj;
                flag = flag1;
                if (b == ((ag) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((ag) (obj)).c)
                    {
                        flag = flag1;
                        if (d == ((ag) (obj)).d)
                        {
                            flag = flag1;
                            if (h == ((ag) (obj)).h)
                            {
                                flag = flag1;
                                if (i == ((ag) (obj)).i)
                                {
                                    flag = flag1;
                                    if (e == ((ag) (obj)).e)
                                    {
                                        flag = flag1;
                                        if (f == ((ag) (obj)).f)
                                        {
                                            flag = flag1;
                                            if (com.google.android.exoplayer.e.k.a(a, ((ag) (obj)).a))
                                            {
                                                flag = flag1;
                                                if (g.size() == ((ag) (obj)).g.size())
                                                {
                                                    int l = 0;
label0:
                                                    do
                                                    {
label1:
                                                        {
                                                            if (l >= g.size())
                                                            {
                                                                break label1;
                                                            }
                                                            flag = flag1;
                                                            if (!Arrays.equals((byte[])g.get(l), (byte[])((ag) (obj)).g.get(l)))
                                                            {
                                                                break label0;
                                                            }
                                                            l++;
                                                        }
                                                    } while (true);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        if (j == 0)
        {
            int l;
            int j1;
            if ((new StringBuilder("527")).append(a).toString() == null)
            {
                l = 0;
            } else
            {
                l = a.hashCode();
            }
            j1 = ((((((l * 31 + b) * 31 + c) * 31 + d) * 31 + h) * 31 + i) * 31 + e) * 31 + f;
            l = i1;
            i1 = j1;
            for (; l < g.size(); l++)
            {
                i1 = Arrays.hashCode((byte[])g.get(l)) + i1 * 31;
            }

            j = i1;
        }
        return j;
    }
}
