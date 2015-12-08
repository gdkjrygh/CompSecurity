// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.typeahead;


public class SearchSuggestions
{
    public static class Suggestion
    {

        public Department departments[];
        public String query;

        public Suggestion()
        {
        }
    }

    public static class Suggestion.Department
    {

        public int id;
        public String name;

        public Suggestion.Department()
        {
        }
    }


    public Suggestion generic[];
    public Suggestion specific[];

    public SearchSuggestions()
    {
    }
}
