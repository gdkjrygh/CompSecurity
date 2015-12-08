// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.moremenu:
//            AboutPresenter

private static class initOptions extends BasicAdapter
{

    private static final SparseArray OPTIONS;
    private final Activity mActivity;
    private final LayoutInflater mInflater;
    private SparseArray mOptions;

    private void initOptions()
    {
        mOptions = OPTIONS;
    }

    public int getItemCount()
    {
        return mOptions.size();
    }

    public long getItemId(int i)
    {
        return (long)n.access._mth600((n)mOptions.valueAt(i));
    }

    public BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new BasicViewHolder(mInflater.inflate(0x7f040020, viewgroup, false));
    }

    public void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        ViewUtil.setText(0x7f10004f, basicviewholder.itemView, n.access._mth700((n)mOptions.valueAt(i)));
    }

    static 
    {
        OPTIONS = new SparseArray();
        OPTIONS.put(1, new n(1, 0x7f09005c));
        OPTIONS.put(2, new n(2, 0x7f09005b));
    }

    public n(Activity activity)
    {
        mOptions = new SparseArray();
        mActivity = activity;
        mInflater = (LayoutInflater)mActivity.getSystemService("layout_inflater");
        initOptions();
    }
}
