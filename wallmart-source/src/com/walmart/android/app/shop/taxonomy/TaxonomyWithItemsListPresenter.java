// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            TaxonomyWithItemsListAdapter

public class TaxonomyWithItemsListPresenter extends Presenter
{

    private TaxonomyWithItemsListAdapter mAdapter;
    private Context mContext;
    private View mView;

    public TaxonomyWithItemsListPresenter(Context context)
    {
        mContext = context;
        mAdapter = new TaxonomyWithItemsListAdapter(context);
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mAdapter.shutdown();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mView == null)
        {
            mView = ViewUtil.inflate(mContext, 0x7f0401b5, viewgroup);
        }
    }

    public void setOnItemClickedListener(TaxonomyWithItemsListAdapter.OnItemClickedListener onitemclickedlistener)
    {
        mAdapter.setOnItemClickedListener(onitemclickedlistener);
    }

    public void setTaxonomy(TaxonomyItem taxonomyitem)
    {
        mAdapter.setTaxonomyItems(taxonomyitem.children);
        taxonomyitem = (ListView)ViewUtil.findViewById(mView, 0x7f1005cb);
        taxonomyitem.setAdapter(mAdapter);
        taxonomyitem.setVisibility(0);
        mView.findViewById(0x7f100545).setVisibility(8);
    }
}
