// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.HashMap;
import java.util.Map;

public final class dsh extends LayerDrawable
{

    private Map a;

    public dsh(Drawable drawable)
    {
        this(new Drawable[] {
            drawable
        });
    }

    private dsh(Drawable adrawable[])
    {
        super(adrawable);
        a = new HashMap();
    }

    public final void a(int i, int j)
    {
        a.put(Integer.valueOf(i), Integer.valueOf(j));
    }

    public final boolean isStateful()
    {
        return true;
    }

    protected final boolean onStateChange(int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            if (a.containsKey(Integer.valueOf(k)))
            {
                super.setColorFilter(((Integer)a.get(Integer.valueOf(k))).intValue(), android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        }

        return super.onStateChange(ai);
    }
}
