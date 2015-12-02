// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class ijm extends ContextWrapper
{

    private ijo a;
    private final int b = ijk.a().g();

    private ijm(Context context)
    {
        super(context);
    }

    public static ContextWrapper a(Context context)
    {
        return new ijm(context);
    }

    public final Object getSystemService(String s)
    {
        if ("layout_inflater".equals(s))
        {
            if (a == null)
            {
                a = new ijo(LayoutInflater.from(getBaseContext()), this, b, false);
            }
            return a;
        } else
        {
            return super.getSystemService(s);
        }
    }
}
