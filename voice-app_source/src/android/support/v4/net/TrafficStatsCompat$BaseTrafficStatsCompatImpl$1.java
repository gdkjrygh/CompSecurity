// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;


// Referenced classes of package android.support.v4.net:
//            TrafficStatsCompat

class this._cls0 extends ThreadLocal
{

    final initialValue this$0;

    protected cketTags initialValue()
    {
        return new cketTags(null);
    }

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    cketTags()
    {
        this$0 = this._cls0.this;
        super();
    }
}
