// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SearchViewCompatHoneycomb

class _cls1 extends _cls1
{

    public CharSequence getQuery(View view)
    {
        return SearchViewCompatHoneycomb.getQuery(view);
    }

    public boolean isIconified(View view)
    {
        return SearchViewCompatHoneycomb.isIconified(view);
    }

    public boolean isQueryRefinementEnabled(View view)
    {
        return SearchViewCompatHoneycomb.isQueryRefinementEnabled(view);
    }

    public boolean isSubmitButtonEnabled(View view)
    {
        return SearchViewCompatHoneycomb.isSubmitButtonEnabled(view);
    }

    public Object newOnCloseListener(final  listener)
    {
        class _cls2
            implements SearchViewCompatHoneycomb.OnCloseListenerCompatBridge
        {

            final SearchViewCompat.SearchViewCompatHoneycombImpl this$0;
            final SearchViewCompat.OnCloseListenerCompat val$listener;

            public boolean onClose()
            {
                return listener.onClose();
            }

            _cls2()
            {
                this$0 = SearchViewCompat.SearchViewCompatHoneycombImpl.this;
                listener = oncloselistenercompat;
                super();
            }
        }

        return SearchViewCompatHoneycomb.newOnCloseListener(new _cls2());
    }

    public Object newOnQueryTextListener(final _cls2 listener)
    {
        class _cls1
            implements SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge
        {

            final SearchViewCompat.SearchViewCompatHoneycombImpl this$0;
            final SearchViewCompat.OnQueryTextListenerCompat val$listener;

            public boolean onQueryTextChange(String s)
            {
                return listener.onQueryTextChange(s);
            }

            public boolean onQueryTextSubmit(String s)
            {
                return listener.onQueryTextSubmit(s);
            }

            _cls1()
            {
                this$0 = SearchViewCompat.SearchViewCompatHoneycombImpl.this;
                listener = onquerytextlistenercompat;
                super();
            }
        }

        return SearchViewCompatHoneycomb.newOnQueryTextListener(new _cls1());
    }

    public View newSearchView(Context context)
    {
        return SearchViewCompatHoneycomb.newSearchView(context);
    }

    public void setIconified(View view, boolean flag)
    {
        SearchViewCompatHoneycomb.setIconified(view, flag);
    }

    public void setMaxWidth(View view, int i)
    {
        SearchViewCompatHoneycomb.setMaxWidth(view, i);
    }

    public void setOnCloseListener(Object obj, Object obj1)
    {
        SearchViewCompatHoneycomb.setOnCloseListener(obj, obj1);
    }

    public void setOnQueryTextListener(Object obj, Object obj1)
    {
        SearchViewCompatHoneycomb.setOnQueryTextListener(obj, obj1);
    }

    public void setQuery(View view, CharSequence charsequence, boolean flag)
    {
        SearchViewCompatHoneycomb.setQuery(view, charsequence, flag);
    }

    public void setQueryHint(View view, CharSequence charsequence)
    {
        SearchViewCompatHoneycomb.setQueryHint(view, charsequence);
    }

    public void setQueryRefinementEnabled(View view, boolean flag)
    {
        SearchViewCompatHoneycomb.setQueryRefinementEnabled(view, flag);
    }

    public void setSearchableInfo(View view, ComponentName componentname)
    {
        SearchViewCompatHoneycomb.setSearchableInfo(view, componentname);
    }

    public void setSubmitButtonEnabled(View view, boolean flag)
    {
        SearchViewCompatHoneycomb.setSubmitButtonEnabled(view, flag);
    }

    _cls1()
    {
    }
}
