// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            AbstractWorkspace, TabRow

public class Workspace extends AbstractWorkspace
{

    private TabRow b;

    public Workspace(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected final void a(int i)
    {
        if (b != null)
        {
            b.a(i, true);
        }
    }
}
