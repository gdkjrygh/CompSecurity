// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//            ANRError

class ANRError$$
{
    private class _Thread extends Throwable
    {

        final ANRError$$ this$0;

        public Throwable fillInStackTrace()
        {
            setStackTrace(_stackTrace);
            return this;
        }

        private _Thread(_Thread _pthread)
        {
            this$0 = ANRError$$.this;
            super(_name, _pthread);
        }

        _Thread(_Thread _pthread, ANRError._cls1 _pcls1)
        {
            this(_pthread);
        }
    }


    private final String _name;
    private final StackTraceElement _stackTrace[];

    private ANRError$$(String s, StackTraceElement astacktraceelement[])
    {
        _name = s;
        _stackTrace = astacktraceelement;
    }

    ANRError$$(String s, StackTraceElement astacktraceelement[], ANRError._cls1 _pcls1)
    {
        this(s, astacktraceelement);
    }


}
