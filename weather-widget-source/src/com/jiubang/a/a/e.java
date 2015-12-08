// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.a.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.a.a.a;
import com.a.a.s;

// Referenced classes of package com.jiubang.a.a:
//            d

public class e extends d
{

    private long b;
    private long c;
    private float d;
    private long e;

    public e(BaseAdapter baseadapter)
    {
        this(baseadapter, 160L, 420L, 50F);
    }

    public e(BaseAdapter baseadapter, long l, long l1, float f)
    {
        super(baseadapter);
        b = 160L;
        c = 420L;
        d = 50F;
        e = 0L;
        b = l;
        c = l1;
        d = f;
    }

    protected long a()
    {
        return b;
    }

    public void a(long l, long l1, long l2, float f)
    {
        e = l;
        b = l1;
        c = l2;
        d = f;
    }

    protected long b()
    {
        return c;
    }

    protected a b(ViewGroup viewgroup, View view)
    {
        return s.a(view, "translationY", new float[] {
            d, 0.0F
        });
    }

    protected long c()
    {
        return e;
    }
}
