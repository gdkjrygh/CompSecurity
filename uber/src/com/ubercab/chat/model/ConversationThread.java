// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.chat.model;

import cye;
import gjx;
import gjy;
import gjz;
import gki;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.ubercab.chat.model:
//            Message, Payload

public class ConversationThread
{

    private final String mConnectedUserId;
    private int mHighWaterMark;
    private final ArrayList mMessages = new ArrayList();
    private int mNextSequenceNumber;
    private String mThreadId;
    private final String mTripId;

    public ConversationThread(String s, String s1)
    {
        mHighWaterMark = -1;
        mNextSequenceNumber = 0;
        mConnectedUserId = s;
        mTripId = s1;
    }

    private boolean isDuplicateConfirmedMessage(Message message)
    {
        gjz.a(message.getMessageId());
        return tryFindMessageByMessageId(message.getMessageId()).b();
    }

    private boolean isDuplicatePendingOutgoingMessage(Message message)
    {
        gjz.a(message.getClientMessageId());
        return tryFindMessageByClientMessageId(message.getClientMessageId()).b();
    }

    private boolean isValidSequenceNumber(int i)
    {
        return i == mHighWaterMark || i >= mNextSequenceNumber;
    }

    private gjy tryFindMessageByClientMessageId(String s)
    {
        return gki.d(new cye(mMessages), new _cls3(s));
    }

    private gjy tryFindMessageByMessageId(String s)
    {
        return gki.d(new cye(mMessages), new _cls4(s));
    }

    private void updateHighWaterMark(int i)
    {
        if (i > mNextSequenceNumber)
        {
            throw new OutOfOrderException();
        }
        if (i == mHighWaterMark)
        {
            mNextSequenceNumber = mNextSequenceNumber + 1;
        } else
        if (i == mNextSequenceNumber)
        {
            mHighWaterMark = mNextSequenceNumber;
            mNextSequenceNumber = i + 1;
            return;
        }
    }

    private void updateMessagesWithConfirmedMessage(Message message)
    {
        for (ListIterator listiterator = mMessages.listIterator(mMessages.size()); listiterator.hasPrevious() && message.getClientMessageId() != null;)
        {
            if (gjx.a(message.getClientMessageId(), ((Message)listiterator.previous()).getClientMessageId()))
            {
                listiterator.set(message);
                return;
            }
        }

        mMessages.add(message);
    }

    public void addConfirmedMessage(Message message)
    {
        if (message.getMessageId() == null)
        {
            throw new IllegalArgumentException("Confirmed message should have message ID");
        }
        if (message.getThreadId() == null)
        {
            throw new IllegalArgumentException("Confirmed message should have thread ID");
        }
        if (!gjx.a(mThreadId, message.getThreadId()))
        {
            throw new IllegalArgumentException((new StringBuilder("Message with thread \"")).append(message.getThreadId()).append("\" added to wrong thread \"").append(mThreadId).append("\"").toString());
        }
        while (isDuplicateConfirmedMessage(message) || !isValidSequenceNumber(message.getSequenceNumber())) 
        {
            return;
        }
        updateHighWaterMark(message.getSequenceNumber());
        updateMessagesWithConfirmedMessage(message);
    }

    public void addConfirmedMessages(List list)
    {
        for (list = list.iterator(); list.hasNext(); addConfirmedMessage((Message)list.next())) { }
    }

    public void addPendingOutgoingMessage(Message message)
    {
        if (message.getClientMessageId() == null)
        {
            throw new IllegalArgumentException("Message should have client message ID");
        }
        if (!gjx.a(mThreadId, message.getThreadId()))
        {
            throw new IllegalArgumentException((new StringBuilder("Message with thread \"")).append(message.getThreadId()).append("\" added to wrong thread \"").append(mThreadId).append("\"").toString());
        }
        if (isDuplicatePendingOutgoingMessage(message))
        {
            return;
        } else
        {
            mMessages.add(message);
            return;
        }
    }

    public String getConnectedUserId()
    {
        return mConnectedUserId;
    }

    public int getHighWaterMark()
    {
        return mHighWaterMark;
    }

    public Message getLastReceivedMessage()
    {
        return (Message)gki.d(new cye(mMessages), new _cls1()).d();
    }

    public Message getLastUnreadMessage()
    {
        return (Message)gki.d(new cye(mMessages), new _cls2()).d();
    }

    public List getMessages()
    {
        return mMessages;
    }

    public String getThreadId()
    {
        return mThreadId;
    }

    public String getTripId()
    {
        return mTripId;
    }

    public int getUnreadMessageCount()
    {
        Iterator iterator = mMessages.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((Message)iterator.next()).getIsRead())
            {
                i++;
            }
        } while (true);
        return i;
    }

    public void updateConfirmedMessagePayloadPath(String s, String s1)
    {
        s = tryFindMessageByMessageId(s);
        if (s.b())
        {
            ((Message)s.c()).getPayload().setLocalPath(s1);
        }
    }

    public void updatePendingOutgoingMessage(String s, String s1, int i, long l)
    {
        s = tryFindMessageByClientMessageId(s);
        if (s.b())
        {
            addConfirmedMessage(Message.create((Message)s.c(), s1, i, l));
        }
    }

    public void updateThreadIdIfNotConfirmed(String s)
    {
        if (mThreadId == null)
        {
            mThreadId = s;
            for (Iterator iterator = mMessages.iterator(); iterator.hasNext(); ((Message)iterator.next()).setThreadId(s)) { }
        } else
        if (!mThreadId.equals(s))
        {
            throw new IllegalStateException((new StringBuilder("Attempt to update a confirmed thread \"")).append(mThreadId).append("\" with a different thread UUID \"").append(s).append("\"").toString());
        }
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class OutOfOrderException {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
