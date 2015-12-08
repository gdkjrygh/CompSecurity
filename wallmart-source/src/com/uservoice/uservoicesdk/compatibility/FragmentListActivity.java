// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.compatibility;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.activity.BaseActivity;
import com.uservoice.uservoicesdk.integration.IntegrationProvider;

public abstract class FragmentListActivity extends BaseActivity
{

    private ListAdapter mAdapter;
    private boolean mFinishedStart;
    private Handler mHandler;
    private ListView mList;
    private android.widget.AdapterView.OnItemClickListener mOnClickListener;
    private Runnable mRequestFocus;

    public FragmentListActivity()
    {
        mHandler = new Handler();
        mFinishedStart = false;
        mRequestFocus = new Runnable() {

            final FragmentListActivity this$0;

            public void run()
            {
                mList.focusableViewAvailable(mList);
            }

            
            {
                this$0 = FragmentListActivity.this;
                super();
            }
        };
        mOnClickListener = new android.widget.AdapterView.OnItemClickListener() {

            final FragmentListActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                onListItemClick((ListView)adapterview, view, i, l);
            }

            
            {
                this$0 = FragmentListActivity.this;
                super();
            }
        };
    }

    private void ensureList()
    {
        if (mList != null)
        {
            return;
        }
        IntegrationProvider integrationprovider = Session.getInstance().getConfig().getProvider();
        if (integrationprovider != null)
        {
            android.view.ViewGroup viewgroup = integrationprovider.initAndGetViewLayout(this);
            ListView listview = (ListView)((LayoutInflater)getSystemService("layout_inflater")).inflate(com.uservoice.uservoicesdk.R.layout.uv_list_content, viewgroup).findViewById(0x102000a);
            if (listview != null)
            {
                listview.setSelector(integrationprovider.getListSelector());
            }
            setContentView(viewgroup);
        } else
        {
            setContentView(com.uservoice.uservoicesdk.R.layout.uv_list_content);
        }
        initList();
    }

    private void initList()
    {
        View view = findViewById(0x1020004);
        mList = (ListView)findViewById(0x102000a);
        if (mList == null)
        {
            return;
        }
        if (view != null)
        {
            mList.setEmptyView(view);
        }
        mList.setOnItemClickListener(mOnClickListener);
        if (mFinishedStart)
        {
            setListAdapter(mAdapter);
        }
        mHandler.post(mRequestFocus);
        mFinishedStart = true;
    }

    public ListAdapter getListAdapter()
    {
        return mAdapter;
    }

    public ListView getListView()
    {
        ensureList();
        return mList;
    }

    public long getSelectedItemId()
    {
        return mList.getSelectedItemId();
    }

    public int getSelectedItemPosition()
    {
        return mList.getSelectedItemPosition();
    }

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        ensureList();
        super.onRestoreInstanceState(bundle);
    }

    public void setListAdapter(ListAdapter listadapter)
    {
        this;
        JVM INSTR monitorenter ;
        ensureList();
        mAdapter = listadapter;
        mList.setAdapter(listadapter);
        this;
        JVM INSTR monitorexit ;
        return;
        listadapter;
        this;
        JVM INSTR monitorexit ;
        throw listadapter;
    }

    public void setSelection(int i)
    {
        mList.setSelection(i);
    }

}
