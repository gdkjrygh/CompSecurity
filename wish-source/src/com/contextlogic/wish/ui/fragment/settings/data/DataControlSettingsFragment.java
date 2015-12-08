// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.data;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.data:
//            DataControlSettingsAdapter

public class DataControlSettingsFragment extends BaseContentFragment
{

    private DataControlSettingsAdapter listAdapter;
    private ListView listView;

    public DataControlSettingsFragment()
    {
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.DataControlSettings;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03004a;
    }

    public void handleResume()
    {
        super.handleResume();
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f06010d));
        listView = (ListView)view.findViewById(0x7f0d01b0);
        view = new ArrayList();
        view.add(getString(0x7f06015e));
        listAdapter = new DataControlSettingsAdapter(getActivity(), view);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    protected void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
    }

    public boolean useCanvasBackground()
    {
        return true;
    }
}
