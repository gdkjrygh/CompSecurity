// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.mf;
import com.google.a.a.a.a.mh;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashMap;
import java.util.Map;

public final class Offlineability
{

    private final mf a;
    private final boolean b;
    private Map c;

    public Offlineability(mf mf1)
    {
        a = (mf)com.google.android.apps.youtube.common.fromguava.c.a(mf1);
        b = mf1.b;
    }

    public final boolean a()
    {
        return b;
    }

    public final Map b()
    {
        if (c == null)
        {
            c = new HashMap();
            mg amg[] = a.d;
            int j = amg.length;
            for (int i = 0; i < j; i++)
            {
                Format format = new Format(amg[i], (byte)0);
                Format.Type type = format.d();
                if (type != null)
                {
                    c.put(type, format);
                }
            }

        }
        return c;
    }

    public final mh c()
    {
        return a.c;
    }

    private class Format
    {

        private final CharSequence a;
        private final CharSequence b;
        private final Type c;

        public final CharSequence a()
        {
            return a;
        }

        public final boolean b()
        {
            return b != null;
        }

        public final CharSequence c()
        {
            return b;
        }

        public final Type d()
        {
            return c;
        }

        private Format(mg mg1)
        {
            com.google.android.apps.youtube.common.fromguava.c.a(mg1);
            a = com.google.android.apps.youtube.datalib.innertube.a.b.a(mg1.b);
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(mg1.c);
            class Type extends Enum
            {

                private static final Type $VALUES[];
                public static final Type AMODO_ONLY;
                public static final Type HD;
                public static final Type SD;
                private final int qualityValue;

                public static Type valueOf(String s)
                {
                    return (Type)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/model/Offlineability$Format$Type, s);
                }

                public static Type[] values()
                {
                    return (Type[])$VALUES.clone();
                }

                public final int getQualityValue()
                {
                    return qualityValue;
                }

                static 
                {
                    AMODO_ONLY = new Type("AMODO_ONLY", 0, 0);
                    SD = new Type("SD", 1, 360);
                    HD = new Type("HD", 2, 720);
                    $VALUES = (new Type[] {
                        AMODO_ONLY, SD, HD
                    });
                }

                private Type(String s, int i, int j)
                {
                    super(s, i);
                    qualityValue = j;
                }
            }

            switch (mg1.d)
            {
            default:
                L.b((new StringBuilder("Invalid offlineability.format.format_type: ")).append(mg1.d).toString());
                c = null;
                return;

            case 3: // '\003'
                c = Type.AMODO_ONLY;
                return;

            case 1: // '\001'
                c = Type.SD;
                return;

            case 2: // '\002'
                c = Type.HD;
                return;
            }
        }

        Format(mg mg1, byte byte0)
        {
            this(mg1);
        }
    }

}
