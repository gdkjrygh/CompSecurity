// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.c4;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            App, og, aoz

public class d2
    implements Comparator
{

    private final Context a;

    public d2(Context context)
    {
        a = context;
    }

    public int a(og og1, og og2)
    {
        c4 c4_1 = null;
        Object obj;
        if (App.ah.v(og1.a))
        {
            obj = App.ah.t(og1.a);
        } else
        {
            obj = null;
        }
        if (App.ah.v(og2.a))
        {
            c4_1 = App.ah.t(og2.a);
        }
        if (obj == null && c4_1 == null)
        {
            obj = Collator.getInstance();
            ((Collator) (obj)).setStrength(0);
            ((Collator) (obj)).setDecomposition(1);
            return ((Collator) (obj)).compare(og1.a(a), og2.a(a));
        }
        if (obj == null)
        {
            return 1;
        }
        if (c4_1 == null)
        {
            return -1;
        }
        if (((c4) (obj)).I == c4_1.I)
        {
            return og1.a(a).compareTo(og2.a(a));
        }
        return ((c4) (obj)).I >= c4_1.I ? -1 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((og)obj, (og)obj1);
    }
}
