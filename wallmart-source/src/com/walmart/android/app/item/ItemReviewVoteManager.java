// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import java.util.HashMap;

public class ItemReviewVoteManager
{
    public static final class Vote extends Enum
    {

        private static final Vote $VALUES[];
        public static final Vote HELPFUL;
        public static final Vote NOT_HELPFUL;

        public static Vote valueOf(String s)
        {
            return (Vote)Enum.valueOf(com/walmart/android/app/item/ItemReviewVoteManager$Vote, s);
        }

        public static Vote[] values()
        {
            return (Vote[])$VALUES.clone();
        }

        static 
        {
            HELPFUL = new Vote("HELPFUL", 0);
            NOT_HELPFUL = new Vote("NOT_HELPFUL", 1);
            $VALUES = (new Vote[] {
                HELPFUL, NOT_HELPFUL
            });
        }

        private Vote(String s, int i)
        {
            super(s, i);
        }
    }


    private static ItemReviewVoteManager sInstance;
    private HashMap mVotes;

    private ItemReviewVoteManager()
    {
        mVotes = new HashMap();
    }

    public static ItemReviewVoteManager getInstance()
    {
        if (sInstance == null)
        {
            sInstance = new ItemReviewVoteManager();
            MessageBus.getBus().register(sInstance);
        }
        return sInstance;
    }

    public Vote getVote(String s)
    {
        return (Vote)mVotes.get(s);
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        mVotes.clear();
    }

    public void undoVote(String s)
    {
        mVotes.remove(s);
    }

    public void vote(String s, Vote vote1)
    {
        mVotes.put(s, vote1);
    }
}
