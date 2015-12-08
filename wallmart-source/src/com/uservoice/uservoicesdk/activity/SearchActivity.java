// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import com.uservoice.uservoicesdk.ui.SearchAdapter;

public interface SearchActivity
{

    public abstract SearchAdapter getSearchAdapter();

    public abstract void hideSearch();

    public abstract void showSearch();

    public abstract void updateScopedSearch(int i, int j, int k);
}
