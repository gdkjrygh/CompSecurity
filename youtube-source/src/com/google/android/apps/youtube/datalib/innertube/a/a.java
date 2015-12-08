// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.a;

import android.text.TextUtils;
import com.google.a.a.a.a.aa;
import com.google.a.a.a.a.am;
import com.google.a.a.a.a.bj;
import com.google.a.a.a.a.jz;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.qf;
import com.google.a.a.a.a.tu;
import com.google.a.a.a.a.wb;

public final class a
{

    public static boolean a(kz kz1, kz kz2, boolean flag)
    {
        if ((kz1 != null || kz2 == null) && (kz1 == null || kz2 != null)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (kz1 == null && kz2 == null)
        {
            return true;
        }
        if (kz1.r != null && kz2.r != null)
        {
            return TextUtils.equals(kz1.r.b, kz2.r.b);
        }
        if (kz1.c == null || kz2.c == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag || TextUtils.equals(kz1.c.c, kz2.c.c))
        {
            return TextUtils.equals(kz1.c.b, kz2.c.b);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (kz1.m != null && kz2.m != null)
        {
            return TextUtils.equals(kz1.m.b, kz2.m.b);
        }
        if (kz1.e != null && kz2.e != null)
        {
            return true;
        }
        if (kz1.p != null && kz2.p != null)
        {
            return TextUtils.equals(kz1.p.b, kz2.p.b);
        }
        if (kz1.s != null && kz2.s != null)
        {
            return true;
        }
        if (kz1.g == null || kz2.g == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag || TextUtils.equals(kz1.g.c, kz2.g.c))
        {
            return TextUtils.equals(kz1.g.b, kz2.g.b);
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (kz1.k != null && kz2.k != null)
        {
            return TextUtils.equals(kz1.k.b, kz2.k.b);
        }
        if (kz1.i != null && kz2.i != null)
        {
            kz1 = kz1.i;
            kz2 = kz2.i;
            if ((!flag || TextUtils.equals(((wb) (kz1)).e, ((wb) (kz2)).e) && TextUtils.equals(((wb) (kz1)).f, ((wb) (kz2)).f) && TextUtils.equals(((wb) (kz1)).j, ((wb) (kz2)).j) && Float.compare(((wb) (kz1)).i, ((wb) (kz2)).i) == 0 && Float.compare(((wb) (kz1)).h, ((wb) (kz2)).h) == 0) && ((wb) (kz1)).g == ((wb) (kz2)).g && ((wb) (kz1)).d == ((wb) (kz2)).d && TextUtils.equals(((wb) (kz1)).b, ((wb) (kz2)).b) && TextUtils.equals(((wb) (kz1)).c, ((wb) (kz2)).c))
            {
                return true;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
