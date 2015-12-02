// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.List;

public final class ffx extends dso
{

    private int b;

    public ffx(Context context, List list)
    {
        super(context, list);
        b = (int)context.getResources().getDimension(0x7f08020a);
    }

    public final View a()
    {
        View view = new View(a);
        view.setMinimumHeight(b);
        return view;
    }
}
