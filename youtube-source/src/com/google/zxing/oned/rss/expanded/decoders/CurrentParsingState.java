// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


final class CurrentParsingState
{

    private int a;
    private State b;

    CurrentParsingState()
    {
        a = 0;
        b = State.NUMERIC;
    }

    final int a()
    {
        return a;
    }

    final void a(int i)
    {
        a = i;
    }

    final void b(int i)
    {
        a = a + i;
    }

    final boolean b()
    {
        return b == State.ALPHA;
    }

    final boolean c()
    {
        return b == State.ISO_IEC_646;
    }

    final void d()
    {
        b = State.NUMERIC;
    }

    final void e()
    {
        b = State.ALPHA;
    }

    final void f()
    {
        b = State.ISO_IEC_646;
    }

    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ALPHA;
        public static final State ISO_IEC_646;
        public static final State NUMERIC;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/zxing/oned/rss/expanded/decoders/CurrentParsingState$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            NUMERIC = new State("NUMERIC", 0);
            ALPHA = new State("ALPHA", 1);
            ISO_IEC_646 = new State("ISO_IEC_646", 2);
            $VALUES = (new State[] {
                NUMERIC, ALPHA, ISO_IEC_646
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
