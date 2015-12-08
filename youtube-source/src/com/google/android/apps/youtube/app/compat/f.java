// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;


// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            e

final class f
    implements android.app.ActionBar.OnMenuVisibilityListener
{

    public final e a;

    public f(e e1)
    {
        a = e1;
    }

    public final void onMenuVisibilityChanged(boolean flag)
    {
        a.g(flag);
    }
}
