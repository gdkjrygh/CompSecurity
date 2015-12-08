// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.regex.Pattern;

// Referenced classes of package com.google.common.io:
//            CharSource, CharSequenceReader, LineProcessor

private static class seq extends CharSource
{

    private static final Splitter LINE_SPLITTER = Splitter.on(Pattern.compile("\r\n|\n|\r"));
    private final CharSequence seq;

    private Iterable lines()
    {
        return new Iterable() {

            final CharSource.CharSequenceCharSource this$0;

            public Iterator iterator()
            {
                return new AbstractIterator() {

                    Iterator lines;
                    final _cls1 this$1;

                    protected volatile Object computeNext()
                    {
                        return computeNext();
                    }

                    protected String computeNext()
                    {
                        if (lines.hasNext())
                        {
                            String s = (String)lines.next();
                            if (lines.hasNext() || !s.isEmpty())
                            {
                                return s;
                            }
                        }
                        return (String)endOfData();
                    }

            
            {
                this$1 = _cls1.this;
                super();
                lines = CharSource.CharSequenceCharSource.LINE_SPLITTER.split(seq).iterator();
            }
                };
            }

            
            {
                this$0 = CharSource.CharSequenceCharSource.this;
                super();
            }
        };
    }

    public boolean isEmpty()
    {
        return seq.length() == 0;
    }

    public Reader openStream()
    {
        return new CharSequenceReader(seq);
    }

    public String read()
    {
        return seq.toString();
    }

    public String readFirstLine()
    {
        Iterator iterator = lines().iterator();
        if (iterator.hasNext())
        {
            return (String)iterator.next();
        } else
        {
            return null;
        }
    }

    public ImmutableList readLines()
    {
        return ImmutableList.copyOf(lines());
    }

    public Object readLines(LineProcessor lineprocessor)
        throws IOException
    {
        for (Iterator iterator = lines().iterator(); iterator.hasNext() && lineprocessor.processLine((String)iterator.next());) { }
        return lineprocessor.getResult();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(Ascii.truncate(seq, 30, "...")));
        return (new StringBuilder(s.length() + 17)).append("CharSource.wrap(").append(s).append(")").toString();
    }




    protected _cls1.this._cls0(CharSequence charsequence)
    {
        seq = (CharSequence)Preconditions.checkNotNull(charsequence);
    }
}
