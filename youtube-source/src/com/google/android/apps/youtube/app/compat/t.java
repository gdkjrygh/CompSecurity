// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            w

public class t extends w
{

    public t(Context context, MenuItem menuitem)
    {
        super(context, menuitem);
    }

    public final void b(int i)
    {
        a.setShowAsAction(i);
    }

    public View d()
    {
        return a.getActionView();
    }
}
