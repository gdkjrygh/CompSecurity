// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messenger;

import java.util.List;

public class MessengerThreadParams
{
    public static final class Origin extends Enum
    {

        public static final Origin COMPOSE_FLOW;
        private static final Origin ENUM$VALUES[];
        public static final Origin REPLY_FLOW;
        public static final Origin UNKNOWN;

        public static Origin valueOf(String s)
        {
            return (Origin)Enum.valueOf(com/facebook/messenger/MessengerThreadParams$Origin, s);
        }

        public static Origin[] values()
        {
            Origin aorigin[] = ENUM$VALUES;
            int i = aorigin.length;
            Origin aorigin1[] = new Origin[i];
            System.arraycopy(aorigin, 0, aorigin1, 0, i);
            return aorigin1;
        }

        static 
        {
            REPLY_FLOW = new Origin("REPLY_FLOW", 0);
            COMPOSE_FLOW = new Origin("COMPOSE_FLOW", 1);
            UNKNOWN = new Origin("UNKNOWN", 2);
            ENUM$VALUES = (new Origin[] {
                REPLY_FLOW, COMPOSE_FLOW, UNKNOWN
            });
        }

        private Origin(String s, int i)
        {
            super(s, i);
        }
    }


    public final String metadata;
    public final Origin origin;
    public final List participants;
    public final String threadToken;

    public MessengerThreadParams(Origin origin1, String s, String s1, List list)
    {
        threadToken = s;
        metadata = s1;
        participants = list;
        origin = origin1;
    }
}
