// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

// Referenced classes of package com.walmartlabs.ui:
//            NoDefaultSpinner

public static class add extends ArrayAdapter
{

    private String mDefaultString;
    private boolean mSelectionMade;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = (TextView)view.findViewById(0x1020014);
        if (i == 0 && !mSelectionMade)
        {
            viewgroup.setHint(mDefaultString);
            viewgroup.setText(null);
        }
        return view;
    }

    public void setSelectionMade(boolean flag)
    {
        mSelectionMade = flag;
        notifyDataSetChanged();
    }

    public (Context context, int i, int j)
    {
        this(context, context.getString(i), context.getResources().getStringArray(j));
    }

    public (Context context, String s, String as[])
    {
        super(context, com.walmart.lib.tem);
        setDropDownViewResource(0x1090009);
        mDefaultString = s;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            add(as[i]);
        }

    }
}
