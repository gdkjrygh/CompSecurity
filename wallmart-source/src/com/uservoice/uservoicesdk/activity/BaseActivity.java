// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ViewFlipper;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.UserVoice;
import com.uservoice.uservoicesdk.ui.MixedSearchAdapter;
import com.uservoice.uservoicesdk.ui.PortalAdapter;
import com.uservoice.uservoicesdk.ui.SearchAdapter;
import com.uservoice.uservoicesdk.ui.SearchExpandListener;
import com.uservoice.uservoicesdk.ui.SearchQueryListener;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            SearchActivity

public class BaseActivity extends AppCompatActivity
{

    private static final String CONFIG_KEY = "config_key";
    protected android.support.v7.app.ActionBar.Tab allTab;
    protected android.support.v7.app.ActionBar.Tab articlesTab;
    protected android.support.v7.app.ActionBar.Tab ideasTab;
    private int originalNavigationMode;
    protected MixedSearchAdapter searchAdapter;

    public BaseActivity()
    {
        originalNavigationMode = -1;
    }

    public SearchAdapter getSearchAdapter()
    {
        return searchAdapter;
    }

    public boolean hasActionBar()
    {
        return getSupportActionBar() != null;
    }

    public void hideSearch()
    {
        int i = 0;
        ((ViewFlipper)findViewById(com.uservoice.uservoicesdk.R.id.uv_view_flipper)).setDisplayedChild(0);
        if (hasActionBar())
        {
            ActionBar actionbar = getSupportActionBar();
            if (originalNavigationMode != -1)
            {
                i = originalNavigationMode;
            }
            actionbar.setNavigationMode(i);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        if (bundle != null && Session.getInstance().getConfig() == null)
        {
            bundle = (Config)bundle.getParcelable("config_key");
            if (bundle != null)
            {
                UserVoice.init(bundle, getApplicationContext());
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Config config = Session.getInstance().getConfig();
        if (config != null)
        {
            bundle.putParcelable("config_key", config);
        }
    }

    public void setTitle(int i)
    {
        super.setTitle(i);
        getSupportActionBar().setTitle(i);
    }

    protected void setupScopedSearch(Menu menu)
    {
        if (hasActionBar())
        {
            menu.findItem(com.uservoice.uservoicesdk.R.id.uv_action_search).setOnActionExpandListener(new SearchExpandListener((SearchActivity)this));
            ((SearchView)menu.findItem(com.uservoice.uservoicesdk.R.id.uv_action_search).getActionView()).setOnQueryTextListener(new SearchQueryListener((SearchActivity)this));
            searchAdapter = new MixedSearchAdapter(this);
            menu = new ListView(this);
            menu.setAdapter(searchAdapter);
            menu.setOnItemClickListener(searchAdapter);
            ((ViewFlipper)findViewById(com.uservoice.uservoicesdk.R.id.uv_view_flipper)).addView(menu, 1);
            menu = new android.support.v7.app.ActionBar.TabListener() {

                final BaseActivity this$0;

                public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
                {
                }

                public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
                {
                    searchAdapter.setScope(((Integer)tab.getTag()).intValue());
                }

                public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
                {
                }

            
            {
                this$0 = BaseActivity.this;
                super();
            }
            };
            allTab = getSupportActionBar().newTab().setText(getString(com.uservoice.uservoicesdk.R.string.uv_all_results_filter)).setTabListener(menu).setTag(Integer.valueOf(PortalAdapter.SCOPE_ALL));
            getSupportActionBar().addTab(allTab);
            articlesTab = getSupportActionBar().newTab().setText(getString(com.uservoice.uservoicesdk.R.string.uv_articles_filter)).setTabListener(menu).setTag(Integer.valueOf(PortalAdapter.SCOPE_ARTICLES));
            getSupportActionBar().addTab(articlesTab);
            ideasTab = getSupportActionBar().newTab().setText(getString(com.uservoice.uservoicesdk.R.string.uv_ideas_filter)).setTabListener(menu).setTag(Integer.valueOf(PortalAdapter.SCOPE_IDEAS));
            getSupportActionBar().addTab(ideasTab);
            return;
        } else
        {
            menu.findItem(com.uservoice.uservoicesdk.R.id.uv_action_search).setVisible(false);
            return;
        }
    }

    public void showSearch()
    {
        ((ViewFlipper)findViewById(com.uservoice.uservoicesdk.R.id.uv_view_flipper)).setDisplayedChild(1);
        if (hasActionBar())
        {
            if (originalNavigationMode == -1)
            {
                originalNavigationMode = getSupportActionBar().getNavigationMode();
            }
            getSupportActionBar().setNavigationMode(2);
        }
    }

    public void updateScopedSearch(int i, int j, int k)
    {
        if (hasActionBar())
        {
            allTab.setText(String.format("%s (%d)", new Object[] {
                getString(com.uservoice.uservoicesdk.R.string.uv_all_results_filter), Integer.valueOf(i)
            }));
            articlesTab.setText(String.format("%s (%d)", new Object[] {
                getString(com.uservoice.uservoicesdk.R.string.uv_articles_filter), Integer.valueOf(j)
            }));
            ideasTab.setText(String.format("%s (%d)", new Object[] {
                getString(com.uservoice.uservoicesdk.R.string.uv_ideas_filter), Integer.valueOf(k)
            }));
        }
    }
}
