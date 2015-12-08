// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.search;

import com.google.android.apps.youtube.common.L;
import com.google.android.youtube.p;

public final class SearchType extends Enum
{

    private static final SearchType $VALUES[];
    public static final SearchType CHANNEL;
    public static final String CHANNEL_SEARCH_MODIFIER = "is:channel";
    public static final SearchType DEFAULT_SEARCH_TYPE;
    public static final SearchType PLAYLISTS;
    public static final String PLAYLISTS_SEARCH_MODIFIER = "is:playlists";
    public static final SearchType VIDEO;
    private final int descriptionId;

    private SearchType(String s, int i, int j)
    {
        super(s, i);
        descriptionId = j;
    }

    public static SearchType fromQuery(String s)
    {
        if (s != null)
        {
            if (s.contains("is:channel"))
            {
                return CHANNEL;
            }
            if (s.contains("is:playlists"))
            {
                return PLAYLISTS;
            }
        }
        return DEFAULT_SEARCH_TYPE;
    }

    public static SearchType fromString(String s)
    {
        if (s == null)
        {
            return DEFAULT_SEARCH_TYPE;
        }
        SearchType searchtype;
        try
        {
            searchtype = valueOf(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            L.e((new StringBuilder("Attempted to search with unsupported SEARCH_TYPE: ")).append(s).toString());
            return DEFAULT_SEARCH_TYPE;
        }
        return searchtype;
    }

    public static String removeModifiersFromQuery(String s)
    {
        return s.replace("is:channel", "").replace("is:playlists", "").trim();
    }

    public static SearchType valueOf(String s)
    {
        return (SearchType)Enum.valueOf(com/google/android/apps/youtube/app/search/SearchType, s);
    }

    public static SearchType[] values()
    {
        return (SearchType[])$VALUES.clone();
    }

    public final int getDescriptionStringResourceId()
    {
        return descriptionId;
    }

    static 
    {
        VIDEO = new SearchType("VIDEO", 0, p.hf);
        CHANNEL = new SearchType("CHANNEL", 1, p.ak);
        PLAYLISTS = new SearchType("PLAYLISTS", 2, p.dQ);
        $VALUES = (new SearchType[] {
            VIDEO, CHANNEL, PLAYLISTS
        });
        DEFAULT_SEARCH_TYPE = VIDEO;
    }
}
