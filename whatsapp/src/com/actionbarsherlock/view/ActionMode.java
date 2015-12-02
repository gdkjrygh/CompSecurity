// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.view:
//            Menu

public abstract class ActionMode
{

    public static int a;

    public ActionMode()
    {
    }

    public abstract void finish();

    public abstract Menu getMenu();

    public abstract void invalidate();

    public abstract void setCustomView(View view);

    public abstract void setTitle(CharSequence charsequence);
}
