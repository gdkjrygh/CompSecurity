// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions, AbstractIterator, Joiner

public final class Splitter
{
    public static final class MapSplitter
    {

        private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final Splitter entrySplitter;
        private final Splitter outerSplitter;

        public Map split(CharSequence charsequence)
        {
            LinkedHashMap linkedhashmap = new LinkedHashMap();
            charsequence = outerSplitter.split(charsequence).iterator();
            while (charsequence.hasNext()) 
            {
                String s = (String)charsequence.next();
                Iterator iterator = entrySplitter.splittingIterator(s);
                Preconditions.checkArgument(iterator.hasNext(), "Chunk [%s] is not a valid entry", new Object[] {
                    s
                });
                String s1 = (String)iterator.next();
                boolean flag;
                if (!linkedhashmap.containsKey(s1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Duplicate key [%s] found.", new Object[] {
                    s1
                });
                Preconditions.checkArgument(iterator.hasNext(), "Chunk [%s] is not a valid entry", new Object[] {
                    s
                });
                linkedhashmap.put(s1, (String)iterator.next());
                if (!iterator.hasNext())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Chunk [%s] is not a valid entry", new Object[] {
                    s
                });
            }
            return Collections.unmodifiableMap(linkedhashmap);
        }

        private MapSplitter(Splitter splitter, Splitter splitter1)
        {
            outerSplitter = splitter;
            entrySplitter = (Splitter)Preconditions.checkNotNull(splitter1);
        }

    }

    private static abstract class SplittingIterator extends AbstractIterator
    {

        int limit;
        int offset;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        protected volatile Object computeNext()
        {
            return computeNext();
        }

        protected String computeNext()
        {
            int i = offset;
            do
            {
                if (offset == -1)
                {
                    break;
                }
                int l = i;
                int i1 = separatorStart(offset);
                int j;
                if (i1 == -1)
                {
                    j = toSplit.length();
                    offset = -1;
                } else
                {
                    j = i1;
                    offset = separatorEnd(i1);
                }
                if (offset == i)
                {
                    offset = offset + 1;
                    if (offset >= toSplit.length())
                    {
                        offset = -1;
                    }
                } else
                {
                    do
                    {
                        i = j;
                        if (l >= j)
                        {
                            break;
                        }
                        i = j;
                        if (!trimmer.matches(toSplit.charAt(l)))
                        {
                            break;
                        }
                        l++;
                    } while (true);
                    for (; i > l && trimmer.matches(toSplit.charAt(i - 1)); i--) { }
                    if (omitEmptyStrings && l == i)
                    {
                        i = offset;
                    } else
                    {
                        int k;
                        if (limit == 1)
                        {
                            i = toSplit.length();
                            offset = -1;
                            do
                            {
                                k = i;
                                if (i <= l)
                                {
                                    break;
                                }
                                k = i;
                                if (!trimmer.matches(toSplit.charAt(i - 1)))
                                {
                                    break;
                                }
                                i--;
                            } while (true);
                        } else
                        {
                            limit = limit - 1;
                            k = i;
                        }
                        return toSplit.subSequence(l, k).toString();
                    }
                }
            } while (true);
            return (String)endOfData();
        }

        abstract int separatorEnd(int i);

        abstract int separatorStart(int i);

        protected SplittingIterator(Splitter splitter, CharSequence charsequence)
        {
            offset = 0;
            trimmer = splitter.trimmer;
            omitEmptyStrings = splitter.omitEmptyStrings;
            limit = splitter.limit;
            toSplit = charsequence;
        }
    }

    private static interface Strategy
    {

        public abstract Iterator iterator(Splitter splitter, CharSequence charsequence);
    }


    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    private Splitter(Strategy strategy1)
    {
        this(strategy1, false, CharMatcher.NONE, 0x7fffffff);
    }

    private Splitter(Strategy strategy1, boolean flag, CharMatcher charmatcher, int i)
    {
        strategy = strategy1;
        omitEmptyStrings = flag;
        trimmer = charmatcher;
        limit = i;
    }

    public static Splitter fixedLength(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The length may not be less than 1");
        return new Splitter(new Strategy(i) {

            final int val$length;

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls4 this$0;

                    public int separatorEnd(int i)
                    {
                        return i;
                    }

                    public int separatorStart(int i)
                    {
                        i += length;
                        if (i < toSplit.length())
                        {
                            return i;
                        } else
                        {
                            return -1;
                        }
                    }

            
            {
                this$0 = _cls4.this;
                super(splitter, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                length = i;
                super();
            }
        });
    }

    public static Splitter on(char c)
    {
        return on(CharMatcher.is(c));
    }

    public static Splitter on(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return new Splitter(new Strategy(charmatcher) {

            final CharMatcher val$separatorMatcher;

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls1 this$0;

                    int separatorEnd(int i)
                    {
                        return i + 1;
                    }

                    int separatorStart(int i)
                    {
                        return separatorMatcher.indexIn(toSplit, i);
                    }

            
            {
                this$0 = _cls1.this;
                super(splitter, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                separatorMatcher = charmatcher;
                super();
            }
        });
    }

    public static Splitter on(String s)
    {
        boolean flag;
        if (s.length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The separator may not be the empty string.");
        return new Splitter(new Strategy(s) {

            final String val$separator;

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls2 this$0;

                    public int separatorEnd(int i)
                    {
                        return separator.length() + i;
                    }

                    public int separatorStart(int i)
                    {
                        int l = separator.length();
                        int i1 = toSplit.length();
label0:
                        do
                        {
                            int k;
                            if (i <= i1 - l)
                            {
                                int j = 0;
                                do
                                {
                                    k = i;
                                    if (j >= l)
                                    {
                                        break;
                                    }
                                    if (toSplit.charAt(j + i) != separator.charAt(j))
                                    {
                                        i++;
                                        continue label0;
                                    }
                                    j++;
                                } while (true);
                            } else
                            {
                                k = -1;
                            }
                            return k;
                        } while (true);
                    }

            
            {
                this$0 = _cls2.this;
                super(splitter, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                separator = s;
                super();
            }
        });
    }

    public static Splitter on(Pattern pattern)
    {
        Preconditions.checkNotNull(pattern);
        boolean flag;
        if (!pattern.matcher("").matches())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The pattern may not match the empty string: %s", new Object[] {
            pattern
        });
        return new Splitter(new Strategy(pattern) {

            final Pattern val$separatorPattern;

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return splitter. new SplittingIterator(charsequence, separatorPattern.matcher(charsequence)) {

                    final _cls3 this$0;
                    final Matcher val$matcher;

                    public int separatorEnd(int i)
                    {
                        return matcher.end();
                    }

                    public int separatorStart(int i)
                    {
                        if (matcher.find(i))
                        {
                            return matcher.start();
                        } else
                        {
                            return -1;
                        }
                    }

            
            {
                this$0 = final__pcls3;
                matcher = matcher1;
                super(Splitter.this, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                separatorPattern = pattern;
                super();
            }
        });
    }

    public static Splitter onPattern(String s)
    {
        return on(Pattern.compile(s));
    }

    private Iterator splittingIterator(CharSequence charsequence)
    {
        return strategy.iterator(this, charsequence);
    }

    public Splitter limit(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "must be greater than zero: %s", new Object[] {
            Integer.valueOf(i)
        });
        return new Splitter(strategy, omitEmptyStrings, trimmer, i);
    }

    public Splitter omitEmptyStrings()
    {
        return new Splitter(strategy, true, trimmer, limit);
    }

    public Iterable split(final CharSequence sequence)
    {
        Preconditions.checkNotNull(sequence);
        return new Iterable() {

            final Splitter this$0;
            final CharSequence val$sequence;

            public Iterator iterator()
            {
                return splittingIterator(sequence);
            }

            public String toString()
            {
                return Joiner.on(", ").appendTo((new StringBuilder()).append('['), this).append(']').toString();
            }

            
            {
                this$0 = Splitter.this;
                sequence = charsequence;
                super();
            }
        };
    }

    public List splitToList(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        charsequence = splittingIterator(charsequence);
        ArrayList arraylist = new ArrayList();
        for (; charsequence.hasNext(); arraylist.add(charsequence.next())) { }
        return Collections.unmodifiableList(arraylist);
    }

    public Splitter trimResults()
    {
        return trimResults(CharMatcher.WHITESPACE);
    }

    public Splitter trimResults(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return new Splitter(strategy, omitEmptyStrings, charmatcher, limit);
    }

    public MapSplitter withKeyValueSeparator(char c)
    {
        return withKeyValueSeparator(on(c));
    }

    public MapSplitter withKeyValueSeparator(Splitter splitter)
    {
        return new MapSplitter(this, splitter);
    }

    public MapSplitter withKeyValueSeparator(String s)
    {
        return withKeyValueSeparator(on(s));
    }




}
