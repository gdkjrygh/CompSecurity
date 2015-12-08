// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Equivalence;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static abstract class <init> extends Enum
{

    private static final WEAK $VALUES[];
    public static final WEAK SOFT;
    public static final WEAK STRONG;
    public static final WEAK WEAK;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/cache/LocalCache$Strength, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract Equivalence defaultEquivalence();

    abstract rence referenceValue(Entry entry, Entry entry1, Object obj, int i);

    static 
    {
        STRONG = new LocalCache.Strength("STRONG", 0) {

            Equivalence defaultEquivalence()
            {
                return Equivalence.equals();
            }

            LocalCache.ValueReference referenceValue(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, Object obj, int i)
            {
                if (i == 1)
                {
                    return new LocalCache.StrongValueReference(obj);
                } else
                {
                    return new LocalCache.WeightedStrongValueReference(obj, i);
                }
            }

        };
        SOFT = new LocalCache.Strength("SOFT", 1) {

            Equivalence defaultEquivalence()
            {
                return Equivalence.identity();
            }

            LocalCache.ValueReference referenceValue(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, Object obj, int i)
            {
                if (i == 1)
                {
                    return new LocalCache.SoftValueReference(segment.valueReferenceQueue, obj, referenceentry);
                } else
                {
                    return new LocalCache.WeightedSoftValueReference(segment.valueReferenceQueue, obj, referenceentry, i);
                }
            }

        };
        WEAK = new LocalCache.Strength("WEAK", 2) {

            Equivalence defaultEquivalence()
            {
                return Equivalence.identity();
            }

            LocalCache.ValueReference referenceValue(LocalCache.Segment segment, LocalCache.ReferenceEntry referenceentry, Object obj, int i)
            {
                if (i == 1)
                {
                    return new LocalCache.WeakValueReference(segment.valueReferenceQueue, obj, referenceentry);
                } else
                {
                    return new LocalCache.WeightedWeakValueReference(segment.valueReferenceQueue, obj, referenceentry, i);
                }
            }

        };
        $VALUES = (new .VALUES[] {
            STRONG, SOFT, WEAK
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
