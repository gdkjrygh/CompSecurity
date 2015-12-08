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
    private int adHitId;
    private boolean anonymizeIp;
    final String category;
    CustomVariableBuffer customVariableBuffer;
    final long eventId;
    private Item item;
    final String label;
    private int randomVal;
    final int screenHeight;
    final int screenWidth;
    private int timestampCurrent;
    private int timestampFirst;
    private int timestampPrevious;
    private Transaction transaction;
    private boolean useServerTime;
    private int userId;
    final int value;
    private int visits;

    Event(long l, String s, int i, int j, int k, int i1, 
            int j1, String s1, String s2, String s3, int k1, int l1, int i2)
    {
        eventId = l;
        accountId = s;
        randomVal = i;
        timestampFirst = j;
        timestampPrevious = k;
        timestampCurrent = i1;
        visits = j1;
        category = s1;
        action = s2;
        label = s3;
        value = k1;
        screenHeight = i2;
        screenWidth = l1;
        userId = -1;
        useServerTime = false;
    }

    Event(Event event, String s)
    {
        this(event.eventId, s, event.randomVal, event.timestampFirst, event.timestampPrevious, event.timestampCurrent, event.visits, event.category, event.action, event.label, event.value, event.screenWidth, event.screenHeight);
        adHitId = event.adHitId;
        userId = event.userId;
        anonymizeIp = event.anonymizeIp;
        useServerTime = event.useServerTime;
        customVariableBuffer = event.customVariableBuffer;
        transaction = event.transaction;
        item = event.item;
    }

    Event(String s, String s1, String s2, String s3, int i, int j, int k)
    {
        this(-1L, s, -1, -1, -1, -1, -1, s1, s2, s3, i, j, k);
    }

    int getAdHitId()
    {
        return adHitId;
    }

    boolean getAnonymizeIp()
    {
        return anonymizeIp;
    }

    public CustomVariableBuffer getCustomVariableBuffer()
    {
        return customVariableBuffer;
    }

    public Item getItem()
    {
        return item;
    }

    int getRandomVal()
    {
        return randomVal;
    }

    int getTimestampCurrent()
    {
        return timestampCurrent;
    }

    int getTimestampFirst()
    {
        return timestampFirst;
    }

    int getTimestampPrevious()
    {
        return timestampPrevious;
    }

    public Transaction getTransaction()
    {
        return transaction;
    }

    boolean getUseServerTime()
    {
        return useServerTime;
    }

    int getUserId()
    {
        return userId;
    }

    int getVisits()
    {
        return visits;
    }

    public boolean isSessionInitialized()
    {
        return timestampFirst != -1;
    }

    void setAdHitId(int i)
    {
        adHitId = i;
    }

    void setAnonymizeIp(boolean flag)
    {
        anonymizeIp = flag;
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

    void setRandomVal(int i)
    {
        randomVal = i;
    }

    void setTimestampCurrent(int i)
    {
        timestampCurrent = i;
    }

    void setTimestampFirst(int i)
    {
        timestampFirst = i;
    }

    void setTimestampPrevious(int i)
    {
        timestampPrevious = i;
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

    void setUseServerTime(boolean flag)
    {
        useServerTime = flag;
    }

    void setUserId(int i)
    {
        userId = i;
    }

    void setVisits(int i)
    {
        visits = i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("id:").append(eventId).append(" ").append("random:").append(randomVal).append(" ").append("timestampCurrent:").append(timestampCurrent).append(" ").append("timestampPrevious:").append(timestampPrevious).append(" ").append("timestampFirst:").append(timestampFirst).append(" ").append("visits:").append(visits).append(" ").append("value:").append(value).append(" ").append("category:").append(category).append(" ").append("action:").append(action).append(" ").append("label:").append(label).append(" ").append("width:").append(screenWidth).append(" ").append("height:").append(screenHeight).toString();
    }
}
