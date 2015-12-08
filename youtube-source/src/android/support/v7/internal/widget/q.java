// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView, t

final class q extends DataSetObserver
{

    final ActivityChooserView a;

    q(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public final void onChanged()
    {
        super.onChanged();
        ActivityChooserView.a(a).notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        super.onInvalidated();
        ActivityChooserView.a(a).notifyDataSetInvalidated();
    }
}
