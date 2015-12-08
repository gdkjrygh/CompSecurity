// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.a;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import com.google.a.a.a.a.fk;
import com.google.a.a.a.a.sc;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.ao;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

public final class b
{

    public static Spanned a(fk fk1)
    {
        if (fk1 == null)
        {
            return null;
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        fk1 = fk1.b;
        int i1 = fk1.length;
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < i1) 
        {
            Object obj = fk1[i];
            k = ((sc) (obj)).b.length() + k;
            spannablestringbuilder.append(((sc) (obj)).b);
            int l;
            byte byte0;
            if (((sc) (obj)).c)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            if (((sc) (obj)).d)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            l |= byte0;
            if (l != 0)
            {
                spannablestringbuilder.setSpan(new StyleSpan(l), j, k, 33);
            }
            i++;
            j = k;
        }
        return spannablestringbuilder;
    }

    public static fk a(long l)
    {
        fk fk1 = new fk();
        sc sc1 = new sc();
        sc1.b = NumberFormat.getInstance().format(l);
        fk1.b = (new sc[] {
            sc1
        });
        return fk1;
    }

    public static ao a(ap ap1, int i, int j)
    {
        Object obj;
        obj = null;
        Object obj1 = null;
        boolean flag1 = true;
        c.a(ap1);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (j >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (ap1.a()) goto _L2; else goto _L1
_L1:
        obj = obj1;
_L4:
        return ((ao) (obj));
_L2:
        Iterator iterator = ap1.b().iterator();
        int k = 0;
        ap1 = ((ap) (obj));
        do
        {
            obj = ap1;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (ao)iterator.next();
            int l = i - ((ao) (obj)).b();
            int i1 = j - ((ao) (obj)).c();
            l = l * l + i1 * i1;
            if (ap1 == null || l < k)
            {
                ap1 = ((ap) (obj));
                k = l;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
