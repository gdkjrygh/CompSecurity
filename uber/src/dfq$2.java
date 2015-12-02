// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

final class ang.Object
    implements bkr
{

    final Class a;
    final dfq b;

    public final bkq create(bjw bjw1, bmj bmj1)
    {
        if (bmj1.getRawType() == gqj)
        {
            return new bkq(bjw1.a(this, bmj1), bjw1) {

                final bkq a;
                final bjw b;
                final dfq._cls2 c;

                public final Object a(JsonReader jsonreader)
                {
                    return b.a(jsonreader, c.a);
                }

                public final void a(JsonWriter jsonwriter, Object obj)
                {
                    a.a(jsonwriter, obj);
                }

            
            {
                c = dfq._cls2.this;
                a = bkq1;
                b = bjw1;
                super();
            }
            };
        } else
        {
            return null;
        }
    }

    (dfq dfq1, Class class1)
    {
        b = dfq1;
        a = class1;
        super();
    }
}
