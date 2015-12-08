// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushMessage

class RichPushMessageCache
{

    private final Map readMessages = new ConcurrentHashMap();
    private final Map unreadMessages = new ConcurrentHashMap();

    RichPushMessageCache()
    {
    }

    void addMessage(RichPushMessage richpushmessage)
    {
        removeMessage(richpushmessage);
        if (richpushmessage.isRead())
        {
            readMessages.put(richpushmessage.getMessageId(), richpushmessage);
            return;
        } else
        {
            unreadMessages.put(richpushmessage.getMessageId(), richpushmessage);
            return;
        }
    }

    RichPushMessage getMessage(String s)
    {
        if (unreadMessages.containsKey(s))
        {
            return (RichPushMessage)unreadMessages.get(s);
        } else
        {
            return (RichPushMessage)readMessages.get(s);
        }
    }

    int getMessageCount()
    {
        return getUnreadMessageCount() + getReadMessageCount();
    }

    Set getMessageIds()
    {
        HashSet hashset = new HashSet(getMessageCount());
        hashset.addAll(readMessages.keySet());
        hashset.addAll(unreadMessages.keySet());
        return hashset;
    }

    List getMessages()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(unreadMessages.values());
        arraylist.addAll(readMessages.values());
        return arraylist;
    }

    int getReadMessageCount()
    {
        return readMessages.size();
    }

    List getReadMessages()
    {
        return new ArrayList(readMessages.values());
    }

    int getUnreadMessageCount()
    {
        return unreadMessages.size();
    }

    List getUnreadMessages()
    {
        return new ArrayList(unreadMessages.values());
    }

    void removeMessage(RichPushMessage richpushmessage)
    {
        readMessages.remove(richpushmessage.getMessageId());
        unreadMessages.remove(richpushmessage.getMessageId());
    }
}
