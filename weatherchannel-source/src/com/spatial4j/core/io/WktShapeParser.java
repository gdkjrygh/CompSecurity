// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.context.SpatialContextFactory;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Shape;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WktShapeParser
{
    public class State
    {

        private WktShapeParser a;
        public String dimension;
        public int offset;
        public String rawString;

        public final boolean eof()
        {
            return offset >= rawString.length();
        }

        public SpatialContext getCtx()
        {
            return a.ctx;
        }

        public WktShapeParser getParser()
        {
            return a;
        }

        public double nextDouble()
            throws ParseException
        {
            int i = offset;
            skipDouble();
            if (i == offset)
            {
                throw new ParseException("Expected a number", offset);
            }
            double d;
            try
            {
                d = Double.parseDouble(rawString.substring(i, offset));
            }
            catch (Exception exception)
            {
                throw new ParseException(exception.toString(), offset);
            }
            nextIfWhitespace();
            return d;
        }

        public void nextExpect(char c)
            throws ParseException
        {
            if (eof())
            {
                throw new ParseException((new StringBuilder("Expected [")).append(c).append("] found EOF").toString(), offset);
            }
            char c1 = rawString.charAt(offset);
            if (c1 != c)
            {
                throw new ParseException((new StringBuilder("Expected [")).append(c).append("] found [").append(c1).append("]").toString(), offset);
            } else
            {
                offset = offset + 1;
                nextIfWhitespace();
                return;
            }
        }

        public boolean nextIf(char c)
        {
            if (!eof() && rawString.charAt(offset) == c)
            {
                offset = offset + 1;
                nextIfWhitespace();
                return true;
            } else
            {
                return false;
            }
        }

        public boolean nextIfEmptyAndSkipZM()
            throws ParseException
        {
            char c;
            if (!eof())
            {
                if ((c = rawString.charAt(offset)) != '(' && Character.isJavaIdentifierPart(c))
                {
                    String s = nextWord();
                    if (s.equalsIgnoreCase("EMPTY"))
                    {
                        return true;
                    }
                    dimension = s;
                    if (!eof())
                    {
                        char c1 = rawString.charAt(offset);
                        if (c1 != '(' && Character.isJavaIdentifierPart(c1))
                        {
                            String s1 = nextWord();
                            if (s1.equalsIgnoreCase("EMPTY"))
                            {
                                return true;
                            } else
                            {
                                throw new ParseException((new StringBuilder("Expected EMPTY because found dimension; but got [")).append(s1).append("]").toString(), offset);
                            }
                        }
                    }
                }
            }
            return false;
        }

        public void nextIfWhitespace()
        {
            do
            {
                if (offset >= rawString.length() || !Character.isWhitespace(rawString.charAt(offset)))
                {
                    return;
                }
                offset = offset + 1;
            } while (true);
        }

        public String nextSubShapeString()
            throws ParseException
        {
            int j;
            int k;
            k = offset;
            j = 0;
_L7:
            if (offset >= rawString.length()) goto _L2; else goto _L1
_L1:
            char c = rawString.charAt(offset);
            if (c != ',') goto _L4; else goto _L3
_L3:
            int i;
            i = j;
            if (j != 0)
            {
                break MISSING_BLOCK_LABEL_77;
            }
_L2:
            if (j != 0)
            {
                throw new ParseException("Unbalanced parenthesis", k);
            } else
            {
                return rawString.substring(k, offset);
            }
_L4:
            if (c != ')')
            {
                break; /* Loop/switch isn't completed */
            }
            if (j == 0) goto _L2; else goto _L5
_L5:
            i = j - 1;
_L8:
            offset = offset + 1;
            j = i;
            if (true) goto _L7; else goto _L6
_L6:
            i = j;
            if (c == '(')
            {
                i = j + 1;
            }
              goto _L8
            if (true) goto _L7; else goto _L9
_L9:
        }

        public String nextWord()
            throws ParseException
        {
            int i = offset;
            for (; offset < rawString.length() && Character.isJavaIdentifierPart(rawString.charAt(offset)); offset = offset + 1) { }
            if (i == offset)
            {
                throw new ParseException("Word expected", i);
            } else
            {
                String s = rawString.substring(i, offset);
                nextIfWhitespace();
                return s;
            }
        }

        public void skipDouble()
        {
            int i = offset;
            do
            {
                if (offset >= rawString.length())
                {
                    break;
                }
                char c = rawString.charAt(offset);
                if (!Character.isDigit(c) && c != '.' && c != '-' && c != '+' && (offset == i || c != 'e' && c != 'E'))
                {
                    break;
                }
                offset = offset + 1;
            } while (true);
        }

        public void skipNextDoubles()
        {
            do
            {
label0:
                {
                    if (!eof())
                    {
                        int i = offset;
                        skipDouble();
                        if (i != offset)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                nextIfWhitespace();
            } while (true);
        }

        public State(String s)
        {
            a = WktShapeParser.this;
            super();
            rawString = s;
        }
    }


    private static boolean a;
    protected final SpatialContext ctx;

    public WktShapeParser(SpatialContext spatialcontext, SpatialContextFactory spatialcontextfactory)
    {
        ctx = spatialcontext;
    }

    public SpatialContext getCtx()
    {
        return ctx;
    }

    protected State newState(String s)
    {
        return new State(s);
    }

    protected double normDist(double d)
    {
        return d;
    }

    public Shape parse(String s)
        throws ParseException
    {
        Shape shape1 = parseIfSupported(s);
        if (shape1 != null)
        {
            return shape1;
        }
        if (s.length() > 128)
        {
            s = (new StringBuilder()).append(s.substring(0, 125)).append("...").toString();
        }
        throw new ParseException((new StringBuilder("Unknown Shape definition [")).append(s).append("]").toString(), 0);
    }

    protected Shape parseBufferShape(State state)
        throws ParseException
    {
        state.nextExpect('(');
        Shape shape1 = shape(state);
        state.nextExpect(',');
        double d = normDist(state.nextDouble());
        state.nextExpect(')');
        return shape1.getBuffered(d, ctx);
    }

    protected Shape parseEnvelopeShape(State state)
        throws ParseException
    {
        state.nextExpect('(');
        double d = state.nextDouble();
        state.nextExpect(',');
        double d1 = state.nextDouble();
        state.nextExpect(',');
        double d2 = state.nextDouble();
        state.nextExpect(',');
        double d3 = state.nextDouble();
        state.nextExpect(')');
        return ctx.makeRectangle(ctx.normX(d), ctx.normX(d1), ctx.normY(d3), ctx.normY(d2));
    }

    protected Shape parseGeometryCollectionShape(State state)
        throws ParseException
    {
        if (state.nextIfEmptyAndSkipZM())
        {
            return ctx.makeCollection(Collections.EMPTY_LIST);
        }
        ArrayList arraylist = new ArrayList();
        state.nextExpect('(');
        do
        {
            arraylist.add(shape(state));
        } while (state.nextIf(','));
        state.nextExpect(')');
        return ctx.makeCollection(arraylist);
    }

    public Shape parseIfSupported(String s)
        throws ParseException
    {
        Object obj = null;
        State state = newState(s);
        state.nextIfWhitespace();
        if (state.eof())
        {
            s = obj;
        } else
        {
            s = obj;
            if (Character.isLetter(state.rawString.charAt(state.offset)))
            {
                s = state.nextWord();
                Shape shape1;
                try
                {
                    shape1 = parseShapeByType(state, s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    ParseException parseexception = new ParseException(s.toString(), state.offset);
                    parseexception.initCause(s);
                    throw parseexception;
                }
                s = shape1;
                if (shape1 != null)
                {
                    s = shape1;
                    if (!state.eof())
                    {
                        throw new ParseException("end of shape expected", state.offset);
                    }
                }
            }
        }
        return s;
    }

    protected Shape parseLineStringShape(State state)
        throws ParseException
    {
        if (state.nextIfEmptyAndSkipZM())
        {
            return ctx.makeLineString(Collections.emptyList());
        } else
        {
            state = pointList(state);
            return ctx.makeLineString(state);
        }
    }

    protected Shape parseMultiLineStringShape(State state)
        throws ParseException
    {
        if (state.nextIfEmptyAndSkipZM())
        {
            return ctx.makeCollection(Collections.EMPTY_LIST);
        }
        ArrayList arraylist = new ArrayList();
        state.nextExpect('(');
        do
        {
            arraylist.add(parseLineStringShape(state));
        } while (state.nextIf(','));
        state.nextExpect(')');
        return ctx.makeCollection(arraylist);
    }

    protected Shape parseMultiPointShape(State state)
        throws ParseException
    {
        if (state.nextIfEmptyAndSkipZM())
        {
            return ctx.makeCollection(Collections.EMPTY_LIST);
        }
        ArrayList arraylist = new ArrayList();
        state.nextExpect('(');
        do
        {
            boolean flag = state.nextIf('(');
            Point point1 = point(state);
            if (flag)
            {
                state.nextExpect(')');
            }
            arraylist.add(point1);
        } while (state.nextIf(','));
        state.nextExpect(')');
        return ctx.makeCollection(arraylist);
    }

    protected Shape parsePointShape(State state)
        throws ParseException
    {
        if (state.nextIfEmptyAndSkipZM())
        {
            return ctx.makePoint((0.0D / 0.0D), (0.0D / 0.0D));
        } else
        {
            state.nextExpect('(');
            Point point1 = point(state);
            state.nextExpect(')');
            return point1;
        }
    }

    protected Shape parseShapeByType(State state, String s)
        throws ParseException
    {
        if (!a && !Character.isLetter(s.charAt(0)))
        {
            throw new AssertionError((new StringBuilder("Shape must start with letter: ")).append(s).toString());
        }
        if (s.equalsIgnoreCase("POINT"))
        {
            return parsePointShape(state);
        }
        if (s.equalsIgnoreCase("MULTIPOINT"))
        {
            return parseMultiPointShape(state);
        }
        if (s.equalsIgnoreCase("ENVELOPE"))
        {
            return parseEnvelopeShape(state);
        }
        if (s.equalsIgnoreCase("GEOMETRYCOLLECTION"))
        {
            return parseGeometryCollectionShape(state);
        }
        if (s.equalsIgnoreCase("LINESTRING"))
        {
            return parseLineStringShape(state);
        }
        if (s.equalsIgnoreCase("MULTILINESTRING"))
        {
            return parseMultiLineStringShape(state);
        }
        if (s.equalsIgnoreCase("BUFFER"))
        {
            return parseBufferShape(state);
        } else
        {
            return null;
        }
    }

    protected Point point(State state)
        throws ParseException
    {
        double d = state.nextDouble();
        double d1 = state.nextDouble();
        state.skipNextDoubles();
        return ctx.makePoint(ctx.normX(d), ctx.normY(d1));
    }

    protected List pointList(State state)
        throws ParseException
    {
        ArrayList arraylist = new ArrayList();
        state.nextExpect('(');
        do
        {
            arraylist.add(point(state));
        } while (state.nextIf(','));
        state.nextExpect(')');
        return arraylist;
    }

    protected Shape shape(State state)
        throws ParseException
    {
        String s = state.nextWord();
        Shape shape1 = parseShapeByType(state, s);
        if (shape1 == null)
        {
            throw new ParseException((new StringBuilder("Shape of type ")).append(s).append(" is unknown").toString(), state.offset);
        } else
        {
            return shape1;
        }
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/io/WktShapeParser.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
