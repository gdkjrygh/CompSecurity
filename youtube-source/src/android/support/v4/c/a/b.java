// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c.a;

import android.support.v4.view.n;
import android.view.MenuItem;
import android.view.View;

public interface b
    extends MenuItem
{

    public abstract b a(n n);

    public abstract boolean expandActionView();

    public abstract MenuItem setActionView(int i);

    public abstract MenuItem setActionView(View view);

    public abstract void setShowAsAction(int i);
}
