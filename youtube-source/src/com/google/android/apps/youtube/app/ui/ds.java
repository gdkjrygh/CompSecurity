// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.youtube.l;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            PrivacySpinner, dt, du

final class ds extends a
{

    final PrivacySpinner a;

    public ds(PrivacySpinner privacyspinner)
    {
        a = privacyspinner;
        super();
        b(Arrays.asList(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.values()));
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = com.google.android.apps.youtube.app.ui.PrivacySpinner.a(a).inflate(l.aN, null);
            view = new dt(this, view1);
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (dt)view.getTag();
            view1 = view;
        }
        viewgroup.a((com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy)getItem(i));
        return view1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = com.google.android.apps.youtube.app.ui.PrivacySpinner.a(a).inflate(l.aO, null);
            view = new du(this, view1);
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (du)view.getTag();
            view1 = view;
        }
        viewgroup.a((com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy)getItem(i));
        return view1;
    }
}
