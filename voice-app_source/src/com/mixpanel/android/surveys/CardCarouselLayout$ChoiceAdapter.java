// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout

private static class mInflater
    implements ListAdapter
{

    private static final int VIEW_TYPE_FIRST = 0;
    private static final int VIEW_TYPE_LAST = 1;
    private static final int VIEW_TYPE_MAX = 3;
    private static final int VIEW_TYPE_MIDDLE = 2;
    private final List mChoices;
    private final LayoutInflater mInflater;

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        return mChoices.size();
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return (String)mChoices.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (i == 0)
        {
            return 0;
        }
        return i != mChoices.size() - 1 ? 2 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        int j;
        j = -1;
        view1 = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        getItemViewType(i);
        JVM INSTR tableswitch 0 2: default 40
    //                   0 83
    //                   1 91
    //                   2 99;
           goto _L3 _L4 _L5 _L6
_L3:
        view1 = mInflater.inflate(j, viewgroup, false);
_L2:
        ((TextView)view1.findViewById(com.mixpanel.android.e_choice_answer_text)).setText((String)mChoices.get(i));
        return view1;
_L4:
        j = com.mixpanel.android.st_choice_answer;
        continue; /* Loop/switch isn't completed */
_L5:
        j = com.mixpanel.android.t_choice_answer;
        continue; /* Loop/switch isn't completed */
_L6:
        j = com.mixpanel.android.dle_choice_answer;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return mChoices.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public (List list, LayoutInflater layoutinflater)
    {
        mChoices = list;
        mInflater = layoutinflater;
    }
}
