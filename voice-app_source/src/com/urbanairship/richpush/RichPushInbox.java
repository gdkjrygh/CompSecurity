// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushMessageCache, RichPushMessage, RichPushManager, RichPushResolver

public class RichPushInbox
{
    public static interface Listener
    {

        public abstract void onUpdateInbox();
    }

    static class SentAtRichPushMessageComparator
        implements Comparator
    {

        public int compare(RichPushMessage richpushmessage, RichPushMessage richpushmessage1)
        {
            return richpushmessage1.getSentDate().compareTo(richpushmessage.getSentDate());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((RichPushMessage)obj, (RichPushMessage)obj1);
        }

        SentAtRichPushMessageComparator()
        {
        }
    }


    private static RichPushInbox instance;
    private static final SentAtRichPushMessageComparator richPushMessageComparator = new SentAtRichPushMessageComparator();
    ExecutorService executor;
    private List listeners;
    private RichPushMessageCache messageCache;
    private final List pendingDeletionMessageIds = new ArrayList();

    RichPushInbox()
    {
        listeners = new ArrayList();
        messageCache = new RichPushMessageCache();
        executor = Executors.newSingleThreadExecutor();
        updateCacheFromDB();
    }

    private RichPushMessage messageFromCursor(Cursor cursor)
    {
        try
        {
            cursor = RichPushMessage.messageFromCursor(cursor);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Logger.error(cursor);
            return null;
        }
        return cursor;
    }

