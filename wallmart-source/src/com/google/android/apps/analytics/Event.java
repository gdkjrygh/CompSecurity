// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            CustomVariableBuffer, Item, Transaction

class Event
{

    static final String INSTALL_EVENT_CATEGORY = "__##GOOGLEINSTALL##__";
    static final String ITEM_CATEGORY = "__##GOOGLEITEM##__";
    static final String PAGEVIEW_EVENT_CATEGORY = "__##GOOGLEPAGEVIEW##__";
    static final String TRANSACTION_CATEGORY = "__##GOOGLETRANSACTION##__";
    final String accountId;
    final String action;
    final String category;
    CustomVariableBuffer customVariableBuffer;
    final long eventId;
    private Item item;
    final String label;
    final int randomVal;
    final int screenHeight;
    final int screenWidth;
    final int timestampCurrent;
    final int timestampFirst;
    final int timestampPrevious;
    private Transaction transaction;
    final int userId;
    final int value;
    final int visits;

    Event(int i, String s, String s1, String s2, String s3, int j, int k, 
            int l)
    {
        this(-1L, i, s, -1, -1, -1, -1, -1, s1, s2, s3, j, k, l);
    }

    Event(long l, int i, String s, int j, int k, int i1, 
            int j1, int k1, String s1, String s2, String s3, int l1, int i2, 
            int j2)
    {
        eventId = l;
        userId = i;
        accountId = s;
        randomVal = j;
        timestampFirst = k;
        timestampPrevious = i1;
        timestampCurrent = j1;
        visits = k1;
        category = s1;
        action = s2;
        label = s3;
        value = l1;
        screenHeight = j2;
        screenWidth = i2;
    }

    public CustomVariableBuffer getCustomVariableBuffer()
    {
        return customVariableBuffer;
    }

    public Item getItem()
    {
        return item;
    }

    public Transaction getTransaction()
    {
        return transaction;
    }

    public void setCustomVariableBuffer(CustomVariableBuffer customvariablebuffer)
    {
        customVariableBuffer = customvariablebuffer;
    }

    public void setItem(Item item1)
    {
        if (!category.equals("__##GOOGLEITEM##__"))
        {
            throw new IllegalStateException((new StringBuilder()).append("Attempted to add an item to an event of type ").append(category).toString());
        } else
        {
            item = item1;
            return;
        }
    }

    public void setTransaction(Transaction transaction1)
    {
        if (!category.equals("__##GOOGLETRANSACTION##__"))
        {
            throw new IllegalStateException((new StringBuilder()).append("Attempted to add a transction to an event of type ").append(category).toString());
        } else
        {
            transaction = transaction1;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("id:").append(eventId).append(" ").append("random:").append(randomVal).append(" ").append("timestampCurrent:").append(timestampCurrent).append(" ").append("timestampPrevious:").append(timestampPrevious).append(" ").append("timestampFirst:").append(timestampFirst).append(" ").append("visits:").append(visits).append(" ").append("value:").append(value).append(" ").append("category:").append(category).append(" ").append("action:").append(action).append(" ").append("label:").append(label).append(" ").append("width:").append(screenWidth).append(" ").append("height:").append(screenHeight).toString();
    }
}
