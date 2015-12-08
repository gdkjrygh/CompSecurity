// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.walmart.android.service.MockManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.test:
//            MockMethodListPresenter

public class MockServiceListPresenter extends Presenter
{
    public static class StringListAdapter extends BaseAdapter
    {

        private Context mContext;
        private ArrayList mServiceNames;

        public int getCount()
        {
            return mServiceNames.size();
        }

        public Object getItem(int i)
        {
            return null;
        }

        public long getItemId(int i)
        {
            return 0L;
        }

        public String getString(int i)
        {
            return (String)mServiceNames.get(i);
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = LayoutInflater.from(mContext).inflate(com.walmart.lib.R.layout.mock_list_entry, null);
            }
            ViewUtil.setText(com.walmart.lib.R.id.mock_entry_text, viewgroup, (CharSequence)mServiceNames.get(i));
            return viewgroup;
        }

        public StringListAdapter(Context context, ArrayList arraylist)
        {
            mContext = context;
            mServiceNames = arraylist;
        }
    }


    private View mContainer;
    private Context mContext;

    public MockServiceListPresenter(final Context mockServiceListAdapter)
    {
        mContext = mockServiceListAdapter;
        mContainer = LayoutInflater.from(mockServiceListAdapter).inflate(com.walmart.lib.R.layout.mock_list_layout, null);
        ListView listview = (ListView)mContainer.findViewById(com.walmart.lib.R.id.mock_list_view);
        mockServiceListAdapter = MockManager.getInstance(mockServiceListAdapter).getAvailableServiceNames();
        mockServiceListAdapter = new StringListAdapter(mContext, mockServiceListAdapter);
        listview.setAdapter(mockServiceListAdapter);
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MockServiceListPresenter this$0;
            final StringListAdapter val$mockServiceListAdapter;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = mockServiceListAdapter.getString(i);
                adapterview = new MockMethodListPresenter(mContext, adapterview);
                pushPresenter(adapterview);
            }

            
            {
                this$0 = MockServiceListPresenter.this;
                mockServiceListAdapter = stringlistadapter;
                super();
            }
        });
    }

    public String getTitleText()
    {
        return "Services";
    }

    public View getView()
    {
        return mContainer;
    }


}
