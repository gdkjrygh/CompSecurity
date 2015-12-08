// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.walmart.android.app.shop.search.ShopRecentSearchDB;
import com.walmart.android.app.shop.search.ShopSearchData;
import com.walmart.android.app.shop.search.ShopSearchSuggestionProvider;
import com.walmart.android.util.ScannerUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class SearchContentProvider extends ContentProvider
{
    private static class AppSection
    {

        int index;
        String intentData;
        int intentExtra;
        String resourceName;
        String sectionName;

        public AppSection(int i, String s, String s1, String s2, int j)
        {
            index = i;
            resourceName = s;
            sectionName = s1;
            intentData = s2;
            intentExtra = j;
        }
    }

    public static class AppSectionCursor extends MatrixCursor
    {

        public AppSectionCursor(String s)
        {
            super(SearchContentProvider.sColumns);
            Iterator iterator = SearchContentProvider.sAppSections.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AppSection appsection = (AppSection)iterator.next();
                if (appsection.sectionName.toLowerCase(Locale.US).startsWith(s.toLowerCase(Locale.US)))
                {
                    addRow(new Object[] {
                        Integer.valueOf(appsection.index), appsection.resourceName, SearchContentProvider.NO_ICON, appsection.intentData, Integer.valueOf(appsection.intentExtra), null, appsection.sectionName, null
                    });
                }
            } while (true);
        }
    }

    public static class BarcodeSuggestionCursor extends MatrixCursor
    {

        public BarcodeSuggestionCursor(Context context)
        {
            super(SearchContentProvider.sColumns, 1);
            if (ScannerUtil.scannerAvailable(context))
            {
                addRow(new Object[] {
                    Integer.valueOf(0), String.valueOf(0x7f0202c5), null, "scanner", null, null, context.getString(0x7f090544), ""
                });
            }
        }
    }

    public static class RecentSearchCursor extends CursorWrapper
    {

        private static final String recentSearchId = String.valueOf(0x7f020299);
        private static final String refinementId = String.valueOf(0x7f0202bc);
        private static int sIconIndex;
        private static int sQueryIndex;
        private static int sRefinementIndex;

        public int getColumnCount()
        {
            return super.getColumnCount() + 3;
        }

        public int getColumnIndex(String s)
        {
            if ("suggest_icon_1".equals(s))
            {
                return sIconIndex;
            }
            if ("suggest_icon_2".equals(s))
            {
                return sRefinementIndex;
            }
            if ("suggest_intent_query".equals(s))
            {
                return sQueryIndex;
            } else
            {
                return super.getColumnIndex(s);
            }
        }

        public String getColumnName(int i)
        {
            if (sIconIndex == i)
            {
                return "suggest_icon_1";
            }
            if (sRefinementIndex == i)
            {
                return "suggest_icon_2";
            }
            if (sQueryIndex == i)
            {
                return "suggest_intent_query";
            } else
            {
                return super.getColumnName(i);
            }
        }

        public String[] getColumnNames()
        {
            String as[] = super.getColumnNames();
            int i = as.length;
            String as1[] = new String[i + 3];
            System.arraycopy(as, 0, as1, 0, i);
            as1[i] = "suggest_icon_1";
            as1[i + 1] = "suggest_icon_2";
            as1[i + 2] = "suggest_intent_query";
            return as1;
        }

        public String getString(int i)
        {
            if (sIconIndex == i)
            {
                return recentSearchId;
            }
            if (sRefinementIndex == i)
            {
                return refinementId;
            }
            if (sQueryIndex == i)
            {
                return super.getString(getColumnIndex("suggest_text_1"));
            }
            if (getColumnIndex("suggest_intent_extra_data") == i)
            {
                return String.valueOf(com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_RECENT);
            } else
            {
                return super.getString(i);
            }
        }


        public RecentSearchCursor(Cursor cursor)
        {
            super(cursor);
            sIconIndex = super.getColumnNames().length;
            sRefinementIndex = sIconIndex + 1;
            sQueryIndex = sRefinementIndex + 1;
        }
    }

    public static class SuggestionsCursor extends MatrixCursor
    {

        public SuggestionsCursor(List list)
        {
            super(SearchContentProvider.sColumns, list.size());
            for (int i = 0; i < list.size(); i++)
            {
                addRow(new Object[] {
                    Integer.valueOf(i), SearchContentProvider.NO_ICON, String.valueOf(0x7f0202bc), null, String.valueOf(com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_SUGGESTION), ((ShopSearchData)list.get(i)).getSearchText(), ((ShopSearchData)list.get(i)).getSearchText(), ((ShopSearchData)list.get(i)).getDepartment()
                });
            }

        }
    }


    public static final Uri CONTENT_URI = (new android.net.Uri.Builder()).scheme("content").authority("com.walmart.search").appendPath("search_suggest_query").build();
    private static final String NO_ICON = String.valueOf(0x7f0f0119);
    private static final int RECENT = 1;
    private static final int SEARCH = 2;
    private static final List sAppSections = new ArrayList();
    private static final String sColumns[] = {
        "_id", "suggest_icon_1", "suggest_icon_2", "suggest_intent_data", "suggest_intent_extra_data", "suggest_intent_query", "suggest_text_1", "suggest_text_2"
    };
    private static final UriMatcher sURIMatcher;
    private ShopRecentSearchDB mRecentSearchDB;
    private ShopSearchSuggestionProvider mSuggestionProvider;

    public SearchContentProvider()
    {
    }

    private void populateAppSections()
    {
        if (sAppSections.isEmpty())
        {
            Resources resources = getContext().getResources();
            sAppSections.add(new AppSection(0, resources.getResourceEntryName(0x7f0202c7), resources.getString(0x7f09027a), "reroute", 1));
            sAppSections.add(new AppSection(1, resources.getResourceEntryName(0x7f0202cb), resources.getString(0x7f09027d), "reroute", 2));
            sAppSections.add(new AppSection(2, resources.getResourceEntryName(0x7f0202c9), resources.getString(0x7f09027b), "reroute", 3));
            sAppSections.add(new AppSection(3, resources.getResourceEntryName(0x7f0202ca), resources.getString(0x7f09027c), "reroute", 4));
            sAppSections.add(new AppSection(4, resources.getResourceEntryName(0x7f0202c0), resources.getString(0x7f09026b), "reroute", 5));
            sAppSections.add(new AppSection(5, resources.getResourceEntryName(0x7f0202c1), resources.getString(0x7f090273), "reroute", 6));
            sAppSections.add(new AppSection(6, resources.getResourceEntryName(0x7f0202c2), resources.getString(0x7f090275), "reroute", 7));
            sAppSections.add(new AppSection(7, resources.getResourceEntryName(0x7f0202c4), resources.getString(0x7f090277), "reroute", 9));
        }
    }

    public int delete(Uri uri, String s, String as[])
    {
        if (mRecentSearchDB != null)
        {
            return mRecentSearchDB.delete(s, as);
        } else
        {
            return 0;
        }
    }

    public String getType(Uri uri)
    {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        if (mRecentSearchDB != null)
        {
            mRecentSearchDB.addSearch(contentvalues);
        }
        return null;
    }

    public boolean onCreate()
    {
        populateAppSections();
        mRecentSearchDB = new ShopRecentSearchDB(getContext());
        mSuggestionProvider = new ShopSearchSuggestionProvider();
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        if (as1 != null && as1[0] != null)
        {
            uri = as1[0];
        } else
        {
            uri = "";
        }
        if (TextUtils.isEmpty(uri))
        {
            return new MergeCursor(new Cursor[] {
                new BarcodeSuggestionCursor(getContext()), new RecentSearchCursor(mRecentSearchDB.query(null))
            });
        } else
        {
            return new MergeCursor(new Cursor[] {
                new AppSectionCursor(uri), new RecentSearchCursor(mRecentSearchDB.query(uri)), new SuggestionsCursor(mSuggestionProvider.getSuggestions(uri))
            });
        }
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }

    static 
    {
        sURIMatcher = new UriMatcher(-1);
        sURIMatcher.addURI("com.walmart.search", "search_suggest_query", 1);
        sURIMatcher.addURI("com.walmart.search", "search_suggest_query/*", 2);
    }



}
