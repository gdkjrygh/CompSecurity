// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.widget.ListAdapter;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            k, i, j

public interface PagedView
{

    public abstract int a();

    public abstract void a(String s);

    public abstract int b();

    public abstract void b(String s);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract State f();

    public abstract k h();

    public abstract int i();

    public abstract void setAdapter(ListAdapter listadapter);

    public abstract void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener);

    public abstract void setOnPagedViewStateChangeListener(i j);

    public abstract void setOnRetryClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setOnScrollListener(j j);
}
