// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public abstract class dso extends dsl
{

    public dso(Context context, List list)
    {
        super(context, list, null);
    }

    private boolean d(int i)
    {
        return i == getCount();
    }

    public abstract View a();

    public final View b(int i, View view, ViewGroup viewgroup)
    {
        if (i == 0 || b(i) || b(i - 1))
        {
            return null;
        } else
        {
            return a();
        }
    }

    public boolean isEnabled(int i)
    {
        return d(i) || super.isEnabled(i);
    }
}
