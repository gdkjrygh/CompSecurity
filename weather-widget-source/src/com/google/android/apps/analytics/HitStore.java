// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            Referrer, Hit, Event

interface HitStore
{

    public abstract void clearReferrer();

    public abstract void deleteHit(long l);

    public abstract int getNumStoredHits();

    public abstract Referrer getReferrer();

    public abstract String getSessionId();

    public abstract int getStoreId();

    public abstract String getVisitorCustomVar(int i);

    public abstract String getVisitorId();

    public abstract void loadExistingSession();

    public abstract Hit[] peekHits();

    public abstract Hit[] peekHits(int i);

    public abstract void putEvent(Event event);

    public abstract void setAnonymizeIp(boolean flag);

    public abstract boolean setReferrer(String s);

    public abstract void setSampleRate(int i);

    public abstract void startNewVisit();
}
