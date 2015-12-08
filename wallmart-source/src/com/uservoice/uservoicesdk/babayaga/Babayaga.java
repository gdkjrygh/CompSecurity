// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.babayaga;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Babayaga
{
    public static final class Event extends Enum
    {

        private static final Event $VALUES[];
        public static final Event AUTHENTICATE;
        public static final Event COMMENT_IDEA;
        public static final Event IDENTIFY;
        public static final Event SEARCH_ARTICLES;
        public static final Event SEARCH_IDEAS;
        public static final Event SUBMIT_IDEA;
        public static final Event SUBMIT_TICKET;
        public static final Event SUBSCRIBE_IDEA;
        public static final Event VIEW_APP;
        public static final Event VIEW_ARTICLE;
        public static final Event VIEW_CHANNEL;
        public static final Event VIEW_FORUM;
        public static final Event VIEW_IDEA;
        public static final Event VIEW_KB;
        public static final Event VIEW_TOPIC;
        public static final Event VOTE_ARTICLE;
        public static final Event VOTE_IDEA;
        private final String code;

        public static Event valueOf(String s)
        {
            return (Event)Enum.valueOf(com/uservoice/uservoicesdk/babayaga/Babayaga$Event, s);
        }

        public static Event[] values()
        {
            return (Event[])$VALUES.clone();
        }

        public String getCode()
        {
            return code;
        }

        static 
        {
            VIEW_APP = new Event("VIEW_APP", 0, "g");
            VIEW_FORUM = new Event("VIEW_FORUM", 1, "m");
            VIEW_TOPIC = new Event("VIEW_TOPIC", 2, "c");
            VIEW_KB = new Event("VIEW_KB", 3, "k");
            VIEW_CHANNEL = new Event("VIEW_CHANNEL", 4, "o");
            VIEW_IDEA = new Event("VIEW_IDEA", 5, "i");
            VIEW_ARTICLE = new Event("VIEW_ARTICLE", 6, "f");
            AUTHENTICATE = new Event("AUTHENTICATE", 7, "u");
            SEARCH_IDEAS = new Event("SEARCH_IDEAS", 8, "s");
            SEARCH_ARTICLES = new Event("SEARCH_ARTICLES", 9, "r");
            VOTE_IDEA = new Event("VOTE_IDEA", 10, "v");
            VOTE_ARTICLE = new Event("VOTE_ARTICLE", 11, "z");
            SUBMIT_TICKET = new Event("SUBMIT_TICKET", 12, "t");
            SUBMIT_IDEA = new Event("SUBMIT_IDEA", 13, "d");
            SUBSCRIBE_IDEA = new Event("SUBSCRIBE_IDEA", 14, "b");
            IDENTIFY = new Event("IDENTIFY", 15, "y");
            COMMENT_IDEA = new Event("COMMENT_IDEA", 16, "h");
            $VALUES = (new Event[] {
                VIEW_APP, VIEW_FORUM, VIEW_TOPIC, VIEW_KB, VIEW_CHANNEL, VIEW_IDEA, VIEW_ARTICLE, AUTHENTICATE, SEARCH_IDEAS, SEARCH_ARTICLES, 
                VOTE_IDEA, VOTE_ARTICLE, SUBMIT_TICKET, SUBMIT_IDEA, SUBSCRIBE_IDEA, IDENTIFY, COMMENT_IDEA
            });
        }

        private Event(String s, int i, String s1)
        {
            super(s, i);
            code = s1;
        }
    }

    private static class Track
    {

        public String event;
        public Map eventProps;

        public Track(String s, Map map)
        {
            event = s;
            eventProps = map;
        }
    }


    public static String CHANNEL = "d";
    static String DOMAIN = "by.uservoice.com";
    private static final boolean ENABLED = false;
    private static SharedPreferences prefs;
    private static List queue = new ArrayList();
    private static Map traits;
    private static String uvts;

    public Babayaga()
    {
    }

    public static void flush()
    {
    }

    public static String getUvts()
    {
        return uvts;
    }

    public static void init(Context context)
    {
    }

    public static void setUserTraits(Map map)
    {
        traits = map;
    }

    public static void setUvts(String s)
    {
    }

    public static void track(Event event)
    {
        track(event, ((Map) (null)));
    }

    public static void track(Event event, int i)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("id", Integer.valueOf(i));
        track(event, ((Map) (hashmap)));
    }

    public static void track(Event event, String s, List list)
    {
    }

    public static void track(Event event, Map map)
    {
        track(event.getCode(), map);
    }

    public static void track(String s, Map map)
    {
    }

}
