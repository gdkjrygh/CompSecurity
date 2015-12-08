// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.arubanetworks.meridian.editor.EditorKey;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.arubanetworks.meridian.search:
//            LocalSearchResult, SearchFragment

public class SearchActivity extends FragmentActivity
    implements SearchFragment.OnSearchResultSelectedListener
{

    public SearchActivity()
    {
    }

    public static Intent createIntent(Context context, EditorKey editorkey)
    {
        return createIntent(context, editorkey, null);
    }

    public static Intent createIntent(Context context, EditorKey editorkey, List list)
    {
        context = new Intent(context, com/arubanetworks/meridian/search/SearchActivity);
        context.putExtra("meridian.SearchActivityAppKey", editorkey);
        if (list != null && list.size() > 0)
        {
            context.putExtra("meridian.SearchActivityExclusionList", new ArrayList(list));
        }
        return context;
    }

    public static LocalSearchResult getSearchResult(Intent intent)
    {
        return (LocalSearchResult)intent.getSerializableExtra("meridian.SearchResultKey");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            bundle = SearchFragment.newInstance((EditorKey)getIntent().getExtras().getSerializable("meridian.SearchActivityAppKey"), (List)getIntent().getExtras().getSerializable("meridian.SearchActivityExclusionList"));
            getSupportFragmentManager().beginTransaction().add(0x1020002, bundle).commit();
        }
    }

    public void onSearchCanceled()
    {
        setResult(0);
        finish();
    }

    public void onSearchResultSelected(LocalSearchResult localsearchresult)
    {
        Intent intent = getIntent();
        intent.putExtra("meridian.SearchResultKey", localsearchresult);
        setResult(-1, intent);
        finish();
    }
}
