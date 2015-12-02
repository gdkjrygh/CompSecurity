// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsEvent;

final class t> extends dos
{

    final a a;

    public final void a(boolean flag)
    {
        dor.b(a.a).i(flag);
    }

    ( )
    {
        a = ;
        super((byte)0);
    }

    // Unreferenced inner class dor$1

/* anonymous class */
    final class dor._cls1
        implements doo
    {

        final dor a;

        public final void a(Exception exception)
        {
            exception = AnalyticsEvent.create("custom").setName(k.a).setValue(exception.getMessage());
            dor.a(a).a(exception);
        }

        public final void a(String s, String s1)
        {
            AnalyticsEvent analyticsevent = AnalyticsEvent.create("custom").setName(k.b).setValue("google");
            dor.a(a).a(analyticsevent);
            dor.c(a).a(s, s1, new dor._cls1._cls1(this));
        }

            
            {
                a = dor1;
                super();
            }
    }

}
