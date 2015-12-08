// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.ar;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            e, a, f

public final class g extends e
{

    private WeakReference e;

    protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        if (!flag1)
        {
            a a1 = (a)e.get();
            if (a1 != null)
            {
                a1.a(a.a, drawable, flag2);
            }
        }
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof g))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        obj = (g)obj;
        a a1 = (a)e.get();
        a a2 = (a)((g) (obj)).e.get();
        boolean flag;
        if (a2 != null && a1 != null && ar.a(a2, a1) && ar.a(((g) (obj)).a, a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            a
        });
    }
}
