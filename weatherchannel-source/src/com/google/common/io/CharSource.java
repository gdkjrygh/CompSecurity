// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

// Referenced classes of package com.google.common.io:
//            Closer, CharSink, CharStreams, LineProcessor, 
//            CharSequenceReader, MultiReader

public abstract class CharSource
{
    private static class CharSequenceCharSource extends CharSource
    {

        private static final Splitter LINE_SPLITTER = Splitter.on(Pattern.compile("\r\n|\n|\r"));
        private final CharSequence seq;

        private Iterable lines()
        {
            return new Iterable() {

                final CharSequenceCharSource this$0;

                public Iterator iterator()
                {
                    return new AbstractIterator() {

                        Iterator lines;
                        final CharSequenceCharSource._cls1 this$1;

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
                this$1 = CharSequenceCharSource._cls1.this;
                super();
                lines = CharSequenceCharSource.LINE_SPLITTER.split(seq).iterator();
            }
                    };
                }

            
            {
                this$0 = CharSequenceCharSource.this;
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




        protected CharSequenceCharSource(CharSequence charsequence)
        {
            seq = (CharSequence)Preconditions.checkNotNull(charsequence);
        }
    }

    private static final class ConcatenatedCharSource extends CharSource
    {

        private final Iterable sources;

        public boolean isEmpty()
            throws IOException
        {
            for (Iterator iterator = sources.iterator(); iterator.hasNext();)
            {
                if (!((CharSource)iterator.next()).isEmpty())
                {
                    return false;
                }
            }

            return true;
        }

        public Reader openStream()
            throws IOException
        {
            return new MultiReader(sources.iterator());
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(sources));
            return (new StringBuilder(s.length() + 19)).append("CharSource.concat(").append(s).append(")").toString();
        }

        ConcatenatedCharSource(Iterable iterable)
        {
            sources = (Iterable)Preconditions.checkNotNull(iterable);
        }
    }

    private static final class EmptyCharSource extends CharSequenceCharSource
    {

        private static final EmptyCharSource INSTANCE = new EmptyCharSource();

        public String toString()
        {
            return "CharSource.empty()";
        }



        private EmptyCharSource()
        {
            super("");
        }
    }


    protected CharSource()
    {
    }

    public static CharSource concat(Iterable iterable)
    {
        return new ConcatenatedCharSource(iterable);
    }

    public static CharSource concat(Iterator iterator)
    {
        return concat(((Iterable) (ImmutableList.copyOf(iterator))));
    }

    public static transient CharSource concat(CharSource acharsource[])
    {
        return concat(((Iterable) (ImmutableList.copyOf(acharsource))));
    }

    public static CharSource empty()
    {
        return EmptyCharSource.INSTANCE;
    }

    public static CharSource wrap(CharSequence charsequence)
    {
        return new CharSequenceCharSource(charsequence);
    }

    public long copyTo(CharSink charsink)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(charsink);
        closer = Closer.create();
        long l = CharStreams.copy((Reader)closer.register(openStream()), (Writer)closer.register(charsink.openStream()));
        closer.close();
        return l;
        charsink;
        throw closer.rethrow(charsink);
        charsink;
        closer.close();
        throw charsink;
    }

    public long copyTo(Appendable appendable)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(appendable);
        closer = Closer.create();
        long l = CharStreams.copy((Reader)closer.register(openStream()), appendable);
        closer.close();
        return l;
        appendable;
        throw closer.rethrow(appendable);
        appendable;
        closer.close();
        throw appendable;
    }

    public boolean isEmpty()
        throws IOException
    {
        Closer closer = Closer.create();
        int i = ((Reader)closer.register(openStream())).read();
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        closer.close();
        return flag;
        Object obj;
        obj;
        throw closer.rethrow(((Throwable) (obj)));
        obj;
        closer.close();
        throw obj;
    }

    public BufferedReader openBufferedStream()
        throws IOException
    {
        Reader reader = openStream();
        if (reader instanceof BufferedReader)
        {
            return (BufferedReader)reader;
        } else
        {
            return new BufferedReader(reader);
        }
    }

    public abstract Reader openStream()
        throws IOException;

    public String read()
        throws IOException
    {
        Closer closer = Closer.create();
        String s = CharStreams.toString((Reader)closer.register(openStream()));
        closer.close();
        return s;
        Object obj;
        obj;
        throw closer.rethrow(((Throwable) (obj)));
        obj;
        closer.close();
        throw obj;
    }

    public String readFirstLine()
        throws IOException
    {
        Closer closer = Closer.create();
        String s = ((BufferedReader)closer.register(openBufferedStream())).readLine();
        closer.close();
        return s;
        Object obj;
        obj;
        throw closer.rethrow(((Throwable) (obj)));
        obj;
        closer.close();
        throw obj;
    }

    public ImmutableList readLines()
        throws IOException
    {
        Closer closer = Closer.create();
        Object obj;
        java.util.ArrayList arraylist;
        obj = (BufferedReader)closer.register(openBufferedStream());
        arraylist = Lists.newArrayList();
_L1:
        String s = ((BufferedReader) (obj)).readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        arraylist.add(s);
          goto _L1
        Object obj1;
        obj1;
        throw closer.rethrow(((Throwable) (obj1)));
        obj1;
        closer.close();
        throw obj1;
        obj1 = ImmutableList.copyOf(arraylist);
        closer.close();
        return ((ImmutableList) (obj1));
    }

    public Object readLines(LineProcessor lineprocessor)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(lineprocessor);
        closer = Closer.create();
        lineprocessor = ((LineProcessor) (CharStreams.readLines((Reader)closer.register(openStream()), lineprocessor)));
        closer.close();
        return lineprocessor;
        lineprocessor;
        throw closer.rethrow(lineprocessor);
        lineprocessor;
        closer.close();
        throw lineprocessor;
    }
}