    private void notifyListeners()
    {
        (new Handler(UAirship.shared().getApplicationContext().getMainLooper())).post(new Runnable() {

            final RichPushInbox this$0;

            public void run()
            {
                List list = listeners;
                list;
                JVM INSTR monitorenter ;
                for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onUpdateInbox()) { }
                break MISSING_BLOCK_LABEL_54;
                Exception exception;
                exception;
                list;
                JVM INSTR monitorexit ;
                throw exception;
                list;
                JVM INSTR monitorexit ;
            }

            
            {
                this$0 = RichPushInbox.this;
                super();
            }
        });
    }

    public static RichPushInbox shared()
    {
        com/urbanairship/richpush/RichPushInbox;
        JVM INSTR monitorenter ;
        RichPushInbox richpushinbox;
        if (instance == null)
        {
            instance = new RichPushInbox();
        }
        richpushinbox = instance;
        com/urbanairship/richpush/RichPushInbox;
        JVM INSTR monitorexit ;
        return richpushinbox;
        Exception exception;
        exception;
        throw exception;
    }

    private void updateCacheFromDB()
    {
        Cursor cursor;
        obj = new ArrayList(pendingDeletionMessageIds);
        cursor = RichPushManager.resolver.getAllMessages();
        if (cursor == null)
        {
            return;
        }
_L2:
        RichPushMessage richpushmessage;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        richpushmessage = messageFromCursor(cursor);
        if (richpushmessage == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        synchronized (messageCache)
        {
            if (!richpushmessage.isDeleted() && !richpushmessage.isExpired())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            messageCache.removeMessage(richpushmessage);
        }
        continue; /* Loop/switch isn't completed */
        obj;
        richpushmessagecache;
        JVM INSTR monitorexit ;
        throw obj;
        if (!((List) (obj)).contains(richpushmessage.getMessageId()))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        richpushmessagecache;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        RichPushMessage richpushmessage1 = messageCache.getMessage(richpushmessage.getMessageId());
        if (richpushmessage1 != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        messageCache.addMessage(richpushmessage);
        richpushmessagecache;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        messageCache.removeMessage(richpushmessage1);
        richpushmessage.unreadClient = richpushmessage1.unreadClient;
        messageCache.addMessage(richpushmessage);
        richpushmessagecache;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
        cursor.close();
        return;
    }

    public void addListener(Listener listener)
    {
        synchronized (listeners)
        {
            listeners.add(listener);
        }
        return;
        listener;
        list;
        JVM INSTR monitorexit ;
        throw listener;
    }

    public void deleteMessages(final Set messageIds)
    {
        pendingDeletionMessageIds.addAll(messageIds);
        executor.execute(new Runnable() {

            final RichPushInbox this$0;
            final Set val$messageIds;

            public void run()
            {
                RichPushManager.resolver.markMessagesDeleted(messageIds);
                pendingDeletionMessageIds.removeAll(messageIds);
            }

            
            {
                this$0 = RichPushInbox.this;
                messageIds = set;
                super();
            }
        });
        RichPushMessageCache richpushmessagecache = messageCache;
        richpushmessagecache;
        JVM INSTR monitorenter ;
        messageIds = messageIds.iterator();
_L2:
        Object obj;
        do
        {
            if (!messageIds.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            obj = (String)messageIds.next();
            obj = messageCache.getMessage(((String) (obj)));
        } while (obj == null);
        obj.deleted = true;
        messageCache.removeMessage(((RichPushMessage) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        messageIds;
        richpushmessagecache;
        JVM INSTR monitorexit ;
        throw messageIds;
        richpushmessagecache;
        JVM INSTR monitorexit ;
        notifyListeners();
        return;
    }

    public int getCount()
    {
        return messageCache.getMessageCount();
    }

    public RichPushMessage getMessage(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return messageCache.getMessage(s);
        }
    }

    public Set getMessageIds()
    {
        return messageCache.getMessageIds();
    }

    public List getMessages()
    {
        List list = messageCache.getMessages();
        Collections.sort(list, richPushMessageComparator);
        return list;
    }

    public int getReadCount()
    {
        return messageCache.getReadMessageCount();
    }

    public List getReadMessages()
    {
        List list = messageCache.getReadMessages();
        Collections.sort(list, richPushMessageComparator);
        return list;
    }

    public int getUnreadCount()
    {
        return messageCache.getUnreadMessageCount();
    }

    public List getUnreadMessages()
    {
        List list = messageCache.getUnreadMessages();
        Collections.sort(list, richPushMessageComparator);
        return list;
    }

    public void markMessagesRead(final Set messageIds)
    {
        executor.execute(new Runnable() {

            final RichPushInbox this$0;
            final Set val$messageIds;

            public void run()
            {
                RichPushManager.resolver.markMessagesRead(messageIds);
            }

            
            {
                this$0 = RichPushInbox.this;
                messageIds = set;
                super();
            }
        });
        RichPushMessageCache richpushmessagecache = messageCache;
        richpushmessagecache;
        JVM INSTR monitorenter ;
        messageIds = messageIds.iterator();
_L2:
        Object obj;
        do
        {
            if (!messageIds.hasNext())
            {
                break MISSING_BLOCK_LABEL_85;
            }
            obj = (String)messageIds.next();
            obj = messageCache.getMessage(((String) (obj)));
        } while (obj == null);
        obj.unreadClient = false;
        messageCache.addMessage(((RichPushMessage) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        messageIds;
        richpushmessagecache;
        JVM INSTR monitorexit ;
        throw messageIds;
        richpushmessagecache;
        JVM INSTR monitorexit ;
        notifyListeners();
        return;
    }

    public void markMessagesUnread(final Set messageIds)
    {
        executor.execute(new Runnable() {

            final RichPushInbox this$0;
            final Set val$messageIds;

            public void run()
            {
                RichPushManager.resolver.markMessagesUnread(messageIds);
            }

            
            {
                this$0 = RichPushInbox.this;
                messageIds = set;
                super();
            }
        });
        RichPushMessageCache richpushmessagecache = messageCache;
        richpushmessagecache;
        JVM INSTR monitorenter ;
        messageIds = messageIds.iterator();
_L2:
        Object obj;
        do
        {
            if (!messageIds.hasNext())
            {
                break MISSING_BLOCK_LABEL_85;
            }
            obj = (String)messageIds.next();
            obj = messageCache.getMessage(((String) (obj)));
        } while (obj == null);
        obj.unreadClient = true;
        messageCache.addMessage(((RichPushMessage) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        messageIds;
        richpushmessagecache;
        JVM INSTR monitorexit ;
        throw messageIds;
        richpushmessagecache;
        JVM INSTR monitorexit ;
        notifyListeners();
        return;
    }

    public void removeListener(Listener listener)
    {
        synchronized (listeners)
        {
            listeners.remove(listener);
        }
        return;
        listener;
        list;
        JVM INSTR monitorexit ;
        throw listener;
    }

    void updateCache()
    {
        updateCacheFromDB();
        notifyListeners();
    }



}
