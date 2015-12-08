// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.test;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.walmart.android.service.MockManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.CollectionUtils;
import java.util.ArrayList;

public class MockMethodListPresenter extends Presenter
{

    private static final String standardMockOptions[] = {
        "(disabled)"
    };
    private View mContainer;
    private Context mContext;
    private String mServiceName;

    public MockMethodListPresenter(final Context mockMethodListAdapter, String s)
    {
        mContext = mockMethodListAdapter;
        mContainer = LayoutInflater.from(mockMethodListAdapter).inflate(com.walmart.lib.R.layout.mock_list_layout, null);
        mServiceName = s;
        s = (ListView)mContainer.findViewById(com.walmart.lib.R.id.mock_list_view);
        mockMethodListAdapter = MockManager.getInstance(mockMethodListAdapter).getAvailableMethodNames(mServiceName);
        mockMethodListAdapter = new MockServiceListPresenter.StringListAdapter(mContext, mockMethodListAdapter);
        s.setAdapter(mockMethodListAdapter);
        s.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MockMethodListPresenter this$0;
            final MockServiceListPresenter.StringListAdapter val$mockMethodListAdapter;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = mockMethodListAdapter.getString(i);
                buildMockResponseOptions(mContext, adapterview).show();
            }

            
            {
                this$0 = MockMethodListPresenter.this;
                mockMethodListAdapter = stringlistadapter;
                super();
            }
        });
    }

    private int getSelectedIndex(ArrayList arraylist, final String selectedResponseName)
    {
        int i = -1;
        selectedResponseName = MockManager.getInstance(mContext).getMockResponseName(mServiceName, selectedResponseName);
        if (selectedResponseName != null)
        {
            i = CollectionUtils.indexOf(arraylist, new com.walmart.android.utils.CollectionUtils.UnaryPredicate() {

                final MockMethodListPresenter this$0;
                final String val$selectedResponseName;

                public volatile boolean isTrue(Object obj)
                {
                    return isTrue((String)obj);
                }

                public boolean isTrue(String s)
                {
                    return s.equals(selectedResponseName);
                }

            
            {
                this$0 = MockMethodListPresenter.this;
                selectedResponseName = s;
                super();
            }
            });
        }
        return i;
    }

    public Dialog buildMockResponseOptions(Context context, final String method)
    {
        final ArrayList mockResponseNameList = MockManager.getInstance(mContext).getAvailableMockResponseNames(mServiceName, method);
        final int offset = standardMockOptions.length;
        String as[] = new String[mockResponseNameList.size() + offset];
        for (int i = 0; i < standardMockOptions.length; i++)
        {
            as[i] = standardMockOptions[i];
        }

        String as1[] = new String[mockResponseNameList.size()];
        for (int j = 0; j < as1.length; j++)
        {
            as1[j] = (String)mockResponseNameList.get(j);
        }

        for (int k = offset; k < as.length; k++)
        {
            as[k] = as1[k - offset];
        }

        int l = getSelectedIndex(mockResponseNameList, method);
        if (l == -1)
        {
            l = 0;
        } else
        {
            l += offset;
        }
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle("Select Response");
        context.setSingleChoiceItems(as, l, new android.content.DialogInterface.OnClickListener() {

            final MockMethodListPresenter this$0;
            final String val$method;
            final ArrayList val$mockResponseNameList;
            final int val$offset;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface.dismiss();
                if (i1 < MockMethodListPresenter.standardMockOptions.length)
                {
                    if (i1 == 0)
                    {
                        MockManager.getInstance(mContext).clearMockResponse(mServiceName, method);
                    }
                    return;
                } else
                {
                    dialoginterface = (String)mockResponseNameList.get(i1 - offset);
                    MockManager.getInstance(mContext).enableMockResponse(mServiceName, method, dialoginterface);
                    return;
                }
            }

            
            {
                this$0 = MockMethodListPresenter.this;
                method = s;
                mockResponseNameList = arraylist;
                offset = i;
                super();
            }
        });
        return context.create();
    }

    public String getTitleText()
    {
        return (new StringBuilder()).append("Methods for: ").append(mServiceName).toString();
    }

    public View getView()
    {
        return mContainer;
    }




}
