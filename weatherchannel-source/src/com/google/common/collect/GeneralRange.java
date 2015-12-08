// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            BoundType, Range, Ordering

final class GeneralRange
    implements Serializable
{

    private final Comparator comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final Object lowerEndpoint;
    private transient GeneralRange reverse;
    private final BoundType upperBoundType;
    private final Object upperEndpoint;

    private GeneralRange(Comparator comparator1, boolean flag, Object obj, BoundType boundtype, boolean flag1, Object obj1, BoundType boundtype1)
    {
        boolean flag3 = true;
        super();
        comparator = (Comparator)Preconditions.checkNotNull(comparator1);
        hasLowerBound = flag;
        hasUpperBound = flag1;
        lowerEndpoint = obj;
        lowerBoundType = (BoundType)Preconditions.checkNotNull(boundtype);
        upperEndpoint = obj1;
        upperBoundType = (BoundType)Preconditions.checkNotNull(boundtype1);
        if (flag)
        {
            comparator1.compare(obj, obj);
        }
        if (flag1)
        {
            comparator1.compare(obj1, obj1);
        }
        if (flag && flag1)
        {
            int i = comparator1.compare(obj, obj1);
            if (i <= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "lowerEndpoint (%s) > upperEndpoint (%s)", new Object[] {
                obj, obj1
            });
            if (i == 0)
            {
                boolean flag2;
                if (boundtype != BoundType.OPEN)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (boundtype1 == BoundType.OPEN)
                {
                    flag3 = false;
                }
                Preconditions.checkArgument(flag2 | flag3);
            }
        }
    }

    static GeneralRange all(Comparator comparator1)
    {
        return new GeneralRange(comparator1, false, null, BoundType.OPEN, false, null, BoundType.OPEN);
    }

    static GeneralRange downTo(Comparator comparator1, Object obj, BoundType boundtype)
    {
        return new GeneralRange(comparator1, true, obj, boundtype, false, null, BoundType.OPEN);
    }

    static GeneralRange from(Range range1)
    {
        Comparable comparable;
        BoundType boundtype;
        Comparable comparable1;
        BoundType boundtype1;
        if (range1.hasLowerBound())
        {
            comparable = range1.lowerEndpoint();
        } else
        {
            comparable = null;
        }
        if (range1.hasLowerBound())
        {
            boundtype = range1.lowerBoundType();
        } else
        {
            boundtype = BoundType.OPEN;
        }
        if (range1.hasUpperBound())
        {
            comparable1 = range1.upperEndpoint();
        } else
        {
            comparable1 = null;
        }
        if (range1.hasUpperBound())
        {
            boundtype1 = range1.upperBoundType();
        } else
        {
            boundtype1 = BoundType.OPEN;
        }
        return new GeneralRange(Ordering.natural(), range1.hasLowerBound(), comparable, boundtype, range1.hasUpperBound(), comparable1, boundtype1);
    }

    static GeneralRange range(Comparator comparator1, Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        return new GeneralRange(comparator1, true, obj, boundtype, true, obj1, boundtype1);
    }

    static GeneralRange upTo(Comparator comparator1, Object obj, BoundType boundtype)
    {
        return new GeneralRange(comparator1, false, null, BoundType.OPEN, true, obj, boundtype);
    }

    Comparator comparator()
    {
        return comparator;
    }

    boolean contains(Object obj)
    {
        return !tooLow(obj) && !tooHigh(obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof GeneralRange)
        {
            obj = (GeneralRange)obj;
            flag = flag1;
            if (comparator.equals(((GeneralRange) (obj)).comparator))
            {
                flag = flag1;
                if (hasLowerBound == ((GeneralRange) (obj)).hasLowerBound)
                {
                    flag = flag1;
                    if (hasUpperBound == ((GeneralRange) (obj)).hasUpperBound)
                    {
                        flag = flag1;
                        if (getLowerBoundType().equals(((GeneralRange) (obj)).getLowerBoundType()))
                        {
                            flag = flag1;
                            if (getUpperBoundType().equals(((GeneralRange) (obj)).getUpperBoundType()))
                            {
                                flag = flag1;
                                if (Objects.equal(getLowerEndpoint(), ((GeneralRange) (obj)).getLowerEndpoint()))
                                {
                                    flag = flag1;
                                    if (Objects.equal(getUpperEndpoint(), ((GeneralRange) (obj)).getUpperEndpoint()))
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    BoundType getLowerBoundType()
    {
        return lowerBoundType;
    }

    Object getLowerEndpoint()
    {
        return lowerEndpoint;
    }

    BoundType getUpperBoundType()
    {
        return upperBoundType;
    }

    Object getUpperEndpoint()
    {
        return upperEndpoint;
    }

    boolean hasLowerBound()
    {
        return hasLowerBound;
    }

    boolean hasUpperBound()
    {
        return hasUpperBound;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType()
        });
    }

    GeneralRange intersect(GeneralRange generalrange)
    {
        Object obj1;
        Object obj2;
        boolean flag1;
        Preconditions.checkNotNull(generalrange);
        Preconditions.checkArgument(comparator.equals(generalrange.comparator));
        flag1 = hasLowerBound;
        obj1 = getLowerEndpoint();
        obj2 = getLowerBoundType();
        if (hasLowerBound()) goto _L2; else goto _L1
_L1:
        Object obj;
        BoundType boundtype;
        boolean flag;
        flag = generalrange.hasLowerBound;
        obj = generalrange.getLowerEndpoint();
        boundtype = generalrange.getLowerBoundType();
_L6:
        Object obj3;
        Object obj4;
        boolean flag2;
        flag2 = hasUpperBound;
        obj3 = getUpperEndpoint();
        obj4 = getUpperBoundType();
        if (hasUpperBound()) goto _L4; else goto _L3
_L3:
        flag1 = generalrange.hasUpperBound;
        obj1 = generalrange.getUpperEndpoint();
        obj2 = generalrange.getUpperBoundType();
_L11:
label0:
        {
            obj4 = obj;
            obj3 = boundtype;
            generalrange = ((GeneralRange) (obj2));
            if (!flag)
            {
                break label0;
            }
            obj4 = obj;
            obj3 = boundtype;
            generalrange = ((GeneralRange) (obj2));
            if (!flag1)
            {
                break label0;
            }
            int i = comparator.compare(obj, obj1);
            if (i <= 0)
            {
                obj4 = obj;
                obj3 = boundtype;
                generalrange = ((GeneralRange) (obj2));
                if (i != 0)
                {
                    break label0;
                }
                obj4 = obj;
                obj3 = boundtype;
                generalrange = ((GeneralRange) (obj2));
                if (boundtype != BoundType.OPEN)
                {
                    break label0;
                }
                obj4 = obj;
                obj3 = boundtype;
                generalrange = ((GeneralRange) (obj2));
                if (obj2 != BoundType.OPEN)
                {
                    break label0;
                }
            }
            obj4 = obj1;
            obj3 = BoundType.OPEN;
            generalrange = BoundType.CLOSED;
        }
        return new GeneralRange(comparator, flag, obj4, ((BoundType) (obj3)), flag1, obj1, generalrange);
_L2:
        flag = flag1;
        obj = obj1;
        boundtype = ((BoundType) (obj2));
        if (!generalrange.hasLowerBound()) goto _L6; else goto _L5
_L5:
        int j = comparator.compare(getLowerEndpoint(), generalrange.getLowerEndpoint());
        if (j < 0) goto _L8; else goto _L7
_L7:
        flag = flag1;
        obj = obj1;
        boundtype = ((BoundType) (obj2));
        if (j != 0) goto _L6; else goto _L9
_L9:
        flag = flag1;
        obj = obj1;
        boundtype = ((BoundType) (obj2));
        if (generalrange.getLowerBoundType() != BoundType.OPEN) goto _L6; else goto _L8
_L8:
        obj = generalrange.getLowerEndpoint();
        boundtype = generalrange.getLowerBoundType();
        flag = flag1;
          goto _L6
_L4:
        flag1 = flag2;
        obj1 = obj3;
        obj2 = obj4;
        if (!generalrange.hasUpperBound()) goto _L11; else goto _L10
_L10:
        j = comparator.compare(getUpperEndpoint(), generalrange.getUpperEndpoint());
        if (j > 0) goto _L13; else goto _L12
_L12:
        flag1 = flag2;
        obj1 = obj3;
        obj2 = obj4;
        if (j != 0) goto _L11; else goto _L14
_L14:
        flag1 = flag2;
        obj1 = obj3;
        obj2 = obj4;
        if (generalrange.getUpperBoundType() != BoundType.OPEN) goto _L11; else goto _L13
_L13:
        obj1 = generalrange.getUpperEndpoint();
        obj2 = generalrange.getUpperBoundType();
        flag1 = flag2;
          goto _L11
    }

    boolean isEmpty()
    {
        return hasUpperBound() && tooLow(getUpperEndpoint()) || hasLowerBound() && tooHigh(getLowerEndpoint());
    }

    GeneralRange reverse()
    {
        GeneralRange generalrange = reverse;
        if (generalrange == null)
        {
            generalrange = new GeneralRange(Ordering.from(comparator).reverse(), hasUpperBound, getUpperEndpoint(), getUpperBoundType(), hasLowerBound, getLowerEndpoint(), getLowerBoundType());
            generalrange.reverse = this;
            reverse = generalrange;
            return generalrange;
        } else
        {
            return generalrange;
        }
    }

    public String toString()
    {
        Object obj = (new StringBuilder()).append(comparator).append(":");
        char c;
        StringBuilder stringbuilder;
        if (lowerBoundType == BoundType.CLOSED)
        {
            c = '[';
        } else
        {
            c = '(';
        }
        stringbuilder = ((StringBuilder) (obj)).append(c);
        if (hasLowerBound)
        {
            obj = lowerEndpoint;
        } else
        {
            obj = "-\u221E";
        }
        stringbuilder = stringbuilder.append(obj).append(',');
        if (hasUpperBound)
        {
            obj = upperEndpoint;
        } else
        {
            obj = "\u221E";
        }
        obj = stringbuilder.append(obj);
        if (upperBoundType == BoundType.CLOSED)
        {
            c = ']';
        } else
        {
            c = ')';
        }
        return ((StringBuilder) (obj)).append(c).toString();
    }

    boolean tooHigh(Object obj)
    {
        boolean flag1 = true;
        if (!hasUpperBound())
        {
            return false;
        }
        Object obj1 = getUpperEndpoint();
        int i = comparator.compare(obj, obj1);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (getUpperBoundType() != BoundType.OPEN)
        {
            flag1 = false;
        }
        return flag | i & flag1;
    }

    boolean tooLow(Object obj)
    {
        boolean flag1 = true;
        if (!hasLowerBound())
        {
            return false;
        }
        Object obj1 = getLowerEndpoint();
        int i = comparator.compare(obj, obj1);
        boolean flag;
        if (i < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (getLowerBoundType() != BoundType.OPEN)
        {
            flag1 = false;
        }
        return flag | i & flag1;
    }
}
