// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            Event

interface EventStore
{

    public abstract void deleteEvent(long l);

    public abstract int getNumStoredEvents();

    public abstract String getReferrer();

    public abstract int getStoreId();

    public abstract String getVisitorCustomVar(int i);

    public abstract Event[] peekEvents();

    public abstract Event[] peekEvents(int i);

    public abstract void putEvent(Event event);

    public abstract void setReferrer(String s);

    public abstract void startNewVisit();
}
