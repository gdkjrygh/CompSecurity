// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.runtime.internal.AroundClosure;

// Referenced classes of package org.aspectj.runtime.reflect:
//            StringMaker, SignatureImpl

class JoinPointImpl
    implements ProceedingJoinPoint
{
    static class EnclosingStaticPartImpl extends StaticPartImpl
        implements org.aspectj.lang.JoinPoint.EnclosingStaticPart
    {

        public EnclosingStaticPartImpl(int i, String s, Signature signature, SourceLocation sourcelocation)
        {
            super(i, s, signature, sourcelocation);
        }
    }

    static class StaticPartImpl
        implements org.aspectj.lang.JoinPoint.StaticPart
    {

        private int id;
        String kind;
        Signature signature;
        SourceLocation sourceLocation;

        public int getId()
        {
            return id;
        }

        public String getKind()
        {
            return kind;
        }

        public Signature getSignature()
        {
            return signature;
        }

        public SourceLocation getSourceLocation()
        {
            return sourceLocation;
        }

        public final String toLongString()
        {
            return toString(StringMaker.longStringMaker);
        }

        public final String toShortString()
        {
            return toString(StringMaker.shortStringMaker);
        }

        public final String toString()
        {
            return toString(StringMaker.middleStringMaker);
        }

        String toString(StringMaker stringmaker)
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append(stringmaker.makeKindName(getKind()));
            stringbuffer.append("(");
            stringbuffer.append(((SignatureImpl)getSignature()).toString(stringmaker));
            stringbuffer.append(")");
            return stringbuffer.toString();
        }

        public StaticPartImpl(int i, String s, Signature signature1, SourceLocation sourcelocation)
        {
            kind = s;
            signature = signature1;
            sourceLocation = sourcelocation;
            id = i;
        }
    }


    Object _this;
    private AroundClosure arc;
    Object args[];
    org.aspectj.lang.JoinPoint.StaticPart staticPart;
    Object target;

    public JoinPointImpl(org.aspectj.lang.JoinPoint.StaticPart staticpart, Object obj, Object obj1, Object aobj[])
    {
        staticPart = staticpart;
        _this = obj;
        target = obj1;
        args = aobj;
    }

    public Object[] getArgs()
    {
        if (args == null)
        {
            args = new Object[0];
        }
        Object aobj[] = new Object[args.length];
        System.arraycopy(((Object) (args)), 0, ((Object) (aobj)), 0, args.length);
        return aobj;
    }

    public String getKind()
    {
        return staticPart.getKind();
    }

    public Signature getSignature()
    {
        return staticPart.getSignature();
    }

    public SourceLocation getSourceLocation()
    {
        return staticPart.getSourceLocation();
    }

    public org.aspectj.lang.JoinPoint.StaticPart getStaticPart()
    {
        return staticPart;
    }

    public Object getTarget()
    {
        return target;
    }

    public Object getThis()
    {
        return _this;
    }

    public Object proceed()
        throws Throwable
    {
        if (arc == null)
        {
            return null;
        } else
        {
            return arc.run(arc.getState());
        }
    }

    public Object proceed(Object aobj[])
        throws Throwable
    {
        boolean flag6 = true;
        boolean flag7 = true;
        if (arc == null)
        {
            return null;
        }
        int i = arc.getFlags();
        if ((0x100000 & i) == 0);
        Object aobj1[];
        boolean flag;
        int l;
        boolean flag1;
        int i1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if ((0x10000 & i) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((i & 0x1000) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i & 0x100) != 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if ((i & 0x10) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if ((i & 1) != 0)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        aobj1 = arc.getState();
        i = 0;
        if (flag1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (flag4 && !flag2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag = i;
        if (flag1)
        {
            flag = i;
            if (flag3)
            {
                flag = true;
                aobj1[0] = aobj[0];
            }
        }
        i = ((flag) ? 1 : 0);
        if (flag4)
        {
            i = ((flag) ? 1 : 0);
            if (flag5)
            {
                if (flag2)
                {
                    int j;
                    if (flag3)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    j = i + 1;
                    if (flag3)
                    {
                        i = ((flag7) ? 1 : 0);
                    } else
                    {
                        i = 0;
                    }
                    aobj1[0] = aobj[i];
                    i = j;
                } else
                {
                    int k;
                    int j1;
                    if (flag1)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    j1 = i + 1;
                    if (flag1)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (flag1)
                    {
                        k = ((flag6) ? 1 : 0);
                    } else
                    {
                        k = 0;
                    }
                    aobj1[i] = aobj[k];
                    i = j1;
                }
            }
        }
        for (j = i; j < aobj.length; j++)
        {
            aobj1[(j - i) + (0 + l + i1)] = aobj[j];
        }

        return arc.run(aobj1);
    }

    public void set$AroundClosure(AroundClosure aroundclosure)
    {
        arc = aroundclosure;
    }

    public final String toLongString()
    {
        return staticPart.toLongString();
    }

    public final String toShortString()
    {
        return staticPart.toShortString();
    }

    public final String toString()
    {
        return staticPart.toString();
    }
}
