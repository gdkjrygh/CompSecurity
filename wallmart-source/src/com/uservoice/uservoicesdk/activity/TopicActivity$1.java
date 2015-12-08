// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            TopicActivity

class this._cls0 extends ArrayAdapter
{

    final TopicActivity this$0;

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getDropDownView(i, view, viewgroup);
        ((TextView)view).setTextColor(-1);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        ((TextView)view).setTextColor(-1);
        return view;
    }

    _cls9(Context context, int i, List list)
    {
        this$0 = TopicActivity.this;
        super(context, i, list);
    }
}
